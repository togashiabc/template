package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dto.AdminHistoryDTO;
import com.internousdev.template.dto.HistoryDTO;
import com.internousdev.template.util.DBConnector;

/**
 * 管理者販売履歴の表示に関するメソッド
 */
public class AdminHistoryDAO {




	/**
	 * 購入履歴を格納する
	 */
	public ArrayList<HistoryDTO> AdminHistoryList = new ArrayList<HistoryDTO>();

	/**
	 * 商品IDで販売履歴を取得しリストに格納するメソッド
	 * @param itemId 商品ID
	 * @return adminhistorylist 販売履歴
	 */
	public ArrayList<AdminHistoryDTO> select(int itemId) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "template", "root", "mysql");
		Connection con = db.getConnection();

		ArrayList<AdminHistoryDTO> adminhistoryList = new ArrayList<AdminHistoryDTO>();

		int k = 0;
		String sql;


		if(itemId == 0){


			sql= "select * from purchases left join items on purchases.item_id = items.item_id";




		}else{
		 sql = "select * from purchases left join items on purchases.item_id = items.item_id where purchases.item_id=?";
		k=1;

		}

		try {
			PreparedStatement ps = con.prepareStatement(sql);




			if(k == 1){

				ps.setInt(1, itemId);
			}
			ResultSet rs = ps.executeQuery();


			while (rs.next()) {
				AdminHistoryDTO dto = new AdminHistoryDTO();

				dto.setItemId(rs.getInt("item_id")); //商品ID

				dto.setPurchaseId(rs.getInt("purchase_id")); //購入ID

				dto.setQuantities(rs.getInt("quantities")); //数量

				dto.setCreatedAt(rs.getString("created_at")); //登録日

				dto.setItemsName(rs.getString("items_name")); //商品名

				dto.setPrice(rs.getFloat("price")); //単価

				dto.setSubtotal(dto.getPrice()*dto.getQuantities());//合計金額


				adminhistoryList.add(dto);



			}



			rs.close();
			ps.close();


		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return adminhistoryList;
	}

	}



