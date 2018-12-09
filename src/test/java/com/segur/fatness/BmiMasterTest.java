package com.segur.fatness;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BmiMasterTest {

	@Test
	void testCalc() {
		// BMIマスターを１人確保する
		BmiMaster bmiMaster = new BmiMaster();

		// BMI計算する。
		double bmi = bmiMaster.calc(170.0, 57.8);

		// 計算結果を判定する。
		assertThat(bmi).isEqualTo(20.0);
	}

}
