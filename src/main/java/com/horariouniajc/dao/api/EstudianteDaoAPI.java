package com.horariouniajc.dao.api;

import org.springframework.data.repository.CrudRepository;

import com.horariouniajc.models.Usuario;

public interface EstudianteDaoAPI extends CrudRepository<Usuario, Integer> {

}
