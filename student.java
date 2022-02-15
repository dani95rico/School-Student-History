package listaAlumnos;


public class Alumno {
	// Atributos de la clase alumno
	private final int maxAsignaturas; 	//n mero m ximo de asignaturas en las que puede matricularse
	private int numAsignaturas;		  	//n mero actual de asignaturas en las que esta matriculado	
	private final String nombre;		//nombre del alumno
	private Asignatura[] asignaturas;	//informaci n de las asignaturas en las que esta matriculado
	private int indice;
	/**
	  Constructor de la clase alumno
	  @param nombre es el nombre completo del alumno. No puede estar vac o. 
	  @param maxAsignaturas n mero m ximo de asignaturas en las que puede matricularse
	*/
	public Alumno(String nombre,int maxAsignaturas){
		// Ver en el enunciado el ap ndice sobre asserts
		assert ( nombre != null );
		assert( !nombre.trim().isEmpty());
		assert ( maxAsignaturas>0 );
		/*** Completar ***/
		this.maxAsignaturas=maxAsignaturas;
		this.nombre=nombre;
		this.indice=0;
		asignaturas=new Asignatura[maxAsignaturas];
	}

	/**
	  Devuelve el nombre del alumno
	  @return String con el nombre del alumno
	*/
	public String getNombre() {
		/*** Completar ***/
		return nombre;
	}
	
	/**
	  Devuelve el n mero de asignaturas matriculadas del alumno
	  @return el n mero de asignaturas matriculadas
	*/
	public int getNumeroAsignaturas() {
		/*** Completar ***/
		return indice;
	}

	/** Da de alta una nueva asignatura  si aun no est  matriculado del m ximo n mero
	de asignaturas.
	  @param asignatura objeto de la clase Asignatura
	  @return true si se ha podido a adir la asinnatura y false en caso de que
	  el array este lleno o el nombre de la asignatura sea null
	*/
	public boolean nuevaAsignatura (Asignatura asignatura){
		boolean resultado=false;
		/*** Completar ***/
		if(indice<maxAsignaturas)
		{
			asignaturas[indice]=asignatura;
			indice++;
			resultado=true;
		}
		return resultado;
	}

	/** Devuelve un array de asignaturas en las que el alumno esta actualmente matriculado.
	  @return un array de objetos de clase Asignatura.
	*/
	public Asignatura[] getAsignaturas() {
		// Ver en el enunciado el ap ndice sobre asserts
		assert (numAsignaturas>0);
		
		/*** Completar ***/
		return asignaturas;
	}
	/** Devuelve la nota media del alumno.
	  @return valor con la media aritm tica de todas las asignaturas en las que esta matriculado
	*/
	public double getNotaMedia() {
		// Ver en el enunciado el ap ndice sobre asserts
		assert (numAsignaturas>0);

		/*** Completar ***/
		double notaMedia;
		double suma=0;
		int total=0;
		for(int i=0;i<maxAsignaturas;i++)
		{
			if(asignaturas[i]!=null)
			{
			suma=suma+asignaturas[i].getNota();
			total++;
			}
		}
		notaMedia=suma/total;
		return notaMedia;

	}
	/** Devuelve una asignatura cuyo nombre se le pasa como par metro
	  @param nombre de la asignatura a buscar
	  @return  un objeto de clase Asignatura o nul si no existe
	*/
	public Asignatura getAsignatura(String nombre) {
		// Ver en el enunciado el ap ndice sobre asserts
		assert (nombre!=null);		
		/*** Completar ***/
		Asignatura correcto=null;
		for(int i=0;i<asignaturas.length;i++)
		{
			if(asignaturas[i]!=null)
			{
			if(nombre.equals(asignaturas[i].getNombre()))
			{
				correcto=asignaturas[i];
			}
			}
		}
		return correcto;
	}
}
