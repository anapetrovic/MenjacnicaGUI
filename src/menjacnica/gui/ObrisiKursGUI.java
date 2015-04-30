package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldSifra;
	private JTextField textFieldNaziv;
	private JTextField textFieldProdajni;
	private JTextField textFieldKupovni;
	private JTextField textFieldSrednji;
	private JTextField textFieldSkraceni;
	private JButton btnObrisi;
	private JButton btnOdustani;
	private JCheckBox checkBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKursGUI frame = new ObrisiKursGUI();
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
	public ObrisiKursGUI() {
		addWindowListener(new WindowAdapter() {
			public void windowClosed(WindowEvent arg0) {
				dispose();
			}
		});
		setResizable(false);
		setTitle("Obri\u0161i kurs");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 25, 10));
		
		JLabel lblifra = new JLabel("\u0160ifra");
		contentPane.add(lblifra);
		
		JLabel lblNaziv = new JLabel("Naziv");
		contentPane.add(lblNaziv);
		
		textFieldSifra = new JTextField();
		textFieldSifra.setEditable(false);
		textFieldSifra.setColumns(10);
		contentPane.add(textFieldSifra);
		
		textFieldNaziv = new JTextField();
		textFieldNaziv.setEditable(false);
		textFieldNaziv.setColumns(10);
		contentPane.add(textFieldNaziv);
		
		JLabel lblProdajni = new JLabel("Prodajni kurs");
		contentPane.add(lblProdajni);
		
		JLabel lblKupovni = new JLabel("Kupovni kurs");
		contentPane.add(lblKupovni);
		
		textFieldProdajni = new JTextField();
		textFieldProdajni.setEditable(false);
		textFieldProdajni.setColumns(10);
		contentPane.add(textFieldProdajni);
		
		textFieldKupovni = new JTextField();
		textFieldKupovni.setEditable(false);
		textFieldKupovni.setColumns(10);
		contentPane.add(textFieldKupovni);
		
		JLabel lblSrednjiKurs = new JLabel("Srednji kurs");
		contentPane.add(lblSrednjiKurs);
		
		JLabel lblSkraceniNaziv = new JLabel("Skra\u0107eni naziv");
		contentPane.add(lblSkraceniNaziv);
		
		textFieldSrednji = new JTextField();
		textFieldSrednji.setEditable(false);
		textFieldSrednji.setColumns(10);
		contentPane.add(textFieldSrednji);
		
		textFieldSkraceni = new JTextField();
		textFieldSkraceni.setEditable(false);
		textFieldSkraceni.setColumns(10);
		contentPane.add(textFieldSkraceni);
		
		checkBox = new JCheckBox("Zaista obri\u0161i kurs?");
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checkBox.isSelected())btnObrisi.setEnabled(true);
				else btnObrisi.setEnabled(false);
			}
		});
		contentPane.add(checkBox);
		
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnObrisi = new JButton("Obri\u0161i");
		btnObrisi.setEnabled(false);
		contentPane.add(btnObrisi);
		
		btnOdustani = new JButton("Odustani");
		btnOdustani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		contentPane.add(btnOdustani);
	}

}
