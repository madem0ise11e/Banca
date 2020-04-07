package banca;

public class Conto {

	private double saldo;
	

	public Conto(double saldo) {
		 this.saldo=saldo;
	}

	public void preleva(double conto) {
		saldo-=conto;
		
	}

	public void deposita(double conto) {
		saldo+=conto;
		
	}

	public double getSaldo() {
		
		return saldo;
	}

}
