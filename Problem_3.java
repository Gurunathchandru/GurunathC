import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        int limit = a;
        if (limit % 2 == 0) limit--;

        for (int i = 1; i <= limit *2 -1; i += 2) {
            System.out.print(i);
            if (i < limit*2-1) System.out.print(", ");
        }
    }
}
