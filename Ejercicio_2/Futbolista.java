package Ejercicio_2;

//Esta clase hereda de SeleccionFutbol
public class Futbolista extends SeleccionFutbol{
	
	//Atributos
	private int dorsal;
	private String demarcacion;
	
	//Constructor
	public Futbolista(int id, String nombre, String apellidos, int edad,int dorsal,String demarcacion) {
		super(id, nombre, apellidos, edad);
		
		this.dorsal=dorsal;
		this.demarcacion=demarcacion;
		
	}
	
	//Métodos exclusivos de esta clase
	
	public void entrevista() {
		
		System.out.println("Da una entrevista.");
		
	}
	
	public void entrenamiento() {
		
		System.out.println("Realiza un entrenamiento");
		
	}

}
