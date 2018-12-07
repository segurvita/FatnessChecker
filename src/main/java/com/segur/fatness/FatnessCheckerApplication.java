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
		// BMIを答えてくれる人を肥満度を答えてくれる人が用意する
		// ------------------------------------------------------
		
		// 肥満度を答えてくれる人を呼ぶ
		FatnessChecker fatnessChecker = new FatnessChecker();

		// 肥満度を答えてもらう
		String result = fatnessChecker.check(170.0, 70.0);

		// 肥満度を表示する
		System.out.println("内部: " + result);
		
		// ------------------------------------------------------
		// BMIを答えてくれる人をユーザーが用意する
		// ------------------------------------------------------

		// BMIを答えてくれる人を呼ぶ
		BmiCalculator bmiCalculator = new BmiCalculator();

		// 肥満度を答えてくれる人を呼ぶ
		FatnessCheckerDi fatnessCheckerDi = new FatnessCheckerDi(bmiCalculator);

		// 肥満度を答えてもらう
		String resultDi = fatnessCheckerDi.check(170.0, 70.0);

		// 肥満度を表示する
		System.out.println("外部: " + resultDi);
	}
}
