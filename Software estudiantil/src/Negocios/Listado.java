package Negocios;

import IU.Interfaz;
import java.util.LinkedList;

import Datos.Alumno;

public class Listado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaz i1 = new Interfaz();
		i1.Login();
	}
	LinkedList<Alumno> Estudiante = new LinkedList<Alumno>();
	
	public boolean add(Alumno alumno) {
		char [] letras = alumno.getNombre().toCharArray();
		if(letras.length >= 3 && letras.length <= 60 ) {
			String apellido = alumno.getApellido();
			letras= apellido.toCharArray();
			if(letras.length>= 3 && letras.length<= 60) {
				String dni = alumno.getDni();
				letras = dni.toCharArray();
				if(letras.length == 8) {
				Estudiante.add(alumno);
				return true;
				}
			}
		}
		return false;
	}
	
	public Alumno buscar(String dni) {
		Alumno alumno = new Alumno();
		for (int i = 0; i < Estudiante.size(); i++) {
			System.out.println(Estudiante.get(i));
           alumno=Estudiante.get(i);
           //System.out.println(alumno.getDni());
           //System.out.println("Dni ");
           //System.out.println(dni);
           String aux = alumno.getDni();
  
           if(aux.equals(dni)) {
        	   //System.out.println("Lo encontré");
        	   return alumno ;        	   
           }
		}
		String aux = "0";
		alumno.setDni(aux);
		//System.out.println("no encontre");
		return alumno ;
	}
	
	public boolean Borrar(Alumno alumno) {
		
		if(Estudiante.remove(alumno)) {			
			return true; 
		}else {			
			return false;
		}
	}

	public LinkedList<Alumno> getUsuarios() {
		return Estudiante;
	}

	public void setUsuarios(LinkedList<Alumno> usuarios) {
		Estudiante = usuarios;
	}

	@Override
	public String toString() {
		return "Listado [Estudiantes=" + Estudiante + "]";
	}
	
	

}
