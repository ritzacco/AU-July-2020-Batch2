import java.util.Arrays;

public class Prime {
    public static void main(String[] args) {
        boolean isPrime[] = new boolean[101];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= 100; i++){
            if (isPrime[i]){
                for (int j = i * i; j <= 100; j = j + i){
                    isPrime[j] = false;
                }
            }
        }
        //time complexity is O(nlog(logn))
        int a = 1;

        while (a <= 100){
            try{
                if (isPrime[a]){
                    throw new PrimeException();
                }
            }
            catch(PrimeException e){
                System.out.println(a + " is a Prime");
            }
            a++;
        }
    }
}

class PrimeException extends RuntimeException{

}