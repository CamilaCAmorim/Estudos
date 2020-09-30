package ex4;

public class Main {

	public static void main(String[]args){
		
		
		for (int i=1 ; i<=2 ; i++){
		ThreadCarro x = new ThreadCarro(i);
		x.start();
		}
	}
}
