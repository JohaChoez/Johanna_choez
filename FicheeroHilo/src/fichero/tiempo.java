package fichero;
public class tiempo implements Runnable{

	 int c;
	 Thread thrd;
	 static boolean stop = false;
	 static String currentName;
	 
	
	 tiempo(String nombres) {
		 thrd = new Thread(this, nombres);
		 c = 0;
		 currentName = nombres;
		 } 
	public void run() {
		System.out.println(thrd.getName() + " INICIAR");
		 do {
		 c++;
		 if(currentName.compareTo(thrd.getName()) != 0) {
		 currentName = thrd.getName();
		 	}
		 }while(stop == false && c < 10000);
		 stop = true;
	}
}
	