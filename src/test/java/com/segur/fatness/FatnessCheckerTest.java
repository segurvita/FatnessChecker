package com.segur.fatness;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FatnessCheckerTest {

	@Test
	void testCheck() {
		// 肥満度判定会社を１つ確保
		FatnessChecker fatnessChecker = new FatnessChecker();

		// BMI計算する。
		String result = fatnessChecker.check(170.0, 57.8);

		// 計算結果を判定する。
		assertThat(result).isEqualTo("肥満（２度）");
	}

}
