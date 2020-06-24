package Fila;
import java.util.Random;
public class caixa implements Runnable{
	public String ca;
	public int qtdItens;
	public boolean vazio = true;
	public static fila f1 = new fila();
	public caixa (String x) {
		this.ca = x;
	}






	@Override 
	public void run() {
		Random gerador = new Random();


		while(f1.abertoFechado() == true && f1.tamanho() > 0) {

			if(this.vazio == true) {
				qtdItens = gerador.nextInt(10);
				f1.remover();
				this.vazio = false;
				System.out.println("O " + ca + " recebeu " + qtdItens + " itens! ");
				try{
					Thread.sleep(this.qtdItens * 1000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}

				System.out.println("O " + ca + " Liberou !");
				qtdItens = 0;
				this.vazio = true;
			}
		}
	}







}
