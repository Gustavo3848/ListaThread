package Fila;



public class teste {
	public static void main(String args[]) {


		caixa caixa1 = new caixa("CAIXA 1");
		caixa caixa2 = new caixa("CAIXA 2");
		caixa caixa3 = new caixa("CAIXA 3");


		Thread c1 = new Thread(caixa1);
		Thread c2 = new Thread(caixa2);
		Thread c3 = new Thread(caixa3);

		Thread c4 = new Thread(caixa.f1);


		c4.start();
		c1.start();
		c2.start();
		c3.start();







	}
}
