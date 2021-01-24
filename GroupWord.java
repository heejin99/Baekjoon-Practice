import java.util.Scanner;

public class GroupWord {

    static Scanner s = new Scanner(System.in); // 입력받기 위한 함수

    public static void main(String[] args) {
        int num = 0; // 그룹단어 개수

        int n = s.nextInt(); // 그룹단어 체크할 수

        for(int i = 0; i < n; i++) {
            if (checker() == true) { // 단어 확인 시 true (그룹단어가 맞으면)
                num++; // 그룹단어 개수 1 증가
            }
        }
        System.out.println(num);

    }

    public static boolean checker() { // 그룹 단어 확인 함수
        boolean[] check = new boolean[26]; // check 배열
        int pre = 0; // 비교할 이전 문자
        String str = s.next(); // 단어 입력

        for(int i = 0; i < str.length(); i++) { // 단어의 길이만큼 확인
            int aft = str.charAt(i); // 문자열로 받은 걸 char로 하나씩 쪼개줌

            if (pre != aft) { // 이전 문자와 다음 문자가 같지 않으면
                if (check[aft - 'a'] == false) { // 해당 문자가 처음 나오는 경우
                    check[aft - 'a'] = true; // 문자가 나왔다고 표시하기 위해 true 표기
                    pre = aft; // 이전 문자에 현재 문자를 저장
                }
                else { // 해당 문자가 나온적이 있는 경우
                    return false; // 그룹 단어가 아니므로 false 리턴
                }
            }
            // 이전 문자와 다음 문자가 같은 경우 따로 코드 작성 X
        }
        return true;
    }
}