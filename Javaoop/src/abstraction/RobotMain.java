package abstraction;

public class RobotMain {
	public static void main(String[] args) {
		
		/*
		 GunRobot
		 ShieldRobot
		 
		 건로봇 속도 10 에너지 10 공격력 50
		 -공격력은 인스턴스 변수로 int attackPoint
		 쉴드로봇 속도 20 에너지 20 방어력 50
		 -방어력은 인스턴스 변수로 int shieldPoint
		 
		 * */
		GunRobot g = new GunRobot();
		g.charge(10);
		g.run(10);
		g.setAttackPoint(50);
		g.status();
	}

}
