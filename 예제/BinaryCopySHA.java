import java.io.*;

public class BinaryCopySHA {
    public static void main(String[] args) {
        File src = new File( "c:\\SHA\\img.jpg");
        File dest = new File("c:\\SHA\\back.jpg"); 
        int c;
        try {
            FileInputStream fi = new FileInputStream(args[0]); 
            FileOutputStream fo = new FileOutputStream(args[1]); 
            while((c = fi.read()) != -1) {
                fo.write((byte)c);
            }
            fi.close();
            fo.close();
            System.out.println( src.getPath()+ "를 " + dest.getPath()+
            "로 복사하였습니다.");
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}