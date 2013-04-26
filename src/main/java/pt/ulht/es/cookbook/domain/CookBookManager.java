package pt.ulht.es.cookbook.domain;

import java.util.HashMap;
import java.util.Map;

public class CookBookManager {

	private static int nextRecipeId=1;
	private static Map<String,Recipe> RECIPE_MAP = new HashMap<String,Recipe>(); 
	
	public static void saveRecipe(Recipe recipe) {
		String key=nextRecipeId+"";
		recipe.setId(key);
		RECIPE_MAP.put(key, recipe);
		nextRecipeId++;
		
	}

	public static Recipe getRecipe(String id) {
		return RECIPE_MAP.get(id);
	}

}
