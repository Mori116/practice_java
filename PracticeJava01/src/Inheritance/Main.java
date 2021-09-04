package Inheritance;

public final class Main { // finalを記述することでクラスの継承禁止が可能
	public static void main(String[] args) {
		Hero h = new Hero();
		SuperHero sh = new SuperHero();
		h.run();
		sh.run(); // SuperHeroクラスにはrun()の記述がないが、Hero継承のためHero内のrun()が使用可能
	}
}
