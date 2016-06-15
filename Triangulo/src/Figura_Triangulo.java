
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
		 //Creamos una variable tipo constante para utilizarla.
        final char asterisco = '*';
        //Se hace con un preincremento ++j.
        for (int i = 0; i < tamano; ++i) {
            //Cada primer for, se hace un salto de línea.
            System.out.println();
            //Utilizamos dos for para lograr la forma.
            for (int j = 0; j < tamano-i-1; ++j) {                      
                System.out.print(" ");           
            }
            for (int j = 0; j < 2*i+1; ++j){
                //Condición para imprimir solo los bordes.
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


