package Ejercicio_1;

import java.util.Date;

public abstract class Contenido {
	
	//Atributos
	private int codigo;
	private String titulo;
	private Date annio_publicacion;
	
	//Constructor
	public Contenido(int codigo,String titulo,Date annio_publicacion) {
		
		this.codigo=codigo;
		this.titulo=titulo;
		this.annio_publicacion=annio_publicacion;
		
	}
	
	//Getters y setters
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getAnnio_publicacion() {
		return annio_publicacion;
	}
	public void setAnnio_publicacion(Date annio_publicacion) {
		this.annio_publicacion = annio_publicacion;
	}
	
}
