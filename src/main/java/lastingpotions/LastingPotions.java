package lastingpotions;

import net.fabricmc.api.ModInitializer;
import lastingpotions.potion.LastingPotionOfSwiftness;

public class LastingPotions implements ModInitializer {
	@Override
	public void onInitialize() {
		LastingPotionOfSwiftness.registerPotions();
		LastingPotionOfSwiftness.registerPotionsRecipes();
	}
}