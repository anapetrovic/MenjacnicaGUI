package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JSlider;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenuGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldKupovni;
	private JTextField textFieldProdajni;
	private JTextField textFieldIznos;
	JRadioButton rdbtn1, rdbtn2;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzvrsiZamenuGUI frame = new IzvrsiZamenuGUI();
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
	public IzvrsiZamenuGUI() {
		addWindowListener(new WindowAdapter() {
			public void windowClosed(WindowEvent arg0) {
				dispose();
			}
		});
		setTitle("Izvrsi zamenu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl = new JLabel("Kupovni kurs");
		lbl.setBounds(10, 0, 133, 43);
		lbl.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lbl);
		
		JLabel lblValuta = new JLabel("Valuta");
		lblValuta.setBounds(153, 0, 133, 43);
		lblValuta.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblValuta);
		
		JLabel lblNewLabel_1 = new JLabel("Prodajni kurs");
		lblNewLabel_1.setBounds(293, 0, 133, 43);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNewLabel_1);
		
		textFieldKupovni = new JTextField();
		textFieldKupovni.setEditable(false);
		textFieldKupovni.setBounds(10, 43, 133, 33);
		textFieldKupovni.setText("");
		panel.add(textFieldKupovni);
		textFieldKupovni.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CHF"}));
		comboBox.setBounds(150, 43, 133, 33);
		panel.add(comboBox);
		
		textFieldProdajni = new JTextField();
		textFieldProdajni.setEditable(false);
		textFieldProdajni.setBounds(291, 43, 133, 33);
		panel.add(textFieldProdajni);
		textFieldProdajni.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Iznos");
		lblNewLabel_2.setBounds(10, 0, 202, 27);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.LEFT);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Vrsta transakcije");
		lblNewLabel_3.setBounds(232, 0, 202, 27);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel_3);
		
		textFieldIznos = new JTextField();
		textFieldIznos.setBounds(10, 42, 202, 34);
		panel_1.add(textFieldIznos);
		textFieldIznos.setColumns(10);
		
		rdbtn1 = new JRadioButton("kupovina");
		buttonGroup.add(rdbtn1);
		rdbtn1.setBounds(232, 30, 202, 27);
		panel_1.add(rdbtn1);
		
		rdbtn2 = new JRadioButton("prodaja");
		buttonGroup.add(rdbtn2);
		rdbtn2.setBounds(232, 60, 202, 27);
		panel_1.add(rdbtn2);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(2, 1, 0, 0));
		
		
		final JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				textFieldIznos.setText(slider.getValue()+"");
			}
		});
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMinorTickSpacing(5);
		slider.setPreferredSize(new Dimension(400, 44));
		slider.setForeground(Color.BLACK);
		slider.setMajorTickSpacing(10);
		panel_2.add(slider);
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnZamena = new JButton("Izvr\u0161i zamenu");
		btnZamena.setBounds(23, 5, 142, 32);
		panel_3.add(btnZamena);
		
		JButton btnOdustani = new JButton("Odustani");
		btnOdustani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnOdustani.setBounds(238, 5, 155, 32);
		panel_3.add(btnOdustani);
	}
}



