interface DummyInterface {
    void func();
}

class A{
    int temp;
    public A(int temp){
        this.temp = temp;
    }
}

public class Q2FinallyVariableLambda {
    public static void main(String[] args) {
        int n = 10;
        A a = new A(3);
        DummyInterface dummy = () -> {        // lambda expression
            n = n + 1; //this will throw error!
                       //"java: local variables referenced from a lambda expression
                       //must be final or effectively final"

            a.temp = a.temp + 1; //this will not throw any error as it is an instance variable
                                 //for instance variable, references are passed
                                 //for local variable, the lambda COPIES it, so it must be declared final
                                 //or should be effectively final
            System.out.println("Lambda expression run successfully.");
        };
        dummy.func();
    }
}