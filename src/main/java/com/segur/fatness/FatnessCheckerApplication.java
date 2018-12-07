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
	public static void main(
			String[] args) {
		
		// ------------------------------------------------------
		// 肥満度検査会社（外部会社）に作業を依頼する。
		// ------------------------------------------------------
		
		// 肥満度検査会社（外部会社）と取引を始める。
		FatnessChecker fatnessChecker = new FatnessChecker();

		// 肥満度の検査を依頼する。
		String result = fatnessChecker.check(170.0, 70.0);

		// 肥満度の検査結果を表示する。
		System.out.println("肥満度検査結果（外部会社）：" + result);
		
		// ------------------------------------------------------
		// 肥満度検査会社（グループ会社）に作業を依頼する。
		// ------------------------------------------------------

		// 自社のBMIマスターを一人確保する。
		BmiCalculator bmiCalculator = new BmiCalculator();

		// 肥満度検査会社（グループ会社）に自社のBMIマスターを出向させる。
		FatnessCheckerDi fatnessCheckerDi = new FatnessCheckerDi(bmiCalculator);

		// 肥満度の検査を依頼する。
		String resultDi = fatnessCheckerDi.check(170.0, 70.0);

		// 肥満度の検査結果を表示する。
		System.out.println("肥満度検査結果（グループ会社）：" + resultDi);
	}
}
