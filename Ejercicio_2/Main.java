package Ejercicio_2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<SeleccionFutbol> equipo= new ArrayList<SeleccionFutbol>();
		
		equipo.add(new Entrenador(1,"Luis Enrique","Gil Bermejo",34,1));
		equipo.add(new Futbolista(2,"Sergio","Ramos",35,10,"Centrocampista"));
		equipo.add(new Masajista(3,"Marcos","Alonso",40,"Quiropráctico",10));
		
		for(SeleccionFutbol e: equipo) {
			
			System.out.print(e.getNombre()+" "+e.getApellidos()+" -> ");
			e.concentrarse();
			
		}
		
		System.out.println("\n\n\n");
		
		for(SeleccionFutbol e: equipo) {
			
			System.out.print(e.getNombre()+" "+e.getApellidos()+" -> ");
			e.viajar();
			
		}
		
		
		System.out.println("\n\n\n");
		
		
		for(SeleccionFutbol e: equipo) {
			
			System.out.print(e.getNombre()+" "+e.getApellidos()+" -> ");
			
			if(e instanceof Entrenador) {
				
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
