import java.util.Scanner;

public class Soneic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // a= 고정비용
        int b = sc.nextInt(); // b=1대당 가변 비용
        int c = sc.nextInt(); // c = 노트북 가격

        if (b >= c){
            System.out.println(-1);
        }
        else {
            System.out.println(a/(c-b)+1);
        }
    }
}
