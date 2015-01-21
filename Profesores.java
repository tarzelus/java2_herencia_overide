public class Profesores extends Escuela{
	//git eclipse proba

	private String nombreProfe;
	private int idProfe;
	private String tipoProfe;
	private String horarioProfe;

       
	// getter y setter gitekin eclipse

		public String getNombreProfe()
		{
			return nombreProfe;
		}
		
		public void  setNombreProfe(String nombreProfe1)
		{
			nombreProfe=nombreProfe1;
		}
		
		
		
		public int getIdProfe()
		{
			return idProfe;
		}
		
		public void  setIdProfe(int idProfe1)
		{
			idProfe=idProfe1;
		}

		
		
		public String getTipoProfe()
		{
			return tipoProfe;
		}
		
		public void  setTipoProfe(String tipoProfe1)
		{
			tipoProfe=tipoProfe1;
		}


		public String getHorarioProfe()
		{
			return horarioProfe;
		}
		
		public void  setHorarioProfe(String horarioProfe1)
		{
			horarioProfe=horarioProfe1;
		}


		@Override
			public void imprimir()
			 {
			 super.imprimir();
			 System.out.print("\n\n--- Profesor: ");
			 System.out.println("Nombre del profesor: " + getNombreProfe());
			 System.out.println("Id del profesor: " + getIdProfe());
			 System.out.println("tipo de profesor: " + getTipoProfe());
			 System.out.println("Horario del profesor: " + getHorarioProfe());
			}
	
}
