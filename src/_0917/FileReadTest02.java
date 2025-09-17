package _0917;

import java.io.*;

public class FileReadTest02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        int i = 1;

        BufferedReader br = null;
        String line = null;
        try {
            br = new BufferedReader(new FileReader(new File("D:/FileTest/MyData1.txt")));
            while((line = br.readLine()) != null) {
                System.out.printf("%d : %s\n", i++, line);
                line = br.readLine();
//                if(line == null)
//                    break;
//                sb.append(i + line+ "\n");

            }
        }catch(FileNotFoundException e) {
            System.out.println("현재경로에서 파일을 찾을 수 없습니다.");
            return;
        }catch (IOException e){
            System.out.println("한 줄씩 읽는 동안 문제가 발생했습니다.");
            return;
        }
        try {
            br.close();
        }catch(IOException e) {
            System.out.println("Closing file Error");
        }
        sb.reverse();
        System.out.println(sb.toString());
        try {
            br.close();
        } catch (IOException e) {
            System.out.println("Closing file Error");
        }
    }
}
