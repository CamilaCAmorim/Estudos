package ex1;

import java.util.concurrent.Semaphore;
import ex1.ThreadCont;

public class Main {

	public static void main(String[] args) {

		Semaphore semaforo = new Semaphore(1);

		for (int i = 0; i < 21; i++) {
			Thread x = new ThreadCont(i, semaforo);
			x.start();
		}
	}

}
