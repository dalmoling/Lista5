package YColecoesAtividade.dominio;

public class Filme {

	private String  titulo;
	private String genero;
	private int ano;
	private String diretor;
	private Sala sala;

	public Filme(String titulo, String genero, int ano, String diretor, Sala sala) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.ano = ano;
		this.diretor = diretor;
		this.sala = sala;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + ", genero=" + genero + ", ano="
				+ ano + ", diretor=" + diretor + ", sala=" + sala + "]";
	}
	
	
}
