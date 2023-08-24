package cl.etian.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import cl.etian.java.entity.Capacitacion;
import cl.etian.java.entity.Usuario;
import cl.etian.java.service.IntCapacitacionService;
import cl.etian.java.service.IntUsuarioService;

@Controller
public class HomeController {
	
	@Autowired
	private IntCapacitacionService objcapacitacion;
	
	
	  @Autowired 
	  private IntUsuarioService objusuario;
	 

	@GetMapping({"/","index","home"})
	public String inicio() {
		return "/vistas/index";
	}
	
	@GetMapping("articulos")
	public String art() {
		return "/vistas/articulos";
	}
	
	@GetMapping("contacto")
	public String cont() {
		return "/vistas/contacto";
	}
	
	@GetMapping("registro")
	public String reg() {
		return "/vistas/registro";
	}
	
	@GetMapping("usuario")
	public String est() {
		return "redirect:/listusuarios";
	}
	
	@GetMapping("capacita")
	public String capacit() {
		return "redirect:/capacitacion";
	}
	
	@GetMapping("nuevacap")
	public String nueva(Capacitacion capacitacion) {
		return "/vistas/formcapacitacion";
	}
	
	@PostMapping("guardarcap")
	public String guarda(Capacitacion capacitacion) {
		objcapacitacion.guardar(capacitacion);
		return "redirect:/capacitacion";
	}
	
	
	@GetMapping("nuevousu")
	public String nueva(Usuario usuario) {
		return "/vistas/formusuario";
	}
	  
	@PostMapping("guardarusu")
	public String guarda(Usuario usuario) {
		objusuario.guardar(usuario);
		return "redirect:/listusuarios";
	}
	
	
	@GetMapping("eliminarusu{id}")
	public String eliminarusu(@PathVariable("id") Long id) {
		objusuario.eliminar(id);
		return "redirect:/listusuarios";
	}
	 
	
	
	@GetMapping("eliminarcap{id}")
	public String eliminarcap(@PathVariable("id") Long id) {
		objcapacitacion.eliminar(id);
		return "redirect:/capacitacion";
	}
	 
	 
}
