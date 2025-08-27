package _0827;

import java.util.Calendar;
import java.util.Random;

public class Chapter09_LAB1 {
    public static void main(String[] args) {
        String[] arr ={"누가 교육받은 사람인가?\n" +
                "첫째로,\n" +
                "교양있는 사람이란 환경의 지배를\n" +
                "받는 사람이 아니라 환경을 지배하는 사람을 의미한다.\n" +
                "둘째로,\n" +
                "교양있는 사람이란 어떤 경우에도\n" +
                "용감하게 행동하고 지적으로 생각하는 사람을 의미한다.\n" +
                "셋째로,\n" +
                "교양있는 사람이란 모든 것을 명예롭게\n" +
                "처리하는 자, 다시 말해서 마음에 들지 아니하는\n" +
                "사람과 물건까지도 정정당당하게 처리하는\n" +
                "사람을 의미한다.\n" +
                "넷째로,\n" +
                "교양있는 사람이란 쾌락을 절제하며 불행에\n" +
                "빠지지 않는 사람을 의미한다. 마지막으로 교양 있는\n" +
                "사람이란 성공 때문에 명예를 더럽히지 않는\n" +
                "사람을 의미한다."};
        Random rand = new Random();

        int todayIndex = rand.nextInt(arr.length);
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.printf("%d년 %d월 %d일 오늘의 명언 : %s \n", year, month, day, arr[todayIndex]);
    }
}
