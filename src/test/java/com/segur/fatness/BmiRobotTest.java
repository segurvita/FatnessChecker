package com.segur.fatness;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * BMIロボット（バグあり）のテスト
 */
class BmiRobotTest {

	/**
	 * BMIマスター
	 */
	final private BmiRobot bmiRobot;

	/**
	 * コンストラクタ
	 */
	public BmiRobotTest() {

		// BMIロボットを１人確保する
		this.bmiRobot = new BmiRobot();
	}

	/**
	 * BMI計算のテスト
	 */
	@Test
	void testCalc() {

		// BMI計算する。
		double bmi = this.bmiRobot.calc(170.0, 68.0);

		// 計算結果を判定する。
		assertThat(bmi).isEqualTo(40.0);
	}

}
