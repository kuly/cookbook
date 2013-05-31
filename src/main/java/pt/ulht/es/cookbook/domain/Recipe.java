package pt.ulht.es.cookbook.domain;



public class Recipe extends Recipe_Base {

	
    public Recipe(String titulo, String problema, String solucao, String autor, String tags) {
        
    	setCookbookManager(CookbookManager.getInstance());
    	setVersion();
    }
    
    private void setVersion() {
		
		
	}

	public void delete() {
    	setCookbookManager(null);
    	deleteDomainObject();
    }

    public void lastVersion(){
    	
    	
    }
    
    /*
     * 
     * possivel base de trabalho para as pesquisas. Retirado de LP2.
     * estava a tentar utilizar na implementação logo do setTags mas n dá por causa da bd
     * Provavelmente terá de ser movido para o recipeController
     * 
     *
	public void search(String[] tags){

		String data = this.getTags();
		System.out.println("tags:" + data);
		
		//	while (str. ){
			
		//	s=str.split(",");
			//key=s[0].trim();
			//table.put(value);
	}
    */
 
}
