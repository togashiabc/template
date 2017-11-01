
package com.internousdev.template.dto;

	/**
	 * 問い合わせに関するDTOクラス
	 */

public class ContactHistoryDTO {

	/**
	 * 問い合わせ項目
	 */
	private String  title;

	/**
	 * 問い合わせ者名
	 */
	private String userName;

	/**
	 * メールアドレス
	 */
	private String email;

	/**
	 * 問い合わせ内容
	 */
	private String comment;

	/**
	 * 登録日
	 */
	private String dt;


	//以下アクセサリー


	/**
	 * 問い合わせ項目を取得するメソッド
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 問い合わせ項目を格納するメソッド
	 * @param title セットする title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 問い合わせ者名を取得するメソッド
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 問い合わせ者名を格納するメソッド
	 * @param userName セットする userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * メールアドレスを取得するメソッド
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * メールアドレスを格納するメソッド
	 * @param email セットする email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 問い合わせ内容を取得するメソッド
	 * @return comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * 問い合わせ内容を格納するメソッド
	 * @param comment セットする comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * 登録日を取得するメソッド
	 * @return dt
	 */
	public String getDt() {
		return dt;
	}

	/**
	 * 登録日を格納するメソッド
	 * @param dt セットする dt
	 */
	public void setDt(String dt) {
		this.dt = dt;
	}

}
