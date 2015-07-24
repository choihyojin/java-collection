package abstraction;

public class GunRobot extends BasicBot {
	private int attackPoint;
	
	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}
	@Override
	public void status() {
		super.status();
		System.out.println("공격력 : "+this.attackPoint);
	}


}
