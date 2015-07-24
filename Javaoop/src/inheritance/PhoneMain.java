package inheritance;

import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		Phone phone = new Phone();
		//클래스이름 인스턴스(객체) = new 생성자
		//인스턴스를 생성하는 이유? 메소드 호출
		phone.setCompany("삼성 가정용 전화기");
		Scanner scanner = new Scanner(System.in);
		System.out.println("전화 걸 사람:");
		phone.setCall(scanner.next());
		System.out.println(phone.getCompany()+"를 사용해서...");
		/*
		 삼성가정용 전화기를 사용해서
		 홍길동에게 전화를 검
		 * */
		System.out.println(phone.getCall());

	}

}
