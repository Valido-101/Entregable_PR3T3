package Ejercicio_1;

import java.util.Date;

//Hereda de Contenido e implementa la interfaz Prestable
public class Libro extends Contenido implements Prestable{
	
	//Atributos
	private boolean prestado;
	
	//Constructor
	public Libro(int codigo,String titulo,int annio_publicacion) {
		super(codigo,titulo,new Date(annio_publicacion,0,0));
		
		prestado=false;
		
	}
	
	//M�todos heredados de la interfaz
	
	public void Prestar() {
		
		if(prestado==true) {
			
			System.out.println("Error. Este libro ya est� prestado.");
			
		}else {
			
			prestado=true;
			System.out.println("Proceso realizado con �xito.");
			
		}
		
	}
	
	public void Devolver() {
		
		if(prestado==false) {
			
			System.out.println("Error. Este libro ya est� devuelto.");
			
		}else {
			
			prestado=false;
			System.out.println("Proceso realizado con �xito.");
			
		}
		
	}
	
	public boolean Prestado() {
		
		return prestado;
		
	}

	//toString
	@Override
	public String toString() {
		String disponible;
		if(prestado==false) {
			
			disponible="Disponible";
			
		}else {
			
			disponible="Prestado";
			
		}
		return "Libro ["+ disponible + ", C�digo=" + getCodigo() + ", T�tulo=" + getTitulo()
				+ ", A�o de publicaci�n=" + getAnnio_publicacion().getYear() + "]";
	}
	
	

}
