package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Campanha {
	static Scanner sc = new Scanner(System.in);
	private String nome;
	private String entidade;
	private String vencimento;
	private List<Item> meta = new ArrayList<Item>();
	private List<Doacao> doacoes = new ArrayList<Doacao>();
	
	public Campanha() {}
	
	public static Campanha cadastrar() {
		Campanha c = new Campanha();
		System.out.println("Nome da campanha:");
		c.nome = sc.next();
		System.out.println("Entidade Receptora:");
		c.entidade = sc.next();
		System.out.println("Prazo de vencimento:");
		c.vencimento = sc.next();
//		c.meta = cadastrarMeta(c);
		return c;
	}
	
	public static void cadastrarMeta(Campanha c){
		Item item = Item.cadastrar();
		c.meta.add(item);
	}
	public static void listarCampanhas(List<Campanha> campanhas) {
		campanhas.forEach(x -> System.out.println(campanhas.indexOf(x)
				+" - " + x));
	}
	public static void listarMeta(List<Item> itens) {
		itens.forEach(x -> System.out.println(itens.indexOf(x)
				+" - " + x));
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEntidade() {
		return entidade;
	}

	public void setEntidade(String entidade) {
		this.entidade = entidade;
	}

	public String getVencimento() {
		return vencimento;
	}

	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}

	public List<Item> getMeta() {
		return meta;
	}

	public void setMeta(List<Item> itens) {
		this.meta = itens;
	}

	public List<Doacao> getDoacoes() {
		return doacoes;
	}

	public void setDoacoes(List<Doacao> doacoes) {
		this.doacoes = doacoes;
	}

	@Override
	public String toString() {
		return "Campanha nome=" + nome + ", entidade=" + entidade + ", vencimento=" + vencimento + ", meta=" + meta
				+ ", doacoes=" + doacoes + "\n";
	}

	
	
}
