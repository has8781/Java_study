package java_SHA;
import java.util.*;

public class sha4 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(); 
		Scanner scanner = new Scanner(System.in);
		System.out.print("5개의 숫자를 입력하시오 : ");
		for(int i = 0; i < 5; i++) {
			v.add(scanner.nextInt());
		}
		Iterator<Integer> it = v.iterator();
		int sum = it.next();
		while(it.hasNext()){
			int n = it.next();
			sum = sum * n;
		}
		
		
		System.out.println("정수의 곱 : " + sum);
		scanner.close();
	}
}
