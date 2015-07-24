package encapsulation;
/*
 @ Data : 2015.07.15
 @ Author : me
 @ Story : 생성자문법
 생성자는 setter를 통해 값을 할당하는 
 기능을 보강하여,객체가 만들어짐과
 동시에 값을 할당하도록
 특수하게 만들어진 ★메소드
 * */

public class CardBean {
/*======== Field ========*/
	private String name,name2;
	private int su1,su2;//멤변초기화 하지않음 무조건private
/*======== Constructor ========*/
	//생성자 위치는(멤버)필드 와 메소드 영역 사이에 위치 
	//생성자 모양
	//public 클래스이름(){}
	public CardBean(){}//디폴트 생성자
	public CardBean(String name) {
		//setter 역할을 겸용하는 생성자 
		this.name=name;
		this.su1= (int) ((Math.random()*13)+1);
}
	
	
	
	//디폴트 생성자는 개발자가 직접 만들지 않아도 
	//프로그램 내부에서는 생성되 있는 것으로 인식한다.
	//그런데 이것을 꺼내든 이유는 
	//new키워드를 통한 객체생성 역할 뿐 아니라
	//생성과 동시에 값을 할당하는 기능을 추가 시키기 위해서 
	
	
/*======== Method ========*/

	public String getName() {
		return name;
	}
	public int getSu1() {
		return su1;
	}

	
	public String getWinner() {
		//getter에서 문제해결 패턴
		//제일 먼저 리턴타입을 카피
		String winner="";
		if (this.su1>this.su2) {
			winner=name + "승리";
		} else if (this.su2>this.su1){
			winner=name2 + "승리";
		} else{
			winner="비김";
		}
		return winner;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+name+": "+su1+"]VS["
				+name2+" : "+su2+"]"
				 +this.getWinner();
	}
}
