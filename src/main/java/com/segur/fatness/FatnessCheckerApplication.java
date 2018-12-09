package com.segur.fatness;

/**
 * 肥満度を検査する話
 */
public class FatnessCheckerApplication {

	/**
	 * メイン文
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// ユーザーが登場する。
		User user = new User();

		// BMIマスターなしで肥満度判定会社に判定を依頼する。
		user.runWithoutBmiMaster();

		// BMIマスターありで肥満度判定会社に判定を依頼する。
		user.runWithBmiMaster();
	}
}
