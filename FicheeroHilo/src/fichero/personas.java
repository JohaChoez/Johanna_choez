package fichero;

public class personas {
	private String matricula;
	private String nombre;
	private String direccion;
	private String ciudad;
	private int edad;
	
	
		public personas(){}
		public personas(String matricula, String nombre, String direccion, String ciudad, int edad){
			this.matricula= matricula;
			this.nombre = nombre;
			this.direccion = direccion;
			this.ciudad = ciudad;
			this.edad=edad;
		}
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public String getNombres() {
			return nombre;
		}
		public void setNombres(String nombres) {
			this.nombre = nombres;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getCiudad() {
			return ciudad;
		}
		public void setCiudad(String ciudad) {
			this.ciudad = ciudad;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}

}
