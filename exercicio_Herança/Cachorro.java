package exercicio_Herança;

public class Cachorro extends AnimalCorrer {
	//no sentido que ele convive dentro de casa com você
	private String domestico;

	public String getDomestico() {
		return domestico;
	}

	public void setDomestico(String domestico) {
		this.domestico = domestico;
	}
}
