package abstraction;

public class Notebook extends ProductSpec{
	private String cpu; //cpu사양
	private String ram; //메모리 사양
	private String hdd; //하드디스크 사양
	

	public void writeInfo(String company,
			String name, 
			String serialNo,
			String cpu,
			String ram,
			String hdd) {

		super.writeInfo(company, name, serialNo);
		this.cpu=cpu;
		this.ram=ram;
		this.hdd=hdd;
	}
	@Override
	public void showInfo() {

		super.showInfo();
		System.out.println("cpu정보"+this.cpu);
		System.out.println("메모리정보"+this.ram);
		System.out.println("하드디스크정보"+this.hdd);
	}
}
