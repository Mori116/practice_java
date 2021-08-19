//繰り返し処理:拡張for
//配列やコレクションの全要素に対して、繰り返し処理を行なう

//for (型 変数名：配列やコレクションの変数) {
//    ブロック(繰り返し処理)
//}

public class For02 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        for (int number : array) {
            System.out.println("For02 = " + number);
        }
    }
}
