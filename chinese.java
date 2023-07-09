import java.util.Scanner;

public class chinese {
    int cal(int size, int div[], int rem[]) {
        int j, x = 1;
        while (true) {
            for (j = 0; j < size; j++) {
                if (x % div[j] != rem[j]) {
                    break;
                }
                if (j == size - 1)
                    return x;
                x++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of divisors:");
        int size = sc.nextInt();
        int[] div = new int[size];
        int[] rem = new int[size];

        System.out.println("Enter the divisors:");
        for (int i = 0; i < size; i++) {
            div[i] = sc.nextInt();
        }

        System.out.println("Enter the remainders:");
        for (int i = 0; i < size; i++) {
            rem[i] = sc.nextInt();
        }

        chinese chinese = new chinese();
        int result = chinese.cal(size, div, rem);
        System.out.println("The smallest number satisfying the Chinese Remainder Theorem is: " + result);

        sc.close();
    }
}
