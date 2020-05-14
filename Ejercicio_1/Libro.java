package Ejercicio_1;

import java.util.Date;

public class Libro extends Contenido implements Prestable{
	
	private boolean prestado;
	
	public Libro(int codigo,String titulo,int annio_publicacion) {
		super(codigo,titulo,new Date(annio_publicacion,0,0));
		
		prestado=false;
		
	}
	
	public void Prestar() {
		
		if(prestado==true) {
			
			System.out.println("Error. Este libro ya está prestado.");
			
		}else {
			
			prestado=true;
			System.out.println("Proceso realizado con éxito.");
			
		}
		
	}
	
	public void Devolver() {
		
		if(prestado==false) {
			
			System.out.println("Error. Este libro ya está devuelto.");
			
		}else {
			
			prestado=false;
			System.out.println("Proceso realizado con éxito.");
			
		}
		
	}
	
	public boolean Prestado() {
		
		return prestado;
		
	}

	@Override
	public String toString() {
		String disponible;
		if(prestado==false) {
			
			disponible="Disponible";
			
		}else {
			
			disponible="Prestado";
			
		}
		return "Libro ["+ disponible + ", Código=" + getCodigo() + ", Título=" + getTitulo()
				+ ", Año de publicación=" + getAnnio_publicacion().getYear() + "]";
	}
	
	

}
