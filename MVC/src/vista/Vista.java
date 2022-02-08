package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Vista extends JFrame {

	public JPanel contentPane;
	public JTextField txt1;
	public JTextField txt2;
	public JTextField txtResultado;
	public JButton btnSumar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
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
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(10, 60, 86, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(95, 63, 46, 14);
		contentPane.add(lblNewLabel);
		
		txt2 = new JTextField();
		txt2.setBounds(135, 60, 86, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("=");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(220, 63, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(260, 60, 86, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		btnSumar = new JButton("Sumar");
		btnSumar.setBounds(10, 112, 89, 23);
		contentPane.add(btnSumar);
	}
}
