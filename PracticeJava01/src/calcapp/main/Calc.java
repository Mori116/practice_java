package calcapp.main; // パッケージ化することによって、他のパッケージで同じクラス名を使用しても区別可能となる
import calcapp.logics.CalcLogic;  // パッケージ名.クラス名
// import calcapp.logics.*; → calcapp.logicsパッケージの全クラスをインポートする場合

public class Calc {
	public static void main(String[] args) {
		int a = 10; int b = 2;
		/* パッケージ名.クラス名.メソッド名(引数)：パッケージ、クラス名先で定義したメソッドが使用できる
		int total = calcapp.logics.CalcLogic.tasu(a, b);
		int delta = calcapp.logics.CalcLogic.hiku(a, b); */

		// import文を記述することで、8,9行目の文よりスッキリさせることができる
		int total = CalcLogic.tasu(a, b);
		int delta = CalcLogic.hiku(a, b);
		System.out.println("10 + 2は" + total + "、10 - 2は" + delta);
	}
}
