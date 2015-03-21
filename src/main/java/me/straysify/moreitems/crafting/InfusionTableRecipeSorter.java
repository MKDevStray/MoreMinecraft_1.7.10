package me.straysify.moreitems.crafting;

import java.util.Comparator;

import net.minecraft.item.crafting.IRecipe;

public class InfusionTableRecipeSorter implements Comparator {
	
final InfusionTableCraftingManager workSurface;
	
	public InfusionTableRecipeSorter(InfusionTableCraftingManager infusionTableCraftingManager) {
		this.workSurface = infusionTableCraftingManager;
	}
	
	public int compareRecipes(IRecipe irecipe1, IRecipe irecipe2) {
		return irecipe1 instanceof InfusionTableShapelessRecipes && irecipe2 instanceof InfusionTableShapedRecipes ? 1: (irecipe2 instanceof InfusionTableShapelessRecipes && irecipe1 instanceof InfusionTableShapedRecipes ? -1 : (irecipe2.getRecipeSize() < irecipe1.getRecipeSize() ? -1 : (irecipe2.getRecipeSize() > irecipe1.getRecipeSize() ? 1 : 0)));
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		return this.compareRecipes((IRecipe)o1, (IRecipe)o2);
	}

}
