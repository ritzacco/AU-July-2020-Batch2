import java.io.*;
import java.util.UUID;

public class SerializationTask {

    public static void main(String[] args) {
        Myclass obj = new Myclass(10, 20, 30, "hello", 9999);
        String filename = "serializaepractice.txt";

        //Serialization
        try{
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(obj);
            out.close();
            file.close();
            System.out.println("Object Serialized");
            printInfo(obj);
            obj.printUID();
        } catch (IOException e) {
            e.printStackTrace();
        }

        obj = null;

        //Deserialization
        try{
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            obj = (Myclass)in.readObject();
            in.close();
            System.out.println("Object Deserialized");
            printInfo(obj);
            obj.printUID();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
    public static void printInfo(Myclass obj){
        System.out.println("first " + obj.first);
        System.out.println("second " + obj.second);
        System.out.println("third " + obj.third);
        System.out.println("fourth " + obj.fourth);
        System.out.println("fifth " + obj.fifth);
    }
}

class Myclass implements Serializable{
    private static final UUID SerialVersionUID = UUID.randomUUID();

    transient int first;
    transient int second;
    int third;
    String fourth;
    long fifth;

    public Myclass(int first, int second, int third, String fourth, long fifth){
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
    }
    public void printUID(){
        System.out.println("UID is " + SerialVersionUID);
    }
}
