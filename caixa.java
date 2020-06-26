package Fila;

public class caixa implements Runnable{

	private String caixa;
	private int qtd;
	public static estruturaFila f1 = new estruturaFila();

	public caixa(String x) {
		this.caixa = x;

	}


	@Override 
	public void run() {
		while(f1.abertoFechado) {
			while(f1.vazia() == false) {

				this.qtd = f1.valor();
				f1.removerFila();
				f1.teste();
				System.out.println("O " + caixa + " recebeu " + this.qtd + " itens!\r ");
				try{
					Thread.sleep(this.qtd * 1000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}

				System.out.println("O " + caixa + " Liberou !\r");

			}
		}
		System.out.println("Processo Finalizado !!");
	}
}








