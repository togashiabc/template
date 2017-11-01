package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;

/**
 * 商品情報追加に関するクラス
 */

public class AdminAddDAO {


	/**
	 * 商品名を照合し、重複していないか確認するメソッド
	 * @param itemsName 商品名
	 * @return result 重複したらtrue、してなければfalseを返す
	 */
	public boolean doubling(String itemsName){
		boolean result=false;
		DBConnector db=new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "template", "root","mysql");
		Connection con=db.getConnection();

		String sql="select * from items where items_name = ?";
		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, itemsName);
			ResultSet rs = ps.executeQuery();
			if (rs.next()){
				result=true;
			}
			rs.close();
			ps.close();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}


	/**
	 * 商品情報を追加するメソッド
	 * @param itemsName 商品名
	 * @param price 単価
	 * @param stocks 在庫数
	 * @param itemDetail 商品詳細
	 * @param imgPath イメージパス
	 * @param sortId 種類ID
	 * @return inserted 成否を格納する変数
	 */
	public int insert(String itemsName,float price,int stocks, String itemDetail,String imgPath,int sortId){
		DBConnector db=new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "template", "root","mysql");
		Connection con=db.getConnection();
		int inserted=0;
		String sql= "insert into items(items_name,price,stocks,items_detail,img_path,sort_id,item_img01,item_img02)"
				+ "values(?,?,?,?,?,?,'','')";

		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1,itemsName);
			ps.setFloat(2,price);
			ps.setInt(3,stocks);
			ps.setString(4,itemDetail);
			ps.setString(5,imgPath);
			ps.setInt(6,sortId);
			inserted=ps.executeUpdate();

			ps.close();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return inserted;
	}



}
