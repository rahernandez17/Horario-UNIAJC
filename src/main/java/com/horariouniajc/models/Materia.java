package com.horariouniajc.models;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "materias")
public class Materia {

	@Id
	@Column(name = "id_materia")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Integer idMateria;

	@Column
	@Basic(optional = false)
	private String nombre;

	@Column
	@Basic(optional = false)
	private String grupo;

	@Column
	@Basic(optional = false)
	private String sede;

	@Column
	@Basic(optional = false)
	private String bloque;

	@Column
	@Basic(optional = false)
	private String salon;

	@Column
	@Basic(optional = false)
	private String dia;

	@Column(name = "hora_inicio")
	@Basic(optional = false)
	private Time horaInicio;

	@Column(name = "hora_fin")
	@Basic(optional = false)
	private Time horaFin;

	public Materia() {
	}

	public Integer getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(Integer idMateria) {
		this.idMateria = idMateria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getBloque() {
		return bloque;
	}

	public void setBloque(String bloque) {
		this.bloque = bloque;
	}

	public String getSalon() {
		return salon;
	}

	public void setSalon(String salon) {
		this.salon = salon;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public Time getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Time horaInicio) {
		this.horaInicio = horaInicio;
	}
	
	@SuppressWarnings("deprecation")
	public void setHoraInicio(String horaInicio) {
		DateFormat formatter = new SimpleDateFormat("hh:mm:ss");
		Date date;
		try {
			date = formatter.parse(horaInicio);
			this.horaInicio = new Time(date.getHours(), date.getMinutes(), date.getSeconds());
		} catch (ParseException e) {
			this.horaInicio = new Time(0, 0, 0);
			e.printStackTrace();
		}
	}

	public Time getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Time horaFin) {
		this.horaFin = horaFin;
	}

	@SuppressWarnings("deprecation")
	public void setHoraFin(String horaFin) {
		DateFormat formatter = new SimpleDateFormat("hh:mm:ss");
		Date date;
		try {
			date = formatter.parse(horaFin);
			this.horaFin = new Time(date.getHours(), date.getMinutes(), date.getSeconds());
		} catch (ParseException e) {
			this.horaFin = new Time(0, 0, 0);
			e.printStackTrace();
		}
	}

}
