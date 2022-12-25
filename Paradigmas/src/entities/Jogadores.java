package entities;


public class Jogadores {
	private String nome_jogador;
	private Integer  idade;
	private double altura;
	private String pe;
	private String posicao;
	private Integer camisa;
	private String nacionalidade;
		
	public Jogadores () {
		
	} /*construtores */

	public Jogadores(String nome_jogador, Integer idade, double altura, String pe, String posicao, Integer camisa,
			String nacionalidade) {
		this.nome_jogador = nome_jogador;
		this.idade = idade;
		this.altura = altura;
		this.pe = pe;
		this.posicao = posicao;
		this.camisa = camisa;
		this.nacionalidade = nacionalidade;
	}

	public String getNome_jogador() {
		return nome_jogador;
	}

	public void setNome_jogador(String nome_jogador) {
		this.nome_jogador = nome_jogador;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getPe() {
		return pe;
	}

	public void setPe(String pe) {
		this.pe = pe;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public Integer getCamisa() {
		return camisa;
	}

	public void setCamisa(Integer camisa) {
		this.camisa = camisa;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	
  
}
