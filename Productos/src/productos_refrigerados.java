
public class productos_refrigerados extends productos_generados{
 private String cod_supervion_alim;
 
  public productos_refrigerados(String fecha_caducidad, String numero_lote){
	  super(fecha_caducidad, numero_lote);
	  cod_supervion_alim="NO EXISTE";
	  
  }
    
	public String getCod_supervion_alim() {
		return cod_supervion_alim;
	}
	
	public void setCod_supervion_alim(String cod) {
		cod_supervion_alim = cod;
	}
  public void imprimir(){
	  show_infor();
	  System.out.println("CODIDO SUPERVISION ALIMENTICIA-> " + getCod_supervion_alim());
  }
}
