// 演算子
public class sample01 {

	public static void main(String[] args) {
		int a = 15;
		int c;
		c = a + 3;  // c = 18
		System.out.println(c);
		c = a - 5;  // c = 10
		System.out.println(c);
		c = a * 2;  // c = 30
		System.out.println(c);
		c = a / 6;  // c = 2
		System.out.println(c);
		c = a % 4;  // c = 3
		System.out.println(c);


//		インクリメント・デクリメント演算子
		int b;
		b = 10;
		b++;  // a = 11(1増加する)
		System.out.println(b);
		b = 10;
		b--;  // a = 9(1減少する)
		System.out.println(b);

//		前置と後置:++,--の位置で処理が変わる
		int d;
		int e;

		d = 5;
		e = ++d;  // d をインクリメントした後に、d が e に代入される
		// それぞれの値は、d が「6」で e も「6」
		System.out.println(d);
		System.out.println(e);

		d = 5;
		e = d++;  // d を e に代入した後に、d がインクリメントされる
		// それぞれの値は、d が「6」で e が「5」
		System.out.println(d);
		System.out.println(e);


//		代入演算子
		int f;
		f = 10;

		f += 5;  // f = 15：fにf+5の結果を代入
		System.out.println(f);
		f -= 3;  // f = 12：fにf-3の結果を代入
		System.out.println(f);
		f *= 4;  // f = 48：fにf*4の結果を代入
		System.out.println(f);
		f /= 2;  // f = 24：fにf/2の結果を代入
		System.out.println(f);
		f %= 7;  // f = 3 ：fにf%7の結果を代入
		System.out.println(f);


//		関係（比較）演算子
		int g = 5;
		boolean h;

		h = g < 5;   // h = false
		System.out.println(h);
		h = g <= 5;  // h = true
		System.out.println(h);
		h = g > 4;   // h = true
		System.out.println(h);
		h = g >= 6;  // h = false
		System.out.println(h);
		h = g == 5;  // h = true
		System.out.println(h);
		h = g != 5;  // h = false
		System.out.println(h);


//		論理演算子
		boolean i = true;
		boolean j = false;
		boolean k;

		k = i && true;   // AND/ c = true
		System.out.println(k);
		k = i && false;  // c = false
		System.out.println(k);
		k = j || true;   // OR/ c = true
		System.out.println(k);
		k = j || false;  // c = false
		System.out.println(k);
		k = !i;          // NOT(falseの場合にtrueを返す)/ c = false
		System.out.println(k);
		k = !j;          // c = true
		System.out.println(k);


//		文字列の比較(※「==」等は使用を避け、equalsメソッドを使用すること)
		String m = "applePie";
		String n = "applePie";
		boolean o;
		o = m == n;  // c = true
		System.out.println(o);

//		p,qが別のオブジェクトを生成しているため、「==」を使用するとfalseを返す
//		そのため、文字数の比較はequalsメソッドを使用すること
		String p = "applePie";
		String q = new String("applePie");
		boolean r;
		r = p.equals(q);
		System.out.println(r);

	}

}
