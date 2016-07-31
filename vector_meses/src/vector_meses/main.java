package vector_meses;

import javax.swing.JOptionPane;


public class main {

	public static void main(String[] args)
	{
		int meses;
     	String a[]={"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};
	    proceso validacion= new proceso(a);
	   do
	   {
	  meses=Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO 1-12"));
       }
	   while((meses<1)||(meses>12));
	   validacion.mostrar(a, meses);
	   validacion=null;
	}
}