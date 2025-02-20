package com.bd.cibertec.Servicio;

import java.util.List;

import com.bd.cibertec.modelo.TblMedico;

public interface IMedicoServicio {
// Declaramos los metodos
	void RegistrarMedico(TblMedico tblmedico);
	void EliminarMedico (TblMedico tblMedico);
	List<TblMedico> ListadoMedico();
	TblMedico buscarporId (Integer id);
	
}// Fin de la interface
