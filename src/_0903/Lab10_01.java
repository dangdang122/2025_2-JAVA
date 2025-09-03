package _0903;

import java.util.Scanner;

public class Lab10_01 {
    public static int calc(int v1, int v2, char op){
        int result = 0;
        switch(op){
            case '+': result = v1 + v2; break;
            case '-': result = v1 - v2; break;
            case '*': result = v1 * v2; break;
            case '/': result = v1 / v2; break;

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("1번째 정수 입력: ");
            int num1 = sc.nextInt();

            if (num1 == -1) {
                System.out.println("프로그램 종료");
                break;
            }

            System.out.print("연산자 입력 : ");
            char op = sc.next().charAt(0);

            System.out.print("2번째 정수 입력: ");
            int num2 = sc.nextInt();

            int result = calc(num1, num2, op);
            System.out.println("연산 결과: " + result);
        }

        sc.close();
    }
}
