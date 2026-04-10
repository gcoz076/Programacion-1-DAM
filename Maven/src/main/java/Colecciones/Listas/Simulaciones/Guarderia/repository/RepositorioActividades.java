package Colecciones.Listas.Simulaciones.Guarderia.repository;

import java.time.LocalDate;
import java.util.*;

import Colecciones.Listas.Simulaciones.Guarderia.exceptions.*;
import Colecciones.Listas.Simulaciones.Guarderia.models.*;

public class RepositorioActividades {
	private Collection<Actividad> activididades;

	public RepositorioActividades() {
		super();
		this.activididades = new HashSet<Actividad>();
		//Uso un hashset porque no repetidos y no me dicen que guarde ordenado
	}

	public Collection<Actividad> getActivididades() {
		return activididades;
	}

	public void setActivididades(Set<Actividad> activididades) {
		this.activididades = activididades;
	}
	
	public boolean isAlumnoApuntado(String nombreActividad, LocalDate fechaActividad, Alumno a) throws GuarderiaException {
		boolean esta = false;
		Actividad actividadRecibida = new Actividad(nombreActividad, fechaActividad);
		Iterator<Actividad> iterator = this.activididades.iterator();
		boolean existe = false;
		Actividad tipo = null;
		while (iterator.hasNext() && !existe) {
			Actividad actividad = iterator.next();
			if (actividad.equals(actividadRecibida)) {
				existe = true;
			}else {
				throw new GuarderiaException(nombreActividad+" no existe.");
			}
		}
		if (actividadRecibida.getAlumnos().contains(a)) {
			esta = true;
		}

		return esta;
	}

	public void agregarAlumnoActividad(String nombreActividad, LocalDate fechaActividad, Alumno a)
			throws GuarderiaException {
		Actividad actividadRecibida = new Actividad(nombreActividad, fechaActividad);
		Iterator<Actividad> iterator = this.activididades.iterator();
		boolean existe = false;
		Actividad tipo = null;
		while (iterator.hasNext() && !existe) {
			Actividad actividad = iterator.next();
			if (actividad.equals(actividadRecibida)) {
				existe = true;
			}else {
				throw new GuarderiaException(nombreActividad+" no existe.");
			}
		}
		if (existe) {
			actividadRecibida.agregarAlumno(a);
		}
	}

	public List<Alumno> getAlumnadoConAlergias(String nombreActividad, LocalDate fechaActividad) {
		List<Alumno> alergias = null;

		// TODO
		return alergias;
	}



	public List<Actividad> getListaActividades() {
		List<Actividad> actividades = null;

		// TODO
		return actividades;
	}

}
