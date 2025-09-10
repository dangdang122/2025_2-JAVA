package _0910.MathodTest;
import _0910.Calc1;

public class MathodReturn {
    public static void main(String[] args) {
        MathodTest2 input = new MathodTest2();
        int[] scores = input.inputScores();
        Calc1 calc = new Calc1();
        int result = calc.plus(scores);

        System.out.println(scores.length + "개 정수의 합계: " + result);
    }
}