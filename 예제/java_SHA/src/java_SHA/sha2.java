package java_SHA;
import java.util.*;

class GStack<T> {
	int tos;
	Object [] stck;
	public GStack() {
		tos = 0;
		stck = new Object[10];
	}
	public void push(T item) {
		if(tos == 10)
			return; 
		stck[tos] = item;
		tos++;
	}
	public T pop() {
		if(tos == 0)
			return null;
		tos--; 
		return (T)stck[tos]; 
	}
}

class Point {
	private int x, y, z;
	public Point(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public String toString() {
		return "("+x+", "+y+", "+z+")";
	}
}
	public class sha2 {
		public static void main(String[] args) {
			GStack<Point> pointStack = new GStack<Point>();
			pointStack.push(new Point(8, 16, 24));
			pointStack.push(new Point(7, 9, 12));
			pointStack.push(new Point(5, 7, 9));
			
			for(int n=0; n<3; n++) {
				System.out.print(pointStack.pop());
			}
	}
}


