package pt.ulht.es.cookbook.domain;

public class Recipe extends Recipe_Base implements Comparable<Recipe>{
    
    public  Recipe(String title, String problem, String solution, String author, String tags) {
    	setCookbookManager(CookbookManager.getInstance());
    	
    	if (hasAnyRecipeVersion())
    		new RecipeVersion(title, problem, solution, author, tags);
    	else {
    		RecipeVersion recipe = new RecipeVersion(title, problem, solution, author, tags);
    		addRecipeVersion(recipe);
    	}
    }

	public void delete() {
    	setCookbookManager(null);
    	deleteDomainObject();
}
	

	public int compareTo(Recipe o) {
		return o.getExternalId().toLowerCase().compareTo(o.getExternalId().toLowerCase());
    }

	public boolean match(String[] split) {
		for(String token : split){
			if(getTitle().toLowerCase().contains(token.toLowerCase()) ||
				(getProblem().toLowerCase().contains(token.toLowerCase()) ||
				(getSolution().toLowerCase().contains(token.toLowerCase()) ||
				(getTags().toLowerCase().contains(token.toLowerCase() )) {
				return true;
			}
		}
		return false;
	}
    
}
