package cl.etian.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.etian.java.entity.Usuario;
import cl.etian.java.repository.IntUsuarioRepository;

@Service
public class UsuarioServiceImpl implements IntUsuarioService{
	
	@Autowired
	private IntUsuarioRepository usu;

	@Override
	public List<Usuario> listarTodos() {
		
		return (List<Usuario>) usu.findAll();
	}

	@Override
	public void guardar(Usuario usuario) {
		usu.save(usuario);
		
	}

	@Override
	public Usuario buscarId(Long id) {
		
		return usu.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		usu.deleteById(id);
		
	}

}
