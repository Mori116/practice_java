package capsule;

public class Hero {
	private String name = "たろう";
	String nickname;
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


	/* getterメソッド:フィールド値を取り出すだけのメソッド
	public フィールドの型 getフィールド名() {
		return this.フィールド名;
	}
	*/
	public String getName() {
		return this.name; // privateにしているため、メソッドにして他クラスでも呼び出せるようにする
	}


	/* setterメソッド:フィールドに値を代入するだけのメソッド
	public void setフィールド名(フィールドの型 任意の変数名) {
		this.フィールド名 = 任意の変数名;
	}
	*/
	public void setNickname(String nickname) {
		if (nickname == null) {
			throw new IllegalArgumentException("名前がnullのため、処理を中断します");
			// IllegalArgumentException：エラーを出し、プログラムを強制停止する命令
		}
		if (nickname.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎるため、処理を中断します");
		}
		if (nickname.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎるため、処理を中断します");
		}
		this.nickname = nickname;
	}

}
