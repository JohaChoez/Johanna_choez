
public class Figura_Triangulo {
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
        for (int i = 0; i < tamano; ++i) {
            System.out.println();
           
            for (int j = 0; j < tamano-i-1; ++j) {                      
                System.out.print(" ");           
            }
            for (int j = 0; j < 2*i+1; ++j){
                
                if ((i==0)||(i==tamano-1)||(j==0)||(j==2*i)) {
                    System.out.print(asterisco);
                }
                else{
                   System.out.print(" ");  
                }
                
            }
        }
        System.out.println();
    }
	}


