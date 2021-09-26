package web;

import java.io.InputStream;
import java.net.URL;

public class Main {
	public static void main(String[] args) throws Exception {
		URL u = new URL("https://~"); // 接続先のURLを記述する
		InputStream is = u.openStream(); // インターネットへの接続
		int i = is.read();
		while (i != -1) { // ページの終わりまで繰り返す
			char c = (char) i;
			System.out.print(c); // 読んだ内容を表示する
			i = is.read();
		}
	}
}
