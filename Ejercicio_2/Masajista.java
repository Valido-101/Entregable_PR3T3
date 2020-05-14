package Ejercicio_2;

public class Masajista extends SeleccionFutbol{

	private String titulacion;
	private int aniosExperiencia;
	
	public Masajista(int id, String nombre, String apellidos, int edad,String titulacion,int aniosExperiencia) {
		super(id, nombre, apellidos, edad);
		
		this.titulacion=titulacion;
		this.aniosExperiencia=aniosExperiencia;
		
	}
	
	public void darMasajes() {
		
		System.out.println("El masajista "+getNombre()+" "+getApellidos()+" dará un masaje.");
		
	}
	
}
