package com.internousdev.template.dto;

/**
 * 購入情報に関するDTOクラス
 */

public class HistoryDTO {

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 *商品ID
	 */
	private int itemId;

	/**
	 * 単価
	 */
	private float price;

	/**
	 * 数量
	 */
	private int quantities;

	/**
	 * 小計
	 */
	private float subtotal;

	/**
	 * 登録日
	 */
	private String createdAt;

	/**
	 * 商品名
	 */
	private String itemsName;


	//以下アクセサリー


	/**
	 * ユーザーIDを取得するメソッド
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを格納するメソッド
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * アイテムIDを取得するメソッド
	 * @return itemId
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * アイテムIDを格納するメソッド
	 * @param itemId セットする itemId
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
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
	 * 数量を取得するメソッド
	 * @return quantities
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
	 * 小計を取得するメソッド
	 * @return subtotal
	 */
	public float getSubtotal() {
		return subtotal;
	}

	/**
	 * 小計を格納するメソッド
	 * @param subtotal セットする subtotal
	 */
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * 登録日を取得するメソッド
	 * @return createdAt
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
	 * 更新日を取得するメソッド
	 * @return itemsName
	 */
	public String getItemsName() {
		return itemsName;
	}

	/**
	 * 更新日を格納するメソッド
	 * @param itemsName セットする itemsName
	 */
	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
	}
}
