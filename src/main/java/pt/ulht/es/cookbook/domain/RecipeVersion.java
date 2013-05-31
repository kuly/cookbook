package pt.ulht.es.cookbook.domain;

import org.joda.time.DateTime;

public class RecipeVersion extends RecipeVersion_Base {
    
    public  RecipeVersion(String titulo, String problema, String solucao, String autor, String tags) {
        
    	setTitle(titulo);
        setProblem(problema);
        setSolution(solucao);
        setAuthor(autor);
        setTags(tags);
        setCreationTimestamp(new DateTime());
    	
    }
    
}
