/**
 *
 */
package com.internousdev.template.action;

import java.util.ArrayList;

import com.internousdev.template.dao.AdminUserDAO;
import com.internousdev.template.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

//
/**
 * 顧客情報を表示するクラス
 */

public class AdminUserAction extends ActionSupport {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 991275253511116448L;

	/**
	 * 顧客ID
	 */
	private int userId;

	/**
	 * 姓（英字）
	 */
	private String familyName;

	/**
	 * 名（英字）
	 */
	private String givenName;

	/**
	 * 誕生日
	 */
	private String birthday;

	/**
	 * 電話番号
	 */
	private String phoneNumber;

	/**
	 * メールアドレス
	 */
	private String phoneEmail;

	/**
	 * 郵便番号
	 */
	private String postal;

	/**
	 * 住所
	 */
	private String address;

	/**
	 * パスワード
	 */
	private String password;

	/**
	 * 性別
	 */
	private String sex;

	/**
	 * 登録日
	 */
	private String registerDay;


	/**
	 * 商品リスト
	 */
	public ArrayList<MyPageDTO> itemList = new ArrayList<MyPageDTO>();

	/**
	 * 実行メソッド
	 * 処理内容と順番
	 * 1：useridを入力することでuserへ登録された顧客情報を表示する。
	 */
	public String execute() {

		String result = ERROR;
		AdminUserDAO dao = new AdminUserDAO();
		itemList = dao.select(userId);
		if (itemList.size() > 0) {

			result = SUCCESS;
		}
		return result;

	}

	//以下アクセサー


	/**
	 * 顧客IDを取得するメソッド
	 * @return　userId　顧客ID
	 */
	public int getUserId() {
		return userId;
	}


	/**
	 * 顧客IDを格納するメソッド
	 * @param userId　セットする　userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * 姓（英字）を取得するメソッド
	 * @return　familyname　姓（英字）
	 */
	public String getFamilyName() {
		return familyName;
	}

	/**
	 * 姓（英字）を格納するメソッド
	 * @param familyName　セットする famliyName
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	/**
	 * 名（英字）を取得するメソッド
	 * @return givenName　名（英字）
	 */
	public String getGivenName() {
		return givenName;
	}

	/**
	 * 名（英字）を格納するメソッド
	 * @param givenName　セットする givenName
	 */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	/**
	 * 誕生日を取得するメソッド
	 * @return birthday　誕生日
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * 誕生日を格納するメソッド
	 * @param birthday　セットする birthday
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

		/**
		 * 電話番号を取得するメソッド
		 * @return phoneNumber　電話番号
		 */
		public String getPhoneNumber() {
			return phoneNumber;
		}

		/**
		 * 電話番号を格納するメソッド
		 * @param phoneNumber　セットする phoneNumber
		 */
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		/**
		 * メールアドレスを取得するメソッド
		 * @return phoneEmail　メールアドレス
		 */
		public String getPhoneEmail() {
			return phoneEmail;
		}

		/**
		 * メールを格納するメソッド
		 * @param phoneEmail　セットする phoneEmail
		 */
		public void setPhoneEmail(String phoneEmail) {
			this.phoneEmail = phoneEmail;
		}

		/**
		 * 郵便番号を取得するメソッド
		 * @return　postal 郵便番号
		 */
		public String getPostal() {
			return postal;
		}


		/**
		 * 郵便番号を格納するメソッド
		 * @param postal　セットする postal
		 */
		public void setPostal(String postal) {
			this.postal = postal;
		}
		/**
		 * 住所を取得するメソッド
		 * @return　address 住所
		 */
		public String getAddress() {
			return address;
		}

		/**
		 * 住所を格納するメソッド
		 * @param address セットする address
		 */
		public void setAddress(String address) {
			this.address = address;
		}

		/**
		 * パスワードを取得するメソッド
		 * @return　password パスワード
		 */
		public String getPassword() {
			return password;
		}
		/**
		 * パスワードを格納するメソッド
		 * @param password　セットする password
		 */
		public void setPassword(String password) {
			this.password = password;
		}
		/**
		 * 性別を取得するメソッド
		 * @return sex　性別
		 */
		public String getSex() {
			return sex;
		}

		/**
		 * 性別を格納するメソッド
		 * @param sex　セットする sex
		 */
		public void setSex(String sex) {
			this.sex = sex;
		}
		/**
		 * 登録日を取得するメソッド
		 * @return registerDay　登録日
		 */
		public String getRegisterDay() {
			return registerDay;
		}

		/**
		 * 登録日を格納するメソッド
		 * @param registerDay　セットする registerDay
		 */
		public void setRegisterDay(String registerDay) {
			this.registerDay = registerDay;
		}

}
