public class Method {
	public static void main(String[] args) {
		// メソッド
		// 改行せずに画面に文字を表示する
		String name = "ささき";
		System.out.print("私の名前は");
		System.out.print(name);
		System.out.print("です");

		// 2つの値を比較して大きい方を取得する
		int m = 2;
		int n = 3;
		int o = Math.max(m, n);
		System.out.println("比較実験：" + m + "と" + n + "で大きい方は・・・" + o);

		// 文字列を数値に変換する
		String p = "30";
		int q = Integer.parseInt(p);
		System.out.println("今年で" + (q + 1) + "です");

		// 乱数を発生させる
		int r = new java.util.Random().nextInt(90); // 0以上90未満の数字がランダムでrに代入される
		System.out.println("あなたは" + r + "歳ですか？");

		// キーボードから入力を受け付ける
		System.out.println("あなたの名前を入力してください。");
		String lastName = new java.util.Scanner(System.in).nextLine(); // 1行の文字列の入力を受け付ける
		System.out.println("年齢を入力してください。");
		int age = new java.util.Scanner(System.in).nextInt(); // 1つの整数の入力を受け付ける
		System.out.println("ようこそ" + age + "歳の" + lastName + "さん");



		// 練習：占い
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String last_name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age_01 = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);
		fortune++;
		System.out.println("占いの結果が出ました！");
		System.out.println(age_01 + "歳の" + last_name + "さん、あなたの運気番号は" + fortune + "です");
		System.out.println("1:大吉 2:中吉 3:吉 4:凶");
	}
}
