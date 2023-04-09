package codebank;

public class Conta {

	private int saldo;
	private String agencia;
	private String numero;
	private Cliente titular;
	private static int total;
	
	public Conta(String agencia, String numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Parabéns, sua conta foi concluído com sucesso!");
		System.out.println("Agencia: " + this.agencia + " Número: " + this.numero + "\n");
		Conta.total++;
		System.out.println("O total de contas neste banco é de: " + total + "\n");
	}

	void deposita(double valor) {
		System.out.println(this.titular.nome +", sua conta possui R$" + valor);
		this.saldo += valor;
	}

	public void saca(double valor) {
	
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: R$" + this.saldo + " Valor: R$" + valor);
		}
		
		this.saldo -= valor;

	}

	public void transfere(double valor, Conta destino) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Operação não concluída, seu saldo atual de: R$" + this.saldo + " é insuficiente");
		}
		
		this.saldo -= valor;
		destino.saldo += valor;
		
		System.out.println("\n O valor de R$" + valor + " foi transferido para: " + destino.getTitular().nome + "\n");
	}
	
	
	public void consulta() {
		try {
		System.out.println(this.titular.nome + " seu saldo é: " + this.saldo);
		
			} catch (NullPointerException e){
				String msg = e.getMessage();
				System.out.println("Exception " + msg);
				e.printStackTrace();
				
				System.out.println("Algum valor desse objeto está nulo");
			}
		
	}


	public String getAgencia() {
		return agencia;
	}


	public String getNumero() {
		return numero;
	}


	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Conta.total = total;
	}
	
}
