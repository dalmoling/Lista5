package YColecoesAtividade.test;


import YColecoesAtividade.dominio.Cinema;
import YColecoesAtividade.dominio.Filme;
import YColecoesAtividade.dominio.Sala;

public class GerenciarCinema {

	public static void main(String[] args) {
		
		Cinema cinema = new Cinema();
		
		cinema.definirValorIngresso(10.00);
		
		Sala sala1 = new Sala(1, 100);
		Sala sala2 = new Sala(2, 140);
		Sala sala3 = new Sala(3, 200);
		
		cinema.adicionarSala(sala1);
		cinema.adicionarSala(sala2);
		cinema.adicionarSala(sala3);
		
		Filme filme1 = new Filme("MAD MAX 4", "Acao", 2015, "QQUM", sala1);
		Filme filme2 = new Filme("STAR WARS VII", "Ficcao Cientifica", 2015, "QQUM", sala2);
		Filme filme3 = new Filme("APOCALIPSE NOW REDUX", "Guerra", 1978, "Francis Ford Coppola", sala3);
		
		cinema.adicionarFilme(filme1);
		cinema.adicionarFilme(filme2);
		cinema.adicionarFilme(filme3);
		
		cinema.venderIngresso(filme1, 1);
		cinema.venderIngresso(filme2, 2);
		cinema.venderIngresso(filme3, 500);
		
	}
}
