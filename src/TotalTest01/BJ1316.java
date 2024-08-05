package TotalTest01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ1316 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력받을 문자열의 개수 입력
        int n = Integer.parseInt(br.readLine());
        
        // 입력한 단어가 모두 그룹 단어라는 전제로
        // 그룹 단어의 개수 = 입력받은 문자열의 개수
        int count = n;

        for (int i = 0; i < n; i++) {
            // 반복문을 Loop 돌면서 문자열을 입력받는다.
            String s = br.readLine();

            // 이전 문자와 현재 문자를 ASCII코드 값으로 비교하기 위해
            // 이전 문자의 값을 0으로 초기화
            int prev = 0;

            // 알파벳의 여부를 체크할 수 있도록 알파벳 개수 만큼의 배열 선언
            int[] alphabet = new int[26];

            // 입력받은 문자열의 길이 만큼의 반복문
            for (int j = 0; j < s.length(); j++) {
                // 입력받은 문자열에서 문자를 하나씩 추출하여
                // ASCII코드 값으로 현재 문자에 저장
                int now = s.charAt(j);

                // 이전 문자와 현재 문자가 다를 때
                if (prev != now) {
                    // now의 ASCII 코드 값에서 97을 뺀 값이 0과 같다면
                    // 현재 문자가 이전에 등장하지 않았다면
                    if (alphabet[now - 97] == 0) {
                        // 해당 문자의 index를 1증가 시키고
                        alphabet[now - 97]++;
                        // 증가 시킨 값을 이전 문자를 의미하는 변수에 저장한다.
                        prev = now;
                    } else {
                        // 현재 문자가 이전에 등장 했다면 그룹 단어가 아니기 때문에
                        // 그룹 단어의 개수를 1빼고 반복문을 빠져 나온다.
                        count--;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
