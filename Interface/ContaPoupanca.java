public class ContaPoupanca  {
	private double saldo;
 
	public double getSaldo() {
		return saldo;
	}
 
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double rendimentoMensal(double taxa) {
		 return saldo = saldo*(taxa/100);
	}
	public void RetornarSaldo() {
		System.out.println(getSaldo());
	}
	public double Depositar(double valor) {
		return valor+saldo;
	}
	public void Sacar(double valor) { 
		saldo = saldo-valor;
		}
	}
