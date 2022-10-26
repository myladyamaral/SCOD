package entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Campanha {
	static Scanner sc = new Scanner(System.in);
	private String nome;
	private String entidade;
	private Date vencimento;
	private List<Item> meta = new ArrayList<Item>();
	private List<Doacao> doacoes = new ArrayList<Doacao>();
	private double status;
	
	public Campanha() {}
	//Metodos de Campanha
	public static Campanha cadastrar(String nome, String entidade, Date vencimento) {
		Campanha c = new Campanha();
		c.nome = nome;
		c.entidade = entidade;
		c.vencimento = vencimento;
		return c;	
	}
	
	public static void listar(List<Campanha> campanhas) {
		System.out.println("\tLISTA DE CAMPANHAS\ncodigo, nome, entidade, vencimento");
		campanhas.forEach(x -> System.out.println(campanhas.indexOf(x)
				+", " + x));
	}

	public static List<Campanha> ordenar(List<Campanha> campanhas) {
		List<Campanha> cTemp = new ArrayList<Campanha>();
		for(int i=0;i<campanhas.size()-1;i++) {
			Campanha c = campanhas.get(i);
			Campanha c1 = campanhas.get(i+1);
			if(c.getVencimento().compareTo(c1.getVencimento())<= 0){
				cTemp.add(c);
			}
			if (c.getVencimento().compareTo(c1.getVencimento())> 0){
				cTemp.add(c1);
			}
		}
		return cTemp;
	}
	
	//metodos de Meta
	public static List<Item> cadastrarMeta(List<Item> meta, Item item){
		//campanha onde vai ser adicionado o item novo
		//se metas estiver vazio adiciona item a meta
		if(meta.size() == 0) {
			meta.add(item);
			System.out.println("Primeiro item adicionado a meta: "+item);
			return meta;
		}
		else {
			//Se houver itens na meta ela é percorrida 
			for(int i=0;i<=meta.size()-1;i++) {
				if(meta.get(i).getNome().equals(item.getNome())) {
					//se o item já existir na lista a quantidade é somada ao total
					double q = item.getQuantidade()+meta.get(i).getQuantidade();
					Item i2 = new Item();
					i2.setNome(meta.get(i).getNome());
					i2.setQuantidade(q);
					i2.setUndMedida(meta.get(i).getUndMedida());
					i2.setDescricao(q+" de "+i2.getNome());
					meta.add(i2);
					meta.remove(i);
					System.out.println(i2+ " alterado");
					return meta;
				}
				else {
					meta.add(item);
					System.out.println("Item: "+item+" adicionado a meta");
					return meta;
				}
			}
			
		}
		return meta;
	}
	
	public static void listarMeta(List<Item> itens) {
		itens.forEach(x -> System.out.println(itens.indexOf(x)
				+" - " + x));
	}
	
	public static void calculaStatus(Campanha c) {
		double totalMeta = 0,totalDoacoes = 0;
		for(int i = 0;i<=c.meta.size()-1;i++) {
			totalMeta+=c.meta.get(i).getQuantidade();
		}
		for(int i = 0;i<=c.doacoes.size()-1;i++) {
			totalDoacoes+=c.doacoes.get(i).getItem().getQuantidade();
		}
		double a = totalMeta/100;
		c.status = totalDoacoes*a;
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

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
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
		return  nome + ", " + entidade + ", "+ status+"%"+ ", "+ vencimento;
	}

	
	
}
