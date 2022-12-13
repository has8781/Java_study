import java.util.Scanner;
abstract class shape {
	 abstract void draw();
}

class Editor extends shape {
	Scanner sc = new Scanner(System.in);

	static int i = 0;
	private String [] Shape = new String[10];
	
	public void insert() {
		
		System.out.print("도형 종류 Line(1), Rect(2), Circle(3) >> ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			Shape [i] = "Line";
			i++;
			break;
		case 2:
			Shape [i] = "Rect";
			i++;
			break;
		case 3:
			Shape [i] = "Circle";
			i++;
			break;
		}
	}
	
	public void delete() {
		System.out.print("삭제할 도형의 위치 >> ");
		int Loc = sc.nextInt();
		
		if(i < Loc) {
			System.out.println("삭제할 수 없습니다.");
		}
		else {
			(Shape[Loc-1]) = null;
		}
	}
	
	public void draw() {
		for(int j = 0; j < i; j++) {
			System.out.println(Shape[j]);
		}
	}
}

public class Graph06 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Editor e = new Editor();
		
		boolean b = true;
		
		while(b == true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 :
				e.insert();
				break;
			case 2 :
				e.delete();
				break;
			case 3 :
				e.draw();
				break;
			case 4 :
				System.out.println("프로그램을 종료합니다...");
				b = false;
				break;
			}
		}
        sc.close();
	}
}
