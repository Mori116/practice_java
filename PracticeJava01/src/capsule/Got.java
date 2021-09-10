package capsule;

public class Got {
	void talk(Hero h) {
		System.out.println("神：我が世界へようこそ、" + h.getName() + "。歓迎します。");
		// Heroクラスでnameフィールドをprivate設定しているが、メソッドにすることで他クラスからも呼び出せる
	}
}
