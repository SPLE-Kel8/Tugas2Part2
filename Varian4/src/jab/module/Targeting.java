package jab.module;

/**
 * Targeting
 * 
 * @author jabier.martinez
 */
public class Targeting extends Part {

	public Module bot;

	public Targeting(Module bot) {
		this.bot = bot;
	}

	public void target() {
		if (bot.enemy != null) {
			double dx = bot.enemy.x - bot.getX();
			double dy = bot.enemy.y - bot.getY();

			double theta = Math.toDegrees(Math.atan2(dx, dy));

			double turnGunAmt = theta - bot.getGunHeading();

			while (turnGunAmt <= -180) {
				turnGunAmt = turnGunAmt + 360;
			}
			while (turnGunAmt > 180) {
				turnGunAmt = turnGunAmt - 360;
			}

			bot.setTurnGunRight(turnGunAmt);
		}
	}

}
