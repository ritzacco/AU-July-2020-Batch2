package arithmeticpackage.impl;

import arithmeticpackage.interfaces.ArithmeticInterface;

public class ArithmeticImpl implements ArithmeticInterface {
    public void calculate(int x, int y, char op) throws ClassNotFoundException {
        if (op == '+'){
            System.out.println(x + " + " + y + " = " + (x + y));
        }
        if (op == '-'){
            System.out.println(x + " - " + y + " = " + (x - y));
        }
        if (op == '*'){
            System.out.println(x + " * " + y + " = " + (x * y));
        }
        if (op == '/'){
            System.out.println(x + " / " + y + " = " + (x / y));
        }
    }
}
