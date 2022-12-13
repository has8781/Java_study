import java.util.*;

public class Height06 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Vector<Float> ht = new Vector<Float>();
		System.out.print("2000~2009년까지 1년 단위로 키(cm)를 입력\n>> ");
		
		for(int i=0;i<10;i++) {
			ht.add(scanner.nextFloat());
		}
		float m_grow = -1000;
		int m_y = -1;

		for(int i = 0; i < 9; i++) {
			float grow = ht.get(i+1) - ht.get(i);
			if(grow > m_grow) {
				m_grow = grow;
				m_y = i;
			}
		}
		System.out.println("가장 키가 많이 자란 년도는 200" + m_y + "년 " + m_grow + "cm");
        scanner.close();
	}
}
