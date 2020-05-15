package Ejercicio_2;

//Esta clase hereda de la superclase SeleccionFutbol
public class Entrenador extends SeleccionFutbol{

	//Atributos
	
	private int idFederacion;
	
	//Constructor con parámetros
	
	public Entrenador(int id, String nombre, String apellidos, int edad,int idFederacion) {
		super(id, nombre, apellidos, edad);
		
		this.idFederacion=idFederacion;
		
	}
	
	//Métodos exlusivos de esta clase
	
	public void planificarEntrenamiento() {
		
		System.out.println("Va a planificar un entrenamiento.");
		
	}
	
	public void dirigePartido() {
		
		System.out.println("Dirige un partido.");
		
	}
	
}
