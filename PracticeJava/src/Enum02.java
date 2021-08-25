// 列挙型:Enum
// 変数に代入可能

public enum Enum02 {
	APPLE, ICE_CREAM, CAKE;

	public static void main(String[] args) {
		Enum02 apple = Enum02.APPLE;
		Enum02 iceCream = Enum02.ICE_CREAM;
		Enum02 cake = Enum02.CAKE;

		System.out.println(apple);
		System.out.println(iceCream);
		System.out.println(cake);
		printDessertName(Enum02.CAKE); // 下部でメソッド定義

		// name():定数名そのものをString型で返す
		System.out.println(Enum02.APPLE.name());
		// valueOf():name()の反対。String型の名称から列挙型のインスタンスを取得したい場合
		Enum02 apple01 = Enum02.valueOf("APPLE");
		System.out.println(apple01);

		// ordinal():列挙した順序をint型で返す
		System.out.println(Enum02.APPLE.ordinal());
		System.out.println(Enum02.ICE_CREAM.ordinal());
		System.out.println(Enum02.CAKE.ordinal());

	}

	// 引数の型に用いることが可能
	static void printDessertName(Enum02 dessert){
	    System.out.println(dessert);
	}

}
