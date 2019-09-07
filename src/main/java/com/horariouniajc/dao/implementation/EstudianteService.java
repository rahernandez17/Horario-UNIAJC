package com.horariouniajc.dao.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horariouniajc.dao.api.EstudianteDaoAPI;
import com.horariouniajc.models.Usuario;
import com.horariouniajc.services.api.EntityServiceAPI;

@Service
public class EstudianteService implements EntityServiceAPI<Usuario, Integer> {

	@Autowired
	private EstudianteDaoAPI estudianteDaoAPI; 
	
	@Override
	public void save(Usuario object) {
		estudianteDaoAPI.save(object);
	}

	@Override
	public void modify(Usuario object) {
		estudianteDaoAPI.save(object);
	}

	@Override
	public void delete(Integer idObject) {
		estudianteDaoAPI.deleteById(idObject);
	}

	@Override
	public List<Usuario> getAll() {
		List<Usuario> estudiantes = new ArrayList<>();
		estudianteDaoAPI.findAll().forEach((Usuario t) -> {
			estudiantes.add(t);
		});
		return estudiantes;
	}

	@Override
	public Usuario getById(Integer idObject) {
		return estudianteDaoAPI.findById(idObject).get();
	}

	@Override
	public Boolean isExistObject(Integer idObject) {
		return estudianteDaoAPI.existsById(idObject);
	}
	
}
