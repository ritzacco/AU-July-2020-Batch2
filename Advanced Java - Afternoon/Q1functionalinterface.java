import java.util.Scanner;

@FunctionalInterface
interface AddOne{
    int add(int n);
}

@FunctionalInterface
interface PrintNum{
    void printnumnow(String str);
}

public class Q1functionalinterface {

    public Q1functionalinterface(String str) {
        System.out.println(str);
    }

    public static int addOneFunc(int n){
        return n + 1;
    }

    public int addOneFuncNonstatic(int n){
        return n + 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        //lambda expression
        AddOne a = (int m) -> m + 1;
        System.out.println("Via lambda..." + a.add(num));

        //static method
        AddOne b = Q1functionalinterface :: addOneFunc;
        System.out.println("Via Static..." + b.add(num));

        //instance method
        Q1functionalinterface obj = new Q1functionalinterface("Via instance...");
        AddOne c = obj :: addOneFuncNonstatic;
        System.out.println(c.add(num));

        //constructor
        PrintNum p = Q1functionalinterface::new;
        p.printnumnow("Via contructor... " + num);

    }
}
