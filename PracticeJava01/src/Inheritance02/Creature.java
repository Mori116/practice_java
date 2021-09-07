package Inheritance02;

public interface Creature {
	// 基本的にフィールドは持たない
	int HP = 100; // フィールドを宣言する場合、自動的にpublic static finalが自動的に補われる：定数のみ宣言可能
	void runAway(); // インタフェース宣言したメソッドは記述しなくても自動的にpublid abstractと判断される
}
