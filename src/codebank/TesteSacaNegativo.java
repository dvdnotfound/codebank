package codebank;

public class TesteSacaNegativo {

	public static void main(String[] args) {
			
		Cliente Balthazar = new Cliente();
		Balthazar.cpf = "444.444.444-44";
		Balthazar.nome = "José Balthazar Neto";
		Balthazar.profissao = "Engenheiro Civil";
		
		Conta contaDoBal = new Conta("0003", "0003");
		contaDoBal.setTitular(Balthazar);
		contaDoBal.deposita(100);
		contaDoBal.saca(300);
		
		
	}
}
