//繰り返し処理:for
//falseになるまで繰り返す
//指定した回数分ループして処理を行いたい場合に使用する

//for (初期化式; 条件式; 変化式) {
//    ブロック(繰り返し処理)
//}

public class For01 {
    public static void main(String[] args) {
        for (int number = 1; number <= 5; number++) {
            System.out.println("For01 = " + number);
        }
    }
}
