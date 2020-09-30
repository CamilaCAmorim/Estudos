package ex4;

import java.util.Random;

public class ThreadCarro extends Thread {
	
	private int id;
	private int disMax = 1000;
	private int disAtual = 0;
	private static boolean vencedor = false;
	
	public ThreadCarro (int id){
		this.id = id;
	}
	
	@Override
	public void run() {
		Random nAleatorio = new Random();				
		
		while (disAtual<disMax){
			disAtual += nAleatorio.nextInt(100)+1;	
			System.out.println("Carro " + id + ", posição "+disAtual);
		}
		if(vencedor){
			System.out.println("Carro "+ id + " Perdedor!");
		}else{
			vencedor = true;
			System.out.println("Carro "+ id + " Vencedor!");
		}
			
	}
		
}	


