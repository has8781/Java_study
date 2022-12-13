package java_SHA;

abstract class Calculator {
	public abstract double multiply(int[] a);	// 1*2*3*4*5=120
}
class MultiplyCalc {
	public double multiply(int[] a) {
		double sum = a[0];
		for (int i = 0; i < a.length; i++) {
			sum *= a[i];
		}
		return sum;
	}
}
public class sha3 {
	public static void main(String[] args) {
		double dmultiply;
		MultiplyCalc c = new MultiplyCalc();
		dmultiply = c.multiply(new int[] {1, 2, 3, 4, 5});
		System.out.println("multiply = " + dmultiply);
	}
}
