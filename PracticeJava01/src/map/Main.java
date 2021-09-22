package map;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		// ペアで格納する
		prefs.put("大阪", 30);
		prefs.put("北海道", 25);
		prefs.put("東京", 30);
		int tokyo = prefs.get("東京"); // キーを指定して値を取得する
		System.out.println("東京の温度は" + tokyo);
		prefs.remove("北海道");
		prefs.put("大阪", 31); // 値を上書きする
		int osaka = prefs.get("大阪");
		System.out.println("大阪の温度は" + osaka);


		// 1つずつ取り出す
		Map<String, Integer> prefs01 = new HashMap<String, Integer>();
		prefs01.put("秋田", 27);
		prefs01.put("兵庫", 28);
		prefs01.put("広島", 28);
		for (String key : prefs01.keySet()) {
			int value = prefs01.get(key);
			System.out.println(key + "の温度は" + value);
		}
	}
}
