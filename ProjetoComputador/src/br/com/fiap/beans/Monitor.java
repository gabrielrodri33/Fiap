package br.com.fiap.beans;

public class Monitor {
	
	//visibilidade, tipo de dado e nome da variavel
	
	private String polegada;
	private String hz;
	private String tipo;
	
	//setters
	
	public void setPolegada(String polegada) {
		this.polegada = polegada;
	}
	
	public void setHz(String hz) {
		this.hz = hz;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//getters
	
	public String getPolegada() {
		return polegada;
	}
	
	public String getHz() {
		return hz;
	}
	
	public String getTipo() {
		return tipo;
	}

}
