package fabrica_automoviles;

public class tipos_coches {
	String coche1="MITSUBISHI",coche2="CHEVROLET",coche3="MAZDA",coche4="TOYOTA";
	//String empresa1,empresa2, empresa3, empresa4;
    int precio1=10000,precio2=12500,precio3=15600,precio4=18200,aux=0;
    public tipos_coches(){
    	
    }
    public int comparacion(){
		//return aux;
    	this.aux=this.aux+this.precio1;
    	return this.aux;
    	
    }
    public int comparacion1(){
    	this.aux=this.aux+this.precio2;
    	return this.aux;
    	
    }
    public int comparacion2(){
    	this.aux=this.aux+this.precio3;
    	return this.aux;
    	
    }
    public int comparacion3(){
    	this.aux=this.aux+this.precio4;
    	return this.aux;
    	
    }
	public void menu() {
		// TODO Auto-generated method stub
		
	}
}
