package TotalTest01;

import java.util.Scanner;

public class BJ1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 알파벳의 사용 여부 판단을 위한 배열 선언
        int[] arr = new int[26];
        String s = scanner.next();

        // 입력받은 문자열의 길이 만큼 반복
        for (int i = 0; i < s.length(); i++) {
            // 대소문자 구별이 없다.
            // 각 문자의 ASCII코드 값에서 'A', 'a'를 빼서
            // 해당 문자의 인덱스를 도출해낸다.
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                arr[s.charAt(i) - 'A']++;
            } else {
                arr[s.charAt(i) - 'a']++;
            }
        }

        // 알파벳의 빈도수는 항상 0이상이므로
        // 빈도수가 0이어도 max가 갱신 될 수 있도록 -1로 초기화
        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            // max가 앞서 도출해낸 index보다 작다면 해당 값을 max에 갱신하고
            // 대문자로 출력하기 위해 ASCII코드 값에 65를 더해준다.
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if (arr[i] == max) {
                // index값과 max값이 동일하다면
                // 같은 빈도수의 알파벳이 둘 이상이라는 의미이기 때문에
                // '?'를 출력한다.
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}
