package Inheritance;

public class Monster {
	int hp = 100;
	final int LEVEL = 10;
	char name = 'A';

	public void runAway() {
		System.out.println("モンスターの" + this.name + "は逃げ出した！");
	}
}
