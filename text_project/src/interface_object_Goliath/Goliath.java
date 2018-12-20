package interface_object_Goliath;

public class Goliath implements G_All{

	@Override
	public void attackAir() {
		System.out.println("공중공격");
	}

	@Override
	public void attackGround() {
		System.out.println("지상공격");
	}

	@Override
	public void upgrade() {
		System.out.println("업글!");
	}

}
