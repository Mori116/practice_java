package time;

import java.text.SimpleDateFormat;
// Time API
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws Exception {
		// 日時
		Date now = new Date(); // 現在の日時
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(1600705425827L);
		System.out.println(past);

		// 読みやすい日時表示にする：CalendarやSimpleDateFormatは使いづらい等、問題点を抱えている...
		Calendar e = Calendar.getInstance();
		e.set(2019,8,22,1,23,45); // 6つのint型からDateインスタンスを生成する
		e.set(Calendar.MONTH, 9); // 月を9(10月)に変更する
		Date f = e.getTime();
		System.out.println(f);
		Date now01 = new Date(); // Dateインスタンスからint値を生成する
		e.setTime(now01);
		int y = e.get(Calendar.YEAR); // 年を取り出す
		System.out.println("今年は" + y + "年");

		SimpleDateFormat g = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date h = g.parse("2020/09/01 01:23:23"); // 文字列からDateインスタンスを生成する
		System.out.println(h);
		Date now02 = new Date(); // Dateインスタンスから文字列を生成する
		String i = g.format(now02);
		System.out.println("現在は" + i + "です");


		// Time APIの利用
		Instant i1 = Instant.now(); // 現在の日時を取得
		System.out.println(i1);

		// Instantとlong値との相互変換
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		long I = i2.toEpochMilli();
		System.out.println(I);

		// ZonedDateTimeの生成
		ZonedDateTime z1 = ZonedDateTime.now(); // 現在の日時を取得
		ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo")); // 日時を指定

		// InstantとZonedDateTimeの相互変換
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

		// ZonedDateTimeの利用
		System.out.println("東京：" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println("ロンドン：" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
		if (z2.isEqual(z3)) {
			System.out.println("同じ瞬間を指しています");
		}

		// LocalDateTimeの利用
		// LocalDateTimeの生成
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0); // 2020年1月1日9時5分を指定

		// LocalDateTimeとZonedDateTimeの相互変換
		ZonedDateTime z4 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z4.toLocalDateTime();

	}
}
