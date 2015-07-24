package encapsulation;

public class CardBean3 {
	
	private String name,name2;
	private int su1,su2;//멤변초기화 하지않음 무조건private
	

	public void setName(String name) {
		//()안에 값을 파라미터라 하고 소속은 지변
		this.name = name;
		this.su1= (int) ((Math.random()*13)+1);
		//this.name은 인스턴스변수(멤변)이고
		//=name은 파라미터로 넘어온 지변(스캐너가 받은 값)
		//스캐너가 받아 놓은 값을 가진 지변 값을
		//멤변 name에 할당
		//파라미터값과 멤변값의 이름은 달라도 상관없다
		//단 데이터타입(String,int)은 반드시 일치해야 한다.
	}
	public void setName2(String name2) {
		this.name2 = name2;
		this.su2= (int) ((Math.random()*13)+1);
	}
	public void setSu1() {
		this.su1 = su1;
	}
	public void setSu2() {
		this.su2 = su2;
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
