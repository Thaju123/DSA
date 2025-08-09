package basics;
import java.util.Scanner;

public class PrimeCheck {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }

        sc.close();
    }
        // Method to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime

        // Check from 2 to √n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, it is prime
    }
}
