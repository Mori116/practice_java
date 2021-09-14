package sample;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		Hero h1 = new Hero();
		h.name = "カナト";
		h.hp = 100;
		h1.name = "カナト";
		h1.hp = 100;
		System.out.println(h.toString()); // Heroクラスでオーバーライドしなかった場合は、型名@英数字で表示されるためオーバーライド推奨

		if (h.equals(h1) == true) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}

		Hero.money = 100;  // moneyはHeroクラス共通のフィールド ※インスタンスをnewしていなくても利用可能（クラス変数）
		System.out.println(Hero.money);
		System.out.println(h.money);
		h1.money = 300; // h1に代入するとHero.moneyに反映され、h.moneyでも300となる
		System.out.println(h.money);

		Hero.setRandomMoney(); // インスタンスをnewしていなくても利用可能
		System.out.println(Hero.money); // ランダムな金額
		Hero h2 = new Hero();
		System.out.println(h2.money);
		System.out.println(h1.money);
		System.out.println(h.money);
	}

}
