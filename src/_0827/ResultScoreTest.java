package _0827;

import java.util.Arrays;
import java.util.Scanner;

public class ResultScoreTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        int sum=0;
        double avg = 0;

        System.out.println("피겨스케이팅 연기가 끝났습니다.");
        System.out.println("심사위원들은 점수를 입력해 주세요~");

        for (int i = 0; i < scores.length; i++) {
            System.out.println("심사위원"+(i+1));
            scores[i] = sc.nextInt();
            sum+=scores[i];
        }
        avg = sum+scores.length;

        System.out.println("심사위원 개별 점수" +Arrays.toString(scores));
        System.out.printf("심사위원 평균 점수: %.1f\n",avg);
    }
}
