package codebank;

public class TestaBanco {

		public static void main(String[] args) {
			Cliente paulo = new Cliente();
			paulo.nome = "Paulo Silveira";
			paulo.cpf = "222.222.222-22";
			paulo.profissao = "programador";
			
			Conta contaDoPaulo = new Conta("0001", "00001");
			contaDoPaulo.setTitular(paulo);
			
			
			Cliente kleber = new Cliente();
			kleber.nome = "Kleber Oliveira";
			kleber.cpf = "333.333.333-33";
			kleber.profissao = "motorista";
			
			Conta contaDoKleber = new Conta("0002", "00002");
			contaDoKleber.setTitular(kleber);

			// Operações
			contaDoKleber.deposita(200);
			contaDoPaulo.deposita(200);
			
			contaDoKleber.transfere(50, contaDoPaulo);
			contaDoKleber.consulta();
			contaDoPaulo.consulta();
			
			Cliente Bugador = new Cliente();
			Conta contaDoBugador = new Conta("0003", "00003");
			contaDoBugador.consulta();
			
		}
}
