package exercicio_Heran�a;

public class TestaAnimal {

	public static void main(String[] args) {
		Cavalo c = new Cavalo();
		Pregui�a P = new Pregui�a();
		Cachorro Ca= new Cachorro();
		
		c.setNome("P� de pano");
		c.setIdade(10);
		c.setCorrer("Sim, podem galopar de 16 a 27km/h");
		c.setCrina("Sim, possui uma crina que tem como caracter�stica proteger a pele e olhos da exposi��o ao Sol e chuva ");
		c.setCasco("Sim, para proteger seus dedos");
		c.setPatas(4);
		c.setExpectativaVida(30);
		c.setSom("relinchar");
		
		
		System.out.println("Nome: " + c.getNome());
		System.out.println("Idade: " + c.getIdade()+" anos");
		System.out.println("Expectativa de vida(aproximadamente): " + c.getExpectativaVida()+" anos");
		System.out.println("Deve correr: " + c.getCorrer());
		System.out.println("Crina: " + c.getCrina());
		System.out.println("Casco: " + c.getCasco());
		System.out.println("N�mero de patas: " + c.getPatas());
		System.out.println("Emite algum som: " + c.getSom());
		System.out.println();
		
		Ca.setNome("Thor");
		Ca.setIdade(4);
		Ca.setExpectativaVida(13);
		Ca.setCorrer("Sim, eles adoram passear e correr no parquinho");
		Ca.setPatas(4);
		Ca.setSom("Latir");
		Ca.setDomestico("S�o muito soci�veis e carinhosos com os humanos");
		System.out.println();
		
		System.out.println("Nome: " + Ca.getNome());
		System.out.println("Idade: " + Ca.getIdade()+" anos");
		System.out.println("Expectativa de vida(aproximadamente): " + Ca.getExpectativaVida()+" anos");
		System.out.println("Deve correr: " + Ca.getCorrer());
		System.out.println("Animal de estima��o: " + Ca.getDomestico());
		System.out.println("N�mero de patas: " + Ca.getPatas());
		System.out.println("Emite algum som: " + Ca.getSom());
		System.out.println();
		
		
		P.setNome("Pegui�inha");
		P.setIdade(15);
		P.setExpectativaVida(50);
		P.setPatas(4);
		P.setSom("Sim, elas emitem,por�m ainda � uma inc�gnita distinguir esse som");
		P.setDevagar("Seu metabolismo faz com que seja devagar em todas suas a��es");
		P.setSubeArvore("Sim, adoro ficar em cima dos galhos");
		
		System.out.println("Nome: " + P.getNome());
		System.out.println("Idade: " + P.getIdade()+" anos");
		System.out.println("Expectativa de vida(aproximadamente): " + P.getExpectativaVida()+" anos");
		System.out.println("N�mero de patas: " + P.getPatas());
		System.out.println("Emite algum som: " + P.getSom());
		System.out.println("Porque a Pregui�a tem a caracter�stica ser lenta: " + P.getDevagar());
		System.out.println("Consegue subir em �rvores: " + P.getSubeArvore());
		System.out.println();

	}

}
