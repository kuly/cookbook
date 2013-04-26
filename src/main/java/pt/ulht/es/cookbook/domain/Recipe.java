//para apagar o comment - versao pelo fb...

package pt.ulht.es.cookbook.domain;

public class Recipe {

	private String titulo;
	private String problema;
	private String solucao;
	private String id;
	private static int ide = 1234567;
	
	
public Recipe(String titulo, String problema, String solucao){
	
	this.titulo=titulo;
	this.problema=problema;
	this.solucao=solucao;
	this.id = setId();
}

public String getId() {
	return this.id;
}

public String setId() {
	ide++;
	id = ""+ide;
	return id;	
}


}
