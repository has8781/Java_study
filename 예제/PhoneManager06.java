import java.util.Scanner;

class Phone {
    private int pno;
    private String name, tel;
    static int count;
    public Phone(int pno, String name, String tel) {
        this.pno = pno;
        this.name = name;
        this.tel = tel;
    }
    public int getpno() {
        return pno;
    }
    public String getTel() {
		return tel;
	}
	public String getName() {
		return name;
	}
}

public class PhoneManager06 {
    public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("인원수>> ");
		int num = scanner.nextInt();
		Phone [] phone = new Phone[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력)>> ");
			phone[i]=new Phone(i+1, scanner.next(),scanner.next());
		}
		System.out.println("저장되었습니다...");
		
		while(true) {
			System.out.print("검색할 이름>> ");
			String sn=scanner.next();
			if(sn.equals("exit")) {
				break;
			}
			for(int i = 0; i < num; i++) {
                if(!sn.equals(phone[i].getName()) && i == phone[i].getpno()) {
                    System.out.println(phone[i].getName() + "은(는) 없습니다.");
                }
				else if(sn.equals(phone[i].getName())) {
					System.out.println(phone[i].getName()+"의 번호는 " + phone[i].getpno() + "번이고 전화번호는 " + phone[i].getTel() + " 입니다.");
				}
			}
		}
		System.out.print("프로그램을 종료합니다...");

        scanner.close();
	}
}
