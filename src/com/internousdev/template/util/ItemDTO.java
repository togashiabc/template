/**
 *
 */
package com.internousdev.template.util;

/**
 * アイテム情報に関するDTOクラス
 *
 * @author JUN KIKUCHI
 * @since 2017/05/08
 * @version 1.0
 *
 */
public class ItemDTO {

	/**
	 * 商品名
	 */
	private String itemsName;

	/**
	 * 商品ID
	 */
	private int itemId;

	/**
	 * 単価
	 */
	private float price;

    /**
     * イメージパス
	 */
	private String imgPath;

	/**
	 * 在庫数
	 */
	private int stocks;

	/**
	 * 商品詳細
	 */
	private String itemDetail;

	/**
	 * 売上数
	 */
	private int sales;

	/**
	 * 登録日
	 */
	private String createdAt;

	/**
	 * 更新日
	 */
	private String updatedAt;

	/**
	 * 商品画像01
	 */
	private String itemImg01;

	/**
	 * 商品画像02
	 */
	private String itemImg02;

	/**
	 * 種類ID
	 */
	private int sortId;

	/**
	 * 種類
	 */
	private String itemGenre;

	/**
	 * デリートキー
	 */
	private boolean delKey;


	//以下アクセサリー


	/**
	 * 商品名を取得するメソッド
	 * @return itemsName
	 */
	public String getItemsName() {
		return itemsName;
	}

	/**
	 * 商品名を格納するメソッド
	 * @param itemsName セットする itemsName
	 */
	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
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
	 * イメージパスを取得するメソッド
	 * @return imgPath
	 */
	public String getImgPath() {
		return imgPath;
	}

	/**
	 * イメージパスを格納するメソッド
	 * @param imgPath セットする imgPath
	 */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	/**
	 * 在庫数を取得するメソッド
	 * @return stocks
	 */
	public int getStocks() {
		return stocks;
	}

	/**
	 * 在庫数を格納するメソッド
	 * @param stocks セットする stocks
	 */
	public void setStocks(int stocks) {
		this.stocks = stocks;
	}

	/**
	 * 商品詳細を取得するメソッド
	 * @return itemDetail
	 */
	public String getItemDetail() {
		return itemDetail;
	}

	/**
	 * 商品詳細を格納するメソッド
	 * @param itemDetail セットする itemDetail
	 */
	public void setItemDetail(String itemDetail) {
		this.itemDetail = itemDetail;
	}

	/**
	 * 売上数を取得するメソッド
	 * @return sales
	 */
	public int getSales() {
		return sales;
	}

	/**
	 * 売上数を格納するメソッド
	 * @param sales セットする sales
	 */
	public void setSales(int sales) {
		this.sales = sales;
	}

	/**
	 *	登録日を取得するメソッド
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
	 * @return updatedAt
	 */
	public String getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * 更新日を格納するメソッド
	 * @param updatedAt セットする updatedAt
	 */
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * 商品画像01を取得するメソッド
	 * @return itemImg01
	 */
	public String getItemImg01() {
		return itemImg01;
	}

	/**
	 * 商品画像01を格納するメソッド
	 * @param itemImg01 セットする itemImg01
	 */
	public void setItemImg01(String itemImg01) {
		this.itemImg01 = itemImg01;
	}

	/**
	 * 商品画像02を取得するメソッド
	 * @return itemImg02
	 */
	public String getItemImg02() {
		return itemImg02;
	}

	/**
	 * 商品画像02を格納するメソッド
	 * @param itemImg02 セットする itemImg02
	 */
	public void setItemImg02(String itemImg02) {
		this.itemImg02 = itemImg02;
	}

	/**
	 * 種類IDを取得するメソッド
	 * @return sortId
	 */
	public int getSortId() {
		return sortId;
	}

	/**
	 * 種類IDを格納するメソッド
	 * @param sortId セットする sortId
	 */
	public void setSortId(int sortId) {
		this.sortId = sortId;
	}

	/**
	 * 種類を取得するメソッド
	 * @return itemGenre
	 */
	public String getItemGenre() {
		return itemGenre;
	}

	/**
	 * 種類を格納するメソッド
	 * @param itemGenre セットする itemGenre
	 */
	public void setItemGenre(String itemGenre) {
		this.itemGenre = itemGenre;
	}

	/**
	 * デリートキーを取得するメソッド
	 * @return delKey
	 */
	public boolean isDelKey() {
		return delKey;
	}

	/**
	 * デリートキーを格納するメソッド
	 * @param delKey セットする delKey
	 */
	public void setDelKey(boolean delKey) {
		this.delKey = delKey;
	}

}