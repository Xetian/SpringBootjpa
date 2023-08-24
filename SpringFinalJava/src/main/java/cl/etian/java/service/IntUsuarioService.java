package cl.etian.java.service;

import java.util.List;

import cl.etian.java.entity.Usuario;

public interface IntUsuarioService {

	public List<Usuario> listarTodos();
	public void guardar(Usuario usuario);
	public Usuario buscarId(Long id);
	public void eliminar(Long id);
}
