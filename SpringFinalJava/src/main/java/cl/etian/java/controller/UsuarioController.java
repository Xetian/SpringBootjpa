package cl.etian.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cl.etian.java.entity.Capacitacion;
import cl.etian.java.entity.Usuario;
import cl.etian.java.service.IntUsuarioService;


@Controller
public class UsuarioController {

	@Autowired
	private IntUsuarioService us;
	
	@GetMapping("/listusuarios")
	public String listarUsuarios(Model model) {
		List<Usuario> usuar = us.listarTodos();
		model.addAttribute("lista", usuar);
		
		return "vistas/usuario";
	}
	
	@GetMapping("/editarusu{id}")
	public String editarusu(@PathVariable("id")Long id,Model model) {
		Usuario usu=us.buscarId(id);
		model.addAttribute("usuario", usu);
		
		return "vistas/formusuario";
	}
	
	
	
}
