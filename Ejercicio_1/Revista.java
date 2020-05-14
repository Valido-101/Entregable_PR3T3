package Ejercicio_1;

import java.util.Date;

public class Revista extends Contenido{

	private int numero;
	
	public Revista(int codigo,String titulo,int annio_publicacion,int numero) {
		super(codigo,titulo,new Date(annio_publicacion,0,0));
		
		this.numero=numero;
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Revista [numero=" + numero + ", Código=" + getCodigo() + ", Título=" + getTitulo()
		+ ", Año de publicación=" + getAnnio_publicacion().getYear() + "]";
	}
	
}
