package Datos;

public class Alumno extends Persona{
	
	private int NroAlumno;

	public int getNroAlumno() {
		return NroAlumno;
	}

	public void setNroAlumno(int nroAlumno) {
		NroAlumno = nroAlumno;
	}

	
	
	public Alumno(String nombre, String apellido, String dni) {
		super(nombre, apellido, dni);
		// TODO Auto-generated constructor stub
	}

	public Alumno(){
		super();
	}

	
	
}
