package encapsulation;

import java.beans.beancontext.BeanContext;
import java.util.Scanner;

public class CardMain2 {
	public static void main(String[] args) {
		/*
		 카드 두장을 비교해서 
		 카드 번호가 더 큰수가 이기는 게임프로그램을 작성
		 일단,프로토타입(시제품) 프로그램으로 
		 개발자가 임의의 숫자를 입력하면 
		 [출력]
		 [홍길동 : 7]VS[김유신 : 3]
		 홍길동 승리
		 * */

		Scanner scanner = new Scanner(System.in);

		System.out.println("이름입력:");
		String name=scanner.next();

		System.out.println("이름입력:");
		String name2=scanner.next();

		
		//객체를 생성함
		CardBean3 cardBean = new CardBean3();
		//스캐너가 받아 놓은 값은 현재 지변에 있다
		//그런데 연산로직은 객체에 있다.
		//따라서 지변에 있는 값을 멤변에 던져야 한다.
		cardBean.setName(name);
		cardBean.setName2(name2);
		cardBean.setSu1();//스캐너로받지 않는다고 setsu1()를 호출(사용)하지 않으면 랜덤숫자가 발생하지 않는다
		cardBean.setSu2();
		System.out.println(cardBean.toString());

		
	}

}
