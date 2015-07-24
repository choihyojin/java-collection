package encapsulation;

import java.util.Scanner;

public class KaupBean3 {
	/*
	 * 멤버필드는 은닉화된 데이터 값이 모여있는
	 * 공간이다. 가장 큰 특징은 초기화를 하지 않는다.
	 * 이유는 멤버메소드들이 이 데이터 공간(필드)를
	 * ★★★공유하기 때문이다.
	 * */

	private String name,msg;
	private double height,weight;
	private int idx;
	public void getIndex() {//메소드(동사)

		//연산부
		idx=(int) ((weight/(height*height))*10000);
		if (idx>30) {
			msg="비만";
		} else if((idx>24)&&(idx<30)) {
			msg="과체중";
		} else if((idx>20)&&(idx<24)) {
			msg="정상";
		} else if((idx>15)&&(idx<20)) {
			msg="저체중";
		} else if((idx>13)&&(idx<15)) {
			msg="마름";
		} else{
			msg="영양실조";
		}
		 
	
	}
	
	@Override
	public String toString() {
		/*
		 public : 접근 제한자
		 String : 리턴 타입(결과값의 타입이 String이다.)
		 toString() : 메소드 이름(자바에서 픽스된 메소드)
		 * */
		//선언부
		String str = ""; //지역변수 초기화 
		//연산부
		str="["+name+"] 키:"+height+"cm ,몸무게:"+weight+"kg , 카우푸지수:"+msg;
		//출력부
		return str;
	}

}

