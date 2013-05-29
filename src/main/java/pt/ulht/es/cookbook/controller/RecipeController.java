package pt.ulht.es.cookbook.controller;

import java.util.Map;
import java.util.Set;

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
    	Set<Recipe> recipes = CookbookManager.getInstance().getRecipeSet();
    	model.addAttribute("recipes", recipes);
    	return "listRecipes";
    }

    @RequestMapping("recipes/create")
    public String showRecipeCreationForm() {
    	return "CreateRecipe";	
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/recipes")
    public String createRecipe(@RequestParam Map<String,String>params){
    	String titulo = params.get("titulo");
    	String problema = params.get("problema");
    	String solucao = params.get("solucao");
    	String autor = params.get("autor");
    	String tags = params.get("tags");
    	
    	if (titulo.isEmpty() | problema.isEmpty() | solucao.isEmpty() | autor.isEmpty())
    	{	
    	return "createError";
    	}
    	
    	Recipe recipe = new Recipe(titulo, problema, solucao, autor, tags);
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
 /*
  * Metodo para o Delete. implementação pesquisada e implementada com sucesso em alguns
  * projetos com spring mvc e fenix framework..... está a devolver um erro de POST
  * Ação do form criada no ficheiro detailedRecipe.jsp
  */
    @RequestMapping(method = RequestMethod.POST, value = "recipes/{id}")
    public String deleteRecipe(Model model, @PathVariable String id) {
    	    //Recipe recipe = 
    	//deleteRecipe.removeCookbookManager();
    	
    	return "redirect:/listRecipes";
    }
    
}