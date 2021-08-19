// 繰り返し処理:while(条件式をブロックの実行前に評価する)
//falseになるまで繰り返す

//while (条件式) {
//    ブロック（繰り返し処理）
//}

public class While01 {
	public static void main(String[] args) {
		int number = 1;
		while (number < 50) {
			number *= 2;
			System.out.println("while01 = " + number);
		}
	}
}