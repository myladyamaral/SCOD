package telas;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.border.EmptyBorder;

public class TelaPrincipal1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal1 frame = new TelaPrincipal1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		 
		setContentPane(contentPane);
//		
//		JLabel lblUsername = new JLabel("Username:");
//        lblUsername.setBounds(24, 25, 69, 22);
//        contentPane.add(lblUsername);
		
        
        JMenuBar menuBar = new javax.swing.JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setSize(150, 150);
        
        JMenu campanhaMenu = new JMenu("Campanha");
        JMenu itemMenu = new JMenu("Item");  
        menuBar.add(campanhaMenu);
        menuBar.add(itemMenu);
        
     // Cria e adiciona um item simples para o menu
        JMenuItem cadastrar = new JMenuItem("Cadastrar");
        JMenuItem editar= new JMenuItem("Editar");
        JMenuItem fechar= new JMenuItem("Fechar Campanha");
        
        campanhaMenu.add(cadastrar);
        campanhaMenu.add(editar);
        campanhaMenu.addSeparator();
        campanhaMenu.add(fechar);
        
        JMenuItem adicionar= new JMenuItem("Adicionar item");
        JMenuItem alterar= new JMenuItem("Alterar item");
        itemMenu.add(adicionar);
        itemMenu.add(alterar);

       
	}

}
