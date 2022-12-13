import java.io.*;
public class FileWriterSHA {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        FileWriter fout = null;
        int c;
        try {
            fout = new FileWriter("c:\\tmp\\test.txt");
            while ((c = in.read()) != -1) {
                fout.write(c); // 키보드로부터 받은 문자를 파일에 저장
        }
        in.close();
        fout.close();
        } 
        catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}