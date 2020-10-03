package ex2;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class ThreadRes extends Thread {
	Random aleatorio = new Random();
	
	private Semaphore semaforo;
	private int resto;
	private int lasanha =600;
	private int sopa=300;
	private int entrega = 500;
	int pedido = aleatorio.nextInt(30);

	public ThreadRes(int id, Semaphore semaforo) {
		this.semaforo = semaforo;

	}

	private void tempoExecucao() {// Limita o tempo de execução
				
		int i;
		int porcentagem = 0;
		

		System.out.println(">>>" + pedido + "<<<");
		resto = pedido % 2;

		if (resto == 0) {
			System.out.println("Entrada de pedido par: Lasanha!");
			pedidoPar();
			for (i = 5; i < 8; i++) {
				porcentagem = porcentagem + 30;
				System.out.println("A Lasanha está em " + porcentagem + "%");
			}
			System.out.println("A Lasanha a Bolonhesa esta pronta!\nAguarde pela entrega..");
			
		} else {
			System.out.println("Entrada de pedido impar: Sopa!");
			pedidoImpar();
			for (i = 6; i < 12; i++) {
				porcentagem = porcentagem + 16;
				System.out.println("A Sopa está em " + porcentagem + "%");
			}	
			System.out.println("A Sopa de Cebola esta pronta!\nAguarde pela entrega..");
		}
	}

	private void pedidoPar() {// Mostra quando inicia e termina execução
		try {
			sleep(lasanha);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
	}

	private void pedidoImpar() {// Mostra quando inicia e termina execução

		try {
			sleep(sopa);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	private void entrega() {// 

		try {
			sleep(entrega);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}	

	private void chamar() { // Controla quando realizará uma ou mais execuções
       	
			try {
				semaforo.acquire();// força para que apenar uma execução
				entrega();
				System.out.println("Pedido " + pedido + "entregue!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforo.release();
			}

	}

	@Override
	public void run() {// chama os metodos para funcionar
		tempoExecucao();
		chamar();

	}
}
