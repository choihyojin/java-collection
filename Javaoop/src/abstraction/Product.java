package abstraction;
/*
@Data : 2015.07.21
@Author : me
@Story : 추상적인 "제품"이라는 개념을 인터페이스로 만듦
*/
public interface Product {
	public void showInfo();
	public void writeInfo(String company, String name, String serialNo);
}
