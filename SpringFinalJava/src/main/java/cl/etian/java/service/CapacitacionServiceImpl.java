package cl.etian.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.etian.java.entity.Capacitacion;
import cl.etian.java.repository.IntCapacitacionRepository;


@Service
public class CapacitacionServiceImpl implements IntCapacitacionService{
	
	
	@Autowired
	private IntCapacitacionRepository capa;
	

	@Override
	@Transactional(readOnly=true)
	public List<Capacitacion> listarTodos() {
		return (List<Capacitacion>) capa.findAll();
	}

	@Override
	@Transactional
	public void guardar(Capacitacion capacitacion) {
		capa.save(capacitacion);
		
	}

	@Override
	@Transactional
	public Capacitacion buscarId(Long id) {
		return capa.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public void eliminar(Long id) {
		capa.deleteById(id);
		
	}

}
