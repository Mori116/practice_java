
public class Null01 {

    public static void main(String[] args) {
        String string1;
        string1 = "あいう";
        /* ”あいう”の文字数を出力 */
        System.out.println(string1 + "の文字数：" + string1.length());
        string1 = "";
        /* ””（空文字）の文字数を出力 */
        System.out.println(string1 + "の文字数：" + string1.length());
        string1 = null;
        /* nullの変数を参照するとNullPointerExceptionのエラー */
        /* System.out.println(string1 + "の文字数：" + string1.length()); */


        /* プリミティブ型→ラッパークラス型へ変換、逆変換 */
        Integer integer1 = 5; /* オートボクシング */
        Integer integer2 = Integer.valueOf(5); /* 明示的なボクシング */
        int int1 = integer1; /* アンボクシング */
        int int2 = integer2.intValue(); /* 明示的なアンボクシング */
        System.out.println(int1);
        System.out.println(int2);


        /* 配列 */
        int[] array1 = new int[3]; /* 配列の宣言と生成 */
        /* int array1[] = new int[3]; []は変数名の後ろでもOK */
        array1[0] = 60; /* インデックス番号「0」を指定して１番目の要素にデータを代入 */
        array1[2] = 20; /* ２番目の要素より先に３番目の要素にデータを代入 */
        array1[1] = 20; /* ３番目と同じ値を２番目の要素に代入 */
        int int3 = array1[2]; /* インデックス番号「2」を指定して３番目の要素を取得 */
        System.out.println(int3);

    }

}
