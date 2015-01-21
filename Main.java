import java.util.Hashtable;
//git eclipse proba
public class Main {
	public static void main (String [ ] Args) {
	        Escuela escuela = new Escuela ();
	        escuela.setDireccionEscuela("sagues");
	        escuela.setTipoEscuela("batxillergoa / zikloal");
	        escuela.setNombreEscuela("donostia");

	        System.out.println("Escuela:");
			escuela.imprimir();

	        
	        Profesores profesor = new Profesores();
	        profesor.setNombreProfe("Telmo Arzelus");
	        profesor.setIdProfe(2);
	        profesor.setTipoProfe("Programacion");
	        profesor.setHorarioProfe("9-14");

	        System.out.println("profesor:");
			profesor.imprimir();


			Alumnos alumno = new Alumnos();
	        alumno.setNombreAlumno("Telmo Arzelus");
	        alumno.setIdAlumno(2);
	        alumno.setCursoAlumno("Desarrollo web");
	        alumno.setDniAlumno("777777777T");

	        System.out.println("alumno:");
			alumno.imprimir();



	        
	        
	}
}
