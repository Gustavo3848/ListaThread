package Fila;
import java.util.Random;


public class estruturaFila implements Runnable{
	private int[] estrFila = new int[15];
	public boolean abertoFechado = true;
	private boolean cheio;
	private boolean vazio;

	@Override
	public void run() {



		Random gerador = new Random();
		for(int cont = 0; cont < 30;cont++) {
			while(this.cheio) {
				try {
					Thread.sleep(1 * 1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.addFila(gerador.nextInt(51 - 1));


			
			try {
				Thread.sleep(gerador.nextInt(12 - 1) * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
		this.abertoFechado = false;






	}
	public void addFila(int x) {

		for(int cont = 0;cont < estrFila.length - 1;cont++) {
			if(this.estrFila[cont] == 0) {
				this.estrFila[cont] = x;
				break;
			}

		}
	}
	public void removerFila() {
		for(int cont = 0;cont < estrFila.length - 1;cont++) {
			if(cont + 1 > estrFila.length - 1) {
				break;
			}else
				estrFila[cont] = estrFila[cont + 1];
		}
	}
	public int valor() {
		return estrFila[0];
	}
	public boolean vazia() {
		if(this.estrFila[0] == 0) {
			this.vazio = true;
		}else{
			this.vazio = false;
		}
		return this.vazio;
	}

	public void teste() {
		for(int cont = 0;cont < estrFila.length - 1;cont++) {
			System.out.print("|" + this.estrFila[cont] + "|");

		}
		System.out.println("\r");
	}
	public boolean cheia() {
		if(this.estrFila.length - 1 == 0) {
			this.cheio = false;
		} else {
			this.cheio = true;
		}
		return this.cheio;
	}




}