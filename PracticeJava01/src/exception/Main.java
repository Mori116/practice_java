package exception;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		FileWriter fw = null;
		// 例外処理
    try {
    	// 通常実行される内容
      fw = new FileWriter("data.txt");
      fw.write("hi");
    } catch(Exception e) {
    	// 例外時に実行される内容
      System.out.println("エラーが発生しました。");
    } finally {
    	if (fw != null) { // fwがnullでない時
	    	try {
	    		// 例外があってもなくても必ず実行される内容
	    		fw.close();
	    	} catch(IOException e) {
	    		; // 空文
	    	}
    	}
    }


    // 例外インスタンスを自分で投げる
    Person p = new Person();
    p.setAge(-125); // 例外発生


    // オリジナルの例外
    try {
    	// 試験的に例外を発生させる
    	throw new UnsupportedMusicFileException("未対応のファイルです");
    } catch(Exception e) {
    	e.printStackTrace();
    }
	}
}
