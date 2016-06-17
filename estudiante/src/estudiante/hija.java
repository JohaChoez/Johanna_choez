package estudiante;

public class hija extends persona{
	private String codigo_matricula;
	private String carrera;
	
		public  hija(){
			
		}
	
	public hija(String cedula, String codigo_matricula){
		this.setCedula(cedula);
		this.codigo_matricula = codigo_matricula;
	}
	
	public hija(String cedula, String nombres, String apellidos, String codigo_matricula){
		this.setCedula(cedula);
		this.setNombres(nombres);
		this.setApellidos(apellidos);
		this.codigo_matricula = codigo_matricula;
	}
	
	public hija(String nombres, String apellidos, String codigo_matricula){
		this.setNombres(nombres);
		this.setApellidos(apellidos);
		this.codigo_matricula = codigo_matricula;
	}
	
	public hija(String cedula, String nombres, String apellidos, String ciudad, String codigo_matricula, String carrera){
		
		this.setCedula(cedula);
		this.setNombres(nombres);
		this.setApellidos(apellidos);
		this.setCiudad(ciudad);
		this.codigo_matricula = codigo_matricula;
		this.carrera = carrera;
	}

	public String getMatricula() {
		return codigo_matricula;
	}

	public void setMatricula(String codigo_matricula) {
		this.codigo_matricula = codigo_matricula;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public void menu(){
		
		System.out.println("->CEDULA:    "+ this.getCedula());
		System.out.println("->NOMBRE:    "+ this.getNombres());
		System.out.println("->APELLIDO:  "+ this.getApellidos());
		System.out.println("->CIUDAD:    "+ this.getCiudad());
		System.out.println("->MATRICULA: "+ this.codigo_matricula);
		System.out.println("->CARRERA:   "+ this.carrera);
}
	public void pertenece_ciudad(){
		if(this.getCiudad().equals("ESMERALDAS"))
			menu();
	}
	
	

	

}


