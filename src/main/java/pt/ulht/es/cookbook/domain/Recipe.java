package pt.ulht.es.cookbook.domain;

import org.joda.time.DateTime;


public class Recipe extends Recipe_Base {

	/*
	 * Para criar novos campos com a fenix framework a gravar no mysql, não esquecer de adicionar ao
	 * ficheiro src/main/dml/cookbook-manager.dml os novos campos para a tabela (caso das tags)
	 * Isto porque a estrutura e comunicação com a BD esta toda no Recipe_Base, 
	 * mas quando se tenta alterar esse ficheiro ele não grava as alterações. 
	 * Ao iniciar o servidor volta a colocar de origem.
	 * Só apos este passo foi possivel adicionar o setTags abaixo sem erros.
	 *  
	 * Precisei de apagar e voltar a criar a BD porque estava a dar erro no jetty:start 
	 * 
	 * Duvida a esclarecer - é normal ou existe forma de adicionar campos sem apagar a bd e perder
	 * os dados que já la estavam?
	 * 
	 */
    public  Recipe(String titulo, String problema, String solucao, String autor, String tags) {
        
    	setTitle(titulo);
        setProblem(problema);
        setSolution(solucao);
        setAuthor(autor);
        setTags(tags);
        setCreationTimestamp(new DateTime());
    	setCookbookManager(CookbookManager.getInstance());
    }

    /*
     * 
     * possivel base de trabalho para as pesquisas. Retirado de LP2.
     * estava a tentar utilizar na implementação logo do setTags mas n dá por causa da bd
     * Provavelmente terá de ser movido para o recipeController
     * 
     * 
	public void searchTags(String[] tags){

		//String s, key;
	//	while (str. ){
			
		//	s=str.split(",");
			//key=s[0].trim();
			//table.put(value);
	}
    
 */
}
