package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dto.ItemDTO;
import com.internousdev.template.util.DBConnector;

/**
 * 管理者商品管理に関するクラス
 */
public class AdminItemDAO {

	/**
	 * 商品情報を取得しリストに格納するメソッド
	 * @param itemsName 商品名
	 * @return itemList 商品情報
	 */
	public ArrayList<ItemDTO> select(String itemsName){
		DBConnector db=new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "template", "root");
		Connection con=db.getConnection();

		ArrayList<ItemDTO> itemList=new ArrayList<ItemDTO>();
		int k=0;
		String sql;

		if(itemsName.equals("") || itemsName==null){
			sql="select * from items where del_key = false";
		}else{
			sql="select * from items where items_name= ? and del_key= false";
			k=1;
		}




		try{
			PreparedStatement ps= con.prepareStatement(sql);
			if(k==1){
				ps.setString(1,itemsName);
			}
			ResultSet rs=ps.executeQuery();

			while (rs.next()) {
				ItemDTO dto= new ItemDTO();

				dto.setItemId(rs.getInt("item_id"));

				dto.setItemsName(rs.getString("items_name"));

				dto.setPrice(rs.getFloat("price"));

				dto.setStocks(rs.getInt("stocks"));

				dto.setSales(rs.getInt("sales"));

				dto.setItemDetail(rs.getString("items_detail"));

				dto.setImgPath(rs.getString("img_path"));

				dto.setSortId(rs.getInt("sort_id"));

				dto.setCreatedAt(rs.getString("created_at"));

				dto.setUpdatedAt(rs.getString("updated_at"));

				dto.setDelKey(rs.getBoolean("del_key"));

				switch(dto.getSortId()){
				case 1:dto.setItemGenre("トマト"); break;
				case 2:dto.setItemGenre("ピーマン"); break;
				case 3:dto.setItemGenre("パプリカ"); break;
				case 4:dto.setItemGenre("キュウリ"); break;
				case 5:dto.setItemGenre("トウモロコシ"); break;
				case 6:dto.setItemGenre("キャベツ"); break;
				case 7:dto.setItemGenre("ジャガイモ"); break;
				case 8:dto.setItemGenre("ナス"); break;
				}

				itemList.add(dto);
			}

			rs.close();
			ps.close();
			con.close();


		}catch (SQLException e){
			e.printStackTrace();
		}



		return itemList;
	}

}
