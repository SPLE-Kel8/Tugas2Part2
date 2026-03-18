package jab.module;

/**
 * Movement
 * 
 * @author jab
 */
public class Movement extends Part {

	public Module bot;

	public Movement(Module bot) {
		this.bot = bot;
	}

	public void move() {
		double moveDistance = (Math.random() * 200) - 100;

		double turnAngle = (Math.random() * 90) - 45;

		bot.setAhead(moveDistance);
		bot.setTurnRight(turnAngle);
	}

}
