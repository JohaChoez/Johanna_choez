import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
		
		int op,op1=0;
		// TODO Auto-generated method stub
		 productos_generados fac = new productos_generados(); 
         productos_congelados mariscos = new productos_congelados("19-05-2013","cod100");
         productos_frescos verduras = new productos_frescos("18-04-2010","cod30");
         productos_refrigerados bebidas = new productos_refrigerados("17-05-2016","cod584");
        mariscos.setTemperatura_recomendada(-15);
        verduras.setFecha_envasado("18-05-2016");
        verduras.setPais_origen("ECUADOR");
        bebidas.setCod_supervion_alim("B#516");
        System.out.println("**********************************");
        System.out.println("      PRODUCTOS CONGELADOS");
        mariscos.imprimir();
        System.out.println("***********************************");
        System.out.println("      PRODUCTOS FRESCOS");
        verduras.imprimir();
        System.out.println("**********************************");
        System.out.println("      PRODUCTOS REFRIGERADOS");
        bebidas.imprimir();
        System.out.println("**********************************");
        System.out.println("      PRODUCTOS REFRIGERADOS");
        bebidas.imprimir();
		fac.menu();
		

}
}
