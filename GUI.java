import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JComboBox;

public class GUI {

	private JFrame frame;
	private JTextField tfTanque;
	private JTextField tfAlto;
	private JTextField tfAncho;
	private JTextField tfLargo;
	private JTextField tfLugar;
	private JComboBox cbTipo;
	private JButton btnAgregar;
	private JComboBox cbTanques;

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
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1214, 558);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblControladorDeTanques = new JLabel("CONTROLADOR DE TANQUES");
		lblControladorDeTanques.setFont(new Font("Tarzan", Font.PLAIN, 18));
		lblControladorDeTanques.setBounds(338, 11, 291, 45);
		frame.getContentPane().add(lblControladorDeTanques);
		
		JLabel lblTanque = new JLabel("Tanque id");
		lblTanque.setBounds(35, 68, 56, 14);
		frame.getContentPane().add(lblTanque);
		
		tfTanque = new JTextField();
		tfTanque.setBounds(122, 65, 86, 20);
		frame.getContentPane().add(tfTanque);
		tfTanque.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Alto");
		lblNewLabel.setBounds(35, 105, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tfAlto = new JTextField();
		tfAlto.setBounds(122, 102, 86, 20);
		frame.getContentPane().add(tfAlto);
		tfAlto.setColumns(10);
		
		cbTipo = new JComboBox();
		cbTipo.setBounds(122, 196, 86, 20);
		frame.getContentPane().add(cbTipo);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(35, 199, 46, 14);
		frame.getContentPane().add(lblTipo);
		
		JLabel lblAncho = new JLabel("Ancho");
		lblAncho.setBounds(35, 137, 46, 14);
		frame.getContentPane().add(lblAncho);
		
		tfAncho = new JTextField();
		tfAncho.setBounds(122, 133, 86, 20);
		frame.getContentPane().add(tfAncho);
		tfAncho.setColumns(10);
		
		tfLargo = new JTextField();
		tfLargo.setBounds(122, 164, 86, 20);
		frame.getContentPane().add(tfLargo);
		tfLargo.setColumns(10);
		
		JLabel lblLargo = new JLabel("Largo");
		lblLargo.setBounds(35, 167, 46, 14);
		frame.getContentPane().add(lblLargo);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(35, 268, 89, 23);
		frame.getContentPane().add(btnAgregar);
		
		JLabel lblLugar = new JLabel("Lugar");
		lblLugar.setBounds(35, 230, 46, 14);
		frame.getContentPane().add(lblLugar);
		
		tfLugar = new JTextField();
		tfLugar.setBounds(122, 227, 86, 20);
		frame.getContentPane().add(tfLugar);
		tfLugar.setColumns(10);
		
		JLabel lblTanquesingresados = new JLabel("TANQUES INGRESADOS");
		lblTanquesingresados.setBounds(338, 68, 127, 14);
		frame.getContentPane().add(lblTanquesingresados);
		
		cbTanques = new JComboBox();
		cbTanques.setBounds(348, 102, 117, 17);
		frame.getContentPane().add(cbTanques);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad de agua para la region");
		lblNewLabel_1.setBounds(612, 68, 185, 20);
		frame.getContentPane().add(lblNewLabel_1);
		MiListener oyente = new MiListener();
		
		private class MiListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource()==btnAgregar) {
					
					
				}
			}
		
		}

	}
}
