package com.internousdev.template.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * DBConnectorクラス
 * */

public class DBConnector {
	/**
	 * ドライバ名
	 */
	private static String driveName = "com.mysql.jdbc.Driver";
	/**
	 * URL
	 */
	private static String url = "jdbc:mysql://localhost/";
	/**
	 * user(root)
	 */
	private static String user = "root";
	/**
	 * password(mysql)
	 */
	private static String password = "mysql";
	/**
	 * データベース名
	 */
	private String dataBaseName;
	/**
	 * urlをつなげたもの
	 */
	private static StringBuilder URL = new StringBuilder(String.valueOf(url));
	/**
	 * すべてをつなげたURLを作成するコンストラクタ
	 * @param url
	 * @param driveName
	 * @param user
	 * @param password
	 * @param driveName　ドライブ名
	 * @param url　ＵＲＬ
	 * @param dataBaseName　データベース名
	 * @param user　ユーザー
	 * @param password　パスワード
	 */
	public DBConnector(String url, String driveName, String user, String password) {
		// TODO 自動生成されたコンストラクター・スタブ
		DBConnector.driveName = driveName;
		DBConnector.url = url;
		DBConnector.user = user;
		DBConnector.password = password;
		this.setDataBaseName(dataBaseName);
		URL.append(dataBaseName);
	}


	/**
	 * DBとつなぐメソッド
	 * @return Connection
	 */
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(driveName);
			con = DriverManager.getConnection(URL.toString(), user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	/**
	 * @return dataBaseName
	 */
	public String getDataBaseName() {
		return dataBaseName;
	}

	/**
	 * @param dataBaseName セットする dataBaseName
	 */
	public void setDataBaseName(String dataBaseName) {
		this.dataBaseName = dataBaseName;
	}
}
