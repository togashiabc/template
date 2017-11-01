/**
 * AdminAddAction
 * @author Ryo Maeda
 * @since 2017/05/18
 * @version 1.0
 */
package com.internousdev.template.action;

import com.internousdev.template.dao.AdminAddDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBに商品を追加するためのクラス
 * @author Ryo Maeda
 * @since 2017/05/18
 * @version 1.0
 */
public class AdminAddAction extends ActionSupport{

	/**
	 * シリアルID
	 * @author Ryo Maeda
     * @since 2017/05/18
     * @version 1.0
     */

	private static final long serialVersionUID = 8523447612582469504L;


	/**
	 * 商品名
	 * @author Ryo Maeda
     * @since 2017/05/18
     * @version 1.0
     */


	private String itemsName="";

	/**
	 * 商品ID
	 * @author Ryo Maeda
     * @since 2017/05/18
     * @version 1.0
     */

	private int itemId;

	/**
	 * ジャンル
	 * @author Ryo Maeda
     * @since 2017/05/18
     * @version 1.0
     */

	private String itemGenre;

	/**
	 * 単価
	 * @author Ryo Maeda
     * @since 2017/05/18
     * @version 1.0
     */

	private float price;

	/**
	 * イメージファイルパス
	 * @author Ryo Maeda
     * @since 2017/05/18
     * @version 1.0
     */

	private String imgPath="";

	/**
	 * 商品詳細
	 * @author Ryo Maeda
     * @since 2017/05/18
     * @version 1.0
     */

	private String itemDetail="";

	/**
	 * 在庫数
	 * @author Ryo Maeda
     * @since 2017/05/18
     * @version 1.0
     */

	private int stock=0;

	/**
	 * 売上数
	 * @author Ryo Maeda
     * @since 2017/05/18
     * @version 1.0
     */

	private int sales;
	/**
	 * 種類ID
	 * @author Ryo Maeda
     * @since 2017/05/18
     * @version 1.0
     */

	private int sort;

	/**
	 * 登録日
	 * @author Ryo Maeda
     * @since 2017/05/18
     * @version 1.0
     */

	private String createdAt;

	/**
	 * 更新日
	 * @author Ryo Maeda
     * @since 2017/05/18
     * @version 1.0
     */

	private String updatedAt;

	/**
	 * 商品画像01
	 * @author Ryo Maeda
     * @since 2017/05/18
     * @version 1.0
     */

	private String itemImg01;

	/**
	 * 商品画像02
	 * @author Ryo Maeda
     * @since 2017/05/18
     * @version 1.0
     */

	private String itemImg02;

	/**
	 * 商品名重複時のエラー文
	 * @author Ryo Maeda
     * @since 2017/05/18
     * @version 1.0
     */

	private String doubling;



	/**
	 * 商品名が既にあるか確認し、ないならDBに商品情報を追加する
	 * @author Ryo Maeda
     * @since 2017/05/18
     * @version 1.0
	 *
	 */
	public String execute() {
		String result =ERROR;
		int inserted=0;

		AdminAddDAO dao= new AdminAddDAO();

		if(dao.doubling(itemsName)){setDoubling("※すでにある商品名です/ItemName Already Exists");}
		else{
			inserted=dao.insert(itemsName, price, stock, itemDetail, imgPath, sort);

			if(inserted>0){
				result = SUCCESS;
			}
		}






		return result;
	}


	/**
	 * セッターゲッター
	 * @author Ryo Maeda
     * @since 2017/05/18
     * @version 1.0
     */

	/**
	 * 商品名を取得するメソッド
	 * @return itemsName　商品名
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
	 * 商品IDを格納するメソッド
	 * @return itemId　商品ID
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
	 * ジャンルを取得するメソッド
	 * @return itemGenre　ジャンル
	 */
	public String getItemGenre() {
		return itemGenre;
	}



	/**
	 * ジャンルを格納するメソッド
	 * @param itemGenre セットする itemGenre
	 */
	public void setItemGenre(String itemGenre) {
		this.itemGenre = itemGenre;
	}



	/**
	 *単価を取得するメソッド
	 * @return price 単価
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
	 * イメージファイルパスを取得するメソッド
	 * @return imgPath　イメージファイルパス
	 */
	public String getImgPath() {
		return imgPath;
	}



	/**
	 * イメージファイルパスを格納するメソッド
	 * @param imgPath セットする imgPath
	 */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}



	/**
	 * 商品詳細を取得するメソッド
	 * @return itemDetail　商品詳細
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
	 * 在庫数を取得するメソッド
	 * @return stock　在庫数
	 */
	public int getStock() {
		return stock;
	}



	/**
	 * 在庫数を格納するメソッド
	 * @param stock セットする stock
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}



	/**
	 * 売上数を取得するメソッド
	 * @return sales　売上数
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
	 * 種類IDを取得するメソッド
	 * @return sort　種類ID
	 */
	public int getSort() {
		return sort;
	}



	/**
	 * 種類IDを格納するメソッド
	 * @param sort セットする sort
	 */
	public void setSort(int sort) {
		this.sort = sort;
	}



	/**
	 * 登録日を取得するメソッド
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
	 * 更新日を取得するメソッド
	 * @return updatedAt　更新日
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
	 * @return itemImg01　商品画像01
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
	 * @return itemImg02 商品画像02
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
	 * 商品名重複時のエラー文を取得するメソッド
	 * @return doubling　商品名重複時のエラー文
	 */
	public String getDoubling() {
		return doubling;
	}



	/**
	 * 商品名重複時のエラー文を格納するメソッド
	 * @param doubling セットする doubling
	 */
	public void setDoubling(String doubling) {
		this.doubling = doubling;
	}

}



