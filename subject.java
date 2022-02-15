package listaAlumnos;


public class Asignatura {
	private String nombreAsignatura;
	private double nota;
	public Asignatura(String nombre,double nota)
	{
		this.nombreAsignatura=nombre;
		this.nota=nota;
	}
	
	public double getNota()
	{
		return nota;
	}
	public String getNombre()
	{
		return nombreAsignatura;
	}
}

