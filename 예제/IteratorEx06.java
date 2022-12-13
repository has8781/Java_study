import java.util.*;

public class IteratorEx06 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(); 
        v.add(200);
        v.add(300);
        v.add(400); 
        v.add(500);
        v.add(600);
        v.add(700); 
        v.add(800);
        v.add(900);
        v.add(1000); 
        
        Iterator<Integer> it = v.iterator();
        while(it.hasNext()) {
            int n = it.next();
            System.out.println(n);
        }
        int sum = 0;
        it = v.iterator(); 
        while(it.hasNext()) {
            int n = it.next();
            sum += n; 
        }
        System.out.println("벡터에 있는 정수 합 : " + sum);
    }
}