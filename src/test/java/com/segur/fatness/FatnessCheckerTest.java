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
	void test低体重() {

		// BMI計算する。
		String result = this.fatnessChecker.check(170.0, 17.0);

		// 計算結果を判定する。
		assertThat(result).isEqualTo("低体重");
	}

	/**
	 * BMI判定のテスト
	 */
	@Test
	void test標準体重() {

		// BMI計算する。
		String result = this.fatnessChecker.check(170.0, 31.45);

		// 計算結果を判定する。
		assertThat(result).isEqualTo("普通体重");
	}

	/**
	 * BMI判定のテスト
	 */
	@Test
	void test１度肥満() {

		// BMI計算する。
		String result = this.fatnessChecker.check(170.0, 42.5);

		// 計算結果を判定する。
		assertThat(result).isEqualTo("１度肥満");
	}

	/**
	 * BMI判定のテスト
	 */
	@Test
	void test２度肥満() {

		// BMI計算する。
		String result = this.fatnessChecker.check(170.0, 51.0);

		// 計算結果を判定する。
		assertThat(result).isEqualTo("２度肥満");
	}

	/**
	 * BMI判定のテスト
	 */
	@Test
	void test３度肥満() {

		// BMI計算する。
		String result = this.fatnessChecker.check(170.0, 59.5);

		// 計算結果を判定する。
		assertThat(result).isEqualTo("３度肥満");
	}

	/**
	 * BMI判定のテスト
	 */
	@Test
	void test４度肥満() {

		// BMI計算する。
		String result = this.fatnessChecker.check(170.0, 68.0);

		// 計算結果を判定する。
		assertThat(result).isEqualTo("４度肥満");
	}

}
