package YColecoesAtividade.dominio;

public class Computador {


	private int numero;
	private short status;
	private String modelo;
	private int memoria;
	private String placaVideo;
	private String processador;
		
	public Computador() {
		this.status = Short.valueOf("0");
	}
	
    public Computador(int numero  ) {
    	this.status = Short.valueOf("0");
    	this.numero = numero;
    }  
    	
	public Computador(int numero, short status, String modelo, int memoria,
			String placaVideo, String processador) {
		this.numero = numero;
		this.status = status;
		this.modelo = modelo;
		this.memoria = memoria;
		this.placaVideo = placaVideo;
		this.processador = processador;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public short getStatus() {
		return status;
	}



	public void setStatus(short status) {
		this.status = status;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public int getMemoria() {
		return memoria;
	}



	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}



	public String getPlacaVideo() {
		return placaVideo;
	}



	public void setPlacaVideo(String placaVideo) {
		this.placaVideo = placaVideo;
	}



	public String getProcessador() {
		return processador;
	}



	public void setProcessador(String processador) {
		this.processador = processador;
	}



	@Override
	public String toString() {
		return "\n Computador [numero=" + numero + ", status=" + status
				+ ", modelo=" + modelo + ", memoria=" + memoria
				+ ", placaVideo=" + placaVideo + ", processador=" + processador
				+ "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + memoria;
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + numero;
		result = prime * result
				+ ((placaVideo == null) ? 0 : placaVideo.hashCode());
		result = prime * result
				+ ((processador == null) ? 0 : processador.hashCode());
		result = prime * result + status;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computador other = (Computador) obj;
		if (memoria != other.memoria)
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (numero != other.numero)
			return false;
		if (placaVideo == null) {
			if (other.placaVideo != null)
				return false;
		} else if (!placaVideo.equals(other.placaVideo))
			return false;
		if (processador == null) {
			if (other.processador != null)
				return false;
		} else if (!processador.equals(other.processador))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
	
	
	
}
