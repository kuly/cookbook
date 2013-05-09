
package pt.ulht.es.cookbook.domain;

import java.util.Date;

public class Recipe {

	private String titulo;
	private String problema;
	private String solucao;
	private String id;
	private String autor;
	private Date data;
	
	public Recipe(String titulo, String problema, String solucao, String autor) {
		this.titulo = titulo;
		this.problema = problema;
		this.solucao = solucao;
		this.autor = autor;
		this.data = new Date();
	}
	
	public String getData() {
		return data.toString();
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

	public String getAutor() {
		return autor;
	}
}
