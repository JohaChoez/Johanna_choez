package facturacion;
import javax.swing.JOptionPane;
public class factura {
public double iva;
public float subtotal; 
public double total;
public float precio;
public int cantidad; 
  
 public factura(){
 }
 
 public float subtotal(){
	 this.subtotal=this.cantidad*this.precio; 
	 return this.subtotal; 
 }
 public double calculoIva12(){
	 this.iva = subtotal()*0.12; 
     return this.iva; 
 }
 
 
 public double calculoIva14(){
	 this.iva = subtotal()*0.14; 
	 return this.iva; 
 }
 
 public void proceso() {
	 int op1,op2,op3; 
	 
	 op1 = JOptionPane.showConfirmDialog(null, "¿Esta usted en una ciudad afectada por el Terremoto?", "Atencion",JOptionPane.YES_NO_OPTION);
	 double aux1=0,aux3=0,aux4=0; 
	 int n=0; 
	 float vec[]= new float [50];
	 int v[]=new int [50],i=0,aux=0;
	 if(op1 == JOptionPane.YES_OPTION){
		 do{
		 op2=Integer.parseInt(JOptionPane.showInputDialog("OP1: Ingresar nuevo producto en la factura"+"\n"+"OP2: Mostrar productos de la factura por consola"+"\n"+"OP3: Mostrar por panel"+"\n"+"OP4: Limpiar factura"+"\n"+"OP5: Salir"+"\n"));  
		 
	 switch (op2){
	 case 1:
		  
		 aux++;
		 this.cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos: "));
		 this.precio=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de los productos: "));
		 for( i=n ; i<aux;i++){
		 v[i]=this.cantidad;
		 vec[i]=this.precio; 
		 } 
		 for(int x=n ; x<aux;x++){
			 aux3=vec[x]*v[x];
			 aux1=aux1+aux3; 
			 aux4=aux4+calculoIva12(); 
			 this.total=aux1+aux4; 
		 }
		 n++;
	 break;
	  
	 case 2:
		 System.out.println("****************************************************");
		 System.out.println("***********************FACTURA**********************");
		 System.out.println("Cantidad:                              Precio:");
		 for(int x=0 ; x<aux;x++){
		 System.out.println(v[x]+"                                     "+vec[x]);
		 }
		 System.out.println("");
		 System.out.println("                                 Subtotal: "+aux1);
		 System.out.println("****************************************************");
	 break; 
	 case 3:
		 
		 JOptionPane.showMessageDialog(null, "Subtotal-> "+Double.toString(aux1)+"\n"+" Iva 12% -> "+Double.toString(aux4)+"\n"+ " Total -> "+Double.toString(this.total)+"\n");
	 break;
	 case 4:
		 op3 = JOptionPane.showConfirmDialog(null, "¿Esta ud seguro de limpiar su factura?", "Atencion",JOptionPane.YES_NO_OPTION);
		 if(op3 == JOptionPane.YES_OPTION){
			 JOptionPane.showMessageDialog(null, "Limpiando Factura......", "ATENCION", JOptionPane.WARNING_MESSAGE);
			 for(int j=0;j<v.length;j++){
			 v[i]=0;
			 vec[i]=0;}
			 aux=0;
			 aux1=0;
			 aux3=0;
			 aux4=0;
			 n=0;
			 this.total=0;
			 this.cantidad=0;
			 this.precio=0;
		 }
		 else
			 JOptionPane.showMessageDialog(null, "Continuar");
	 break;
	 case 5:
		 JOptionPane.showMessageDialog(null, "CERRANDO PROGRAMA", "ATENCION", JOptionPane.WARNING_MESSAGE);
	 break;
	 }
		 }while(op2!=5); 
	 }
	 else {
		 do{
			 op2=Integer.parseInt(JOptionPane.showInputDialog("OP1: Ingresar nuevo producto en la factura"+"\n"+"OP2: Mostrar productos de la factura por consola"+"\n"+"OP3: Mostrar por panel"+"\n"+"OP4: Limpiar factura"+"\n"+"OP5: Salir"+"\n"));  
			 
		 switch (op2){
		 case 1:
			  
			 aux++;
			 this.cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos: "));
			 this.precio=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de los productos: "));
			 for( i=n ; i<aux;i++){
			 v[i]=this.cantidad;
			 vec[i]=this.precio; 
			 } 
			 for(int x=n ; x<aux;x++){
				 aux3=vec[x]*v[x];
				 aux1=aux1+aux3; 
				 aux4=aux4+calculoIva14(); 
				 this.total=aux1+aux4; 
			 }
			 n++;
		 break;
		  
		 case 2:
			 System.out.println("----------------------FACTURA----------------------------");
			 System.out.println("Cantidad                            Precio");
			 for(int x=0 ; x<aux;x++){
			 System.out.println(v[x]+"                                     "+vec[x]);
			 }
			 System.out.println("");
			 System.out.println("                             Subtotal "+aux1);
		 break; 
		 case 3:
			 
			 JOptionPane.showMessageDialog(null, "Subtotal-> "+Double.toString(aux1)+"\n"+" Iva 14% -> "+Double.toString(aux4)+"\n"+ " Total -> "+Double.toString(this.total)+"\n");
		 break; 
		 case 4:
			 op3 = JOptionPane.showConfirmDialog(null, "¿Esta ud seguro de limpiar su factura?", "Atencion",JOptionPane.YES_NO_OPTION);
			 if(op3 == JOptionPane.YES_OPTION){
				 JOptionPane.showMessageDialog(null, "Limpiando Factura......", "ATENCION", JOptionPane.WARNING_MESSAGE);
				 for(int j=0;j<v.length;j++){
					 v[i]=0;
					 vec[i]=0;}
					 aux=0;
					 aux1=0;
					 aux3=0;
					 aux4=0;
					 n=0;
					 this.total=0;
					 this.cantidad=0;
					 this.precio=0; }
			 else
				 JOptionPane.showMessageDialog(null, "Continuar");
		 break; 	
		 case 5:
			 JOptionPane.showMessageDialog(null, "CERRANDO PROGRAMA", "ATENCION", JOptionPane.WARNING_MESSAGE);
		 break; }
			 }while(op2!=5); 
		}}}