
public class productos_congelados extends productos_generados {
  private double temperatura_recomendada;
  public productos_congelados(String fecha_caducidad, String numero_lote){
	  super(fecha_caducidad, numero_lote);
	  temperatura_recomendada=0;
  }

		public double getTemperatura_recomendada() {
			return temperatura_recomendada;
		}
		
		public void setTemperatura_recomendada(double temperatura) {
			temperatura_recomendada = temperatura;
		}	
  public void imprimir(){
	  show_infor();
	  System.out.println("TEMPERATURA RECOMENDADA -> "+ getTemperatura_recomendada());
  }



}
