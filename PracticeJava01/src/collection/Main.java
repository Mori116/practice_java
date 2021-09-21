package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

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


		// イテレータの利用
		ArrayList<String> names01 = new ArrayList<String>();
		names01.add("たろう");
		names01.add("はなこ");
		names01.add("しょうた");
		Iterator<String> it = names01.iterator();
		while (it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}


		// setの利用
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("黄");
		colors.add("青");
		for (String s : colors) {
			System.out.print(s + "→"); // setの要素には順序がないため、実行結果が変わる
		}

		// 順序を決めて取り出したい場合
		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("panda");
		words.add("human");
		for (String s : words) {
			System.out.print(s + "→");
		}
	}
}
