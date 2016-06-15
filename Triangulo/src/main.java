import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {

		
      Figura_Triangulo triangulo = new Figura_Triangulo();
      triangulo.set_tamano(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamano del Triangulo ")));
      System.out.println(" JOHANNA CHOEZ ");
      System.out.print("Tu triangulo es de tamano : ");
      System.out.println(triangulo.get_tamano());
      triangulo.dibujar_figura(triangulo.get_tamano());
	}
}