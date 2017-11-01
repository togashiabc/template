package com.internousdev.template.action;

import com.internousdev.template.dao.AdminDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品情報を削除するクラス
 */
public class AdminDeleteAction extends ActionSupport{

	/**
	 * シリアルID
     */

	private static final long serialVersionUID = 8523447612582469504L;



	/**
	 * 商品ID
	 * @author Ryo Maeda
     * @since 2017/05/18
     * @version 1.0
     */

	private int itemId;

	/**
	 * デリートキー
	 * @author Ryo Maeda
     * @since 2017/05/18
     * @version 1.0
     */

	private int delete=0;




	/**
	 * 商品のデリートキーをtrueにするクラス
	 * @author Ryo Maeda
     * @since 2017/05/18
     * @version 1.0
     */
	public String execute() {
		String result =ERROR;
		int deleted=0;

		AdminDeleteDAO dao= new AdminDeleteDAO();

		if(delete==1){
			deleted=dao.delete(itemId);
		}
		if(deleted>0){
			result = SUCCESS;
		}

		return result;
	}


	  /**
	   * 商品IDを取得するメソッド
       *  @param itemId　セットする　itemId
       */

	  public void setItemId(int itemId){this.itemId=itemId;}

	  /**
	   *商品IDを格納するメソッド
	   * @return itemId 商品ID
	   */
	  public int getItemId(){return itemId;}


	  /**
	   * 削除を格納するメソッド
       *  @param delete　セットする delete
       */

	  public void setDelete(int delete){this.delete = delete;}

	  /**
	   * 削除を取得するメソッド
	   * @return delete 削除
	   */
	  public int getDelete(){return delete;}






}
