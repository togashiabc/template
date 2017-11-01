package com.internousdev.template.util;

import java.util.ArrayList;

import com.internousdev.template.dto.ItemDTO;


/**
 * ページネーションが必要なリストのために、1ページごとの情報を保持するためのクラス
 */
public class PageObject {

	/**
	 * ページを識別するID
	 */
	private int pageId;

	/**
	 * 当該1ページに掲載される商品のリスト
	 */
	private ArrayList<ItemDTO> paginatedItemList = new ArrayList<ItemDTO>();




	/**
	 * ページネートされた商品リストを取得するメソッド
	 * @return  paginatedItemList
	 */
	public ArrayList<ItemDTO> getPaginatedList() {
			return paginatedItemList;
			}

	/**
	 * ページネートされた商品リストを格納するメソッド
	 * @param list ページネーションが完了した1ページごとのリスト
	 */
	public void setPaginatedList(ArrayList<ItemDTO> list) {
			paginatedItemList = list;
	}

	/**
	 * AllPagesクラスのpaginate()において使われる
	 * これによってDTOのインスタンスが当該ページにひとつずつ格納されていく
	 * @param list これからページネーション処理を行うリスト
	 * @param j 繰り返し用変数
	 */
	public void addPaginatedList(ArrayList<ItemDTO> list, int j) {
			paginatedItemList.add((ItemDTO)list.get(j));
			}



	/**
	 * ページID取得メソッド
	 * @return pageId
	 */
	public int getPageId() {
		return pageId;
	}

	/**
	 * ページID格納メソッド
	 * @param pageId セットする pageId
	 */
	public void setPageId(int pageId) {
		this.pageId = pageId;
	}
}