package jab.module;

/**
 * Select enemy
 * 
 * @author jabier.martinez
 */
public class SelectEnemy extends Part {

	public Module bot;

	public SelectEnemy(Module bot) {
		this.bot = bot;
	}

	public void select() {
		java.util.Iterator<jab.module.BotInfo> iterator = bot.botsInfo.values().iterator();
		double minEnergy = Double.MAX_VALUE;
		jab.module.BotInfo selected = null;

		while (iterator.hasNext()) {
			jab.module.BotInfo botInfo = iterator.next();

			if ((!botInfo.teammate) && minEnergy > botInfo.energy) {
				selected = botInfo;
				minEnergy = botInfo.energy;
			}
		}
		bot.enemy = selected;
	}

}
