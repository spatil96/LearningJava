package GFG;
/*
* Both have time complexity of O(sqrt(n)) bcoz of  i * i <= n
* Both the appriach have O(1) space
* */
public class PrimeNumber {
    public static void main(String[] args) {
        long number = 29999990000000000L; // Example number
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    static boolean isPrime(long n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        // Check divisors from 5 to sqrt(n)
        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
    static boolean isPrime1(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to square root of n
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
