package Ejercicio_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Scanner para los int y otro para los Strings
		Scanner teclado=new Scanner(System.in);
		Scanner teclado1=new Scanner(System.in);
		//ArrayList que guarda libros y revistas
		ArrayList<Contenido> biblioteca=new ArrayList<Contenido>();
		//Atributos de libro
		int opcion;
		int codigo;
		String titulo;
		int annio;
		//Atributos de revista
		int numero;
		
		//Instancia de los objetos en el ArrayList
		biblioteca.add(new Libro(1,"El retorno de Michael Jackson",2019+1));
		biblioteca.add(new Libro(2,"El Arca Perdida",2009+1));
		biblioteca.add(new Revista(3,"¡Hola!",2015+1,27));
		biblioteca.add(new Revista(4,"Qué me dices",2018+1,214));
		
		//Do while con un menú hecho con switch case
		do {
			
			System.out.print("Introduzca una opción: \n\t1-Añadir libro\n\t2-Añadir revista\n\t3-Prestar libro\n\t4-Devolver libro\n\t5-Mostrar datos de la biblioteca\n\t6-Salir\n\t>");
			opcion=teclado.nextInt();
			System.out.println();
			
			switch(opcion) {
			
				//Esta opción crea y añade un libro al arraylist
				case 1: 
						System.out.print("Introduzca el código del libro > ");
						codigo=teclado.nextInt();
						System.out.print("Introduzca el título > ");
						titulo=teclado1.nextLine();
						System.out.print("Introduzca el año de publicación > ");
						annio=teclado.nextInt();
						biblioteca.add(new Libro(codigo,titulo,annio+1));
						System.out.println("Tarea completada.");
					break;
				//Esta opción crea y añade una revista al arraylist	
				case 2:
						System.out.print("Introduzca el código de la revista > ");
						codigo=teclado.nextInt();
						System.out.print("Introduzca el título > ");
						titulo=teclado1.nextLine();
						System.out.print("Introduzca el año de publicación > ");
						annio=teclado.nextInt();
						System.out.print("Introduzca el número de la revista > ");
						numero=teclado.nextInt();
						biblioteca.add(new Revista(codigo,titulo,annio+1,numero));
						System.out.println("Tarea completada.");
					break;
				//Esta opción muestra los títulos de los libros que no están prestados y luego realiza el método prestar
				case 3:
						System.out.println("\nLibros disponibles:");
						//El for recorre el arraylist
						for(Contenido e: biblioteca) {
							
							//Si el objeto coincide con la clase libro, hace un casting explícito para ver si está prestado y muestra su título
							if(e instanceof Libro) {
								
								Libro x=(Libro) e;
								
								if(x.Prestado()==false) {
									
									System.out.println(e.getTitulo());
									
								}
								
							}
							
						}
						//Pide el título y realiza el método prestar al libro que coincida usando el casting explícito
						System.out.print("\nIntroduzca el título del libro > ");
						titulo=teclado1.nextLine();
						for(Contenido e: biblioteca) {
							
							if(e.getTitulo().equalsIgnoreCase(titulo)) {
								
								Libro l1=(Libro) e;
								l1.Prestar();
								
							}
							
						}
						break;
				//Realiza el mismo proceso que la opción anterior pero con los libros que están prestados para realizar el método devolver
				case 4:
						System.out.println("\nLibros prestados:");
						for(Contenido e: biblioteca) {
							
							if(e instanceof Libro) {
								
								Libro x=(Libro) e;
								
								if(x.Prestado()==false) {
									
									System.out.println(e.getTitulo());
									
								}
								
							}
							
						}
						System.out.print("\nIntroduzca el título del libro > ");
						titulo=teclado1.nextLine();
						for(Contenido e: biblioteca) {
							
							if(e.getTitulo().equalsIgnoreCase(titulo)) {
								
								Libro l1=(Libro) e;
								l1.Devolver();
								
							}
							
						}
					break;
				//Muestra todos los datos de la biblioteca	
				case 5:
						for(Contenido e: biblioteca) {
							
							if(e instanceof Libro) {
								
								System.out.println(((Libro)e).toString());
								
							}else {
								
								System.out.println(((Revista)e).toString());
								
							}
							
						}
						System.out.println();
					break;
				//Sale del menú
				case 6:
						System.out.println("Hasta pronto");
					break;
					}
			System.out.println();
		}while(opcion!=6);

	}

}
