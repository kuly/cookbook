package pt.ulht.es.cookbook.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pt.ist.fenixframework.pstm.AbstractDomainObject;
import pt.ulht.es.cookbook.domain.CookbookManager;
import pt.ulht.es.cookbook.domain.Recipe;

@Controller
public class RecipeController {
  
    @RequestMapping(method=RequestMethod.GET, value="/recipes")
    public String listRecipes(Model model) {
    	List<Recipe> recipes = new ArrayList<Recipe>(CookbookManager.getInstance().getRecipeSet());
    	Collections.sort(recipes);
    	model.addAttribute("recipes", recipes);
    	return "listRecipes";
    }

    @RequestMapping("recipes/create")
    public String showRecipeCreationForm() {
    	return "CreateRecipe";	
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/recipes")
    public String createRecipe(@RequestParam Map<String,String>params){
    	String title = params.get("title");
    	String problem = params.get("problem");
    	String solution = params.get("solution");
    	String author = params.get("author");
    	String tags = params.get("tags");
    	
    	if (title.isEmpty() | problem.isEmpty() | solution.isEmpty() | author.isEmpty())
    	{	
    	return "createError";
    	}
    	
    	Recipe recipe = new Recipe(title, problem, solution, author, tags);
    	return "redirect:/recipes/"+recipe.getExternalId();
    	
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/recipes/{id}")
    public String showRecipe(Model model, @PathVariable String id) {

     Recipe recipe = AbstractDomainObject.fromExternalId(id);		
  
        if(recipe != null) {
        	model.addAttribute("recipe", recipe);
        	return "detailedRecipe";
		} else {
			model.addAttribute("id", id);
			return "recipeNotFound";
		}
    }

    @RequestMapping(method = RequestMethod.GET, value = "recipes/{id}/delete")
    public String deleteRecipe(Model model, @PathVariable String id) {
    	     
    	Recipe recipe = AbstractDomainObject.fromExternalId(id);
    	recipe.delete();
    	return "redirect:/listRecipes";
    }

    @RequestMapping(method = RequestMethod.POST, value ="recipes/search")
    public String searchRecipes(@RequestParam Map<String, String> params, Model model) {
    	String searchParams = params.get("searchParams");
    	String[] split = searchParams.split(",");
    	List<Recipe> resultados = new ArrayList<Recipe>();
	    	for(Recipe recipe : CookbookManager.getInstance().getRecipeSet()){
	    		if(recipe.match(split)){
	    			resultados.add(recipe);
	    		}
	    	
	    	}
	    model.addAttribute("recipes", resultados);
    	return "searchResults";	
    }
    
    @RequestMapping(method = RequestMethod.GET, value ="recipes/search")
    public String showRecipeSearchForm() {
    	return "searchRecipeForm";	
    }
    
}