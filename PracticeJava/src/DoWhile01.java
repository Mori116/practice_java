//繰り返し処理:do-while(条件式をブロックの実行後に評価する)
//falseになるまで繰り返す
//ブロック実行後に条件式を評価するため、1回目がfalseでも最低1回は処理が実行される

//do {
//    ブロック（繰り返し処理）
//} while (条件式);

public class DoWhile01 {
    public static void main(String[] args) {
        int number = 1;
        do {
            number *= 2;
            System.out.println("DoWhile01 = " + number);
        } while (number < 50);
    }
}
