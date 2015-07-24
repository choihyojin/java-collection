package encapsulation;
/*
  현재는 홍길동 승이라고 나오는데
  개선
  ===========
  홍길동 : 6
  김유신 : 4
  홍길동 승리
  ===========
 * */
public class CardGame {
	/*=====Field=====*/

	private String Winner,looser;//멤변선언
	private int winScore, looseScore;

/*=====Constructor=====*/	
	//생성자 단축키
	//CTRL+SPACE
	public CardGame() {} //디폴트 생성자

	public CardGame(CardBean bean1, CardBean bean2) {
		
		//getter에서 문제해결패턴
		//제일먼저 리턴타입을 카피
	
		String Winner="",looser="";
		int winScore=0,looseScore=0;
		//지역변수(로컬변수)는 메모리 영역중에서 (콜)스택에 저장
		//인스턴스변수는 메모리 영역중에서 힙에 저장
		if (bean1.getSu1()>bean2.getSu1()) {
			Winner=bean1.getName();
			looser=bean2.getName();
			winScore=bean1.getSu1();
			winScore=bean2.getSu1();
		} else if (bean2.getSu1()>bean1.getSu1()){
			Winner=bean2.getName();
			looser=bean1.getName();
			winScore=bean2.getSu1();
			winScore=bean1.getSu1();
		} else{
			Winner="비김";
		}
		this.Winner=Winner;
		this.looser=looser;
		this.winScore=winScore;
		this.looseScore=looseScore;
	}
/*===== 멤버메소드 =====*/
	@Override
	public String toString() {
		return "===========\n"
				  + this.Winner + " : "+this.winScore+"\n"
				  + this.looser + " : "+this.looseScore+"\n"
				  + this.Winner+ " 승리\n"
				  + "===========";
	}

}
