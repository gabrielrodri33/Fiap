package br.com.fiap.beans;

public class Computador {
	
	//visibilidade, tipo de dado e nome da variavel
	
	private String marca;
	private int ano;
	private Monitor monitor;
	//private String monitorPolegada;
	//private String monitorHz;
	//private String monitorTipo;
	
	//setters
	
	public void setMarca (String marca) {
		this.marca = marca;
	}
	
	public void setAno (int ano) {
		this.ano = ano;
	}
	
	public void setMonitor (Monitor monitor) {
		this.monitor = monitor;
	}
	
	//getters
	
	public String getMarca() {
		return marca;
	}
	
	public int getAno() {
		return ano;
	}
	
	public Monitor getMonitor() {
		return monitor;
	}
}
