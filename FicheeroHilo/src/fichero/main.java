package fichero;
import java.io.IOException;


public class main {

			public static void main(String[] args) throws Exception {
				 System.out.println("  ** HILOS **" );
				 tiempo m1 = new tiempo("HILO_1");
				 tiempo m2 = new tiempo("HILO_2");
				 
				 m1.thrd.setPriority(Thread.MAX_PRIORITY);
				 m2.thrd.setPriority(Thread.NORM_PRIORITY);
				 m1.thrd.start();
				 m2.thrd.start();
				 try {
				 m1.thrd.join();
				 m2.thrd.join();
				 }
					 catch(InterruptedException exc) {
					 System.out.println(" ");
					 }
					 System.out.println("\nPRIORIDAD ALTA:" + m1.c);
					 System.out.println("PRIORIDAD BAJA: " +m2.c);
					 System.out.println(); 
						hilos hilo = new hilos(); 
						hilo.start();
						xml_hilo hilo2 = new xml_hilo(); 
						System.out.println(); 
						hilo2.start();
					
				
				

			}

		}
