package ex2;

public class ThreadLinha extends Thread {// extends derivada de Thread
	private int id; // espaço
	private int[] linha;

	public ThreadLinha(int id, int[] linha) { // objeto
		this.id = id;
		this.linha = linha;

	}

	@Override
	public void run() {// iniciar a thread
		int soma = 0;

		for (int i = 0; i < linha.length; i++) {
			soma += linha[i];
		}

		System.out.println("\nA linha é: " + id + "\nA soma da linha é: " + soma);

	}

}
