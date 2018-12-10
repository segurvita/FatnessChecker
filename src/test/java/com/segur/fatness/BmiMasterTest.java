package com.segur.fatness;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * BMIマスター（達人）のテスト
 */
class BmiMasterTest {

	/**
	 * BMIマスター
	 */
	final private BmiMaster bmiMaster;

	/**
	 * コンストラクタ
	 */
	public BmiMasterTest() {

		// BMIマスターを１人確保
		this.bmiMaster = new BmiMaster();
	}

	/**
	 * BMI計算のテスト
	 */
	@Test
	void testCalc() {

		// BMI計算する。
		double bmi = this.bmiMaster.calc(170.0, 57.8);

		// 計算結果を判定する。
		assertThat(bmi).isEqualTo(20.0);
	}

}
