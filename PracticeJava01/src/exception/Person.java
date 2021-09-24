package exception;

public class Person {
	int age;

	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("年齢は0以上の数を指定してください。指定値＝" + age);
		}
		this.age = age; // 問題がない場合はフィールドに値をセットする
	}
}
