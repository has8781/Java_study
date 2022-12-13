import java.util.Scanner;

interface StackInterface {
    int lenght();
    String pop();
    boolean push(String ob);
}

class StringStack implements StackInterface {
    String[] stack = new String[5];
    private int i = 0;
    public int lenght() {
        return i + 1;
    }
    public String pop() {
        return stack[--i];
    }
    public boolean push(String ob) {
        if(i == 5) {    //문자열 5개 받으면 멈춤
            return false;
        }
        else {
            stack[i] = ob;
            i++;        //1씩 증가
            return true;
        }
    }
}

public class StackManager06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringStack s = new StringStack();

        System.out.print(">> ");
        for(int x = 0; x < 5; x++) {
            s.push(scanner.next());
        }

        for(int x = 0; x < 5; x++) {
            System.out.print(s.pop() + " ");
        }
        scanner.close();
    }
}
