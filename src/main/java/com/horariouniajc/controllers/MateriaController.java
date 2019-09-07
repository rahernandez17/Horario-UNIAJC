package com.horariouniajc.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.horariouniajc.models.Materia;
import com.horariouniajc.services.api.MateriaServiceAPI;

@Controller
@RequestMapping(value = "/materia")
public class MateriaController {

	@Autowired
	private MateriaServiceAPI materiaServiceApi;

	@PostMapping(value = "/save")
	public ResponseEntity<String> save(@RequestParam Map<String, Object> params) {
		try {
			Materia materia = new Materia();
			if (params.get("id_materia") != null && !StringUtils.isEmpty(params.get("id_materia").toString())) {
				materia.setIdMateria(Integer.parseInt(params.get("id_materia").toString()));
			}
			materia.setNombre(params.get("nombre").toString());
			materia.setGrupo(params.get("grupo").toString());
			materia.setSede(params.get("sede").toString());
			materia.setBloque(params.get("bloque").toString());
			materia.setSalon(params.get("salon").toString());
			materia.setDia(params.get("dia").toString());
			materia.setHoraInicio(params.get("hora_inicio").toString());
			materia.setHoraFin(params.get("hora_fin").toString());
			materiaServiceApi.save(materia);
			return new ResponseEntity<>("Se añadió la materia", HttpStatus.OK);
		} catch (NullPointerException e) {
			return new ResponseEntity<>("Hay un parámetro not null vació", HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping(value = "/modify")
	public ResponseEntity<String> update(@RequestParam Map<String, Object> params) {
		try {
			Materia materia = new Materia();
			if (params.get("id_materia") != null && !StringUtils.isEmpty(params.get("id_materia").toString())) {
				materia.setIdMateria(Integer.parseInt(params.get("id_materia").toString()));
			}
			materia.setNombre(params.get("nombre").toString());
			materia.setGrupo(params.get("grupo").toString());
			materia.setSede(params.get("sede").toString());
			materia.setBloque(params.get("bloque").toString());
			materia.setSalon(params.get("salon").toString());
			materia.setDia(params.get("dia").toString());
			materia.setHoraInicio(params.get("hora_inicio").toString());
			materia.setHoraFin(params.get("hora_fin").toString());
			materiaServiceApi.save(materia);
			return new ResponseEntity<>("Se modificó la materia", HttpStatus.CREATED);
		} catch (NullPointerException e) {
			return new ResponseEntity<>("Hay un parámetro not null vació", HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping(value = "/showAll")
	public ResponseEntity<Object> getAll() {
		try {
			return new ResponseEntity<>(materiaServiceApi.getAll(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("No se pudieron obtener las materias", HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping(value = "/showById")
	public ResponseEntity<Object> getById(@RequestParam Map<String, Object> params) {
		try {
			return new ResponseEntity<>(
					materiaServiceApi.getById(Integer.parseInt(params.get("id_materia").toString())), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("No se pudo obtener la materia", HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping(value = "/showAllByNombre")
	public ResponseEntity<Object> getByNombre(@RequestParam Map<String, Object> params) {
		try {
			return new ResponseEntity<>(materiaServiceApi.getAllByNombre(params.get("nombre").toString()),
					HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("No se pudieron obtener las materias", HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping(value = "/delete")
	public ResponseEntity<String> delete(@RequestParam Map<String, Object> params) {
		try {
			materiaServiceApi.delete(Integer.parseInt(params.get("id_materia").toString()));
			return new ResponseEntity<>("Se eliminó la materia correctamente", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("No se pudo eliminar la materia", HttpStatus.NOT_FOUND);
		}
	}

}
