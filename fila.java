package Fila;
import java.util.Random;

public class fila implements Runnable{

	private int tam = 10;
	private boolean mercadoAberto = true;

	@Override
	public void run() {
		Random gerador = new Random();
		for(int cont = 0; cont < 30;cont++) {
			System.out.println("Tamanho da fila: " + this.tam);
			this.addFila();
			try {
				Thread.sleep(gerador.nextInt(7) * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.mercadoAberto = false;
		System.out.println("CONCLUIDO !");
	}

	public void addFila() {
		tam++;
	}
	public boolean abertoFechado() {
		return mercadoAberto;

	}

	public int tamanho() {

		return tam;
	}

	public void remover() {

		this.tam--;

	}



}
