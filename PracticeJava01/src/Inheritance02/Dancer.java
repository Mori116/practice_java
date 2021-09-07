package Inheritance02;

import Inheritance.Monster;

public class Dancer extends Character {

	public void dance() {
		System.out.println(this.name + "は舞を舞った！");
	}

	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("モンスターに5のダメージ");
		// m.hp -= 5;
	}
}
