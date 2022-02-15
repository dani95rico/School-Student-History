package listaAlumnos;


import java.util.Scanner;
/**
Clase que crea una aplicaciÛn para gestionar los datos de un alumno
de la escuela
@author programacion II - DTE-UPM
@version 1.0
 */
public class ProgramaPrincipal {

	// atributos de la clase

	private Alumno alumno;
	private Scanner teclado = new Scanner(System.in);
	
	// metodo  que crea el estado inicial de¥
	// la aplicaciÛn y permite usar el men˙ de opciones disponibles
	public void init (){
     /* Carga los datos del alumno,
      
	    presenta un men˙ de opciones y lee una opciÛn, 
	    en funciÛn de la opcion elegida ejecuta la operaciÛn correspondiente 
	    utilizando las funciones auxiliares  */

	//*****completar por el alumno *****/
		cargarDatosAlumno();
		int eleccion;
		boolean salir=false;
		while(!salir)
		{
		System.out.println("\nMENU RINCIPAL");
		System.out.println("1. Mostrar los nombres de todas las asignaturas en las que est· matriculado el alumno");
		System.out.println("2. Mostrar la nota media de todas las asignaturas del alumno");
		System.out.println("3. Mostrar datos de una asignatura en las que este matriculado el alumno");
		System.out.println("4. Añadir una nueva asignatura al alumno");
		System.out.println("5. Mostrar los datos de las asignaturas que superan una nota");
		System.out.println("6. Salir");
		eleccion=teclado.nextInt();
		
		switch(eleccion)
		{
		case 1:
			mostrarNombresAsignaturas();
			break;
		case 2:
			mostrarNotaMedia();
			break;
		case 3:
			mostrarDatosAsignatura();
			break;
		case 4:
			añadirAsignatura();
			break;
		case 5:
			mostrarAsignaturasSuperanNota();
			break;
		case 6:
			System.out.println("FIN DEL PROGRAMA");
			salir=true;
			break;
			default: System.out.println("ERROR: elección incorrecta.");
			break;
		}
		}
		teclado.close();
	}


	//METODOS AUXILIARES.
	
	/**
 	Este mÈtodo inicializa los datos de un alumno creandolo
 	con un m·ximo de 10 asignaturas de las cuales rellena 5
	 */
	private void  cargarDatosAlumno ( ){

		// Ejemplo de crear el alumno con hasta 10 asignaturas

		alumno=new Alumno ("ELENA LOPEZ",10);
		Asignatura a=new Asignatura("ANALISIS DE CIRCUITOS I", 5.6);
		alumno.nuevaAsignatura(a);
		a=new Asignatura("FUNDAMENTOS FISICOS DE LA INGENIERIA", 6.3);
		alumno.nuevaAsignatura(a);
		a=new Asignatura("INGLES TECNICO", 8.2);
		alumno.nuevaAsignatura(a);
		a=new Asignatura("PROGRAMACION I", 5.6);
		alumno.nuevaAsignatura(a);
		a=new Asignatura("MATEMATICAS", 6.1);
		alumno.nuevaAsignatura(a);		

		System.out.println("Se han introducido al alumno: "+alumno.getNombre()+ " con "+
				alumno.getNumeroAsignaturas()+ " asignaturas");

	}

	/** 
	Imprime por pantalla los nombres de todas las asignaturas del alumno
	*/
	private  void mostrarNombresAsignaturas() {
		if (alumno.getNumeroAsignaturas()==0){
			System.out.println("El alumno no tiene asignaturas");
		}
		else{	
			
			//*****completar por el alumno *****/
			Asignatura nombres[]=alumno.getAsignaturas();
			for(int i=0;i<nombres.length;i++)
			{
				if(nombres[i]!=null)
				{
				System.out.println("Asignatura "+(i+1)+": "+nombres[i].getNombre());
				}
			}
			}
			}
	/**
	muestra la nota media de todas las asignaturas del alumno
	*/
	private  void mostrarNotaMedia() {
			
			//*****completar por el alumno *****/
		if (alumno.getNumeroAsignaturas()==0){
			System.out.println("El alumno no tiene asignaturas");
		}
		else{	
			
			//*****completar por el alumno *****/
			Asignatura nombres[]=alumno.getAsignaturas();
			for(int i=0;i<nombres.length;i++)
			{
				if(nombres[i]!=null)
				{
				System.out.println("Asignatura "+(i+1)+": "+nombres[i].getNombre()+", nota media: "+nombres[i].getNota());
				}
			}
			}
			
	}

	/**
	   Muestra todos los datos de una asignatura dado el nombre que se 
	   pide por teclado. Saca un mensaje explicativo indicando si la 
	   asignatura no existe
	*/
	private void mostrarDatosAsignatura(){
					
			//*****completar por el alumno *****/
		System.out.print("Elija asignatura: ");
		String nombre=teclado.next();
		Asignatura[] a=alumno.getAsignaturas();
		boolean salir=false;
		for(int i=0;i<a.length && !salir;i++)
		{
			if(a[i]!=null)
			{
			if(nombre.equals(a[i].getNombre()))
			{
				System.out.println("Nombre Asignatura: "+a[i].getNombre());
				System.out.println("Nota media: "+a[i].getNota());
				salir=true;
			}
			}
		}
		if(!salir)
		{
			System.out.println("ERROR: el alumno no tiene esa asignatura.");
		}

	}

	/**
	   aÒade una nueva asignatura cuyos datos se piden por teclado. 
	   Saca un mensaje explicativo indicando si la aÒadido o no
	 */
	private void añadirAsignatura(){
					
			//*****completar por el alumno *****/
		System.out.print("Nombre: ");
		String name=teclado.next();
		System.out.print("Nota media: ");
		double note=teclado.nextDouble();
		Asignatura b=new Asignatura(name,note);
		alumno.nuevaAsignatura(b);

	}
	/**
	   muestra todos los datos de las asignaturas que superan cierta nota que se pide por teclado
	 */
	private void mostrarAsignaturasSuperanNota(){
			
			//*****completar por el alumno *****/
		System.out.print("Introduzca una nota media: ");
		double nota=teclado.nextDouble();
		Asignatura[] a=alumno.getAsignaturas();
		boolean salir=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=null)
			{
			if(a[i].getNota()>nota)
			{
				System.out.println("Nombre Asignatura: "+a[i].getNombre());
				System.out.println("Nota media: "+a[i].getNota());
				salir=true;
			}
			}
		}
		if(!salir)
		{
			System.out.println("ERROR: Ninguna asignatura supera esa nota media.");
		}

	}
	

	/** 
	   Este metodo es el punto de entrada a la aplicaciÛn y crea un objeto
       de la clase ProgramaPrincipal.
	*/
	public static void main(String[] args) {
		ProgramaPrincipal app= new ProgramaPrincipal();
		app.init();
	}
}
	
