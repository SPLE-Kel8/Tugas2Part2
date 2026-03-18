package jab.module;

/**
 * Gun
 * 
 * @author jab
 */
public class Gun extends Part {

	public Module bot;

	public Gun(Module bot) {
		this.bot = bot;
	}

	public void fire() {
		if (bot.getGunHeat() == 0 && bot.enemy != null) {
			bot.setFire(0.1);
		}
	}

}
