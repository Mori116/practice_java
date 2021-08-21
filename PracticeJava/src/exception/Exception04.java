// 例外処理；throws文(例外をスローして呼び出し元に例外処理させたい場合に使用する)

//修飾子 戻り値の型 メソッド名(引数) throws 例外クラスの型 {
//    処理
//    return 戻り値;
//}

package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception04 {
    public static void main(String[] args) {
        try {
            Exception04.readFile("exception.txt");
        } catch (FileNotFoundException e) { // 呼び出し元も例外処理を記述しないとコンパイルエラーになる
            System.out.println("FileNotFoundException例外が発生");
        }
        System.out.println("プログラム終了");
    }

    // readFileメソッドの定義
    public static void readFile(String fileName) throws FileNotFoundException {
        System.out.println("ファイルの読み込み開始");
        // ファイルが存在しないため例外が発生
        FileReader fr = new FileReader(fileName);
        System.out.println(fileName + "の読み込み完了");
    }
}
