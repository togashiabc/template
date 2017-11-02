
package com.internousdev.template.action;

import java.net.UnknownHostException;

import com.internousdev.template.dao.ContactDAO;
import com.opensymphony.xwork2.ActionSupport;

	/**
	 * ContactAction　問い合わせフォームからの情報をmongoDBにインサートするアクション
	 */
public class ContactAction extends ActionSupport {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -5350844676239079386L;

	/**
	 * 問い合わせ項目
	 */
	private String title;

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
	 * 実行メソッド　 問い合わせ情報の送信処理をする
	 */
	public String execute() {
		String result = ERROR;

		ContactDAO dao = new ContactDAO();
		try {
			if (dao.mongoInsert(title, userName, email, comment)) {

                comment = comment.replace("\r\n","<br>");
				result = SUCCESS;
                return result;
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 問い合わせ項目取得メソッド
	 * @return title 問い合わせ項目
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 問い合わせ項目格納メソッド
	 * @param title セットする title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 問い合わせ者名取得メソッド
	 * @return userName 問い合わせ者名
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 問い合わせ者名格納メソッド
	 * @param userName セットする userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * メールアドレス取得メソッド
	 * @return email メールアドレス
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * メールアドレス格納メソッド
	 * @param email セットする email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 問い合わせ内容取得メソッド
	 * @return comment 問い合わせ内容
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * 問い合わせ内容格納メソッド
	 * @param comment セットする comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}


}
