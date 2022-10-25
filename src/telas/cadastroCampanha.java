package telas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class cadastroCampanha extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// private JPanel contentPane;
	/**
	 * Create the panel.
	 * 
	 */
	// frame
	static JFrame f;

	// label to display text
	static JLabel l;

	public cadastroCampanha() {
		
		f = new JFrame("Cadastro de Campanha");

		l = new JLabel();
		l.setText("label text");

		JPanel p = new JPanel();
		p.add(l);
		
		f.add(p);
		f.setSize(800, 600);
		f.show();

	}

}
