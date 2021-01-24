import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        int day = y; // 입력받은 일 수
        for(int i = 0; i < x-1; i++) { // 1월부터 x-1월
            day += month[i]; // 월의 일 수를 더함
        }

        System.out.println(days[day%7]); // 요일 출력


    }
}
