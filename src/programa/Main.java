package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Campanha;
import telas.TelaPrincipal;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static List<Campanha> campanhas = new ArrayList<Campanha>() ;

	public static void main(String[] args) {

		int opcao = menuPrincipal();
			switch (opcao){
				case 1:
					Campanha c = Campanha.cadastrar();
					campanhas.add(c);
					Campanha.listarCampanhas(campanhas);
					subMenuCampanha();
					break;
				case 2:
					System.out.println("2222222");
					menuPrincipal();
					break;
				case 3:
					System.out.println("33333333333");
					menuPrincipal();
					break;
				case 0:
					break;
			}
		
		sc.close();
	}

	public static int menuPrincipal() {
		System.out.println("/**MENU**/\n" 
				+ "1 - Cadastrar Campanha\n"
				+ "2 - Receber Doação\n"
				+ "3 - Editar Campanha\n"
				+ "4 - Adicionar Item a Meta de campanha");
		int opcao = sc.nextInt();
		return opcao;
		}
	public static int subMenuCampanha() {
		System.out.println("/**MENU**/\n" 
				+ "1 - Adicionar Item a Meta\n"
				+ "2 - Mostrar Meta\n"
				+ "3 - Alterar itens\n"
				+ "4 - Fechar Campanha");
		String opcao = sc.next();
		
		while(opcao!="n") {
			switch(opcao){
				case "1":
					System.out.println("Teste");
					int index = sc.nextInt();
					Campanha.cadastrarMeta(campanhas.get(index));
					Campanha.listarMeta(campanhas.get(index).getMeta());
					return subMenuCampanha();
				case "n":
					return menuPrincipal();
					
				}
		}
		return 0;
	}
		
}
