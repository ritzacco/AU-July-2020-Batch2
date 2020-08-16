import java.util.TreeMap;

public class Reverseorderview {
    public static void main(String[] args) {
        TreeMap <Integer,Character> tmap = new TreeMap <> ();
        tmap.put(1, 'A');
        tmap.put(2, 'B');
        tmap.put(3, 'C');
        tmap.put(4, 'D');
        System.out.println("Initial: " + tmap);
        System.out.println("Reverse order view of keys: " + tmap.descendingKeySet());
    }
}
