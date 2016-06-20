
public class productos_frescos extends productos_generados {
    private String fecha_envasado, pais_origen;
    public productos_frescos(String fecha_caducidad, String numero_lote){
    	super(fecha_caducidad, numero_lote);
    	fecha_envasado="Desconocido";
    	pais_origen="Desconocido";
    }
  public String getFecha_envasado() {
		return fecha_envasado;
	}

	public void setFecha_envasado(String fecha) {
		fecha_envasado = fecha;
	}

	public String getPais_origen() {
		return pais_origen;
	}

	public void setPais_origen(String pais) {
		pais_origen = pais;
	}
	 public void imprimir(){
		  show_infor();
		  System.out.println("FECHA ENVASADO-> " + getFecha_envasado()+" \nPAIS DE ORIGEN-> "+ getPais_origen());
	  }
	
	
    
}
