package Ejercicio_2;

//Esta clase hereda de la superclase SeleccionFutbol
public class Masajista extends SeleccionFutbol{

	//Atributos
	private String titulacion;
	private int aniosExperiencia;
	
	//Constructor con par�metros
	public Masajista(int id, String nombre, String apellidos, int edad,String titulacion,int aniosExperiencia) {
		super(id, nombre, apellidos, edad);
		
		this.titulacion=titulacion;
		this.aniosExperiencia=aniosExperiencia;
		
	}
	
	//M�todos exclusivos de esta clase
	public void darMasajes() {
		
		System.out.println("Dar� un masaje.");
		
	}
	
}
