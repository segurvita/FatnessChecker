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
	void test低体重() {

		// BMI計算する。
		String result = this.fatnessCheckerDi.check(170.0, 28.9);

		// 計算結果を判定する。
		assertThat(result).isEqualTo("低体重");
	}

	/**
	 * BMI判定のテスト
	 */
	@Test
	void test標準体重() {

		// BMI計算する。
		String result = this.fatnessCheckerDi.check(170.0, 53.465);

		// 計算結果を判定する。
		assertThat(result).isEqualTo("普通体重");
	}

	/**
	 * BMI判定のテスト
	 */
	@Test
	void test１度肥満() {

		// BMI計算する。
		String result = this.fatnessCheckerDi.check(170.0, 72.25);

		// 計算結果を判定する。
		assertThat(result).isEqualTo("１度肥満");
	}

	/**
	 * BMI判定のテスト
	 */
	@Test
	void test２度肥満() {

		// BMI計算する。
		String result = this.fatnessCheckerDi.check(170.0, 86.7);

		// 計算結果を判定する。
		assertThat(result).isEqualTo("２度肥満");
	}

	/**
	 * BMI判定のテスト
	 */
	@Test
	void test３度肥満() {

		// BMI計算する。
		String result = this.fatnessCheckerDi.check(170.0, 101.15);

		// 計算結果を判定する。
		assertThat(result).isEqualTo("３度肥満");
	}

	/**
	 * BMI判定のテスト
	 */
	@Test
	void test４度肥満() {

		// BMI計算する。
		String result = this.fatnessCheckerDi.check(170.0, 115.6);

		// 計算結果を判定する。
		assertThat(result).isEqualTo("４度肥満");
	}

}
