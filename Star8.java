import java.util.Scanner;

public class Star8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= i-1; j++)
                System.out.print("*");
            for(int j = (i-1)*2; j < 2*(n-1); j++)
                System.out.print(" ");
            for(int j = 0; j <= i-1; j++)
                System.out.print("*");
            System.out.println();
        }

        for(int i = n-1; i > 0; i--) {
            for(int j = i; j > 0; j--)
                System.out.print("*");
            for(int j = 2*(n-1); j > 2*(i-1); j--)
                System.out.print(" ");
            for(int j = i; j > 0; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}
