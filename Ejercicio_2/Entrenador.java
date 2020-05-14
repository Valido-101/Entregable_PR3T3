package Ejercicio_2;

public class Entrenador extends SeleccionFutbol{

	private int idFederacion;
	
	public Entrenador(int id, String nombre, String apellidos, int edad,int idFederacion) {
		super(id, nombre, apellidos, edad);
		
		this.idFederacion=idFederacion;
		
	}
	
	public void planificarEntrenamiento() {
		
		System.out.println("El entrenador "+getNombre()+" "+getApellidos()+" va a planificar un entrenamiento.");
		
	}
	
}
