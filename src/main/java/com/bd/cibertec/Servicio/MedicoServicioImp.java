package com.bd.cibertec.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.cibertec.modelo.TblMedico;
import com.bd.cibertec.repositorio.IMedicoRepositorio;

@Service
public class MedicoServicioImp implements IMedicoServicio{
	
	// inyeccion de dependencias
	@Autowired
	private IMedicoRepositorio imedicorepositorio;

	@Override
	public void RegistrarMedico(TblMedico tblmedico) {
	 imedicorepositorio.save(tblmedico);
		
	}// Fin Metodo Registrar

	@Override
	public void EliminarMedico(TblMedico tblMedico) {
		imedicorepositorio.deleteById(tblMedico.getIdmedicot3());
	}// Fin Metodo Eliminar

	@Override
	public List<TblMedico> ListadoMedico() {
		return (List<TblMedico>) imedicorepositorio.findAll();
	}// Fin Metodo Listar

	@Override
	public TblMedico buscarporId(Integer id) {
		return imedicorepositorio.findById(id).orElse(null);
	}// Fin Metodo Buscar

} // Fin de la clase
