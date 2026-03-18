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
		if (bot.enemy != null) {

			double bulletPower = Math.min(3.0, bot.getEnergy() - 0.01);

			if (bot.enemy.energy == 0) {
				bulletPower = 0;
			}

			bot.bulletPower = bulletPower;

			if (bot.getGunHeat() == 0) {
				robocode.Bullet b = bot.setFireBullet(bulletPower);
				bot.registerBullet(b);
			}
		}
	}

}
