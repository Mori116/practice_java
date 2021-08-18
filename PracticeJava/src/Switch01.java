// 条件分岐 switchの使用

//		switch (式（変数や値）){
//		case 値:
//		    ブロック(処理);
//		    break;
//		default:
//		    ブロック(処理);
//		}

public class Switch01 {
	public static void main(String[] args) {
		int val = 2;
		switch (val) {
		case 3: // 変数とcaseの値が一致する場合、ブロック内の処理を実行する
			System.out.println("よくできました！");
			break; // breakが処理されると、それ以降のcase文は評価されずに、switch文の分岐処理を終了する
		case 2:
			System.out.println("ふつうでした！");
			break;
		default: // 全てのcase文の値と一致しない場合の処理を記述する
			System.out.println("がんばろう！");
		}
	}
}
