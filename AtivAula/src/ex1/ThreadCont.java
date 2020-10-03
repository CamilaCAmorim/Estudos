package ex1;

import java.util.concurrent.Semaphore;

public class ThreadCont extends Thread {// 

	private Semaphore semaforo;
	private int id;
	private int resto;
	private int calculos;
	private int bancodados;

	public ThreadCont(int id, Semaphore semaforo) {
		this.id = id;
		this.semaforo = semaforo;

	}

	private void tempoExecucao() {// Limita o tempo de execu��o 
		resto = id % 3;
		switch (resto) {
		case 1:
			calculos = (int) (Math.random() * 801) + 200;
			bancodados = 1000;
			break;
		case 2:
			calculos = (int) (Math.random() * 1001) + 500;
			bancodados = 1500;
			break;
		case 0:
			calculos = (int) (Math.random() * 1001) + 1000;
			bancodados = 1500;
			break;

		}
	}

	private void calculo() {// Mostra quando inicia e termina execu��o

		System.out.println("A thread # " + id + " esta calculando...");
		try {
			sleep(calculos);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("A thread # " + id + " foi calculada!");
	}

	private void transacao() {// Mostra quando inicia e termina execu��o

		System.out.println("A thread # " + id + " esta tranferindo dados...");
		try {
			sleep(bancodados);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("A thread # " + id + " terminou sua transa��o!");
	}

	private void chamar() { //Controla quando realizar� uma ou mais execu��es
		int x = 3;
		if (resto == 1) {
			x = 2;
		}
		for (int i = 0; i < x; i++) {
			calculo();
			try {
				semaforo.acquire();// for�a para que apenar uma execu��o
				transacao();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforo.release();
			}
		}
	}

	@Override
	public void run() {//chama os metodos para funcionar
		tempoExecucao();
		chamar();

	}

}
