package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.AdminHistoryDAO;
import com.internousdev.template.dto.AdminHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 */

public class AdminHistoryAction extends ActionSupport implements SessionAware{


	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 485219439952045245L;


	/**
	 * 商品ID
	 * @author kota.miyazato
     */
	private int itemId;


	/**
	 * 商品名
     */
	private String itemsName;


	/**
	 * 購入ID
     */
	private int purchaseId;


	/**
	 * 単価
     */
	private float price;


	/**
	 * 登録日
     */
	private String createdAt;


	/**
	 * 数量
     */
	private int quantities;


	/**
	 * 合計金額
     */
	private float subtotal;



	/**
	 * 購入履歴リスト
	 */
     private ArrayList<AdminHistoryDTO> adminhistoryList;
     /**
      * セッション情報
      */
     private Map<String,Object> session;


       /**
        * 購入履歴を取得するメソッド
        * @author kota.miyazato
        * @since 2017/05/12
        * @version 1.0
        */
		public String execute() {

			String result = ERROR;


			AdminHistoryDAO dao = new AdminHistoryDAO();
			adminhistoryList = dao.select(itemId);
			if(adminhistoryList.size() > 0){
				result=SUCCESS;
			}
		return result;
		}

	/**
	 * 商品IDを取得するメソッド
	 * @return itemId　商品ID
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * 商品IDを格納するメソッド
	 * @param itemId セットする itemId
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * 商品名を取得するメソッド
	 * @return itemsName　商品名
	 */
	public String getItemsName() {
		return itemsName;
	}

	/**
	 * 商品名をを格納するメソッド
	 * @param itemsName セットする itemsName
	 */
	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
	}

	/**
	 * 購入IDを取得するメソッド
	 * @return purchaseId　購入ID
	 */
	public int getPurchaseId() {
		return purchaseId;
	}

	/**
	 * 購入IDを格納するメソッド
	 * @param purchaseId セットする purchaseId
	 */
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	/**
	 * 単価を取得するメソッド
	 * @return price　単価
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * 単価を格納するメソッド
	 * @param price セットする price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * 登録日を格納するメソッド
	 * @return createdAt　登録日
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * 登録日を格納するメソッド
	 * @param createdAt セットする createdAt
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * 数量を取得するメソッド
	 * @return quantities　数量
	 */
	public int getQuantities() {
		return quantities;
	}

	/**
	 * 数量を格納するメソッド
	 * @param quantities セットする quantities
	 */
	public void setQuantities(int quantities) {
		this.quantities = quantities;
	}

	/**
	 * 合計金額を取得するメソッド
	 * @return subtotal　合計金額
	 */
	public float getSubtotal() {
		return subtotal;
	}

	/**
	 * 合計金額を格納するメソッド
	 * @param subtotal セットする subtotal
	 */
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * 購入履歴リストを取得するメソッド
	 * @return adminhistoryList　購入履歴リスト
	 */
	public ArrayList<AdminHistoryDTO> getAdminhistoryList() {
		return adminhistoryList;
	}

	/**
	 * 購入履歴リストを格納するメソッド
	 * @param adminhistoryList セットする adminhistoryList
	 */
	public void setAdminhistoryList(ArrayList<AdminHistoryDTO> adminhistoryList) {
		this.adminhistoryList = adminhistoryList;
	}

	/**
	 * セッション情報を取得するメソッド
	 * @return session　セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション情報を格納するメソッド
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}