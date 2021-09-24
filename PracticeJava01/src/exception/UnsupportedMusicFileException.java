package exception;

// オリジナルの例外を定義することが可能
public class UnsupportedMusicFileException extends Exception { // チェック例外にする
	// エラーメッセージを受け取るコンストラクタ
	public UnsupportedMusicFileException(String msg) {
		super(msg);
	}
}
