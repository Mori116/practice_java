public class BranchAndRoop {
	public static void main(String[] args) {
		// if文：条件分岐文
		boolean tenki = true;
		if (tenki == true) {
			System.out.println("洗濯する");
			System.out.println("散歩する");
		} else {
			System.out.println("DVDを観る");
		}

		/* ブロック内が1文の場合、{}の省略が可能だが、ミス防止のため使用は推奨しない。
		boolean tenki = true;
		if (tenki == true) {
		    System.out.println("洗濯する");
		    System.out.println("散歩する");
		} else
		    System.out.println("DVDを観る"); */

		// 文字列を比較する場合、==ではなくequalsを使用する
		String otenki = "晴れ";
		if (otenki.equals("晴れ")) {
			System.out.println("ショッピングします");
		} else {
			System.out.println("映画を観ます");
		}


		// 練習：占い
		System.out.println("運勢を占います");
		int number = new java.util.Random().nextInt(4) + 1; // 1~4の乱数をnumberに代入
		if (number == 1) {
			System.out.println("大吉!");
		} else if (number == 2) {
			System.out.println("中吉");
		} else if (number == 3) {
			System.out.println("吉");
		} else {
			System.out.println("凶");
		}

		/* 全ての条件式が左辺と右辺が一致するか比較しており、内容が整数・文字列・文字の場合
		switch文で書き換えが可能 */
		System.out.println("運勢を占います");
		int fortune = new java.util.Random().nextInt(4) + 1;
		switch (fortune) {
			case 1: // コロン(:)を記述する
				System.out.println("大吉!");
				break; // 記述を忘れると次の文に処理が進んでしまう
			case 2:
				System.out.println("中吉");
				break;
			case 3:
				System.out.println("吉");
				break;
			default: // if文でのelseと同じ
				System.out.println("凶");
		}


		// while文：繰り返し文
		boolean doorClose = false;
		while (doorClose == true) { // 62行目でtrueを代入した場合、64,65行目がループ処理される。
			System.out.println("ノックする");
			System.out.println("1分待つ");
		}

		// do-while文：ブロックを実行した後に条件判定を行う
		int temp = 27;
		do {
			temp--;
			System.out.println("温度を1度下げました");
		} while (temp > 25);

		// for文：回数指定でループ処理が可能
		for (int i = 0; i < 10; i++) {
			System.out.println( (i + 1) + "回目のこんにちは");
		}

		// ネスト：分岐文の中に分岐文や繰り返し文の中に分岐文等を入れること
		for (int j = 1; j < 10; j++) {
			for (int k = 1; k < 10; k++) {
				System.out.print(j * k);
				System.out.print(" ");
			}
			System.out.println("");
		}
		/* 外側のループ1回目→内側のループk < 10まで繰り返す→外側のループ2回目→内側のループk < 10まで繰り返す
		の処理を外側のループj < 10まで繰り返す */


		// if文の使用例
		int isHungry = 0;
		String food = "バナナ";
		System.out.println("こんにちは");
		if (isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");
		}
		if (isHungry == 1) {
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");


		// switch文の使用例:メニューの選択
		System.out.print("[メニュー]1:検索 2:登録 3:削除 4:変更>");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch (selected) {
			case 1:
				System.out.println("検索します");
				break;
			case 2:
				System.out.println("登録します");
				break;
			case 3:
				System.out.println("削除します");
				break;
			case 4:
				System.out.println("変更します");
				break;
		}


		// for,if文の使用例：数当てゲーム
		System.out.print("【数当てゲーム】");
		int ans = new java.util.Random().nextInt(10);
		for (int i = 0; i < 5; i++) {
			System.out.println("0から9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == ans) {
				System.out.println("一致しました！アタリです！");
				break;
		    } else {
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを終了します");

	}
}
