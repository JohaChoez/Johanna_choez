import javax.swing.JOptionPane;
public class productos_generados {
    
	public static int length;
	private static Object mariscos;
	String fecha_caducidad;
	String numero_lote;
	public productos_generados(){
		
	}
	public productos_generados(String fecha_caducidad, String numero_lote ){
		this.fecha_caducidad= fecha_caducidad;
		this.numero_lote=numero_lote;
	}

	public String getFecha_caducidad() {
		return fecha_caducidad;
	}

	public void setFecha_caducidad(String fecha) {
		fecha_caducidad = fecha;
	}

	public String getNumero_lote() {
		return numero_lote;
	}

	public void setNumero_lote(String numero) {
		numero_lote = numero;
	}
	 public void show_infor(){
		 System.out.println("FECHA CADUCIDAD-> " + getFecha_caducidad()+" \nNUMERO LOTE-> "+ getNumero_lote());
	 }
	
	 
 public void menu() {
	 
 int op1=0 ,op;
 do{
	 op=Integer.parseInt(JOptionPane.showInputDialog("1: PRODUCTOS QUE CADUCAN EN EL 2016"+"\n"+"2: BUSCAR PRODUCTOS POR LOTES"+"\n"+"3: SALIR"+"\n"));  
     switch (op1){
	    case 1:
	    	boolean aux=false;
			JOptionPane.showInputDialog("Mostrar productos que caducan el 2016:");
			
			String fecha_caducidad=JOptionPane.showInputDialog("Ingresar el año de caducidad");
					for (int x=0; x<productos_generados.length; x++){
						if(fecha_caducidad.equals(productos_generados.mariscos)){
							productos_generados.imprimir();
							aux=true;
					
						}	
						
					}
	    case 2:
	    
			JOptionPane.showInputDialog("Buscar producto por número de lote:");
	    
		break;
		case 3:
			    
				 JOptionPane.showMessageDialog(null, "CERRANDO PROGRAMA","CERRADO", JOptionPane.WARNING_MESSAGE);
				 break;
					 }
 }
				 while(op!=3); 
			 }
private static void imprimir() {
	// TODO Auto-generated method stub
	
}

    }
 

