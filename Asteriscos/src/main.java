import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {

		
      Figura_Asterisco rombo = new Figura_Asterisco();
      rombo.set_tamano(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamano de filas")));
      System.out.println(" JOHANNA CHOEZ ");
      System.out.print("Tu rombo es de tamano : ");
      System.out.println(rombo.get_tamano());
      rombo.dibujar_figura(rombo.get_tamano());
	}
}