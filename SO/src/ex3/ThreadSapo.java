package ex3;

import java.util.Random;

public class ThreadSapo extends Thread {
	private static int disMax = 100;
	private int disAtual = 0;
	private int id;
	
	
	public ThreadSapo (int id){ 
		this.id = id;
				
	}
	
	@Override
	public void run() {// iniciar a thread
		Random nAleatorio = new Random();
				
		
		while (disAtual<disMax){
			disAtual += nAleatorio.nextInt(10)+1;
			System.out.println("Sapo: "+ id +"\nDistancia Atual: " + disAtual);
		}
		System.out.println("Sapo"+ id + "chegou ao fim da corrida");
	}
}
