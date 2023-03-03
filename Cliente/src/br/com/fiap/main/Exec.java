package br.com.fiap.main;

import br.com.fiap.modelo.Cliente;

public class Exec {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Gabriel Siqueira");
		cliente.setIdade(19);
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getIdade());
		
	}

}
