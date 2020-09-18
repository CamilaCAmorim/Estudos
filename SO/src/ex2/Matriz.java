package ex2;

import java.util.Random;

public class Matriz {

	public static void main(String[] args) {
		Random aleatorio = new Random();

		int[][] matriz = new int[3][5];// criar matriz

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = aleatorio.nextInt(100) + 1; // inserir numeros
															// aleatorios na
															// matriz
			}
		}

		for (int i = 0; i < 3; i++) {
			ThreadLinha a = new ThreadLinha(i, matriz[i]);
			a.start(); // inicia a thread no "run"
		}
	}
}
