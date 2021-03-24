package co.micol.shop.border.command;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	public Connection conn;
	private String driver = "";
	private String url = "";
	private String user = "micol";
	private String password = "micol";
	
	public DAO() { // 최상위 클래스로 존재
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
