package Inheritance;

public class SuperHero extends Hero {  // HeroクラスをベースにしてSuperHeroクラスを定義する
	// Heroクラスの内容を所持しているため、異なる箇所だけ記述すればOK
	boolean flying;

	public void fly() {
		this.flying = true;
		System.out.println("空へ飛び上がった！");
	}

	public void land() {
		this.flying = false;
		System.out.println("着地した");
	}

	// 親クラスで定義したメソッドの上書き可能:オーバーライド
	public void run() {
		System.out.println(this.name + "は撤退した");
	}

	// 親インスタンス部分を使用する場合
	public void attack(Monster m) {
		super.attack(m); // superを記述することで、親インスタンスから呼び出し可能
		if (this.flying) {
			super.attack(m);
		}
	}
}
