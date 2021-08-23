// 継承

//修飾子 class クラス名 extends スーパークラス名 {
//    サブクラスの処理
//}

package extend.human;

// Humanクラスを継承したEmployeeクラス
public class Employee extends Human {
    private String department;

    public Employee(String name, int age, String department) {
        super(name, age); // super:親インスタンス（スーパークラスのインスタンス）を指す変数
        this.department = department;
    }

    public String getEmployeeProfile() {
        String profile = "年齢は" + this.age + "です。";
        profile += "サラリーマンで、部署は" + this.department + "です。";
        return profile;
    }
}
