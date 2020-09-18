package ex1;

public class ThreadNumero extends Thread{
	private int numero;
	
	public ThreadNumero (int numero){
		this.numero = numero;
	}
	
	@Override
	public void run() {
		System.out.println("Thread:  " + numero);
	}
	
}
