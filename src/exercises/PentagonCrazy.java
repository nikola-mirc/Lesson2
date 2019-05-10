package exercises;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class PentagonCrazy {

	private void makePrettyThings() {

		Robot bb8 = new Robot("mini");

		bb8.penDown();

		bb8.setSpeed(10000);

		bb8.setPenColor(Color.ORANGE);

		int sides = 5;

		double angle = 360 / sides;

		for (int i = 0; i < 2000; i++) {

			bb8.move(i);

			bb8.turn(angle);

			bb8.turn(angle + 1);
			bb8.setRandomPenColor();
			bb8.setPenWidth(50);
		}
	}

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();

	}
}