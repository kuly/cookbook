package pt.ulht.es.cookbook.domain;

import org.joda.time.DateTime;

public class RecipeVersion extends RecipeVersion_Base implements Comparable<RecipeVersion>  {
    
    public RecipeVersion(String title, String problem, String solution, String author, String tags) {
        setTitle(title);
        setProblem(problem);
        setAuthor(author);
        setTags(tags);
        setCreationTimestamp(new DateTime());
    }
    
	public int compareTo(RecipeVersion o) {
		return getTitle().toLowerCase().compareTo(getTitle().toLowerCase());
	}
	
}
