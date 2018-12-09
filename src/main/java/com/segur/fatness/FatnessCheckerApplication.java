package com.segur.fatness;

/**
 * 肥満度を確認するツール
 */
public class FatnessCheckerApplication {

	/**
	 * メイン文
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// ------------------------------------------------------
		// 肥満度検査会社（DI導入前）に作業を依頼する。
		// ------------------------------------------------------

		// 肥満度検査会社の人と会話を始める。
		FatnessChecker fatnessChecker = new FatnessChecker();

		// 身長と体重を伝え、肥満度の判定を依頼する。
		String result = fatnessChecker.check(170.0, 70.0);

		// 肥満度の判定結果を表示する。
		System.out.println("肥満度検査結果（DI導入前）：" + result);

		// ------------------------------------------------------
		// 肥満度検査会社（DI導入後）に作業を依頼する。
		// ------------------------------------------------------

		// BMIマスターを１人確保する。
		BmiMaster bmiCalculator = new BmiMaster();

		// 肥満度検査会社の人に、BMI計算をBMIマスターにしてもらうよう依頼する。
		FatnessCheckerDi fatnessCheckerDi = new FatnessCheckerDi(bmiCalculator);

		// 身長と体重を伝え、肥満度の判定を依頼する。
		String resultDi = fatnessCheckerDi.check(170.0, 70.0);

		// 肥満度の検査結果を表示する。
		System.out.println("肥満度検査結果（DI導入後）：" + resultDi);
	}
}
