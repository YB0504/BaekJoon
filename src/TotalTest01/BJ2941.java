package TotalTest01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 비교할 문자열 입력 받기
        String s = br.readLine();
        
        // 변환 되어서 비교해야하는 크로아티안 알파벳 배열 생성
        String[] croatianAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        int index = 0;

        // 배열 길이 만큼 반복문 순회
        for (int i = 0; i < croatianAlphabet.length; i++) {
            // 입력받은 문자열에 크로아티안 알파벳이 있는지 확인
            index = s.indexOf(croatianAlphabet[i]);
            // index가 0보다 크거나 같다면 배열과 같은 내용이 있다는 의미
            if (index >= 0) {
                // 크로아티안 알파벳을 "A"로 변환하여 입력받은 문자열을 변환
                s = s.replaceAll(croatianAlphabet[i], "A");
            }
        }
        System.out.println(s.length());
    }
}
