package entities;


public class Emprestimo extends Jogadores{
	private double valor;
	private String antigo_clube;
	private String duracao;
	private String obrigacao_de_compra;
	
	public Emprestimo () {
		super();
	} /*construtor */

	public Emprestimo(String nome_jogador, Integer idade, double altura, String pe, String posicao, Integer camisa,
			String nacionalidade,double valor, String antigo_clube, String duracao,
			String obrigacao_de_compra) {
		super(nome_jogador, idade, altura, pe, posicao, camisa, nacionalidade);
		this.valor = valor;
		this.antigo_clube = antigo_clube;
		this.duracao = duracao;
		this.obrigacao_de_compra = obrigacao_de_compra;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
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

	public String getObrigacao_de_compra() {
		return obrigacao_de_compra;
	}

	public void setObrigacao_de_compra(String obrigacao_de_compra) {
		this.obrigacao_de_compra = obrigacao_de_compra;
	}

	
	
 
}
