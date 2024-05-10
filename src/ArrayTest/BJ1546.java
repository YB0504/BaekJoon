package ArrayTest;

import java.util.Arrays;
import java.util.Scanner;

public class BJ1546 {
    public static void main(String[] args) {
        // 시험 평균 조작하기
        // 시험 과목 개수 N이 주어지고
        // 입력된 점수 중 최대값 M을 구한 후
        // 모든 점수를 점수/M * 100한다.
        // 위의 방법대로 각 점수를 새로 만들어서 평균을 구하는 프로그램 작성
        Scanner scanner = new Scanner(System.in);

        System.out.println("과목 개수 입력");
        int n = scanner.nextInt();

        // 과목 별 점수 저장 배열
        // 소수부도 저장되어야 하기에 double형으로 선언
        double[] score = new double[n];

        System.out.println("과목 별 점수 입력 및 최대 값 구하기");
        for (int i = 0; i < score.length; i++) {
            score[i] = scanner.nextInt();
        }

        // 기존 점수의 최대값 구하기
        double max = 0;
        // 기존 점수에 주어진 계산식을 수행 후 합계 저장
        double sum = 0;

        for (int i = 0; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
        }
        System.out.println("기존 점수 배열 : "+Arrays.toString(score));

        // 조작된 점수로 배열 새로 저장
        for (int j = 0; j < score.length; j++) {
            score[j] = (score[j] / max) * 100;
        }
        System.out.println("조작 점수 배열 : "+Arrays.toString(score));

        // 조작 점수의 합계
        for (int k = 0; k < score.length; k++) {
            sum += score[k];
        }

        double avg = 0;
        avg = sum / n;

        System.out.println("조작 평균 : " + avg);
        System.out.println(avg);
    }
}
