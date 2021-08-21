// 例外処理：例外処理の記述がないバーション（エラーメッセージを出力してプログラムが終了する）

package exception;

public class Exception01 {
	public static void main(String[] args) {
		System.out.println("100 + 0 は?");
		int result = 100 / 0;
		// 0で割り算するので、例外が発生
		// 例外が発生した以降の処理は実行されない
		System.out.println("計算結果" + result);
		System.out.println("プログラム終了");
	}
}
