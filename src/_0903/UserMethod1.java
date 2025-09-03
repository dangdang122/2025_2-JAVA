package _0903;

import java.util.Random;

public class UserMethod1 {
    //메서드 선언 위치는 상관 없다
    public static void outputDice(String userName){
        System.out.println(userName+ "님, 주사위를 던집니다.");
        int diceNum = new Random().nextInt(6)+1;
        System.out.println("주사위 던진 결과: "+diceNum);
    }
    public static void main(String[] args) {
        outputDice("리즈");
        outputDice("다니엘");
        outputDice("원영");
        outputDice("유진");
    }
}
