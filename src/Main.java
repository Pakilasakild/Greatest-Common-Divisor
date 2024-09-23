import java.util.Scanner;

public class Main {
    public static int getGreatestCommonDivisor(int a, int b) {
        if (a < 10 || b < 10) {
            return -1;
        }
        int biggest = Math.max(a, b);

        for (int i = biggest; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter another number: ");
        int b = sc.nextInt();
        System.out.println(getGreatestCommonDivisor(a, b));
    }
}