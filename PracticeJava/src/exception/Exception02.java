// 例外処理；try-catch文

//try {
//    tryブロック（例外が発生する可能性がある処理）
//} catch (例外クラス 変数名) {
//    catchブロック（例外が発生した時に実行する処理）
//} finally {
//    finallyブロック(例外発生の有無にかかわらず必ず実行する処理)
//}

package exception;

public class Exception02 {
	public static void main(String[] args) {
		try {
			System.out.println("100 + 0 は?");
			int result = 100 / 0;
			System.out.println("計算結果" + result);
		} catch (ArithmeticException e) { // ArithmeticExceptionクラスの例外が発生した場合の例外処理
			System.out.println("例外が発生"); // 例外クラスが一致するので、例外処理が実行される
		} finally {
			System.out.println("プログラム終了"); // 例外発生しても処理を実行
		}
	}
}
