package listaAlumnos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class MainAlumnos {

	public static void main(String[] args) {
		
		// Caso test creacion alumno.
			Alumnos primerAlumno = new Alumnos("Aitor ", "Merino");
			Alumnos segundoAlumno = new Alumnos("Miquel ", "Gustran");
			Alumnos tercerAlumno = new Alumnos("Victor ", "Garcia");

			/*System.out.println(primerAlumno.getNombre() + primerAlumno.getApellidos());
			System.out.println(segundoAlumno.getNombre() + segundoAlumno.getApellidos());
			System.out.println(tercerAlumno.getNombre() + tercerAlumno.getApellidos());*/


		//Creación de la lista

			/*Alumnos[][] alumnos = {{"Aitor ", "Miquel", "Victor", "Denis", "Aitor", "Ramón"}, 
			{"Lepe", "Gustran", "García", "Dilinov", "Merino", "De la Cruz"}}; ({Nombre, Apellido}{Nombre 2, Apellido2}*/

			Queue<Alumnos> listaAlumnos = new LinkedList<Alumnos>();
			listaAlumnos.add(primerAlumno);
			listaAlumnos.add(segundoAlumno);
			listaAlumnos.add(tercerAlumno);

		//Mostrar toda la gente de la cola
			
			for(int i = 0; i < listaAlumnos.size(); i++){
				
				Alumnos alumno = listaAlumnos.element(); // Sacar al alumno y lo metemos en una variable Alumno de la Queue "listaAlumnos".
				System.out.println("Nombre del alumno: " + alumno); //Muestra el nombre del alumno sacado de la queue.
				if(alumno == listaAlumnos.element()){
					alumno = listaAlumnos.;
				}	
			
			
				//listaAlumnos.offer(alumno); //Mete el nombre del alumno al final de la queue(lo que intento es así sacar todos los nombres
											// porque si no, solo sacaría el primero (?)
			}	
	}



