import java.util.Scanner;
public class Money06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("돈의 액수를 입력하세요. >> ");
        int money = scanner.nextInt();

        int m5m=(int)(money/50000); // 오만원
        int m1m=(money%50000)/10000; // 만원
        int m1c=(money%10000)/1000; // 천원
        int m5b=(money%1000)/500; // 오백원
        int m1b=(money%500)/100; // 백원
        int ms=(money%100)/10; // 십원
        int mo=(money%10)/1; // 1원

        System.out.println("오만원 " + m5m + "개, 만원 " + m1m + "개, 천원 " + m1c +
         "개, 오백원 " + m5b + "개, 백원 " + m1b + "개, 십원 " + ms + "개, 1원 " + mo + "개");

        scanner.close();
    }    
}