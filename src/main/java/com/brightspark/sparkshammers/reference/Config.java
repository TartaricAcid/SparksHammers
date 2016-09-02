package com.brightspark.sparkshammers.reference;

public class Config
{
    /**
     * Whether to add tools made from other mod materials into the game.
     */
    public static boolean includeOtherModItems = true;
    /**
     * If set to true, will use old 'easier' recipe using a vanilla crafting table for the unstable hammer and excavator.
     * Else, set to false will keep the hammer crafting table recipe (which requires mobius ingots rather than unstable).
     */
    //public static boolean useEasyUnstableRecipe = false;
    /**
     * Modifier for hammers and excavators to adjust durability.
     */
    public static float toolDurabilityModifier = 6f;
    public static final float toolDurabilityModifierMin = 1f;
    public static final float toolDurabilityModifierMax = 10f;
    /**
     * Modifier for hammers and excavators to adjust mining speed.
     */
    public static float toolSpeedModifier = 0.6f;
    public static final float toolSpeedModifierMin = 0.1f;
    public static final float toolSpeedModifierMax = 2f;
    /**
     * Durability of the Nether Star made hammer
     */
    public static int netherStarHammerDurability = 10;
    public static final int netherStarHammerDurabilityMin = 1;
    public static final int netherStarHammerDurabilityMax = Short.MAX_VALUE/2;
    /**
     * Max mining distance of the Nether Star made hammer
     */
    public static int netherStarHammerDistance = 16;
    public static final int netherStarHammerDistanceMin = 3;
    public static final int netherStarHammerDistanceMax = 100;

    /**
     * Whether shrine structures should be generated in the world to find Mjolnir in.
     */
    public static boolean shouldGenerateMjolnirShrines = true;
    public static int mjolnirShrineRarity = 50;
    public static int mjolnirShrineMinY = 125;
    public static boolean mjolnirShrineDebug = false;

    /*
     * Values for different Tool Materials.
     * The auto updating of Tool Materials can be turn on or off.
     * This simply, when the Tool Material for it's respective pickaxe is in the mod pack, it will check against it
     *  and update these values against it. Otherwise, it will keep what's already saved.
     */
    public static int harvestLevelMin = 0;
    public static int harvestLevelMax = Integer.MAX_VALUE;
    public static int maxUsesMin = 1;
    public static int maxUsesMax = Integer.MAX_VALUE;
    public static float efficiencyMin = 0f;
    public static float efficiencyMax = 100f;
    public static float damageMin = 0f;
    public static float damageMax = 100f;
    public static int enchantabilityMin = 0;
    public static int enchantabilityMax = 50;

    /**
     * Mjolnir
     */
    public static int mjolnirHarvestLevel = harvestLevelMax;
    public static float mjolnirEfficiency = 10f;
    public static float mjolnirDamageVsEntity = 10f;
    public static boolean mjolnirPickupNeedsDragonAchieve = true;

    /*
     * Common mod metals
     */

    public static int copperHarvestLevel = 1;
    public static int copperMaxUses = (int) (128*toolDurabilityModifier);
    public static float copperEfficiency = 4f*toolSpeedModifier;
    public static float copperDamageVsEntity = 1f;
    public static int copperEnchantability = 12;

    public static int silverHarvestLevel = 1;
    public static int silverMaxUses = (int) (128*toolDurabilityModifier);
    public static float silverEfficiency = 5f*toolSpeedModifier;
    public static float silverDamageVsEntity = 1.3f;
    public static int silverEnchantability = 15;

    public static int tinHarvestLevel = 1;
    public static int tinMaxUses = (int) (32*toolDurabilityModifier);
    public static float tinEfficiency = 3f*toolSpeedModifier;
    public static float tinDamageVsEntity = 0.8f;
    public static int tinEnchantability = 5;

    public static int leadHarvestLevel = 0;
    public static int leadMaxUses = (int) (32*toolDurabilityModifier);
    public static float leadEfficiency = 1f*toolSpeedModifier;
    public static float leadDamageVsEntity = 0.3f;
    public static int leadEnchantability = 2;

    public static int nickelHarvestLevel = 1;
    public static int nickelMaxUses = (int) (128*toolDurabilityModifier);
    public static float nickelEfficiency = 4f*toolSpeedModifier;
    public static float nickelDamageVsEntity = 1f;
    public static int nickelEnchantability = 17;

    public static int platinumHarvestLevel = 1;
    public static int platinumMaxUses = (int) (160*toolDurabilityModifier);
    public static float platinumEfficiency = 3f*toolSpeedModifier;
    public static float platinumDamageVsEntity = 0.8f;
    public static int platinumEnchantability = 37;

    public static int bronzeHarvestLevel = 2;
    public static int bronzeMaxUses = (int) (128*toolDurabilityModifier);
    public static float bronzeEfficiency = 8f*toolSpeedModifier;
    public static float bronzeDamageVsEntity = 2f;
    public static int bronzeEnchantability = 11;

    public static int steelHarvestLevel = 2;
    public static int steelMaxUses = (int) (480*toolDurabilityModifier);
    public static float steelEfficiency = 8f*toolSpeedModifier;
    public static float steelDamageVsEntity = 2f;
    public static int steelEnchantability = 5;

    public static int invarHarvestLevel = 2;
    public static int invarMaxUses = (int) (320*toolDurabilityModifier);
    public static float invarEfficiency = 9f*toolSpeedModifier;
    public static float invarDamageVsEntity = 2.3f;
    public static int invarEnchantability = 7;

    public static int electrumHarvestLevel = 1;
    public static int electrumMaxUses = (int) (128*toolDurabilityModifier);
    public static float electrumEfficiency = 5f*toolSpeedModifier;
    public static float electrumDamageVsEntity = 1.3f;
    public static int electrumEnchantability = 25;

    public static int manasteelHarvestLevel = 3;
    public static int manasteelMaxUses = (int) (300*toolDurabilityModifier);
    public static float manasteelEfficiency = 6.2f*toolSpeedModifier;
    public static float manasteelDamageVsEntity = 2f;
    public static int manasteelEnchantability = 20;

    public static int elementiumHarvestLevel = 3;
    public static int elementiumMaxUses = (int) (720*toolDurabilityModifier);
    public static float elementiumEfficiency = 6.2f*toolSpeedModifier;
    public static float elementiumDamageVsEntity = 2f;
    public static int elementiumEnchantability = 20;

    public static int terrasteelHarvestLevel = 4;
    public static int terrasteelMaxUses = (int) (2300*toolDurabilityModifier);
    public static float terrasteelEfficiency = 9f*toolSpeedModifier;
    public static float terrasteelDamageVsEntity = 3f;
    public static int terrasteelEnchantability = 26;

    public static int darksteelHarvestLevel = 5;
    public static int darksteelMaxUses = (int) (1561*toolDurabilityModifier);
    public static float darksteelEfficiency = 7f*toolSpeedModifier;
    public static float darksteelDamageVsEntity = 2f;
    public static int darksteelEnchantability = 25;

    public static int machaliteHarvestLevel = 2;
    public static int machaliteMaxUses = (int) (500*toolDurabilityModifier);
    public static float machaliteEfficiency = 7f*toolSpeedModifier;
    public static float machaliteDamageVsEntity = 3f;
    public static int machaliteEnchantability = 15;

    public static int dragoniteHarvestLevel = 3;
    public static int dragoniteMaxUses = (int) (750*toolDurabilityModifier);
    public static float dragoniteEfficiency = 7f*toolSpeedModifier;
    public static float dragoniteDamageVsEntity = 4f;
    public static int dragoniteEnchantability = 15;

    public static int gossamiteHarvestLevel = 3;
    public static int gossamiteMaxUses = (int) (1000*toolDurabilityModifier);
    public static float gossamiteEfficiency = 8f*toolSpeedModifier;
    public static float gossamiteDamageVsEntity = 5f;
    public static int gossamiteEnchantability = 15;
}
