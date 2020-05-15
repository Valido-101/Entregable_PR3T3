package Ejercicio_2;

public class Entrenador extends SeleccionFutbol{

	private int idFederacion;
	
	public Entrenador(int id, String nombre, String apellidos, int edad,int idFederacion) {
		super(id, nombre, apellidos, edad);
		
		this.idFederacion=idFederacion;
		
	}
	
	public void planificarEntrenamiento() {
		
		System.out.println("Va a planificar un entrenamiento.");
		
	}
	
	public void dirigePartido() {
		
		System.out.println("Dirige un partido.");
		
	}
	
}
