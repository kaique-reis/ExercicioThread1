package view;

import controller.ThreadVetor;

public class Principal1 {

	public static void main(String[] args) {
		int vetor[] = new int[1000];
		for(int i = 0; i < 1000 ; i++){  
			vetor[i] = (int)(Math.random()*100);  
	}

	for (int j = 1; j <= 2; j++){
		Thread threadVetor = new ThreadVetor(vetor, j);
		threadVetor.start();
	}
}
}