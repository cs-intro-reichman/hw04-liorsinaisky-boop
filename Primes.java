
import javax.xml.transform.Source;

public class Primes {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + n + ":");
        int count = 0;
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        for (int j = 0; j <= Math.sqrt(n); j++) {
            if (isPrime[j] == true) {
                for (int z = j * j; z < isPrime.length; z += j) {
                    isPrime[z] = false;
                }
            }

        }
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[0] = false;
            isPrime[1] = false;
            if (isPrime[i] == true) {
                System.out.println(i);
                count++;
            }
        }
        double percentage = (count * 100) / n;
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + (int) percentage + "% are primes)");
    }
}
