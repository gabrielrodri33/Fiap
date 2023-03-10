package br.com.fiap.exec;

import br.com.fiap.beans.Computador;
import br.com.fiap.beans.Monitor;

public class Exec {

	public static void main(String[] args) {
		
		//Instanciar objetos
		
		Computador objComputador = new Computador();
		Monitor objMonitor = new Monitor();
		
		//Setters das variaveis
		
		objComputador.setMarca("Dell");
		objComputador.setAno(2022);
		objComputador.setMonitor(objMonitor);
		
		objMonitor.setPolegada("27 Polegadas");
		objMonitor.setHz("75 Hertz");
		objMonitor.setTipo("WideScreen");
		
		//Saída
		
		System.out.println("Marca: " + objComputador.getMarca() + "\nAno de fabricação: " + objComputador.getAno() + 
				"\n\nMonitor\nPolegadas: " + objComputador.getMonitor().getPolegada() + "\nHertz: " +
				objComputador.getMonitor().getHz() + "\nTipo: " + objComputador.getMonitor().getTipo());
		
	}

}
