package ex1;

public class Main {
	public static void main(String[] args) {
		
		for(int i=0; i<5 ; i++){
			ThreadNumero t = new ThreadNumero(i);//declarar t
			t.start();
		}
	}
}
