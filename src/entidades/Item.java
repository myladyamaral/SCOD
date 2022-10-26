package entidades;


import java.util.Scanner;

public class Item {
	static Scanner sc = new Scanner(System.in);
	
	private String nome;
	private double quantidade;
	private String descricao;
	private String undMedida;
	
	public Item() {}
	public Item(String nome, double quantidade, String medida) {
	}

	public static Item cadastrar() {
		Item i = new Item();
		System.out.println("Nome do item:");
		i.nome = sc.nextLine();
		System.out.println("Quantidade:");
		i.quantidade = sc.nextDouble();
		System.out.println("Medida:");
		String buffer = sc.nextLine();
		i.undMedida = sc.nextLine();
		i.descricao = i.quantidade+" "+i.undMedida+" de "+i.nome;
		return i;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUndMedida() {
		return undMedida;
	}
	public void setUndMedida(String undMedida) {
		this.undMedida = undMedida;
	}
	@Override
	public String toString() {
		return descricao;
	}
	
}
