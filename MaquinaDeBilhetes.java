package YColecoesAtividade.dominio;

public class MaquinaDeBilhetes {

	private double valorIngresso;
	
	public MaquinaDeBilhetes() {
		this.valorIngresso = 0.00;
	}
	
	public MaquinaDeBilhetes( double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}

	public double venderIngresso(Filme filme, int quantidade) {
		double valorTotal = 0;		
		if(quantidade > filme.getSala().getCapacidade()  ) {
			System.out.print("Capacidade da Sala excedida. ");			
		}
		else {
			valorTotal = quantidade * this.valorIngresso;
		}
		return valorTotal;
		
	}
	
	public double getValorIngresso() {
		return valorIngresso;
	}

	public void setValorIngresso(double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}
	
	
}
