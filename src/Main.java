import java.util.Scanner;

class PrimeGenerator {

    private static void printPrimes(int m, int n) {
        boolean[] primes = new boolean[n - m + 1];
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            int start = Math.max(p * p, (m + p - 1) / p * p);
            for (int j = start; j <= n; j += p) {
                primes[j - m] = false;
            }
        }

        for (int i = 0; i < primes.length; i++) {
            if (primes[i] && (i + m) >= 2) {
                System.out.println(i + m);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            printPrimes(m, n);
            if (i < t - 1) {
                System.out.println();
            }
        }
        scanner.close();
    }
}
