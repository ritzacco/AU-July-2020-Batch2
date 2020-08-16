import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CalculatorAssignment{

    public static class Calculator{
        String query;
        public Calculator(String query){
            this.query = query;
        }

        public int calculate(String s) {
            Queue<Character> q = new LinkedList<>();
            for (char c : s.toCharArray()) {
                if (c != ' ') { //remove whitespace
                    q.add(c);
                }
            }
            q.add(' ');
            return calculateMini(q);
        }

        private int calculateMini(Queue<Character> q) {
            int num = 0;
            int prev = 0, sum = 0;
            char prevOp = '+';
            while (!q.isEmpty()) {
                char c = q.poll();
                if (c >= '0' && c <= '9') {
                    num = num * 10 + c - '0';
                } else if (c == '(') {
                    num = calculateMini(q);
                } else {
                    if (prevOp == '+'){
                        sum += prev;
                        prev = num;
                    }
                    else if (prevOp == '-'){
                        sum += prev;
                        prev = -num;
                    }
                    else if (prevOp == '*'){
                        prev *= num;
                    }
                    else if (prevOp == '/'){
                        prev /= num;
                    }
                    else if (prevOp == '%'){
                        prev %= num;
                    }

                    if (c == ')') break;
                    num = 0;
                    prevOp = c;
                }
            }
            return sum + prev;
        }

        public void printAmericanFlag(){
            for (int i = 0; i < 9; i++){
                if ((i & 1) == 0){
                    System.out.print("* * * * * *");
                    for (int j = 0; j < 20; j++){
                        System.out.print("-");
                    }
                }
                else{
                    System.out.print(" * * * * * ");
                    for (int j = 0; j < 20; j++){
                        System.out.print("-");
                    }
                }
                System.out.println();
            }
            for (int i = 0; i < 6; i++){
                for (int j = 0; j < 31; j++){
                    System.out.print("-");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int t = 4;
        while (t-- != 0){
            String query = s.nextLine();
            Calculator c = new Calculator(query);
            System.out.println("Result: " + c.calculate(query));
        }
        Calculator c = new Calculator("");
        c.printAmericanFlag();
    }
}