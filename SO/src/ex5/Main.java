package ex5;

public class Main {

	public static void main(String[]args){
		
		for(int i=0 ;i<3 ;i++ ){
			ThreadJogo x = new ThreadJogo();
			x.start();
		}
	}
}
