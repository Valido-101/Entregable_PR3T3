package Ejercicio_1;

import java.util.Date;

public class Libro extends Contenido implements Prestable{
	
	private boolean prestado;
	
	public Libro(int codigo,String titulo,int annio_publicacion) {
		super(codigo,titulo,new Date(annio_publicacion,0,0));
		
		prestado=false;
		
	}
	
	public void Prestar() {
		
		prestado=true;
		
	}
	
	public void Devolver() {
		
		prestado=false;
		
	}
	
	public boolean Prestado() {
		
		return prestado;
		
	}

	@Override
	public String toString() {
		return "Libro [Prestado=" + prestado + ", Código=" + getCodigo() + ", Título=" + getTitulo()
				+ ", Año de publicación=" + getAnnio_publicacion() + "]";
	}
	
	

}
