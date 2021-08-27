
public class Operator {
	public static void main(String[] args) {
		int a;
	    int b;
	    a = 20;
	    b = a + 5;
		System.out.println(a);
		System.out.println(b);


		// エスケープシーケンスの使用(¥または\)
		System.out.println("私の好きな記号は(\")です");
		/* 以下の文だと、コンパイルエラーになる。
		   System.out.println("私の好きな記号は(")です"); */
		System.out.println("この商品は¥¥1000です");


		// 演算子の優先順位
		int c = 1 + 5 * 3; // *が優先順位が高い
		System.out.println(c); // 16を返す
		int d = (1 + 5) * 3; // ()で囲んだ範囲を優先する
		System.out.println(d); // 18を返す


		// 結合規則（優先順位が同じ演算子が複数ある場合の規則）
		// +演算子は左から右へ評価する
		int e = 10 + 5 + 2; // 10 + 5が評価され、15。15 + 2となり、結果17。
		System.out.println(e);
		// =演算子は右から左へ評価する
		int g;
		int f = g = 10; // g = 10が評価され、gに10が代入。f = 10となり、結果fに10が代入される。
		System.out.println(f);


		// 算術演算子(+,-,*,/,%)
		double h = 9.0 / 2; // 割り算で余りも出力したい場合は少数にすること
		System.out.println(h);


		// 代入演算子（右オペランドの内容を左オペランドの変数に代入する）
		int i = 10;
		i += 15; // i + 15が評価された後に、i = 25が代入される
		System.out.println(i);


		// インクリメント、デクリメント演算子（他の演算子と一緒に使用しないこと）
		int j = 100;
		j++; // 単独で使用を推奨
		System.out.println(j);
		j--;
		System.out.println(j);


		/* キャスト演算子：強制的な型変換し、大きな型から小さな型へ代入する
		   よほどのことがない限り使用しない */
		int age = (int)3.2; // 3.2をint型に変換して代入
		System.out.println(age);


		// 型が異なる場合、大きい型の方に統一される
		double k = 8.5 / 2; // int型の2をdouble型の2.0へ変換
		long l = 5 + 2L; // int型の5をlong型の5Lへ変換
		String msg = "私の身長は" + 180; // int型の180をString型の180へ変換
		System.out.println(k);
		System.out.println(l);
		System.out.println(msg);
	}
}
