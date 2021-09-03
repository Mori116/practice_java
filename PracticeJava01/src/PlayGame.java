public class PlayGame {
	public static void main(String[] args) {
		// Heroインスタンスを生成し、h変数に代入
		Hero h1 = new Hero("ヒロ"); // クラス名 変数名 = new クラス名();
		Hero h2 = new Hero(); // newした直後にコンストラクタが実行される
		// Monsterインスタンスを生成
		Monster m00 = new Monster();
		Monster m01 = new Monster();
		// Clergymanインスタンスを生成
		Clergyman c = new Clergyman();
		// Swordインスタンスを生成
		Sword s = new Sword();
		// Swordインスタンスを生成
		Wizard w = new Wizard();

		// Heroのフィールドに初期値をセットする
		// h1.name = "ヒロ"; →変数名.フィールド名 = 値;
		h1.level = 10;
		// h1.hp = 100; →Heroクラスのコンストラクタによって、既にhpに100が代入されている
		// h2.name = "ゆうた"; →インスタンス生成時、引数にnameを指定。コンストラクタによりHeroクラスにてnameへ代入
		h2.level = 10;
		// h2.hp = 10; →Heroクラスのコンストラクタによって、既にhpに100が代入されている
		// Swordのフィールドに初期値をセットする
		s.name = "雷剣";
		s.damage = 5;
		h1.sword = s; // HeroのswordフィールドにSwordインスタンスを代入
		System.out.println("勇者" + h1.name + "が誕生しました！");
		System.out.println("勇者" + h2.name + "が誕生しました！");
		System.out.println("ステータス：レベル" + h1.level + "、HP" + h1.hp); // hpはコンストラクタにより100
		System.out.println(h1.sword.name + "を手に入れた！");
		// Monsterのフィールドに初期値をセットする
		m00.name = 'A';
		m00.hp = 50;
		m01.name = 'B';
		m01.hp = 40;
		// Clergymanのフィールドに初期値をセットする
		c.name = "セイ";
		// Wizardのフィールドに初期値をセットする
		w.name = "アリス";

		// 各メソッドを呼び出す
		h1.slip();
		h1.sit(5);
		h1.slip();
		c.selfAld();
		c.pray(2);
		h1.attack();
		w.heal(h1); // h1の勇者に対して処理
		w.heal(h2); // h2の勇者に対して処理
		m00.runAway();
		m01.runAway();
		h1.runAway();

	}
}
