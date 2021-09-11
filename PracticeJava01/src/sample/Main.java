package sample;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "かなと";
		h.hp = 100;
		System.out.println(h.toString()); // Heroクラスでオーバーライドしなかった場合は、型名@英数字で表示されるためオーバーライド推奨
	}
}
