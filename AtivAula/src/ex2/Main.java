package ex2;

import java.util.concurrent.Semaphore;

public class Main {
	
	public static void main(String[] args){
		
		Semaphore semaforo = new Semaphore(1);

		for (int i = 0; i < 5; i++) {
			Thread x = new ThreadRes(i, semaforo);
			x.start();
		}
	}

}
