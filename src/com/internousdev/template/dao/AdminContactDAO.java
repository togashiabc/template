package com.internousdev.template.dao;

import java.net.UnknownHostException;
import java.util.ArrayList;

import com.internousdev.template.dto.ContactHistoryDTO;
import com.internousdev.template.util.MongoDBConnector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

/**
 * お問い合わせ情報閲覧に関するクラス
 */
public class AdminContactDAO {

	/**
	 * お問い合わせのデータをいれるリスト
	 */
	ArrayList<ContactHistoryDTO> selectList = new ArrayList<ContactHistoryDTO>();


	/**
	 * mongoDBにアクセスし取得した情報をリストに格納するメソッド
	 * @param searchTitle お問い合わせ項目検索
	 * @param searchName 名前検索
	 * @param searchSort ソート検索
	 * @return selectList お問い合わせ情報
	 */
	public ArrayList<ContactHistoryDTO> selectMongo(String searchTitle, String searchName, int searchSort) {


		/* mongoDBに接続*/
		MongoDBConnector con = new MongoDBConnector();
		DB db=null;


		if(searchTitle == null){
			searchTitle = "";
		}
		if(searchName == null){
			searchName = "";
		}
		try {
			db = con.getConnection();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		DBCollection coll = db.getCollection("inquiry_histories");
		DBCursor cursor=null;



		/* 検索キーに使用*/
				/*問い合わせ項目検索用*/
				BasicDBObject querytitle = new BasicDBObject("title", searchTitle);
				/*名前検索用*/
				BasicDBObject queryname = new BasicDBObject("user_name", searchName);
				/*名前と問い合わせ項目検索用*/
				BasicDBObject querynt = new BasicDBObject("title", searchTitle).append("user_name", searchName);
				BasicDBObject querysort = new BasicDBObject("inquiried_at", searchSort);


		/* 検索キーにて取得データを制御
				 * searchTitle:問い合わせ項目
				 * searchName:名前検索
				 */
				if (searchTitle.length()==0 && searchName.length()==0){
				/* 全件検索*/
					cursor = coll.find();
				}else if(searchTitle.length()!=0 && searchName.length()==0){
				/* 問い合わせ項目のみ検索*/
					cursor = coll.find(querytitle);
				}else if(searchTitle.length()==0 && searchName.length()!=0){
				/* 名前でのみ検索*/
					cursor = coll.find(queryname);
				}else if(searchTitle.length()!=0 && searchName.length()!=0){
				/* 問い合わせ項目と名前検索*/
					cursor = coll.find(querynt);
				}


				/* sort処理
				 * searchSort=-1:降順(新しい順)
				 * searchSort=1:昇順(古い順)
				 */
				cursor = cursor.sort(querysort);


		try {
			while (cursor.hasNext()) {
				ContactHistoryDTO dto = new ContactHistoryDTO();
				DBObject dbs = cursor.next();
				dto.setUserName((String) dbs.get("user_name"));
				dto.setEmail((String) dbs.get("email"));
				dto.setTitle((String) dbs.get("title"));
				dto.setComment((String) dbs.get("comment"));
				dto.setDt((String) dbs.get("inquiried_at"));
				selectList.add(dto);
			}
		} finally {
			cursor.close();
		}
		return selectList;
	}



}