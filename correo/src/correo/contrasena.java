package correo;

public interface contrasena {

	int getLongitud_Contrasena();
	 void setLongitud_Contrasena(int contrasena);
	  String getContrasena();
	   void setContrasena(String contrasena);
	    String generarcontrasena();
	     boolean validar();
	      boolean correo_valido();
		   String tipocontrasena(boolean tc);
	     	String getEmail();
	          void setEmail(String email);
	   }