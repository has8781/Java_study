interface PhoneInterface {
    final int TIMEOUT = 10000;
    void sendCall();
    void receiveCall();
    default void printLogo() {
        System.out.println("** Phone **");
    }
}

class Calc {
    public int Calculate(int x, int y) {
        return x + y;
    }
}

class SmartPhone extends Calc implements PhoneInterface {
    
    public void sendCall() {
        System.out.println("따르릉따르릉~~");
    }

    public void receiveCall() {
        System.out.println("전화 왔어요.");
    }

    public void schedule() {
        System.out.println("일정 관리합니다.");
    }
}

public class InterfaceEx06 {
    public static void main(String[] args){
        SmartPhone phone = new SmartPhone();
        phone.printLogo();
        phone.sendCall();
        System.out.println("3과 5를 더하면 " + phone.Calculate(3, 5));
        phone.schedule();
    }
}
