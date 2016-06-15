
public class Figura_Asterisco {

	int tamano;
	public int get_tamano(){
		return this.tamano;
		
	}
	
	public int get_tamano(int tamano){
		return this.tamano=tamano;
		
	}
	public void set_tamano(int tamano){
		this.tamano=tamano; 
	}
	
 public void dibujar_figura ( int tamano ){
		    
		 final char asterisco = '*';
	        for (int i = 0; i <tamano; ++i) {
	            System.out.println();
	            for (int j = 0; j < tamano-i-1; ++j) {                      
	                System.out.print(" ");           
	            }
	            for (int j = 0; j < 2*i+1; ++j){
	                if ((i==0)||(j==0)||(j==2*i)) {//Solo impriminos loi de afuera del rombo
	                    System.out.print(asterisco);
	                } else {
	                    System.out.print(" ");
	                }                
	            }            
	        }
	       
	        for (int j = tamano-2; j >= 0; --j) {
	            System.out.println();
	          
	            for (int i = 0; i < tamano-j-1; ++i) {                
	                System.out.print(" ");
	            }
	            for (int i = 0; i < 2*j+1; ++i) {
	           
	                if ((j==0)||(i==0)||(i==2*j)) {
	                    System.out.print(asterisco);
	                } else {
	                    System.out.print(" ");
	                }                
	            }
	        }
	        System.out.println();
	    }
		
	}


