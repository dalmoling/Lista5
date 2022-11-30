package YColecoesAtividade.dominio;

import java.util.Date;

public class Defeito {

	private Date dataDefeito;
	private String descricao;	
	
	/**
	 *  Construtor parametrizacao com data do defeito e a descricao
	 *  
	 * @param dataDefeito
	 * @param descricao
	 * 
	 */
	public Defeito(Date dataDefeito, String descricao) {
		this.dataDefeito = dataDefeito;
		this.descricao = descricao;
	}
	
	// GET e SET para os atributos
	public Date getDataDefeito() {
		return dataDefeito;
	}
	public void setDataDefeito(Date dataDefeito) {
		this.dataDefeito = dataDefeito;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * toString para retornar um String do objeto Defeito
	 */
	@Override
	public String toString() {
		return "Defeito [dataDefeito=" + dataDefeito + ", descricao="
				+ descricao + "]";
	}
	
	
}
