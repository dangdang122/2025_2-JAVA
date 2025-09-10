package _0910.MathodTest;

import java.util.Scanner;

public class MathodTest2 {
    public int[] inputScores(){
        int[] scores = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i =0; i<3; i++) {
            System.out.print("정수" + (i+1)+"입력:");
            scores[i] = scanner.nextInt();
        }
        scanner.close();
        return scores;
    }
}
