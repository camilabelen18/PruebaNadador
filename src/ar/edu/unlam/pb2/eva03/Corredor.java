package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor{

	private Integer cantidadDeKilometros;
	private Integer distanciaPreferida;
	private Integer cantidadDeKilometrosEntrenados;

	public Corredor(Integer numeroDeSocio, String nombre,Integer distanciaPreferida) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
	}
	
	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public Integer getCantidadDeKilometros() {
		return cantidadDeKilometros;
	}

	public void setCantidadDeKilometros(Integer cantidadDeKilometros) {
		this.cantidadDeKilometros = cantidadDeKilometros;
	}
	
	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return cantidadDeKilometrosEntrenados;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer cantidadDeKilometrosEntrenados) {
		this.cantidadDeKilometrosEntrenados = cantidadDeKilometrosEntrenados;
	}
	
	



	
}
