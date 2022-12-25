package entities;


public class Definitivo  extends Jogadores{
	private Double  valor;
	private String antigo_clube;
	private String duracao;
   
	public Definitivo () {
	}

	public Definitivo(String nome_jogador, Integer idade, double altura, String pe, String posicao, Integer camisa,
			String nacionalidade, Double valor, String antigo_clube, String duracao) {
		super(nome_jogador, idade, altura, pe, posicao, camisa, nacionalidade);
		this.valor = valor;
		this.antigo_clube = antigo_clube;
		this.duracao = duracao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getAntigo_clube() {
		return antigo_clube;
	}

	public void setAntigo_clube(String antigo_clube) {
		this.antigo_clube = antigo_clube;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	
}
