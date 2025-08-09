package basics;
import java.util.Scanner;

public class armstrong {

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += rem * rem * rem;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        System.out.println("3-digit Armstrong numbers:");
        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        // Optional: Uncomment below to check a single number
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = sc.nextInt();
        System.out.println("Is Armstrong? " + isArmstrong(num));
        */
    }
}
