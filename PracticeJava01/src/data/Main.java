package data;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
	public static void main(String[] args) throws Exception {
		Class.forName("org.j2.Driver");
		String dburl = "jdbc:h2:~/test"; // 接続先DBを指定
		String sql = "INSERT INTO EMPLOYEES(name) VALUES('aoki')";
		Connection conn = DriverManager.getConnection(dburl); // DBに接続
		conn.createStatement().executeUpdate(sql); // SQLを送信
		conn.close(); // DB接続を閉じる
	}
}
