package sample02;

public class Main {
	public static void main(String[] args) {
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
	}
}
