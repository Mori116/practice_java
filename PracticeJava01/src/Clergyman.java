public class Clergyman {
	String name;
	final int MAX_HP = 50;
	int hp = 50;
	final int MAX_MP = 10;
	int mp = 10;

	public void selfAld() {
		System.out.println(this.name + "が回復魔法を唱えた！");
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println("HPが全回復した！");
	}

	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間、祈った！");
		int add = new java.util.Random().nextInt(3) + sec;

		int recover = Math.min(this.MAX_MP - this.mp, add);

		this.mp += recover;
		System.out.println("MPが" + recover + "回復した");
		return recover;
	}

}
