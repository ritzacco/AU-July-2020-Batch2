package arithmetic_voila_1;

/**
 * Hello world!
 *
 */
import arithmeticpackage.impl.ArithmeticImpl;
import arithmeticpackage.interfaces.ArithmeticInterface;


public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException {
        ArithmeticInterface obj = new ArithmeticImpl();
        obj.calculate(1, 2, '+');
        obj.calculate(2, 6, '-');
        obj.calculate(3, 7, '*');
        obj.calculate(8, 2, '/');
    }
}
