public class PlayGame {
	public static void main(String[] args) {
		// Heroインスタンスを生成し、h変数に代入
		Hero h = new Hero(); // クラス名 変数名 = new クラス名();
		// Monsterインスタンスを生成
		Monster m00 = new Monster();
		Monster m01 = new Monster();
		// Clergymanインスタンスを生成
		Clergyman c = new Clergyman();

		// Heroのフィールドに初期値をセットする
		h.name = "ヒロ"; // 変数名.フィールド名 = 値;
		h.level = 10;
		h.hp = 100;
		System.out.println("勇者" + h.name + "が誕生しました！");
		System.out.println("ステータス：レベル" + h.level + "、HP" + h.hp);
		// Monsterのフィールドに初期値をセットする
		m00.name = 'A';
		m00.hp = 50;
		m01.name = 'B';
		m01.hp = 40;
		// Clergymanのフィールドに初期値をセットする
		c.name = "セイ";

		// 各メソッドを呼び出す
		h.slip();
		h.sit(5);
		h.slip();
		c.selfAld();
		c.pray(2);
		m00.runAway();
		m01.runAway();
		h.runAway();

	}
}
