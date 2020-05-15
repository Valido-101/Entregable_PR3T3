package Ejercicio_2;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{

	//Atributos
	private int id;
	private String nombre;
	private String apellidos;
	private int edad;
	
	//Constructor con parámetros
	public SeleccionFutbol(int id,String nombre,String apellidos,int edad) {
		
		this.id=id;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		
	}
	
	//Getters y setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//Métodos que vienen de la interfaz
	
	public void concentrarse() {
		
		System.out.println("Concentrarse");
		
	}
	public void viajar() {
		
		System.out.println("Viaja");
		
	}
	public void entrenar() {
		
		System.out.println("Entrena");
		
	}
	public void jugarPartido() {
		
		System.out.println("Juega un partido");
		
	}
	
	public void asistirPartido() {
		
		System.out.println("Asiste al partido");
		
	}
	
}
