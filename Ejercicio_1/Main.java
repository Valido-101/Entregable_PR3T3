package Ejercicio_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		Scanner teclado1=new Scanner(System.in);
		ArrayList<Libro> biblioteca_libros=new ArrayList<Libro>();
		ArrayList<Revista> biblioteca_revista=new ArrayList<Revista>();
		int opcion;
		int codigo;
		String titulo;
		int annio;
		int numero;
		
		biblioteca_libros.add(new Libro(1,"El retorno de Michael Jackson",2019+1));
		biblioteca_libros.add(new Libro(2,"El Arca Perdida",2009+1));
		biblioteca_revista.add(new Revista(3,"�Hola!",2015+1,27));
		biblioteca_revista.add(new Revista(4,"Qu� me dices",2018+1,214));
		
		do {
			
			System.out.print("Introduzca una opci�n: \n\t1-A�adir libro\n\t2-A�adir revista\n\t3-Prestar libro\n\t4-Devolver libro\n\t5-Mostrar datos de la biblioteca\n\t6-Salir\n\t>");
			opcion=teclado.nextInt();
			
			switch(opcion) {
			
				case 1: 
						System.out.print("Introduzca el c�digo del libro > ");
						codigo=teclado.nextInt();
						System.out.print("Introduzca el t�tulo > ");
						titulo=teclado1.nextLine();
						System.out.print("Introduzca el a�o de publicaci�n > ");
						annio=teclado.nextInt();
						biblioteca_libros.add(new Libro(codigo,titulo,annio+1));
						System.out.println("Tarea completada.");
					break;
				case 2:
						System.out.print("Introduzca el c�digo de la revista > ");
						codigo=teclado.nextInt();
						System.out.print("Introduzca el t�tulo > ");
						titulo=teclado1.nextLine();
						System.out.print("Introduzca el a�o de publicaci�n > ");
						annio=teclado.nextInt();
						System.out.print("Introduzca el n�mero de la revista > ");
						numero=teclado.nextInt();
						biblioteca_revista.add(new Revista(codigo,titulo,annio+1,numero));
						System.out.println("Tarea completada.");
					break;
				case 3:
						System.out.println("\nLibros disponibles:");
						for(Libro e: biblioteca_libros) {
							
							if(e.Prestado()==false) {
								
								System.out.println(e.getTitulo());
								
							}
							
						}
						System.out.print("\nIntroduzca el t�tulo del libro > ");
						titulo=teclado1.nextLine();
						for(Libro e: biblioteca_libros) {
							
							if(e.getTitulo().equalsIgnoreCase(titulo)) {
								
								e.Prestar();
								
							}
							
						}
						break;
				case 4:
						System.out.println("\nLibros prestados:");
						for(Libro e: biblioteca_libros) {
							
							if(e.Prestado()==true) {
								
								System.out.println(e.getTitulo());
								
							}
							
						}
						System.out.print("\nIntroduzca el t�tulo del libro > ");
						titulo=teclado1.nextLine();
						for(Libro e: biblioteca_libros) {
							
							if(e.getTitulo().equalsIgnoreCase(titulo)) {
								
								e.Devolver();
								
							}
							
						}
					break;
				case 5:
						System.out.println("Libros:");
						for(Libro e: biblioteca_libros) {
							
							System.out.println(e.toString());
							
						}
						System.out.println("\nRevistas:");
						for(Revista e: biblioteca_revista) {
							
							System.out.println(e.toString());
							
						}
						System.out.println();
					break;
				case 6:
						System.out.println("Hasta pronto");
					break;
					}
			System.out.println();
		}while(opcion!=6);

	}

}
