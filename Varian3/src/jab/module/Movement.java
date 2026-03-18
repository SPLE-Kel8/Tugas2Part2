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
		bot.setAhead(100 * direction);
		bot.setTurnRight(45);
		direction *= -1;
	}

	int direction = 1;

}
