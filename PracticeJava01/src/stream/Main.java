package stream;

import java.io.FileReader;
import java.io.FileWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		// ファイルから1文字ずつ読み込む
		FileReader fr = new FileReader("data.txt"); // ファイルを開く
		int input = fr.read();
		while (input != -1) {
			System.out.print((char)input);
			input = fr.read();
		}
		fr.close(); // ファイルを閉じる


		// ファイルに1文字ずつ書き込む
		FileWriter fw = new FileWriter("data.txt"); // ファイルを開く
		fw.write('こ');
		fw.write('ん');
		fw.write('に');
		fw.write('ち');
		fw.write('は');
		fw.close(); // ファイルを閉じる
	}
}
