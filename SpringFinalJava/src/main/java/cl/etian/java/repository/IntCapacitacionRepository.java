package cl.etian.java.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.etian.java.entity.Capacitacion;

@Repository
public interface IntCapacitacionRepository extends CrudRepository<Capacitacion, Long>{

}
