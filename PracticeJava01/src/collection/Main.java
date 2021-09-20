package collection;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// ArrayListの利用
		ArrayList<String> names = new ArrayList<String>();
		// 3人追加
		names.add("たなか");
		names.add("ささき");
		names.add("さとう");
		System.out.println(names.get(1)); // ささき

		// 基本型とラッパークラスを変換したい場合、newの使用は非推奨
		ArrayList<Integer> points = new ArrayList<Integer>();
		// 自動的にinteger型に変換、格納される
		points.add(20);
		points.add(10);
		points.add(80);
		for (int i : points) {
			System.out.println(i);
		}
		// 推奨
		Integer i1 = Integer.valueOf(15);
		int i2 = i1.intValue();
		System.out.println(i2);
	}
}
