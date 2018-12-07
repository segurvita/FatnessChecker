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

		// 肥満度を答えてくれる人を呼ぶ
		FatnessChecker fatnessChecker = new FatnessChecker();

		// 肥満度を答えてもらう
		String result = fatnessChecker.check(170.0, 70.0);

		// 肥満度を表示する
		System.out.println(result);
	}
}
