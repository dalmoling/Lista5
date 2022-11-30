package YColecoesAtividade.dominio;

import java.util.ArrayList;

public class Cinema {

	// Colecao de Salas do Cinema
	private ArrayList<Sala> salas;
	
	// Colecao de Filmes em Exibicao
	private ArrayList<Filme> filmes;
	
	// Maquina de Vender Bilhetes
	private MaquinaDeBilhetes maquinaDeBilhetes;

	// Construtor para inicializar a lista de salas e a lista de filmes do cinema
	public Cinema() {
		this.salas = new ArrayList<Sala>();
		this.filmes = new ArrayList<Filme>();
		this.maquinaDeBilhetes = new MaquinaDeBilhetes();
	}

	public void adicionarSala(Sala sala) {
		this.salas.add(sala);
	}
	
	public void adicionarFilme(Filme filme) {
		this.filmes.add(filme);
	}
	
	public void listarFilmes() {
		for( Filme filme : this.filmes) {
			System.out.print(filme);
		}
	}
	
	public void venderIngresso(Filme filme, int quantidade) {
		double valorTotal = this.maquinaDeBilhetes.venderIngresso(filme, quantidade);
		System.out.print("\n Valor Total do Ingresso "+valorTotal);
	}	
	
	public void definirValorIngresso(double valorIngresso) {
		this.maquinaDeBilhetes.setValorIngresso(valorIngresso);
	}
	
}
