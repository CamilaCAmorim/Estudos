package ex5;

import java.util.Random;

public class ThreadJogo extends Thread { // cria classe e insere a thread

	private static int [] valor = new int [3];
	private static int total = 0;

	@Override
	public void run() {
		Random nAleatorio = new Random();

		valor [total] = nAleatorio.nextInt(7) + 1;
		System.out.println(valor[total]);
		total += 1;
		
		if (total>2){
			boolean compara = (valor[0] == valor[1]) & (valor[1] == valor[2]) ;
			if(compara){
					System.out.println("Você ganhou!");
			}else{
				System.out.println("Não foi dessa vez!");
			}
		}
	}

}
