package pt.ulht.es.cookbook.domain;

import org.joda.time.DateTime;

public class Recipe extends Recipe_Base implements Comparable<Recipe>{
    
    public  Recipe(String title, String problem, String solution, String author, String tags) {
    	setCookbookManager(CookbookManager.getInstance());    	
    	
    	if (recipe.hasAnyRecipeVersion())
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
/* metodo para as pesquisas
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
	}*/
/*//metodo para edição, segundo o video. Falta adaptar.
	public void edit(String title, String problem, String solution, String tags, String author) {
		setTitle(title);
        setProblem(problem);
        setAuthor(author);
        setTags(tags);
        setCreationTimestamp(new DateTime());
		
	}*/
    
}
