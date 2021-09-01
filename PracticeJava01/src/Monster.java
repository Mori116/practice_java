public class Monster {
	int hp;
	final int LEVEL = 10;
	char name;

	public void runAway() {
		System.out.println("モンスターの" + this.name + "は逃げ出した！");
	}
}
