package pt.ulht.es.cookbook.domain;

public class CookBookManager {

	private static int nextRecipeId=1;
	private static Map<String,String> RECIPE_MAP = new HashMap<String,Recipe>(); 
	
	public static void saveRecipe(Recipe recipe) {
		String key=nextRecipeId+"";
		RECIPE_MAP.put(key, recipe);
		recipe.setId(key);
		nextRecipeId++;
		
	}

	public static Recipe getRecipe(String id) {
		return RECIPE_MAP.getId();
	}

}
