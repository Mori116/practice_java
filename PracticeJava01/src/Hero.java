public class Hero {
	// 属性の定義
	String name;
	int level;
	int hp;
	Sword sword; // Swordクラス(Sword型):フィールドにクラス型の変数の宣言が可能

	// 操作の定義
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "のHPが100回復した！");
	}

	public void sit(int sec) {
		this.hp += sec; // 座った秒数だけhpに足す
		System.out.println
			(this.name + "は、" + sec + "秒座ったことにより、"  + "HPが" + sec + "回復した！");
	}

	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ！");
	}

	public void runAway() {
		System.out.println(this.name + "は逃げ出した！");
		System.out.println("ゲームオーバー...");
		System.out.println("最終のHPは" + this.hp + "でした");
	}

	public void attack() {
		System.out.println(this.name + "は" + this.sword.name + "で攻撃を繰り出した！");
	}

}
