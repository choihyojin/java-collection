package encapsulation;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 생성자가 가지는 기능
		 1. 객체를 만드는 기능
		 2. setter 기능 
		 3. 객체가 만들어 지는데 필수적인 요소가 
		    주어지지 않으면 아예 생성을 막는 기능==>제약,방어코딩
		 * */
		System.out.println("통장주이름:");
		BankBook bankBook = new BankBook(scanner.next());
		System.out.println("입금:");
		bankBook.setMoney(scanner.nextInt());
		System.out.println("출금:");
		bankBook.withDraw(scanner.nextInt());
		System.out.println("입금:");
		bankBook.deposit(scanner.nextInt());
		
		System.out.println(bankBook.toString());

	}
}
	
