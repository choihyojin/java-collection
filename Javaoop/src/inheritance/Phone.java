package inheritance;

public class Phone {
	/*===== 필드 =====*/
	private String company;
	private String call;
	/*===== 생성자 =====*/
	
	
	
	/*===== 멤버메소드 =====*/
	//get/set단축키 : ALT+SHIFT+S
	public String getCompany() {
		return company;
	}
	public String getCall() {
		return call;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setCall(String call) {
		this.call = call+"에게전화를 검";
	}
	
	
	
}
