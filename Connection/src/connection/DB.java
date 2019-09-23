package connection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * @author Urban Roland
 */

public class DB {

	final String JDBC_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	final String URL = "jdbc:derby:sampleDB;create=true";
	final String USERNAME = "";
	final String PASSWORLD = "";

	Connection conn = null;
	Statement createStatement = null;
	DatabaseMetaData dbmd = null;

	public DB() {
		try {
			conn = DriverManager.getConnection(URL);
			System.out.println("Successful");
		} catch (SQLException e) {
			System.out.println("Something went wrong with connection!");
			System.out.println(" " + e);
		}

		if (conn != null) {
			try {
				createStatement = conn.createStatement();
			} catch (SQLException e) {
				System.out.println("Something went wrong when you create createStatement!");
				System.out.println(" " + e);
			}
		}

		try {
			dbmd = conn.getMetaData();
		} catch (SQLException e) {
			System.out.println("Something went wrong when you create DatabaseMetaData!");
			System.out.println(" " + e);
		}
		try {
			ResultSet rs = dbmd.getTables(null, "APP", "USERS", null);
			if (!rs.next()) {
				createStatement.execute("create table users(name varchar(20),adress varchar(20))");

			}
		} catch (SQLException e) {
			System.out.println("Something went wrong when you create data tables!");
			System.out.println(" " + e);
		}

	}

	public void addUser(String name, String address) {
		String sql = "insert into users values(?,?)";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, address);
			pstmt.execute();

		} catch (SQLException e) {
			System.out.println("Something went wrong when you add user!");
			System.out.println(" " + e);
		}
	}

	public void showAllUsers() {
		String sql = "select * from users";
		try {
			ResultSet rs = createStatement.executeQuery(sql);
			while (rs.next()) {
				String name = rs.getString("name");
				String address = rs.getString("adress");
				System.out.println(name + " | " + address);
			}
		} catch (SQLException e) {
			System.out.println("Something went wrong when you show all users!");
			System.out.println(" " + e);
		}
	}

	public void showUsersMeta() {
		String sql = "select * from users";
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;

		try {
			rs = createStatement.executeQuery(sql);
			rsmd = rs.getMetaData();
			int columCount = rsmd.getColumnCount();
			for (int i = 1; i <= columCount; i++) {
				System.out.println(" | " + rsmd.getColumnName(i) + " | ");
			}
		} catch (Exception e) {
			System.out.println("Something went wrong when you show all users metadata!");
			System.out.println(" " + e);
		}

	}

	public ArrayList<User> getAllUsers() {
		String sql = "select * from users";
		ArrayList<User> users = null;
		try {
			ResultSet rs = createStatement.executeQuery(sql);
			users = new ArrayList<>();

			while (rs.next()) {

				User actualUser = new User(rs.getString("name"), rs.getString("adress"));
				users.add(actualUser);

			}
		} catch (SQLException e) {
			System.out.println("Something went wrong when you get all users!");
			System.out.println(" " + e);
		}

		return users;
	}

	public void showAllUsersName() {
		String sql = "select name from users";
		try {
			ResultSet rs = createStatement.executeQuery(sql);
			while (rs.next()) {
				String name = rs.getString("name");

				System.out.println(name);
			}
		} catch (SQLException e) {
			System.out.println("Something went wrong when you show all users name!");
			System.out.println(" " + e);
		}
	}

	public void deleteAllUser() {
		String sql = "delete from users";
		Statement st = null;
		try {

			st = conn.createStatement();
			st.executeUpdate(sql);

		} catch (SQLException e) {
			System.out.println("Something went wrong when you delete all users!");
			System.out.println(" " + e);
		}
	}

}
