package com.somaditya;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;

public class Caffeine {

	public static void main(String[] args) throws AWTException {

		Robot robot = new Robot();

		while (true) {
			robot.delay(1000 * 30);

			robot.mouseMove(800, 350);
			robot.mouseMove(750, 300);

			Point pObj = MouseInfo.getPointerInfo().getLocation();
			System.out.println(pObj.toString());
		}

	}

}
