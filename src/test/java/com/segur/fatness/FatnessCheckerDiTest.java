package com.segur.fatness;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FatnessCheckerDiTest {

	@Test
	void testCheck() {
		// BMIマスターを１人確保
		BmiMaster bmiMaster = new BmiMaster();

		// 肥満度判定会社を１つ確保
		FatnessCheckerDi fatnessCheckerDi = new FatnessCheckerDi(bmiMaster);

		// BMI計算する。
		String result = fatnessCheckerDi.check(170.0, 57.8);

		// 計算結果を判定する。
		assertThat(result).isEqualTo("普通体重");
	}

}
