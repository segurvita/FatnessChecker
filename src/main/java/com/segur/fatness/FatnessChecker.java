package com.segur.fatness;

/**
 * 肥満度検査会社（DI導入前）
 */
public class FatnessChecker {

	/**
	 * @param height 身長 [cm]
	 * @param weight 体重 [kg]
	 * @return 肥満度
	 */
	public String check(double height, double weight) {

		// 社内の最新型BMIロボットを１台確保する。
		BmiRobot bmiRobot = new BmiRobot();

		// BMIロボットにBMI計算を依頼する。
		double bmi = bmiRobot.calc(height, weight);

		// BMI計算結果から肥満度を判定する。
		if (bmi < 18.5) {
			return "低体重（やせ）";
		} else if (bmi < 25.0) {
			return "普通体重";
		} else if (bmi < 30.0) {
			return "肥満（１度）";
		} else if (bmi < 35.0) {
			return "肥満（２度）";
		} else if (bmi < 40.0) {
			return "肥満（３度）";
		} else {
			return "肥満（４度）";
		}
	}
}
