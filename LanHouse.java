package YColecoesAtividade.dominio;

import java.util.ArrayList;


public class LanHouse {

	// Colecao de computadores da LanHouse
	private ArrayList<Computador> computadores;
	
	// Colecao de defeitos da LanHouse
	private ArrayList<Defeito> defeitos;
	
	/**
	 *  Construtor da classe LanHouse
	 */
	public LanHouse() {
		
		this.computadores = new ArrayList<Computador>();
		this.defeitos = new ArrayList<Defeito>();
	}
	
	/**
	 * 
	 * Um método para listar os computadores com uma determinada 
	 * quantidade de memória. 
	 */
	public void listarComputadores(int memoria) {
		// Crio uma variavel para usar como indice para a colecao
		int i = 0;
		// Crio uma variavel para guardar cada elemento da colecao
		Computador computador = new Computador();
		// Percorro a colecao, elemento a elemento, imprimindo os computadores.
		while( i < this.computadores.size()){
			computador = this.computadores.get(i);
			// Verifica se o computador possui a memoria fornecida como parametro
			if(computador.getMemoria() == memoria) {
				System.out.print(computador);	
			}	
			i++;
		}
	}
	
	/**
	 * Adiciona um novo computador da LanHouse
	 * 
	 * @param computador
	 */
	public void adicionarComputador( Computador computador ) {
		this.computadores.add(computador);
	}
	
	/**
	 * Remove um computador da LanHouse
	 * @param computador
	 */
	public void removerComputador(Computador computador) {
		this.computadores.remove(computador);
	}
	
	/**
	 * Aluga um computador da LanHouse
	 * 
	 * @param computador
	 */
	public void alugarComputador(Computador computador) {
		// Crio uma variavel para usar como indice para a colecao
		int i = 0;
		// Crio uma variavel para guardar cada elemento da colecao
		Computador elementoDaColecao = new Computador();
		// Percorro a colecao, elemento a elemento, imprimindo os computadores.
		while( i < this.computadores.size()){
			elementoDaColecao = this.computadores.get(i);
			// Verifica se o computador é igual ao elemento comp da colecao
			if(elementoDaColecao.equals(computador)) {
				// Aluga o computador da colecao
				elementoDaColecao.setStatus(Short.valueOf("1"));
				break;
			}	
			i++;
		}		
	}
	
	/**
	 * Aluga um computador da LanHouse
	 * 
	 * @param computadorComDefeito
	 */
	public void marcarComputadorDefeituoso(Computador computadorComDefeito) {
		// Crio uma variavel para usar como indice para a colecao
		int i = 0;
		// Crio uma variavel para guardar cada elemento da colecao
		Computador elementoDaColecao = new Computador();
		// Percorro a colecao, elemento a elemento, imprimindo os computadores.
		while( i < this.computadores.size()){
			elementoDaColecao = this.computadores.get(i);
			// Verifica se o computador é igual ao elemento comp da colecao
			if(elementoDaColecao.equals(computadorComDefeito)) {
				// Marca o computador da colecao como defeituoso
				elementoDaColecao.setStatus(Short.valueOf("2"));
				break;
			}	
			i++;
		}		
	}
	
	public void incluirDefeito(Defeito defeito) {
		this.defeitos.add(defeito);
	}
}
