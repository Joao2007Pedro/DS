public abstract class ContaCorrente implements Conta {
	private double saldo;
	public ContaCorrente (double saldo) {
		this.saldo = saldo;
	}
 
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
 
	public void RetornarSaldo() {
		System.out.println(getSaldo());
	}
	public double Depositar(double valor) {
		return valor+saldo;
	}
	public void Sacar(double valor) {
		double chequeEspecial = 1000;
		if (saldo < valor) {
			chequeEspecial = saldo+chequeEspecial - valor;
		}else (saldo+chequeEspecial < valor); {
			System.out.println("Você não pode realizar este saque");
		}
	}
 
}
