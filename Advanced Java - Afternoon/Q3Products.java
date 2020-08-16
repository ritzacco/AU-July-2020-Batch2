import java.util.*;
import java.util.stream.Collectors;

class ProductFactory{
    List<Product> list;
    public ProductFactory(List<Product> list){
        this.list = list;
    }
    public void showProducts(){
        System.out.println("Products List");
        for (Product p : list){
            System.out.println(p.name + " Price: " + p.price);
        }
    }
    public void showPriceBetweenXandY(int x, int y){
        System.out.println("Products priced between " + x + " and " + y);
        List<Product> ans = list.stream().filter(p->p.price >= x && p.price <= y).collect(Collectors.toList());
        ans.forEach(p->System.out.println(p.name));
    }
    public Set<String> getTotalCategories(){
        System.out.println("Total categories");
        Set<String> ans = list.stream().map(Product::getType).collect(Collectors.toSet());
        System.out.println(ans.size());
        return ans;
    }
    public void showMaxMinPricedProduct(){
        Set<String> setcat = getTotalCategories();
        for (String str : setcat){
            int max;
            int min;
            max = list.stream().filter(p->p.type.equals(str)).map(Product::getPrice).max(Comparator.comparing(Integer::valueOf)).get();
            min = list.stream().filter(p->p.type.equals(str)).map(Product::getPrice).min(Comparator.comparing(Integer::valueOf)).get();
            System.out.println("Max Price in " + str + ":" + max);
            System.out.println("Min Price in " + str + ":" + min);
        }
    }
}

class Product{
    String name;
    int pid;
    int price;
    String type;

    public Product(String name, int pid, int price, String type){
        this.name = name;
        this.pid = pid;
        this.price = price;
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public int getPrice(){
        return price;
    }
}

public class Q3Products{

    public static void main(String []args){

        List<Product> items = new ArrayList<>();
        items.add(new Product("Iphone", 0, 100, "phone"));
        items.add(new Product("MacBook", 1, 200, "laptop"));
        items.add(new Product("Dyson", 2, 50, "vaccuum"));
        items.add(new Product("HP", 3, 150, "laptop"));
        items.add(new Product("OnePlus", 4, 10, "phone"));
        items.add(new Product("Dell", 5, 70, "laptop"));
        ProductFactory factory = new ProductFactory(items);
        factory.showProducts();
        factory.showPriceBetweenXandY(50, 100);
        factory.getTotalCategories();
        factory.showMaxMinPricedProduct();
    }
}
