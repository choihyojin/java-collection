package encapsulation;

public class PayBean {
	//메소드는 선언부,연산부,출력부 이렇게 나누고 
	//Bean(메인메소드없는클래스) 클래스라면 멤버필드+멤버메소드

	private String name;//멤버필드변수 는 초기화를 하지않는다.
	private int salary;

	
	//멤버메소드 영역이 시작
	//set은 스캐너로 받아온거
	//get은 결과값으로 주는거
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public int getTax() {
		int tax=0;//지변초기화필수
		tax=(int) (salary*0.1);
		return tax;
	}
	/*
	 * this는 이 클래스 내부에 있는~~~의미
	 * */
	public int getMoney() {
		int money=0;//지변초기화
		money=salary-this.getTax();
		return money;
	}
	
	@Override
	public String toString() {

		return "["+this.name+"]"
				+ "월급:"+this.salary+"세금:"
				+this.getTax()+"실급여:"+this.getMoney();
	}

}
