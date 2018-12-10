package com.segur.fatness;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BmiRobotTest {

	@Test
	void testCalc() {
		// BMIロボットを１人確保する
		BmiRobot bmiRobot = new BmiRobot();

		// BMI計算する。
		double bmi = bmiRobot.calc(170.0, 68.0);

		// 計算結果を判定する。
		assertThat(bmi).isEqualTo(40.0);
	}

}
