package forTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ15552 {
    public static void main(String[] args) throws Exception {
        // 빠른 A+B
        // 입출력 방식의 시간 제한이 중요한 문제
        // JAVA의 경우 Scanner, sout 대신 BufferedReader, BufferedWritter 사용
        // flush()는 마지막에 한번 정도면 충분
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스 N개
        System.out.println("테스트 케이스 갯수");
        int n = Integer.parseInt(bufferedReader.readLine());

        // 공백 기준 숫자 구별을 위한 StringTokenizer
        StringTokenizer stringTokenizer;

        for (int i = 0; i < n; i++) {
            // num1과 num2는 공백으로 구별되어 한 줄로 작성해야한다.
            System.out.println("A B 입력");
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int num1 = Integer.parseInt(stringTokenizer.nextToken());
            int num2 = Integer.parseInt(stringTokenizer.nextToken());
            int sum = num1 + num2;
            bufferedWriter.write(sum + "\n");
        }
        System.out.println("A+B");

        bufferedReader.close();
        bufferedWriter.flush(); // Buffered에 남아있는 데이터 모두 출력
        bufferedWriter.close();
    }
}
