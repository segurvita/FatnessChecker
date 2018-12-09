package com.segur.fatness;

/**
 * BMIロボット（バグあり）
 */
public class BmiRobot {

	/**
	 * BMIを計算する
	 * 
	 * @param height 身長 [cm]
	 * @param weight 体重 [kg]
	 * @return BMI
	 */
	public double calc(double height, double weight) {

		// 体重[kg] ÷ 身長[m]
		return weight * 100 / height;
	}
}
