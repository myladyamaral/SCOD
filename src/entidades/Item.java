package entidades;

import java.util.List;
import java.util.Scanner;

public class Item {
	static Scanner sc = new Scanner(System.in);
	
	private String nome;
	private int quantidade;
	private String descricao;
	
	public Item() {}

	public static Item cadastrar() {
		Item i = new Item();
		System.out.println("Nome do item:");
		i.nome = sc.next();
		System.out.println("Quantidade:");
		i.quantidade = sc.nextInt();
		i.descricao = i.quantidade+" de "+i.nome;
		return i;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Item: nome=" + nome + ", quantidade=" + quantidade + ", descricao=" + descricao + "";
	}
	
}
