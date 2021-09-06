package Inheritance02;

import Inheritance.Monster;

public abstract class Character {  //　抽象メソッドを１つでも含む場合、abstractでの抽象クラスを宣言必要
	String name;
	int hp;

	public void runAway() {
		System.out.println(this.name + "は逃げ出した！");
	}

	public abstract void attack(Monster m); // 処理内容が未定なもの（抽象メソッド）を宣言：abstract

}
