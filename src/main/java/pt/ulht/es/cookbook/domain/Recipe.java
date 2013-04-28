//para apagar o comment - versao pelo fb...

package pt.ulht.es.cookbook.domain;

public class Recipe {

	private String titulo;
	private String problema;
	private String solucao;
	private String id;

	public Recipe(String titulo, String problema, String solucao) {
		this.titulo = titulo;
		this.problema = problema;
		this.solucao = solucao;
	}

	public String getId() {
		return this.id;
	}

	public String setId(String key) {
		this.id = key;
		return this.id;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public String getProblema() {
		return problema;
	}
	
	public String getSolucao() {
		return solucao;
	}
}
