package _0827;

import java.util.Arrays;

public class cloneArrayTest {
    public static void main(String[] args) {
        String[] originArr1 = {"김치찌개", "잔치국수", "감자탕", "돈부리"};
        String[] originArr2 = originArr1;

        originArr1[1] = "라구파스타";
        originArr2[2] = "치즈 돈까스";

        System.out.println(Arrays.toString(originArr1));
        System.out.println(Arrays.toString(originArr2));

        String [] originArr = {"다니엘","민지","해인","해린"};
        String[] cloneArr = originArr.clone();

        cloneArr[0]="장원영";
        cloneArr[2]="리즈";
        System.out.println(Arrays.toString(originArr));
        System.out.println(Arrays.toString(cloneArr));
    }
}
