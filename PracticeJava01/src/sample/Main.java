package sample;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		Hero h1 = new Hero();
		h.name = "カナト";
		h.hp = 100;
		h1.name = "カナト";
		h1.hp = 100;
		System.out.println(h.toString()); // Heroクラスでオーバーライドしなかった場合は、型名@英数字で表示されるためオーバーライド推奨

		if (h.equals(h1) == true) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}
	}

}
