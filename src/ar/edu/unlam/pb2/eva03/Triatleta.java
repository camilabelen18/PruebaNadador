package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;

public class Triatleta extends Deportista{

	private String distanciaPreferida;
	private TipoDeBicicleta tipo;

	public Triatleta(Integer numeroDeSocio, String nombre,String distanciaPreferida,TipoDeBicicleta tipo) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
		this.tipo = tipo;
	}

	public String getDistanciaPreferida() {
		// TODO Auto-generated method stub
		return distanciaPreferida;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		// TODO Auto-generated method stub
		return this.tipo;
	}

}
