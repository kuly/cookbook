package pt.ulht.es.cookbook.domain;


public class Recipe extends Recipe_Base implements Comparable<Recipe>{
    
    public  Recipe(String title, String problem, String solution, String author, String tags) {
    	setCookbookManager(CookbookManager.getInstance());   
        
    	RecipeVersion create = new RecipeVersion(title, problem, solution, author, tags); 
    	create.setRecipe(this);
    	create.setRecipeLastVersion(this);
   	
    	
    }

	public void delete() {
    	setCookbookManager(null);
    	for (RecipeVersion a : this.getRecipeVersionSet()){
    		a.delete();
		}
		
    	deleteDomainObject();
}
	

	public int compareTo(Recipe o) {
		return o.getExternalId().toLowerCase().compareTo(o.getExternalId().toLowerCase());
    }
	
	public RecipeVersion ultima(){

		for (RecipeVersion a : this.getRecipeVersionSet()){
			if (a.hasRecipeLastVersion()){
				return a;
			}
		}
		
		return null;
		
	}
	

	public boolean match(String[] split) {
		for(String token : split){
			if(ultima().getTitle().toLowerCase().contains(token.toLowerCase()) ||
					ultima().getProblem().toLowerCase().contains(token.toLowerCase()) ||
					ultima().getSolution().toLowerCase().contains(token.toLowerCase()) ||
					ultima().getTags().toLowerCase().contains(token.toLowerCase())) {
				return true;
			}
		}
		return false;
	}
	
}
