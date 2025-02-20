package com.bd.cibertec.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bd.cibertec.Servicio.IMedicoServicio;
import com.bd.cibertec.modelo.TblMedico;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@RequestMapping("/Vistas")
public class MedicoController {
	@Autowired
	private IMedicoServicio imedicoservicio;
	
	// Listado de Medico
	@GetMapping("ListadoMedico")
	public String listarMedico(Model modelo) {
		// Recuperamos datos de la BD
		List<TblMedico> listado=imedicoservicio.ListadoMedico();
		// Enviamos a la vista
		modelo.addAttribute("listado", listado);
		// retornamos
		return "/Vistas/ListadoMedico";
	}
	
	// Regsitrar Medico
	@GetMapping("/RegistrarMedico")
	public String RegistrarMedico(Model modelo) {
		TblMedico tblmedico = new TblMedico();
		modelo.addAttribute("regmedico", tblmedico);
		return "/Vistas/FrmRegistrarMedico";
	}
	
	@PostMapping ("/GuardarMedico")
	public String GuardarMedico(@ModelAttribute TblMedico tblmedico, Model modelo) {
		imedicoservicio.RegistrarMedico(tblmedico);
		System.out.println("Medico Registrado en la Base de Datos");
		return "redirect:/Vistas/ListadoMedico";
	}
	
	@GetMapping("/editarmedico/{id}")
	public String Editar(@PathVariable ("id") Integer idmedico, Model modelo) {
		TblMedico clmedico =imedicoservicio.buscarporId(idmedico);
		modelo.addAttribute("regmedico", clmedico);
		return "/Vistas/FrmRegistrarMedico";
	}
	
	@GetMapping ("eliminarmedico/{id}")
	public String eliminar(@PathVariable("id") Integer idmedico, Model modelo) {
	TblMedico tblmed = new TblMedico();
	tblmed.setIdmedicot3(idmedico);
	imedicoservicio.EliminarMedico(tblmed);
	List<TblMedico> listado = imedicoservicio.ListadoMedico();
	modelo.addAttribute("listado", listado);
	return "redirect:/Vistas/ListadoMedico";
	}
	
	
	
}// Fin de la clase
