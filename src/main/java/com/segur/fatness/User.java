package com.segur.fatness;

/**
 * 肥満度を知りたい人
 */
public class User {

	/**
	 * BMIマスターなしで肥満度判定会社に判定を依頼する。
	 */
	public void runWithoutBmiMaster() {

		// 肥満度判定会社の人と会話を始める。
		FatnessChecker fatnessChecker = new FatnessChecker();

		// 身長と体重を伝え、肥満度の判定を依頼する。
		String result = fatnessChecker.check(170.0, 70.0);

		// 肥満度の判定結果を表示する。
		System.out.println("肥満度判定結果（BMIマスターなし）：" + result);
	}

	/**
	 * BMIマスターありで肥満度判定会社に判定を依頼する。
	 */
	public void runWithBmiMaster() {

		// BMIマスターを１人確保する。
		BmiMaster bmiCalculator = new BmiMaster();

		// 肥満度判定会社の人に、BMI計算をBMIマスターにしてもらうよう依頼する。
		FatnessCheckerDi fatnessCheckerDi = new FatnessCheckerDi(bmiCalculator);

		// 身長と体重を伝え、肥満度の判定を依頼する。
		String result = fatnessCheckerDi.check(170.0, 70.0);

		// 肥満度の判定結果を表示する。
		System.out.println("肥満度判定結果（BMIマスターあり）：" + result);
	}
}
