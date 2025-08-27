package _0827;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayTest {
    public static void main(String[] args) {
        int[] arr = {77, 88, 33, 12, 5,4,24,465,234};
        String[] strArr = {"인공지능", "소프트웨어","한국","폴리텍"};
        Arrays.sort(arr);
        for(int num : arr) {
            System.out.print(num + "\t");
        }
        System.out.println();

        Arrays.sort(strArr, Collections.reverseOrder());

        for(String str : strArr) {
            System.out.print(str + "\t");
        }
    }
}
