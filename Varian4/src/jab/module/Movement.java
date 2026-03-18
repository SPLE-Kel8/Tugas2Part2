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
		// Gerak menyamping untuk “ngorbit” musuh.
		// turnRight(90) + ahead() = strafe.
		bot.setTurnRight(90 * orbitDirection);
		bot.setAhead(120);

		// Sesekali ganti arah supaya tidak mudah ditembak
		orbitDirection *= -1;
	}

	int orbitDirection = 1;

}
