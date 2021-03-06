package com.brightspark.sparkshammers.integration.jei;

import com.brightspark.sparkshammers.gui.GuiHammerCraft;
import com.brightspark.sparkshammers.hammerCrafting.HammerCraftingManager;
import com.brightspark.sparkshammers.init.SHBlocks;
import com.brightspark.sparkshammers.init.SHItems;
import com.brightspark.sparkshammers.integration.jei.HammerCraftingTable.HammerCraftingRecipeCategory;
import com.brightspark.sparkshammers.integration.jei.HammerCraftingTable.HammerCraftingRecipeHandler;
import com.brightspark.sparkshammers.item.ItemAOE;
import com.brightspark.sparkshammers.reference.Reference;
import com.brightspark.sparkshammers.util.LoaderHelper;
import com.brightspark.sparkshammers.util.LogHelper;
import mezz.jei.api.BlankModPlugin;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import javax.annotation.Nonnull;

@JEIPlugin
public class SparksHammersPlugin extends BlankModPlugin
{
    public static IJeiHelpers jeiHelper;

    @Override
    public void register(@Nonnull IModRegistry registry)
    {
        jeiHelper = registry.getJeiHelpers();

        registry.addRecipeCategories(new HammerCraftingRecipeCategory(jeiHelper.getGuiHelper()));
        registry.addRecipeHandlers(new HammerCraftingRecipeHandler());

        registry.addRecipes(HammerCraftingManager.getInstance().getRecipeList());

        registry.addRecipeClickArea(GuiHammerCraft.class, 111, 69, 26, 19, Reference.JEI.HAMMER_CRAFTING_UID);
        registry.addRecipeCategoryCraftingItem(new ItemStack(SHBlocks.blockHammerCraft), Reference.JEI.HAMMER_CRAFTING_UID);

        //Hide tools from JEI if you can't make them!
        for(ItemAOE tool : SHItems.AOE_TOOLS)
            if(tool.getDependantOreDic() != null && !LoaderHelper.doesOreExist(tool.getDependantOreDic()))
            {
                LogHelper.info("Hiding tool " + tool.getRegistryName() + " from JEI with dependant ore dic " + tool.getDependantOreDic() + ".");
                jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(tool));
            }
    }
}
