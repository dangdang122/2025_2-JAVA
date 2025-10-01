package _0924;

import java.io.*;

public class report {
    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader("D://FileTest/secure.txt");
            bufferedReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter("D://FileTest/secureDecode.txt");

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("읽은 내용: " + line);
                String decodedLine = "";

                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    ch -= 100;
                    decodedLine += ch;
                }

                fileWriter.write(decodedLine + "\n");
            }

            System.out.println("디코딩 완료");

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("파일 입출력 중 오류 발생.");
        } finally {
           
            try {
                if (fileWriter != null) fileWriter.close();
                if (fileReader != null) fileReader.close();
            } catch (IOException e) {
                System.out.println("파일 닫는 중 오류 발생.");
            }
        }
    }
}
