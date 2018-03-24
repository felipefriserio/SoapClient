package fiap.scj.ws.soap.client;

public class AppMain {
	
	public static void main(String[] args) {

		MinhaSaudeImpl servico = new MinhaSaudeImplService().getMinhaSaudeImplPort();
		
		float imc = servico.calcularImc(1.8f, 60);
		System.out.println("Seu IMC eh : "+imc);
		System.out.println(servico.classificacaoImc(imc));
	}

}
