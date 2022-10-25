package entidades;

public class Doacao {
	private Item item;
	private String doador;
	
	public Doacao() {}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getDoador() {
		return doador;
	}

	public void setDoador(String doador) {
		this.doador = doador;
	}
	
}