package com.segur.fatness;

/**
 * BMIを答えてくれる人
 */
public class BmiCalculator {

	/**
	 * BMIを計算する
	 * 
	 * @param height 身長 [cm]
	 * @param weight 体重 [kg]
	 * @return BMI
	 */
	public double calc(
			double height,
			double weight) {
		
		// 体重[kg] ÷ (身長[m])^2
		return weight * 10000 / (height * height);
	}
}
