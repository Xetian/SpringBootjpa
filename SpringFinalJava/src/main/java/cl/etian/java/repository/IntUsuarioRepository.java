package cl.etian.java.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.etian.java.entity.Usuario;

@Repository
public interface IntUsuarioRepository extends CrudRepository<Usuario,Long>{

}
