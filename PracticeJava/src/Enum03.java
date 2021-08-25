// 列挙型:Enum
// 値の追加可能

public enum Enum03 {
	// それぞれに値段を指定
    APPLE(100), ICE_CREAM(200), CAKE(300);

	// 値段を保持するフィールド
    private int price;

    // コンストラクタを追加。引数はint型の値段。
    private Enum03(int price) {
        this.price = price;
    }

    // 値段を取得するメソッドを追加
    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
    	System.out.println(Enum03.APPLE.getPrice());
    	System.out.println(Enum03.ICE_CREAM.getPrice());
    	System.out.println(Enum03.CAKE.getPrice());
    }

}
