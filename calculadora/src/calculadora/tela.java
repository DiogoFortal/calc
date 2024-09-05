package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela {

	private JFrame frmCalcuaradoraDiogo;
	private JTextField textField_11;
	double numero1;
	double numero2;
	double resul;
	String operacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalcuaradoraDiogo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalcuaradoraDiogo = new JFrame();
		frmCalcuaradoraDiogo.getContentPane().setBackground(new Color(49, 97, 155));
		frmCalcuaradoraDiogo.setTitle("Calcuaradora DIogo4.0");
		frmCalcuaradoraDiogo.setBounds(100, 100, 342, 448);
		frmCalcuaradoraDiogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalcuaradoraDiogo.getContentPane().setLayout(null);

		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Arial", Font.BOLD, 14));
		textField_11.setColumns(10);
		textField_11.setBounds(43, 89, 210, 50);
		frmCalcuaradoraDiogo.getContentPane().add(textField_11);

		JButton btnc = new JButton("C");
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_11.setText("");
			}
		});
		btnc.setForeground(new Color(255, 0, 0));
		btnc.setFont(new Font("Arial", Font.BOLD, 14));
		btnc.setBounds(253, 89, 63, 50);
		frmCalcuaradoraDiogo.getContentPane().add(btnc);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_11.setText(textField_11.getText() + btn7.getText());
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 14));
		btn7.setBounds(43, 150, 63, 50);
		frmCalcuaradoraDiogo.getContentPane().add(btn7);

		JButton btnc_1 = new JButton("+");
		btnc_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(textField_11.getText());
				textField_11.setText("");
				operacao = "/";
			}
		});
		btnc_1.setForeground(new Color(255, 0, 0));
		btnc_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnc_1.setBounds(253, 150, 63, 50);
		frmCalcuaradoraDiogo.getContentPane().add(btnc_1);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_11.setText(textField_11.getText() + btn8.getText());
			}
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 14));
		btn8.setBounds(116, 150, 63, 50);
		frmCalcuaradoraDiogo.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_11.setText(textField_11.getText() + btn9.getText());
			}
		});
		btn9.setFont(new Font("Arial", Font.BOLD, 14));
		btn9.setBounds(189, 150, 63, 50);
		frmCalcuaradoraDiogo.getContentPane().add(btn9);

		JButton btnsub = new JButton("-");
		btnsub.setForeground(Color.RED);
		btnsub.setFont(new Font("Arial", Font.BOLD, 14));
		btnsub.setBounds(253, 211, 63, 50);
		frmCalcuaradoraDiogo.getContentPane().add(btnsub);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_11.setText(textField_11.getText() + btn6.getText());
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 14));
		btn6.setBounds(189, 211, 63, 50);
		frmCalcuaradoraDiogo.getContentPane().add(btn6);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_11.setText(textField_11.getText() + btn5.getText());
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 14));
		btn5.setBounds(116, 211, 63, 50);
		frmCalcuaradoraDiogo.getContentPane().add(btn5);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_11.setText(textField_11.getText() + btn4.getText());
			}
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 14));
		btn4.setBounds(43, 211, 63, 50);
		frmCalcuaradoraDiogo.getContentPane().add(btn4);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_11.setText(textField_11.getText() + btn3.getText());
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 14));
		btn3.setBounds(189, 272, 63, 50);
		frmCalcuaradoraDiogo.getContentPane().add(btn3);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_11.setText(textField_11.getText() + btn2.getText());
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 14));
		btn2.setBounds(116, 272, 63, 50);
		frmCalcuaradoraDiogo.getContentPane().add(btn2);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_11.setText(textField_11.getText() + btn1.getText());
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 14));
		btn1.setBounds(43, 272, 63, 50);
		frmCalcuaradoraDiogo.getContentPane().add(btn1);

		JButton btnmult = new JButton("X");
		btnmult.setForeground(Color.RED);
		btnmult.setFont(new Font("Arial", Font.BOLD, 14));
		btnmult.setBounds(253, 272, 63, 50);
		frmCalcuaradoraDiogo.getContentPane().add(btnmult);

		JButton btnigual = new JButton("=");
		btnigual.setFont(new Font("Arial", Font.BOLD, 14));
		btnigual.setBounds(189, 333, 63, 50);
		frmCalcuaradoraDiogo.getContentPane().add(btnigual);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_11.setText(textField_11.getText() + btn0.getText());
			}
		});
		btn0.setFont(new Font("Arial", Font.BOLD, 14));
		btn0.setBounds(116, 333, 63, 50);
		frmCalcuaradoraDiogo.getContentPane().add(btn0);

		JButton btnponto = new JButton(".");
		btnponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnponto.setFont(new Font("Arial", Font.BOLD, 14));
		btnponto.setBounds(43, 333, 63, 50);
		frmCalcuaradoraDiogo.getContentPane().add(btnponto);

		JButton btndiv = new JButton("/");
		btndiv.setForeground(Color.RED);
		btndiv.setFont(new Font("Arial", Font.BOLD, 14));
		btndiv.setBounds(253, 333, 63, 50);
		frmCalcuaradoraDiogo.getContentPane().add(btndiv);
	}
}
