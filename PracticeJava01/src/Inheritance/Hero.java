package Inheritance;

public class Hero {
	String name = "たつお";
	int hp = 100;

	public void attack(Monster m) {
		/* public final void attack(Monster m) {
		finalを記述することでメソッドのオーバーライドを禁止できる */
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("5のダメージを与えた！");
	}

	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}

}
