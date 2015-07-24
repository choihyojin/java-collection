package encapsulation;

import java.util.Scanner;

public class PayMain {
	public static void main(String[] args) {
		/*
		 Pay프로그램은 월급을 입력받아서
		 세금을 떼고 실급여를 고객에게 
		 알려주는 프로그램
		 세율은 10%
		 출력문은 
		 [홍길동 실급여]
		 월급:100만원
		 세금:10만원
		 실급여:90만원
		 * */
		Scanner scanner = new Scanner(System.in);
		int salary=0,tax=0,money=0;
		String name="";
		
		System.out.print("이름: ");
		name=scanner.next();
		System.out.print("월급: ");
		salary=scanner.nextInt();
		
		PayBean payBean = new PayBean();
		payBean.setName(name);
		payBean.setSalary(salary);
		
		System.out.println(payBean.getName()+"님 반갑습니다.");
		

		
		System.out.println(payBean.toString());
	}

}
