package capsule;

public class Hero {
	String name;
	int level;
	private int hp; // カプセル化:自身のクラスでのみアクセス許可する

	private void sleep() { // 外部のクラスからは呼び出せなくなる
		this.hp = 100; // privateでも同じクラス内であれば読み書き可能
		System.out.println(this.name + "のHPが100回復した！");
		System.out.println("現在のHPは" + this.hp);
	}

	void run() { // public等のアクセス修飾子の記述がない場合、同じパッケージのクラスからの呼び出しのみ許可と判断される
		System.out.println(this.name + "は逃げ出した");
	}

}
