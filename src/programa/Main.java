package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidades.Campanha;
import entidades.Item;


public class Main {
	static Scanner sc = new Scanner(System.in);
	static List<Campanha> campanhas = new ArrayList<Campanha>() ;

	public static void main(String[] args) throws ParseException {

		int opcao = menuPrincipal();
			while(opcao!=0) {
				if(opcao==1) {
					
					System.out.println("Nome da campanha:");
					String buffer = sc.nextLine();
					String nome = sc.nextLine();
					
					System.out.println("Entidade Receptora:");
					String entidade = sc.nextLine();
					
					System.out.println("Prazo de vencimento:");
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					//recebe uma String e converte em tipo Date
					Date vencimento = sdf.parse(sc.next());
					
					campanhas.add(Campanha.cadastrar(nome, entidade, vencimento));
					Campanha.listar(campanhas);
					opcao = menuPrincipal();
				}
				else if(opcao== 2) {
					Campanha.listar(campanhas);
					opcao = menuPrincipal();
				}
				else if(opcao== 6) {
					System.out.println("Adicionar item a Meta");
					int i = indexCampanha();
				
					campanhas.get(i).setMeta(
							Campanha.cadastrarMeta(campanhas.get(i).getMeta(),
							Item.cadastrar()));
					opcao = menuPrincipal();
				}
				else if(opcao== 7) {
					int i = indexCampanha();
					List<Item> itens = campanhas.get(i).getMeta();
					Campanha.listarMeta(itens);
					opcao = menuPrincipal();
				}
				
	
		}
		sc.close();
	}

	public static int menuPrincipal() {
		System.out.println("/**CAMPANHA**/\n" 
				+ "1 - Cadastrar Campanha\n"
				+ "2 - Listar Campanhas\n"
				+ "3 - Estender prazo\n"
				+ "4 - Fechar Campanha\n"
				+ "5 - Status de Campanha\n"
				+ "-----------------------------\n"
				+"/**META**/\n" 
				+ "6 - Adicionar item a Meta\n"
				+ "7 - Mostrar Meta\n"
				+ "8 - Alterar Meta\n"
				+ "-----------------------------\n"
				+ "/**DOAÇÕES**/\n"
				+ "8 - Verificar itens Doados\n"
				+ "-----------------------------\n"
				+ "9 - RECEBER DOAÇÃO\n"
				+ "-----------------------------\n"
				+ "0 - ENCERRAR PROGRAMA\n"
				+ "Selecione uma opção:");
		int opcao = sc.nextInt();
		return opcao;
	}
	
	
	public static int indexCampanha() {
		Campanha.listar(campanhas);
		System.out.println("\nInsira código da campanha:");
		int index = sc.nextInt();
		return index;
	}
		
}
