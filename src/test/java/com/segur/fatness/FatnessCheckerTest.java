package com.segur.fatness;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * 肥満度判定会社（BMIロボット利用）のテスト
 */
class FatnessCheckerTest {

	/**
	 * 肥満度判定会社
	 */
	final private FatnessChecker fatnessChecker;

	/**
	 * コンストラクタ
	 */
	public FatnessCheckerTest() {

		// 肥満度判定会社を１つ確保
		this.fatnessChecker = new FatnessChecker();
	}

	/**
	 * BMI判定のテスト
	 */
	@Test
	void testCheck() {

		// BMI計算する。
		String result = this.fatnessChecker.check(170.0, 57.8);

		// 計算結果を判定する。
		assertThat(result).isEqualTo("肥満（２度）");
	}

}
