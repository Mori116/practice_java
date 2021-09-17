package sample02;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date; // 日時の利用;

public class Main {
	public static void main(String[] args) throws Exception {
		// 文字列処理について
		String s00 = "Hello,Java";
		String s01 = "Java";
		String s02 = "java";

		if (s01.equals(s02)) { // 内容が等しいか確認
			System.out.println("s01とs02は等しい");
		}
		if (s01.equalsIgnoreCase(s02)) { // 大文字、小文字関係なく内容が等しいか確認
			System.out.println("s01とs02は大文字、小文字を区別しなければ等しい");
		}
		System.out.println("s00の長さは" + s00.length() + "です");
		if (s00.isEmpty()) { // 空白または0か確認
			System.out.println("s00は空白です");
		}


		// 文字列の検索
		String s03 = "Java and JavaScript";

		if (s03.contains("Java")) { // 一部に文字列を含むか検索
			System.out.println("文字列s03は、Javaを含んでいる");
		}
		if (s03.endsWith("Java")) { // 文字列で終わるか検索
			System.out.println("文字列s03は、末尾にJavaがある");
		}
		System.out.println("文字列s03で最初にJavaが登場する位置は" + s03.indexOf("Java")); // 文字列が最初に登場する位置を知らべる
		System.out.println("文字列s03で最後にJavaが登場する位置は" + s03.lastIndexOf("Java")); // 文字列が最後に登場する位置を調べる


		// 文字列を切り出す
		String s04 = "Java programming";
		System.out.println("文字列s04の4文字目以降は" + s04.substring(3));
		System.out.println("文字列s04の4~8文字目は" + s04.substring(3, 8)); // 指定した8は結果に含まれない;


		// 文字列の変換
		String s05 = "Java";
		System.out.println("小文字へ変換" + s05.toLowerCase());
		System.out.println("大文字へ変換" + s05.toUpperCase());


		// 文字列の連結
		StringBuilder sb = new StringBuilder(); // +演算子を使用するより処理が速い
		for (int i = 0; i < 10; i++) { // 文字列を10回連結する
			sb.append("Java");
		}
		String s = sb.toString();
		System.out.println(s);


		// マッチング
		String a = "Java";
		a.matches("Java"); // true
		a.matches("java"); // false
		"Java".matches("J.va"); // 1文字目J、2文字目は何でもOK、3文字目はv、4文字目はaであれば、true
		a.matches("Ja.*"); // Jaで始まる任意の文字


		// 文字列の分割
		String b = "ab,cd:ef";
		String[] words = b.split("[,:]"); // ,と:で文字列を分割する
		for (String w : words) {
			System.out.print(w + "->");
		}


		// 文字列の置換
		String c = "ab,cd:ef";
		String w = c.replaceAll("[bdf]","X");
		System.out.println(w);


		// 文字列の表示揃え
		String d = String.format("%sを%d日間勉強しよう", "Java", 30);
		System.out.println(d);
		System.out.printf("%sを%d日間勉強しよう", "Java", 30); // formatの使用と同時に画面に表示する場合


		// 日時
		Date now = new Date(); // 現在の日時
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(1600705425827L);
		System.out.println(past);

		// 読みやすい日時表示にする：CalendarやSimpleDateFormatは使いづらい等、問題点を抱えている...
		Calendar e = Calendar.getInstance();
		e.set(2019,8,22,1,23,45); // 6つのint型からDateインスタンスを生成する
		e.set(Calendar.MONTH, 9); // 月を9(10月)に変更する
		Date f = e.getTime();
		System.out.println(f);
		Date now01 = new Date(); // Dateインスタンスからint値を生成する
		e.setTime(now01);
		int y = e.get(Calendar.YEAR); // 年を取り出す
		System.out.println("今年は" + y + "年");

		SimpleDateFormat g = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date h = g.parse("2020/09/01 01:23:23"); // 文字列からDateインスタンスを生成する
		System.out.println(h);
		Date now02 = new Date(); // Dateインスタンスから文字列を生成する
		String i = g.format(now02);
		System.out.println("現在は" + i + "です");
	}
}
