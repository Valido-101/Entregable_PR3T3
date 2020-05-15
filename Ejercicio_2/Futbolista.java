package Ejercicio_2;

public class Futbolista extends SeleccionFutbol{
	
	private int dorsal;
	private String demarcacion;
	
	public Futbolista(int id, String nombre, String apellidos, int edad,int dorsal,String demarcacion) {
		super(id, nombre, apellidos, edad);
		
		this.dorsal=dorsal;
		this.demarcacion=demarcacion;
		
	}
	
	public void entrevista() {
		
		System.out.println("Da una entrevista.");
		
	}
	
	public void entrenamiento() {
		
		System.out.println("Realiza un entrenamiento");
		
	}

}
