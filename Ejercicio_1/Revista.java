package Ejercicio_1;

import java.util.Date;

//Esta clase hereda de Contenido
public class Revista extends Contenido{

	//Atributos
	private int numero;
	
	//Constructor
	public Revista(int codigo,String titulo,int annio_publicacion,int numero) {
		super(codigo,titulo,new Date(annio_publicacion,0,0));
		
		this.numero=numero;
		
	}

	//Getters y setters
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	//toString
	@Override
	public String toString() {
		return "Revista [Número=" + numero + ", Código=" + getCodigo() + ", Título=" + getTitulo()
		+ ", Año de publicación=" + getAnnio_publicacion().getYear() + "]";
	}
	
}
