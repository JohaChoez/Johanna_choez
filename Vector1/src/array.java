import javax.swing.JOptionPane; 
public class array {
	int array[] = new int [8];
	 
		
		public array(int []array){
			for(int i=0;i<8;i++)
			this.array[i]=array[i]; 
		}
		public void ordenar(){
			for(int i = 0; i < array.length - 1; i++)
	        {
	            for(int j = 0; j < array.length - 1; j++)
	            {
	                if (array[j] > array[j + 1])
	                {
	                    int tmp = array[j+1];
	                    array[j+1] = array[j];
	                    array[j] = tmp;
	                }
	            }
	        }
			System.out.println("Vector Ordenado");
	        for(int i = 0;i < array.length; i++)
	        {
	       
	            System.out.print(array[i]+"\n");
	        }
		}
		public void maximo(){ 
			int max=array[0]; 
			 for(int i=0 ;i<=7;i++){
				if (array[i]>max)
					max=array[i]; 
				 }
			 JOptionPane.showMessageDialog(null ,"EL MAXIMO ES:  "+ Integer.toString(max));
			 }
		public void minimo(){ 
			int min=array[0]; 
			 for(int i=0 ;i<8;i++){
				if (array[i]<min)
					min=array[i]; 
				 }
			 JOptionPane.showMessageDialog(null ,"EL MINIMO ES:  "+ Integer.toString(min));
			 }
		public void promedio(){ 
			float promedio=0;
			int c=0; 
			 for(int i=0 ;i<8;i++){
					promedio=promedio+array[i];
				c++; 
				 }
			 JOptionPane.showMessageDialog(null ,"SU PROMEDIO ES:  "+ Float.toString(promedio/c));
			 }
		
}
