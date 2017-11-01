package com.internousdev.template.dto;

/**
 * 管理者販売履歴に関するDTOクラス
 */

public class AdminHistoryDTO {



	/**
	 * 購入ID
	 */
	private int purchaseId;

	/**
	 * 商品名
	 */
	private String itemsName;

	/**
	 * 単価
	 */
	private float price;

	/**
	 * 商品ID
	 */
	private int itemId;

	/**
	 * 登録日
	 */
	private String createdAt;

	/**
	 * 小計
	 */

	private float subtotal;

	/**
	 * 個数
	 */

	private int quantities;



	//以下アクセサリー


	/**
	 * 商品IDを取得するメソッド
	 * @return itemId
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
	 * @return itemsName
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
	 * @return purchaseId
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
	 * @return price
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
	 * 登録日（購入日）を格納するメソッド
	 * @return createdAt
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * 登録日（購入日）を格納するメソッド
	 * @param createdAt セットする createdAt
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * 個数を取得するメソッド
	 * @return quantities
	 */
	public int getQuantities() {
		return quantities;
	}

	/**
	 * 個数を格納するメソッド
	 * @param quantities セットする quantities
	 */
	public void setQuantities(int quantities) {
		this.quantities = quantities;
	}

	/**
	 * 合計金額を取得するメソッド
	 * @return subtotal
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

}
