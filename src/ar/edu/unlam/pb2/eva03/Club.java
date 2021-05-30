package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Club {


	private String nombre;
	private List<Deportista> socios;
	private Map<String, Evento> competencias;
	
	public Club(String nombre) {
		this.nombre = nombre;
		this.socios = new ArrayList<Deportista>();
	}

	public void agregarDeportista(Deportista deportista) {
		if(this.socios.contains(deportista)==false) {//if(socios.contains(deportista)) es lo mismo que tener if(socios.contains(deportista)==true)
			this.socios.add(deportista);
		}
	}

	public Integer getCantidadSocios() {
		return this.socios.size();
	}
	
}
