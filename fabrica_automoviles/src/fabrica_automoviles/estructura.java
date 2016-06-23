package fabrica_automoviles;
import java.util.Scanner; 
import javax.swing.JOptionPane;

public class estructura extends  tipos_coches{
	Scanner opcion = new Scanner(System.in); 
	int op,a,op1,aux,j,op2,opc,aux1;
	public void menu(){
		
	do{
		op=Integer.parseInt(JOptionPane.showInputDialog("1.-TOTAL DE COMPRA= "+"2.-VOLUMEN DE VENTAS TOTAL= "+"VOLUMEN DE VENTAS POR CENTRO= "+"POCENTAJE POR MODELO= "));
		switch(op){
		case 1:
	    aux++;
	    op2=Integer.parseInt(JOptionPane.showInputDialog("OP1: CENTRO DISTRIBUCION 1"+"\n"+"OP2: CENTRO DISTRIBUCION 2"+"\n"+"OP3: CENTRO DISTRIBUCION 3"+"\n"+"OP4: CENTRO DISTRIBUCION 4"));
		switch(op2)
		{
		case 1:
			aux++;
		}
		System.out.println("¿QUE MODELO DESEA?  "); 
		op1=opcion.nextInt();
		
		if(op1==1){
			j++;
			System.out.println(this.coche1+" "+this.precio1);
		    aux=comparacion(); 
		}
		
		if(opc==2){
			j++;
			System.out.println(this.coche2+" "+this.precio2);
		    aux=comparacion(); 
		}
		
		if(opc==3){
			j++;
			System.out.println(this.coche3+" "+this.precio3);
		    aux=comparacion(); 
		}
		
		if(opc==4){
			j++;
			System.out.println(this.coche4+" "+this.precio4);
		    aux=comparacion(); 
		}
		
		break;
		case 2:
			 aux++;
			System.out.println("¿QUE MODELO DESEA? "); 
			opc=opcion.nextInt();
			if(opc==1){
				j++;
				System.out.println(this.coche1+" "+this.precio1);
			    aux=comparacion(); 
			}
			
			if(opc==2){
				j++;
				System.out.println(this.coche2+" "+this.precio2);
			    aux=comparacion(); 
			}
			
			if(opc==3){
				j++;
				System.out.println(this.coche3+" "+this.precio3);
			    aux=comparacion(); 
			}
			
			if(opc==4){
				j++;
				System.out.println(this.coche4+" "+this.precio4);
			    aux=comparacion(); 
			}
			JOptionPane.showMessageDialog(null, "TOTAL DE LA VENTA: " + Integer.toString(aux)+"\n"+" TOTAL: "+ Integer.toString(aux));
			break;
		case 3:
			 aux++;
			System.out.println("¿QUE MODELO DESEA? "); 
			opc=opcion.nextInt();
			if(opc==1){
				j++;
				System.out.println(this.coche1+" "+this.precio1);
			    aux=comparacion(); 
			}
			
			if(opc==2){
				j++;
				System.out.println(this.coche2+" "+this.precio2);
			    aux=comparacion();
			}
			
			if(opc==3){
				j++;
				System.out.println(this.coche3+" "+this.precio3);
			    aux=comparacion();
			}
			
			if(opc==4){
				j++;
				System.out.println(this.coche4+" "+this.precio4);
			    aux =comparacion();
			}
			JOptionPane.showMessageDialog(null, " CENTRO DISTRIBUCION 1 "+" TOTAL VENTA: "+Integer.toString(aux) +" TOTAL: "+ Integer.toString(aux)+"\n"+" CENTRO DISTRIBUCION 2"+" TOTAL VENTA: "+Integer.toString(aux)+" TOTAL: "+ Integer.toString(aux)+"\n"+" CENTRO DISTRIBUCION 3 "+" TOTAL VENTA: "+Integer.toString(aux) +" TOTAL: "+ Integer.toString(aux)+"\n"+" CENTRO DISTRIBUCION 4 "+" TOTAL VENTA: "+Integer.toString(aux) +" TOTAL: "+ Integer.toString(aux));
			break;
		case 4:
			 aux++;
			System.out.println("¿QUE MODELO DESEA? "); 
			opc=opcion.nextInt();
			if(opc==1){
				j++;
				System.out.println(this.coche1+" "+this.precio1);
			    aux=comparacion(); 
			}
			
			if(opc==2){
				j++;
				System.out.println(this.coche2+" "+this.precio2);
			    j=comparacion();
			}
			
			if(opc==3){
				j++;
				System.out.println(this.coche3+" "+this.precio3);
			    aux=comparacion();
			}
			
			if(opc==4){
				j++; 
				System.out.println(this.coche4+" "+this.precio4);
			    aux=comparacion();
			}
			if(aux1!=0){
				op=Integer.parseInt(JOptionPane.showInputDialog("CENTRO DISTRIBUCION 1 "+"\n"+"CENTRO DISTRIBUCION 2 "+"\n"+"CENTRO DISTRIBUCION 3 "+"\n"+"CENTRO DISTRIBUCION 4 ")); 
			break;
		}
		break;	
	}
	}
	while(op!=5);


}
}
