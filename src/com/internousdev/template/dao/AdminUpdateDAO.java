package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;

	/**
	 * 商品情報の取得に関するクラス
	 */

public class AdminUpdateDAO {

	/**
	 * itemId,itemNameで必要な情報を取得するメソッド
	 * @param itemId 商品ID
	 * @param itemsName 商品名
	 * @return 成功すればtrue、失敗したらfalse
	 */

	public boolean doubling(int itemId ,String itemsName){
		boolean result=false;
		DBConnector db=new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "template", "root","mysql");
		Connection con=db.getConnection();

		String sql="select * from items where items_name = ? and item_id !=?";
		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, itemsName);
			ps.setInt(2, itemId);
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
	 * 商品情報を更新するメソッド
	 * @param itemId 商品ID
	 * @param itemsName 商品名
	 * @param price 価格
	 * @param stocks 在庫数
	 * @param sales 売上数
	 * @param itemDetail 商品詳細
	 * @param imgDel 商品画像削除フラグ
	 * @param imgPath イメージパス
	 * @param sortId 種類ID
	 * @return inserted 成否を格納する変数
	 */
	public int insert(int itemId,String itemsName,float price,int stocks,int sales, String itemDetail,int imgDel,String imgPath,int sortId){
		DBConnector db=new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "template", "root","mysql");
		Connection con=db.getConnection();
		int inserted=0;
		int c=1;
		String sql="";
		if(imgDel==1){
			sql= "update items set items_name =?,price=?,stocks=?,sales =?,items_detail=?,sort_id=? where item_id=?";
		}else if(imgDel==2){
			sql= "update items set items_name =?,price=?,stocks=?,sales =?,items_detail=?,img_path=?,sort_id=? where item_id=?";
		}else if(imgDel==3){
			sql= "update items set items_name =?,price=?,stocks=?,sales =?,items_detail=?,img_path='',sort_id=? where item_id=?";
		}
		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(c++,itemsName);
			ps.setFloat(c++,price);
			ps.setInt(c++,stocks);
			ps.setInt(c++, sales);
			ps.setString(c++,itemDetail);
			if(imgDel==2){
				ps.setString(c++,imgPath);
			}
			ps.setInt(c++,sortId);
			ps.setInt(c, itemId);
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
