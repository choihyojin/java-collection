package inheritance;
/*
Nokia휴대전화를 사용해서
폰을 가지고 다닐 수 있음
홍길동에게 전화를 검
* */
import java.util.Scanner;

public class CelPhoneMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CelPhone nokia = new CelPhone();
		
		nokia.setCompany("Nokia 휴대전화");
		System.out.println("전화 걸 사람: ");
		nokia.setCall(scanner.next());
		nokia.setPortable(true);
		
		
		//boolean 타입의 set메소드를 이용하여 
		//setMove를 자동 설정하게끔 유도하고 
		//출력은 isPortable()이 아니라 
		//getMove()를 호출하게 하는 패턴
		System.out.println(nokia.getCompany()+"를 사용해서");
		System.out.println(nokia.getMove());
		System.out.println(nokia.getCall());
		
	}

}
