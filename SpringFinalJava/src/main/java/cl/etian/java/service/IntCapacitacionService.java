package cl.etian.java.service;

import java.util.List;

import cl.etian.java.entity.Capacitacion;



public interface IntCapacitacionService {
	
	public List<Capacitacion> listarTodos();
	public void guardar(Capacitacion capacitacion);
	public Capacitacion buscarId(Long id);
	public void eliminar(Long id);

}
