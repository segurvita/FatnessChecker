package com.segur.fatness;

/**
 * 肥満度を答えてくれる人
 */
public class FatnessCheckerDi {
	
	/**
	 * BMIを答えてくれる人 
	 */
	final private BmiCalculator bmiCalculator;
	
	/**
	 * コンストラクタ
	 * 
	 * @param bmiCalculator 外部から派遣されたBMIを答えてくれる人
	 */
	public FatnessCheckerDi(BmiCalculator bmiCalculator) {
		// BMIを答えてくれる人を外部から派遣してもらう
		this.bmiCalculator = bmiCalculator;
	}

	/**
	 * @param height 身長 [cm]
	 * @param weight 体重 [kg]
	 * @return 肥満度
	 */
	public String check(
			double height,
			double weight) {
		
		// 外部から派遣された人にBMIを答えてもらう
		double bmi = this.bmiCalculator.calc(height, weight);

		// 肥満度を判定する。
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
