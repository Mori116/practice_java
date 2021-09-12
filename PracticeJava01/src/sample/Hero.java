package sample;

public class Hero { // extendsで親指定していない場合、自動的にjava.lang.Objectを親クラスとして継承する
	String name;
	int hp;

	public String toString() {  // 親クラスのtoStringメソッドをオーバーライド
		return "名前:" + this.name + "/HP:" + this.hp;
	}

	public boolean equals(Object o) { // 親クラスのequalsメソッドをオーバーライド
		if (this == o) { // 等値なら等価
			return true;
		}
		if (o instanceof Hero) {
			Hero h = (Hero)o;
			if (this.name.equals(h.name)) { // 名前が等しければ等価
				return true;
			}
		}
		return false;
	}
}
