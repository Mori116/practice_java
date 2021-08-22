// カプセル化

package capsule.human;

public class HumanCapsule {
	// privateのアクセス修飾子を設定して外部から隠蔽
    private String name;
    private int age;

    public HumanCapsule(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    getterメソッド
//    public 戻り値の型(フィールドの型)  getフィールド名() {
//       return this.フィールド名
//    }
    public String getName() { // nameのgetterメソッド
        return this.name;
    }

//    setterメソッド
//    public void setフィールド名(フィールドの型の引数) {
//       this.フィールド名 = フィールドの型の引数;
//    }
    public void setName(String name) { // nameのsetterメソッド
        this.name = name;
    }

 // ageは外部から変更禁止なので、setterメソッドは作成しない
    public int getAge() { // ageのgetterメソッド
        return this.age;
    }
}
