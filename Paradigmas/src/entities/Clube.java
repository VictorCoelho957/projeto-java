package entities;


public class Clube {
	
	private String nome_clube;
	private String estadio;
	private String cidade;
	private String treinador;
	
	public Clube () {
		
	}  /*construtor */

	public Clube(String nome_clube, String estadio, String cidade, String treinador) {
		this.nome_clube = nome_clube;
		this.estadio = estadio;
		this.cidade = cidade;
		this.treinador = treinador;
	}

	public String getNome_clube() {
		return nome_clube;
	}

	public void setNome_clube(String nome_clube) {
		this.nome_clube = nome_clube;
	}

	

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTreinador() {
		return treinador;
	}

	public void setTreinador(String treinador) {
		this.treinador = treinador;
	}


}

 