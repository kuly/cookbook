package pt.ulht.es.cookbook.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CookBookManager {

	private static int nextRecipeId = 1;
	private static TreeMap<String, Recipe> RECIPE_MAP = new TreeMap<String, Recipe>();

	public static void saveRecipe(Recipe recipe) {
		String key = nextRecipeId + "";
		recipe.setId(key);
		RECIPE_MAP.put(key, recipe);
		nextRecipeId++;

	}

	public static Recipe getRecipe(String id) {
		return RECIPE_MAP.get(id);
	}

	public static Collection<Recipe> ordenaRecipes(final Map<String, Recipe> m) {
		Collection<Recipe> k = new ArrayList<Recipe>(m.values());
		Collections.sort((ArrayList<Recipe>) k, new Comparator<Object>() {
			public int compare(Object a, Object b) {
				if (((Recipe) a).getTitulo().compareToIgnoreCase(
						((Recipe) b).getTitulo()) < 0) {
					return -1;
				}
				if (((Recipe) a).getTitulo().compareToIgnoreCase(
						((Recipe) b).getTitulo()) > 0) {
					return 1;
				}
				return 0;
			}
		});
		return k;
	}

	public static Collection<Recipe> getRecipes() {
		return ordenaRecipes(RECIPE_MAP);
	}

}
