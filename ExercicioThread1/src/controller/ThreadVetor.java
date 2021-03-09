package controller;

public class ThreadVetor extends Thread {
	private int vetor[] = new int [1000];
	private int j;
	
	public ThreadVetor (int vetor[], int j) {
		this.vetor = vetor;
		this.j = j;
	}
	@Override
	public void run() {
		temp(vetor, j);
	}
	private void temp(int vetor[], int j) {
		double ti = 0, tf = 0, tt = 0;

		switch (j) {
		case 1:
			ti = System.nanoTime();
			
			for (int aux : vetor);
			tf = System.nanoTime();
			tt = tf - ti;
			System.out.println("TID #" + getId() + " com foreach " + tt + " ns");
			break;

		case 2:
			ti = System.nanoTime();
			for (int i = 0; i < vetor.length; i++) {
			}
			tf = System.nanoTime();
			tt = tf - ti;
			System.out.println("TID #" + getId() + " com for " + tt + " ns");
			break;
		}
	}
}
