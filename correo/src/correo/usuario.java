package correo;
import java.util.Random;


public class usuario implements contrasena{
	
		private int longitud=9;
	    private String email;
	    private String contrasena;
	    private String vector[];
	   
		public usuario() {
		}
		   public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public String getContrasena() {
				return this.contrasena;
			}
			public void setContrasena(String contrasena) {
				this.contrasena=contrasena;
			}
			
			public int getLongitud_Contrasena() {
				return this.longitud;
			}
	
			public void setLongitud_Contrasena(int contrasena) {
				this.longitud=contrasena;
			}
			    public String generarcontrasena() {
				 String cadenaAleatoria = "";
			        long milis = new java.util.GregorianCalendar().getTimeInMillis();
			        Random r = new Random(milis);
			        int x = 0;
			        while ( x < longitud){
			        char va = (char)r.nextInt(255);
			        if ( (va >= '0' && va <='9') || (va >='a' && va <='z') || (va >='A' && va <='Z')){
			        cadenaAleatoria += va;
			        x ++;
			        } }
			        return cadenaAleatoria;
			        }
				public String tipocontrasena(boolean tc)
			    {
			    	if(tc==true)
			    	{
			    		return "CONTRASEÑA FUERTE";
			    	}
			    	else
			    		return "CONTRASEÑA DEBIL";
			    }
				
		
			    public boolean validar()
			    {
			    	int c1=0,c2=0,c3=0;
			    	for(int i=0;i<9;i++)
			    	{
			    	   if((getContrasena().charAt(i)>='a')||(getContrasena().charAt(i)<='z'))
			    		   c1=c1+1;
			    	   else
			    	   if((getContrasena().charAt(i)>='A')||(getContrasena().charAt(i)<='Z'))
			    		   c2=c2+1;
			    	   else
			    		   c3=c3+1;
			    	}
			    	
			    	if((c1>=2)&&(c2>=1)&&(c3>=5))
			    		return true;
			    	else
			    		return false;
			    }
			    public boolean correo_valido()
			    {
			    	 this.email=this.email.trim();
			         boolean auxiliar = false;
			         int j = this.email.length() - 1;
			         String l, l1 = "";
			         try {
			            for (int x = 0; 1 < j; x++) {
			                 l = "" + this.email.charAt(x);
			                 if (l.equals("@")) {
			                      j++;
			                      l1 = this.email.substring(x, j);
			                      l1=l1.toLowerCase();
			                      if ((l1.equals("@gmail.com")) || (l1.equals("@hotmail.com"))||(l1.equals("@yahoo.com"))) {//que tipo de correo queremos validad
			                           auxiliar = true;
			                           break;
			                      }} }
			         } catch (Exception e) {
			         }
			         return auxiliar;
			    }}