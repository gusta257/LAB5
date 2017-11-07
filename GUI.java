import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;

public class GUI {

	private JFrame frame;
	private JTextField tfAltoO;
	private JLabel lblTanque;
	private JLabel lblAltura;
	private JLabel lblAncho;
	private JLabel lblLargo;
	private JTextField tfAltoCIL;
	private JTextField tfAncho;
	private JTextField tfLargo;
	private JTextField tfRadio;
	private JButton btnAgregarCIL;
	private JButton btnAgregarOR;
	private JButton btnAgregarCUB;
	private JComboBox<String> cbAgregados;
	private JLabel lblNewLabel;
	private JTextField tfIDCIL;
	private JTextField tfIDO;
	private JTextField tfAltoCU;
	private JTextField tfIDCU;
	private JLabel lblNewLabel_1;
	private JButton btnVerificar;
	private JLabel lblAguaDisponible;
	private JLabel lblAgua;
	private JLabel lblAd;
	private JLabel lblCantidadDeAgua;
	private JTextField tfAgua;
	private JButton btnLiberarValvula;
	private Acueducto gestAcue;
	private JButton btnMostrarTanques;
	private JLabel lbRespuesta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
		gestAcue = new Acueducto();
		mensajeI();
	}
	public static void mensajeI(){
		  
		  JOptionPane.showMessageDialog(null, "Bienvenido");
		 }

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1285, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		MiListener oyente = new MiListener();
		
		JLabel lblControladorDeTanques = new JLabel("CONTROLADOR DE TANQUES");
		lblControladorDeTanques.setFont(new Font("Tarzan", Font.PLAIN, 16));
		lblControladorDeTanques.setBounds(346, 11, 242, 27);
		frame.getContentPane().add(lblControladorDeTanques);
		
		lblTanque = new JLabel("Tanque Cilindrico");
		lblTanque.setBounds(25, 55, 117, 14);
		frame.getContentPane().add(lblTanque);
		
		tfAltoO = new JTextField();
		tfAltoO.setText("1");
		tfAltoO.setBounds(321, 142, 86, 20);
		frame.getContentPane().add(tfAltoO);
		tfAltoO.setColumns(10);
		
		lblAltura = new JLabel("Altura");
		lblAltura.setBounds(25, 114, 46, 14);
		frame.getContentPane().add(lblAltura);
		
		lblAncho = new JLabel("Ancho");
		lblAncho.setBounds(268, 83, 46, 14);
		frame.getContentPane().add(lblAncho);
		
		lblLargo = new JLabel("Largo");
		lblLargo.setBounds(268, 114, 46, 14);
		frame.getContentPane().add(lblLargo);
		
		tfAltoCIL = new JTextField();
		tfAltoCIL.setText("1");
		tfAltoCIL.setBounds(105, 111, 86, 20);
		frame.getContentPane().add(tfAltoCIL);
		tfAltoCIL.setColumns(10);
		
		tfAncho = new JTextField();
		tfAncho.setText("2");
		tfAncho.setBounds(321, 80, 86, 20);
		frame.getContentPane().add(tfAncho);
		tfAncho.setColumns(10);
		
		tfLargo = new JTextField();
		tfLargo.setText("4");
		tfLargo.setBounds(321, 111, 86, 20);
		frame.getContentPane().add(tfLargo);
		tfLargo.setColumns(10);
		
		JLabel lblRadio = new JLabel("Radio");
		lblRadio.setBounds(25, 83, 46, 14);
		frame.getContentPane().add(lblRadio);
		
		tfRadio = new JTextField();
		tfRadio.setText("2");
		tfRadio.setBounds(105, 80, 86, 20);
		frame.getContentPane().add(tfRadio);
		tfRadio.setColumns(10);
		
		btnAgregarCIL = new JButton("Agregar");
		btnAgregarCIL.setBounds(102, 173, 89, 23);
		frame.getContentPane().add(btnAgregarCIL);
		btnAgregarCIL.addActionListener(oyente);
		
		cbAgregados = new JComboBox();
		cbAgregados.setBounds(662, 49, 376, 27);
		frame.getContentPane().add(cbAgregados);
		
		lblNewLabel = new JLabel("Tanques Ingresados");
		lblNewLabel.setBounds(737, 20, 129, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(25, 143, 46, 14);
		frame.getContentPane().add(lblId);
		
		tfIDCIL = new JTextField();
		tfIDCIL.setText("Tanque 1");
		tfIDCIL.setBounds(105, 142, 86, 20);
		frame.getContentPane().add(tfIDCIL);
		tfIDCIL.setColumns(10);
		
		JLabel lblTanqueOrtogonal = new JLabel("Tanque Ortogonal");
		lblTanqueOrtogonal.setBounds(268, 55, 112, 14);
		frame.getContentPane().add(lblTanqueOrtogonal);
		
		JLabel lblAltura_1 = new JLabel("Altura");
		lblAltura_1.setBounds(265, 145, 46, 14);
		frame.getContentPane().add(lblAltura_1);
		
		JLabel lblId_1 = new JLabel("Id");
		lblId_1.setBounds(268, 180, 46, 14);
		frame.getContentPane().add(lblId_1);
		
		tfIDO = new JTextField();
		tfIDO.setText("Tanque 2");
		tfIDO.setBounds(321, 173, 86, 20);
		frame.getContentPane().add(tfIDO);
		tfIDO.setColumns(10);
		
		JLabel lblTanqueCbico = new JLabel("Tanque C\u00FAbico");
		lblTanqueCbico.setBounds(476, 55, 89, 14);
		frame.getContentPane().add(lblTanqueCbico);
		
		tfAltoCU = new JTextField();
		tfAltoCU.setText("2");
		tfAltoCU.setBounds(536, 80, 86, 20);
		frame.getContentPane().add(tfAltoCU);
		tfAltoCU.setColumns(10);
		
		JLabel lblAltura_2 = new JLabel("Altura");
		lblAltura_2.setBounds(460, 83, 46, 14);
		frame.getContentPane().add(lblAltura_2);
		
		btnAgregarOR = new JButton("Agregar");
		btnAgregarOR.setBounds(318, 214, 89, 23);
		btnAgregarOR.addActionListener(oyente);
		frame.getContentPane().add(btnAgregarOR);
		
		btnAgregarCUB = new JButton("Agregar");
		btnAgregarCUB.setBounds(536, 156, 89, 23);
		btnAgregarCUB.addActionListener(oyente);
		frame.getContentPane().add(btnAgregarCUB);
		
		JLabel lblId_2 = new JLabel("Id");
		lblId_2.setBounds(460, 114, 46, 14);
		frame.getContentPane().add(lblId_2);
		
		tfIDCU = new JTextField();
		tfIDCU.setText("Tanque 3");
		tfIDCU.setBounds(536, 111, 86, 20);
		frame.getContentPane().add(tfIDCU);
		tfIDCU.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Seleccione un Tanque y verifique Cuanta agua le queda");
		lblNewLabel_1.setFont(new Font("Tarzan", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(429, 214, 445, 46);
		frame.getContentPane().add(lblNewLabel_1);
		
		btnVerificar = new JButton("Verificar");
		btnVerificar.setBounds(895, 228, 89, 23);
		frame.getContentPane().add(btnVerificar);
		btnVerificar.addActionListener(oyente);
		
		lblAguaDisponible = new JLabel("Agua disponible");
		lblAguaDisponible.setBounds(25, 294, 100, 27);
		frame.getContentPane().add(lblAguaDisponible);
		
		lblAgua = new JLabel("");
		lblAgua.setForeground(Color.RED);
		lblAgua.setBackground(Color.LIGHT_GRAY);
		lblAgua.setBounds(145, 294, 288, 24);
		frame.getContentPane().add(lblAgua);
		
		lblCantidadDeAgua = new JLabel("Cantidad de agua necesitada");
		lblCantidadDeAgua.setBounds(10, 348, 165, 14);
		frame.getContentPane().add(lblCantidadDeAgua);
		
		tfAgua = new JTextField();
		tfAgua.setBounds(196, 345, 86, 20);
		frame.getContentPane().add(tfAgua);
		tfAgua.setColumns(10);
		
		btnLiberarValvula = new JButton("Liberar agua");
		btnLiberarValvula.setBounds(321, 344, 112, 23);
		frame.getContentPane().add(btnLiberarValvula);
		
		btnMostrarTanques = new JButton("Mostrar Tanques");
		btnMostrarTanques.setBounds(460, 294, 148, 27);
		frame.getContentPane().add(btnMostrarTanques);
		btnMostrarTanques.addActionListener(oyente);
		
		lbRespuesta = new JLabel("");
		lbRespuesta.setBounds(10, 399, 1236, 62);
		frame.getContentPane().add(lbRespuesta);
		
		lblAd = new JLabel("");
		lblAd.setForeground(Color.RED);
		lblAd.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAd.setBounds(476, 338, 421, 35);
		frame.getContentPane().add(lblAd);
		btnLiberarValvula.addActionListener(oyente);
	}
	private class MiListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()==btnAgregarCIL) {
				try {
					Tanque tanqueCI = new Cilindro(tfIDCIL.getText(),Double.parseDouble(tfAltoCIL.getText()),Double.parseDouble(tfRadio.getText()));
					cbAgregados.addItem(tanqueCI.toString());
					gestAcue.llenarCil(tfIDCIL.getText(), Double.parseDouble(tfAltoCIL.getText()), Double.parseDouble(tfRadio.getText()));
				} catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Error, debe ingresar un numero en las dimensiones ");
				}	
			}
			if (e.getSource()==btnAgregarCUB) {
				try {
					Tanque tanqueCU = new Cubo(tfIDCU.getText(),Double.parseDouble(tfAltoCU.getText()));
					cbAgregados.addItem(tanqueCU.toString());
					gestAcue.llenarCubo(tfIDCU.getText(),Double.parseDouble(tfAltoCU.getText()));
				} catch(Exception e3) {
					JOptionPane.showMessageDialog(null, "Error, debe ingresar un numero en las dimensiones ");
				}	
			}
			if (e.getSource()==btnAgregarOR) {
				try {
					Tanque tanqueOR = new Ortogonal(tfIDO.getText(),Double.parseDouble(tfAltoO.getText()), Double.parseDouble(tfAncho.getText()),Double.parseDouble(tfLargo.getText()));
					cbAgregados.addItem(tanqueOR.toString());
					gestAcue.llenarOrto(tfIDO.getText(),Double.parseDouble(tfAltoO.getText()), Double.parseDouble(tfAncho.getText()),Double.parseDouble(tfLargo.getText()));
					

				} catch(Exception e4) {
					JOptionPane.showMessageDialog(null, "Error, debe ingresar un numero en las dimensiones ");
				}	
			}
			if(e.getSource()==btnVerificar) {
				
				System.out.println(cbAgregados.getSelectedItem());
				lblAgua.setText((String.valueOf(gestAcue.getTanques().get(cbAgregados.getSelectedIndex()).Volumen())));
			}
			if(e.getSource()==btnLiberarValvula) {
			//	System.out.println(gestAcue.getTanques().get(cbAgregados.getSelectedIndex()).Volumen());
				//lblAgua.setText("La capacidad es "+String.valueOf(gestAcue.getTanques().get(cbAgregados.getSelectedIndex()).gasto(gestAcue.getTanques().get(cbAgregados.getSelectedIndex()).Volumen(),Double.parseDouble(tfAgua.getText()))));
				lblAgua.setText(String.valueOf(gestAcue.getTanques().get(cbAgregados.getSelectedIndex()).gasto(Double.parseDouble(lblAgua.getText()),Double.parseDouble(tfAgua.getText()))));
				lblAd.setText(gestAcue.getTanques().get(cbAgregados.getSelectedIndex()).advertencia(Double.parseDouble(lblAgua.getText()),Double.parseDouble(tfAgua.getText())));
				
				
				//System.out.println(gestAcue.getTanques().get(cbAgregados.getSelectedIndex()).gasto(Double.parseDouble(tfAgua.getText())));
				//Tanque prueba = new Tanque();
				//System.out.println(prueba.gasto(Double.parseDouble(tfAgua.getText())));
			}
			if(e.getSource()==btnMostrarTanques) { 
				
				lbRespuesta.setText(gestAcue.toString());
				//gestAcue.getTanques().get(cbAgregados.getSelectedIndex()).advertencia(Double.parseDouble(lblAgua.getText()),Double.parseDouble(tfAgua.getText()));
				 
				

			}
			
		}
		 
	}
}
