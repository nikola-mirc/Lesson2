package optional;

import org.jointheleague.graphical.robot.Robot;

public class StarShow {

	Robot robot = new Robot("batman");

	void makeStars() {

		robot.setSpeed(8);

		float x = 100;

		float y = 100;

		int starSize = 25;

		for (int i = 0; i < 300; i++) {

			robot.setPenWidth(i);

			robot.setPos(x, y);

			drawStar(starSize);

			x += starSize;

			y += starSize;

			starSize += 20;

			robot.turn(12);

			robot.setRandomPenColor();
		}
	}

	private void drawStar(int starSize) {

		robot.penDown();

		for (int i = 0; i < 5; i++) {

			robot.move(starSize);

			robot.turn(144);
		}
	}

	public static void main(String[] args) {
		new StarShow().makeStars();

	}

}
