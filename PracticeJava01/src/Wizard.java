public class Wizard {
	String name;
	int hp = 50;
	int mp = 50;

	public void heal(Hero h) { // Heroクラスを引数にも使用可能
		System.out.println(this.name + "は回復魔法を唱えた！");
		h.hp += 5;
		System.out.println(h.name + "のHPを5回復した！");
	}
}
