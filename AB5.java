import java.util.Scanner;

public class AB5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            String[] str = sc.next().split(",");
            System.out.println(Integer.parseInt(str[0])+Integer.parseInt(str[1]));
        }
    }
}
