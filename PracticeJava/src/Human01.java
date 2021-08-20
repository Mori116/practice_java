// クラス
//修飾子 class クラス名 {
//    修飾子 コンストラクタ(引数) {
//        // 初期化処理
//    }
//}

public class Human01 {
//	メンバー変数
	public String name;
	public int age;

//	引数なしのコンストラクタ
	public Human01() {
		name = "山田";
		age = 20;
	}

//	引数２つのコンストラクタ
	public Human01(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
