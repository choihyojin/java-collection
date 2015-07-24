package inheritance;

public class Iphone extends CelPhone{
	/*===== 필드 =====*/
	private String data;
	private String os;//운영체제
	public static boolean TRUE =true;//오로지 이동전화만 만드는 회사 
	public static String BRAND="아이폰";
	//브랜드를 static 이라는 키워드를 사용해서 클래스 변수로 만들고
	//고정값으로 설정함 
	
	public String getData() {
		return data;
	}
	//get이던set이던 파라미터 추가하는 정도의 변화는
	//개발자의 재량에 있다.
	public void setData(String name,String data) {
		this.data = name+"에게,메세지로 "+data+"를 전달";
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os ="IOS";
	}
	
	/*===== 생성자 =====*/
	/*===== 멤버 메소드 =====*/


}
