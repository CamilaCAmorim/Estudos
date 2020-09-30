package ex3;

public class Main {
	
	public static void main(String[] args) {
		
		for(int i=0; i<5 ; i++){
			ThreadSapo t = new ThreadSapo(i);//declarar t
			t.start();
		}
			
	}

}
