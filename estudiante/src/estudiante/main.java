package estudiante;

public class main {


	public static void main(String[] args) {
		

			hija EST1 = new hija ("0803584762", "9805");
			EST1.setNombres("CINDY"); EST1.setApellidos("CHOEZ"); EST1.setCiudad("MANABI");EST1.setCarrera("INGENIERA EN SISTEMAS");
			
			hija EST2 = new hija("1302633605", "BORIS", "DELGADO", "1003");
			EST2.setCiudad("ESMERALDAS"); EST2.setCarrera("CONTABILIDAD");
			
			hija EST3 = new hija("VANESSA", "CHOEZ", "3095");
			EST3.setCedula("0803445980"); EST3.setCiudad("GUAYAS"); EST3.setCarrera("ADMINISTRACION");
			
			hija EST4 = new hija("0803567845", "MONICA", "CALDERON", "QUITO", "4585", "ENFERMERIA");


			System.out.println("    *** PERSONAS QUE VIVEN EN ESMERALDAS***");
			EST1.pertenece_ciudad();
			EST2.pertenece_ciudad();
			EST3.pertenece_ciudad();
			EST4.pertenece_ciudad();
			
			System.out.println("");
			System.out.println("   ***INFORMACION GENERAL ESTUDIANTES***");
			
			System.out.println("   ***ESTUDIANTE 1***");
			EST1.menu();
			System.out.println("   ***ESTUDIANTE 2***");
			EST2.menu();
			System.out.println("   ***ESTUDIANTE 3***");
			EST3.menu();
			System.out.println("   ***ESTUDIANTE 4***");
			EST4.menu();
}}
