package com.segur.fatness;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * 肥満度判定会社（BMIマスター利用）のテスト
 */
class FatnessCheckerDiTest {
	
	/**
	 * 肥満度判定会社
	 */
	final private FatnessCheckerDi fatnessCheckerDi;

	/**
	 * コンストラクタ
	 */
	public FatnessCheckerDiTest() {

		// BMIマスターを１人確保
		BmiMaster bmiMaster = new BmiMaster();

		// 肥満度判定会社を１つ確保
		this.fatnessCheckerDi = new FatnessCheckerDi(bmiMaster);
	}

	/**
	 * BMI判定のテスト
	 */
	@Test
	void testCheck() {

		// BMI計算する。
		String result = this.fatnessCheckerDi.check(170.0, 57.8);

		// 計算結果を判定する。
		assertThat(result).isEqualTo("普通体重");
	}

}
