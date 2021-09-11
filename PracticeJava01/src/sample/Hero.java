package sample;

public class Hero { // extendsで親指定していない場合、自動的にjava.lang.Objectを親クラスとして継承する
	String name;
	int hp;

	public String toString() {  // 親クラスのtoStringメソッドをオーバーライド
		return "名前:" + this.name + "/HP:" + this.hp;
	}
}
