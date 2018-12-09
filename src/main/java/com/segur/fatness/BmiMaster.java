package com.segur.fatness;

/**
 * BMIマスター（達人）
 */
public class BmiMaster {

	/**
	 * BMIを計算する
	 * 
	 * @param height 身長 [cm]
	 * @param weight 体重 [kg]
	 * @return BMI
	 */
	public double calc(double height, double weight) {

		// 体重[kg] ÷ (身長[m])^2
		return weight * 10000 / (height * height);
	}
}
