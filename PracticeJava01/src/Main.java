public class Main {
	public static void main(String[] args) {
		System.out.println("hello, world!!");
		System.out.println("hello!");
		System.out.println("world!");
		System.out.println("31 + 31の計算をします");
		System.out.println(31 + 31);

		// 変数
		int x;
		x = 6;
		System.out.println(x * x * 3.14);

		int a = 3;
		int b = 5;
		int c = a * b;
		System.out.println("縦幅" + a + "横幅" + b + "の長方形の面積は、" + c);


		// 定数
		final int AGE = 30;
		System.out.println("年齢は" + AGE + "です");


		// 各データ型
		boolean judge = true;
		System.out.println(judge);

		char character = '駆';
		System.out.println(character);

		double circle = 3.14;
		System.out.println(circle);

		long number = 314159265853979L;
		System.out.println(number);

		String message = "夕飯はカレーです。";
		System.out.println(message);
	}
}
