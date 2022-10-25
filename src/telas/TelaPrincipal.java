package telas;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7706468147066809299L;
	private JPanel contentPane;

	public static void main(String[] args) {
		try {
			TelaPrincipal telaPrincipal = new TelaPrincipal();
			telaPrincipal.setDefaultCloseOperation(EXIT_ON_CLOSE);
			telaPrincipal.setVisible(true);
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	public TelaPrincipal() {
			super("Aplicação com menu");
			setJMenuBar(createMenuBar());
			setSize(800, 600);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); 
			setContentPane(contentPane);
		}

	private JMenuBar createMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(createMenuFile());
		menuBar.add(createMenuEdit());
		return menuBar;
	}

	private JMenuItem createMenuItem(String nome, int teclaDeAtalho, ActionListener actionListener) {
		JMenuItem itemMenu = new JMenuItem(nome, teclaDeAtalho);
		itemMenu.addActionListener(actionListener);
		return itemMenu;
	}

	private JMenu createMenuEdit() {
		JMenu menu = new JMenu("Item");
		menu.add(createMenuItem("Adicionar", KeyEvent.VK_E, event -> fileExit()));
		menu.add(createMenuItem("Alterar itens", KeyEvent.VK_E, event -> fileExit()));
		return menu;
	}

	private JMenu createMenuFile() {
		JMenu menu = new JMenu("Campanha");
		menu.add(createMenuItem("Cadastrar", KeyEvent.VK_N, event -> cadCampanha()));
		menu.add(createMenuItem("Editar", KeyEvent.VK_O, event -> fileOpen()));
		menu.add(createMenuItem("Listar", KeyEvent.VK_E, event -> fileExit()));
		return menu;
	}

	private void fileNew() {
		System.out.println("File -> New");
	}

	private void fileOpen() {
		System.out.println("File -> Open");
	}

	private void fileExit() {
		System.out.println("File -> Exit");
	}
	private void cadCampanha() {
		cadastroCampanha c = new cadastroCampanha();
		setContentPane(c);
		
	}

}
