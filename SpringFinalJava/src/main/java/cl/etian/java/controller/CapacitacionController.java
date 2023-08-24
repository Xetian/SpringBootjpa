package cl.etian.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cl.etian.java.entity.Capacitacion;
import cl.etian.java.service.IntCapacitacionService;

@Controller
public class CapacitacionController {
	

	@Autowired
	private IntCapacitacionService cap;
	
	@GetMapping("/capacitacion")
	public String listarCapacitaciones(Model model) {
		List<Capacitacion> capa = cap.listarTodos();
		model.addAttribute("list", capa);
		
		return "vistas/capacitacion";
	}
	
	@GetMapping("/editarcap{id}")
	public String editarcap(@PathVariable("id")Long id,Model model) {
		Capacitacion capa=cap.buscarId(id);
		model.addAttribute("capacitacion", capa);
		
		return "vistas/formcapacitacion";
	}
	
	
	
}
