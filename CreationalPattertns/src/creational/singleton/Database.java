package creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private static Connection conn;

	//Torna o construtor privado, impedindo acesso externo
	private Database() {};
	
	public static Connection getConnection() {
		if (conn == null) {
			try {
				conn = DriverManager.getConnection("asdasd");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
}
