package lastingpotions.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.recipe.BrewingRecipeRegistry;

public class LastingPotionOfSwiftness {

  public static final Potion LASTING_POTION_OF_SWIFTNESS = Registry.register(Registries.POTION,
      new Identifier("lasting_potions", "lasting_potion_of_swiftness"),
      new Potion(new StatusEffectInstance(StatusEffects.SPEED, 16800, 0)));

  public static final Potion LASTING_STRONG_POTION_OF_SWIFTNESS = Registry.register(Registries.POTION,
      new Identifier("lasting_potions", "lasting_strong_potion_of_swiftness"),
      new Potion(new StatusEffectInstance(StatusEffects.SPEED, 2700, 1)));

  public static void registerPotions() {

  }

  public static void registerPotionsRecipes() {
    BrewingRecipeRegistry.registerPotionRecipe(Potions.LONG_SWIFTNESS, Items.REDSTONE,
        LASTING_POTION_OF_SWIFTNESS);
    BrewingRecipeRegistry.registerPotionRecipe(Potions.STRONG_SWIFTNESS, Items.REDSTONE,
        LASTING_STRONG_POTION_OF_SWIFTNESS);

  }
}
