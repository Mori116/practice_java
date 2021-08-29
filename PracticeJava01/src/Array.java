public class Array {
	public static void main(String[] args) {
		// 配列変数の宣言
		int[] scores; // 要素の型[] 配列変数名
		// 要素の作成と配列変数への代入
		scores = new int[5]; // int型の要素を5つ作成し、scoresへ代入する

		/* 以上を1文にまとめることが可能
		int[] scores = new int[5]; */

		// 要素の数を忘れた場合、lengthで確認可能
		int num = scores.length;
		System.out.println("要素の数は" + num);

		// 配列の要素は自動的に初期化されるため、値を代入しなくてもエラーが発生しない
		System.out.println(scores[1]); // 要素が数値型の場合、0
		scores[1] = 10;
		System.out.println(scores[1]); // 代入したことにより、10が返る

		// 配列作成と初期化の代入を省略して記述可能
		int[] scores00 = new int[] {10, 20, 30, 40, 50}; // 要素の型[] 配列変数名 = new 要素の型[] {};
		int[] scores01 = {10, 20, 30, 40, 50};  // 要素の型[] 配列変数名 = {};


		// 配列とfor文の使用例：ループで配列の全要素を利用する
		int[] scores02 = {10, 20, 30, 40, 50};
		for (int i = 0; i < scores02.length; i++) { // 要素の数だけループ処理する
			System.out.println(scores02[i]); // iにはループ回数の数字が入り、scores02配列内の添え字からデータを取得
		}


		// 練習：テストの点数管理
		int[] scores03 = {40, 50, 60, 70, 80};
		int sum = 0;
		for (int i =0; i < scores03.length; i++) {
			sum += scores03[i];
		}
		int avg = sum / scores03.length;
		System.out.println("全教科の合計点は" + sum +"点です");
		System.out.println("平均点は" + avg + "点です");

		// 50点以上の教科がいくつあるか：if文の使用
		int count =0;
		for (int i = 0; i < scores03.length; i++) {
			if (scores03[i] >= 50) {
				count++;
			}
		}
		System.out.println("50点以上の教科は" + count + "つです");


		// 添え字を利用してデータを出力する
		int[] seq = new int[10];
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4); // 0から3までの数字をseqの要素へ代入
			char[] base = {'A', 'B', 'C', 'D'}; // base配列変数に0から3の添え字の要素へ文字を代入
			System.out.println(base[seq[i]] + ""); // seqの要素内容からbaseの添え字に一致した文字を画面に表示する
		}


		// 拡張for文：Javaには特殊なfor文の記述がある
		// 通常のfor文
		int[] scores04 = {80, 90};
		for (int i = 0; i < scores04.length; i++) {
			System.out.println(scores04[i]);
		}
		// 拡張for文
		int[] scores05 = {80, 90};
		for (int value : scores05) { // for (要素の型 任意の変数名 : 配列変数名)
			System.out.println(value);
		}


		// null：意図的に配列を参照されないようにする
		int[] array = {1, 2, 3};
		array = null;
		/* 74行目でnullを代入したため、エラーが発生する
		array[0] = 10; */


		// 2次元配列：2次元以上は多次元配列という
		// 配列の宣言
		int[] [] scores06 = new int[2] [3]; // 要素の型[] [] 配列変数名 = new 要素の型[行数] [列数];
		// 要素へ代入
		scores06[0] [0] = 40; // 配列変数名[行の添え字] [列の添え字]
		scores06[0] [1] = 50;
		scores06[0] [2] = 80;
		scores06[1] [0] = 50;
		scores06[1] [1] = 70;
		scores06[1] [2] = 60;
		System.out.println(scores06[0][1]);

		// 配列の宣言と初期化を1文にする
		int[] [] scores07 = {{10, 20, 30}, {40, 50, 60}};
		System.out.println(scores07.length); // scores07には要素が2つ
		System.out.println(scores07[0].length); // scores07の添え字0には、要素が3つ


		// 練習：数当てゲーム
		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int i = 0; i < numbers.length; i++) {
			if (input == numbers[i]) {
				System.out.println("アタリ!");
			}
		}

	}
}
