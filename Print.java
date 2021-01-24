import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) { // 다음에 읽을 값이 있는 지 확인하는 함수
            String str = sc.nextLine(); // nextLine(): 줄 단위로 읽어옴
            System.out.println(str);
        }
        sc.close();
    }
}
