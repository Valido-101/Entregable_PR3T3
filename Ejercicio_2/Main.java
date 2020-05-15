package Ejercicio_2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//ArrayList de la superclase donde almacenaremos todos los objetos
		ArrayList<SeleccionFutbol> equipo= new ArrayList<SeleccionFutbol>();
		
		//Instancia de los objetos en el ArrayList
		equipo.add(new Entrenador(1,"Luis Enrique","Gil Bermejo",34,1));
		equipo.add(new Futbolista(2,"Sergio","Ramos",35,10,"Centrocampista"));
		equipo.add(new Masajista(3,"Marcos","Alonso",40,"Quiropráctico",10));
		
		//For que recorre el ArrayList para realizar el método común a todos
		for(SeleccionFutbol e: equipo) {
			
			System.out.print(e.getNombre()+" "+e.getApellidos()+" -> ");
			e.concentrarse();
			
		}
		//Saltos de línea
		System.out.println("\n\n\n");
		
		//For para realizar el método común a todos
		for(SeleccionFutbol e: equipo) {
			
			System.out.print(e.getNombre()+" "+e.getApellidos()+" -> ");
			e.viajar();
			
		}
		
		
		System.out.println("\n\n\n");
		
		//Este for realia los métodos específicos de cada subclase
		for(SeleccionFutbol e: equipo) {
			
			System.out.print(e.getNombre()+" "+e.getApellidos()+" -> ");
			
			//Este if comprueba si el objeto coincide con a clase especificada
			if(e instanceof Entrenador) {
				
				//Si se cumple, hace un casting explícito y transforma ese objeto en un objeto transitorio del tipo que necesite para 
				//poder realizar ese método
				Entrenador entrenador=(Entrenador) e;
				entrenador.planificarEntrenamiento();
				
			}
			
			if(e instanceof Futbolista) {
				
				Futbolista futbolista=(Futbolista) e;
				futbolista.entrenamiento();
				
			}
			
			if(e instanceof Masajista) {
				
				Masajista masajista=(Masajista) e;
				masajista.darMasajes();
				
			}
			
		}
		
		System.out.println("\n\n\n");
		
		//En este caso se repite lo mismo que en el anterior
		for(SeleccionFutbol e: equipo) {
			
			System.out.print(e.getNombre()+" "+e.getApellidos()+" -> ");
			
			if(e instanceof Entrenador) {
				
				Entrenador entrenador=(Entrenador) e;
				entrenador.dirigePartido();
				
			}
			
			if(e instanceof Futbolista) {
				
				Futbolista futbolista=(Futbolista) e;
				futbolista.jugarPartido();
				
			}
			
			if(e instanceof Masajista) {
				
				Masajista masajista=(Masajista) e;
				masajista.darMasajes();
				
			}
			
		}
		
		System.out.println("\n\n\n");
		
		//Se imprime por pantalla los métodos específicos de cada clase
		System.out.print(equipo.get(0).getNombre()+" "+equipo.get(0).getApellidos()+" -> ");
		Entrenador entrenador=(Entrenador)equipo.get(0);
		entrenador.planificarEntrenamiento();
		
		System.out.println("\n\n\n");
		
		System.out.print(equipo.get(1).getNombre()+" "+equipo.get(1).getApellidos()+" -> ");
		Futbolista futbolista=(Futbolista)equipo.get(1);
		futbolista.entrevista();
		
		System.out.println("\n\n\n");
		
		System.out.print(equipo.get(2).getNombre()+" "+equipo.get(2).getApellidos()+" -> ");
		Masajista masajista=(Masajista)equipo.get(2);
		masajista.darMasajes();
		
	}

}
