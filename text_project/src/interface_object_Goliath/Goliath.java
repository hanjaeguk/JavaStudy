package interface_object_Goliath;

public class Goliath implements G_All{

	@Override
	public void attackAir() {
		System.out.println("���߰���");
	}

	@Override
	public void attackGround() {
		System.out.println("�������");
	}

	@Override
	public void upgrade() {
		System.out.println("����!");
	}

}
