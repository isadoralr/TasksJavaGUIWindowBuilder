package atividade11;

//Registers two bank accounts and return the informations
public class Atividade11 {
	private double numeroConta;
	private String tipoConta;
	private String titularConta;
	private double saldo;

	void depositar(double saldo,double valor){
	 saldo = valor + saldo;
	}
	void sacar(double valor) {
		if (valor <= saldo) {
		saldo = saldo - valor;
		}
		else {
			System.out.println("Você não pode sacar valores acima de seu saldo.");
		}
	}
	public double getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(double numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public String getTitularConta() {
		return titularConta;
	}
	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	}


