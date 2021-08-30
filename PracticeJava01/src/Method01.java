public class Method01 {
	// メソッドの定義
	public static void hello() { // public static 戻り値の型 メソッド名(引数リスト)
		System.out.println("佐々木さん、こんにちは！"); // メソッドが呼び出された時に実行される処理
	}

	public static void methodA() {
		System.out.println("methodAです");
		methodB(); // methodBを呼び出す
	}

	public static void methodB () {
		System.out.println("methodBです");
	}


	// 引数の使用
	public static void hello01(String name) {
		System.out.println(name + "さん、こんにちは！");
	}

	public static void add(int x, int y) { // 引数が複数の場合:呼び出し元と同じ型であることが必須
		int answer = x + y;
		System.out.println("x + yは" + answer);
	}


	// 戻り値の型：void(何も戻さない), int(整数を戻す), String(文字列を戻す)
	public static int add01(int x, int y) { // public static 戻り値の型 メソッド名(引数リスト)
		int ans = x + y;
		return ans; // 戻り値：呼び出し元へansの値を渡すことができる
		// returnは戻り値とメソッドの終了を兼ねており、return以降に処理を記述しても処理されないため、注意が必要
	}


	/* オーバーロード:同じメソッド名を定義すること
	 仮引数の型が異なる場合は、同じメソッド名でもOK */
	public static int num(int x, int y) {
		return x + y;
	}

	public static double num(double x, double y) {
		return x + y;
	}

	public static String num(String x, String y) {
		return x + y;
	}

	// 仮引数の型が同じでも、引数の数が異なる場合もOK
	public static int num(int x, int y, int z) {
		return x + y + z;
	}


	// 配列
	public static void printArray(int[] array) { // 引数にint[]の配列型を指定
		for (int element : array) {
			System.out.println(element);
		}
	}
	// 戻り値に配列を使用
	public static int[] makeArray(int size) {
		int[] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray;
	}


	// 練習
	public static double calcTriangleArea(double bottom, double height) {
		double ans = (bottom * height) / 2;
		return ans;
	}

	public static double calcCircleArea(double radius) {
		double ans = radius * radius * 3.14;
		return ans;
	}




	// メソッドの呼び出し ※処理は、必ずmainメソッドから行われる
	public static void main(String[] args) {
		System.out.println("【メソッドを呼び出す】");

		hello(); // helloメソッドを呼び出す
		methodA(); // methodAを呼び出す

		// 引数の使用
		hello01("田中"); // hello01メソッドを呼び出す
		add(10, 20); // addメソッドを呼び出す

		// 戻り値
		int ans = add01(20, 5); // add01メソッドを呼び出す:add01メソッドで戻り値を受け取り、ans変数に代入
		System.out.println("20 + 5は" + ans);
		System.out.println("20 + 5は" + add01(20, 5)); // 変数に代入しなくても使用可能

		// オーバーロード
		System.out.println(num(5, 5));
		System.out.println(num(2.0, 2.0));
		System.out.println(num("Hello", "!!"));
		System.out.println(num(5, 5, 5));

		// 配列
		int [] array = {1, 2, 3};
		printArray(array);
		int[] array01 = makeArray(3);
		for (int i : array01) {
			System.out.println(i);
		}

		// 練習
		System.out.println("＊練習＊");
		double triangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println("底辺が10cmで、高さが5cmの三角形の面積は" + triangleArea);
		double circleArea = calcCircleArea(5.0);
		System.out.println("半径が5cmの円の面積は" + circleArea);

		System.out.println("【メソッドの呼び出しが完了しました】");
	}

}
