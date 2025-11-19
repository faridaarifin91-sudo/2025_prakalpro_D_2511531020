package pekan8_2511531020;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class operatorAritmatika_2511531020 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textAngka1;
	private JTextField textAngka2;
	private JTextField textHasil;

	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"Peringatan",JOptionPane.WARNING_MESSAGE);
	}
	private void pesanErorr(String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"Kesalahan",JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					operatorAritmatika_2511531020 frame = new operatorAritmatika_2511531020();
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
	public operatorAritmatika_2511531020() {
		setResizable(false);
		setTitle("GUI pertama");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel_2.setBounds(139, 6, 292, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Angka 1");
		lblNewLabel_1.setBounds(5, 31, 144, 50);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Angka 2");
		lblNewLabel_3.setBounds(5, 106, 426, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Operator");
		lblNewLabel_4.setBounds(5, 156, 54, 23);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("Hasil");
		lblNewLabel.setBounds(5, 206, 426, 23);
		contentPane.add(lblNewLabel);
		
		textAngka1 = new JTextField();
		textAngka1.setBounds(55, 46, 96, 20);
		contentPane.add(textAngka1);
		textAngka1.setColumns(10);
		
		textAngka2 = new JTextField();
		textAngka2.setBounds(55, 107, 96, 20);
		contentPane.add(textAngka2);
		textAngka2.setColumns(10);
		
		textHasil = new JTextField();
		textHasil.setBounds(55, 207, 96, 20);
		textHasil.setToolTipText("txtHasil");
		contentPane.add(textHasil);
		textHasil.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setBounds(55, 156, 30, 22);
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		contentPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("Hitung");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if(textAngka1.getText().trim().isEmpty()) {
					pesanPeringatan("Inputkan angka 1");
				} else if (textAngka2.getText().trim().isEmpty()) {
					pesanPeringatan("Inputkan angka 2");
				} else {
					try {
				int a= Integer .valueOf(textAngka1.getText());
				int b= Integer.parseInt(textAngka2.getText());
				int c= cbOperator. getSelectedIndex();
				if(c==0) {hasil= a+b; }
				if(c==1) {hasil= a-b; }
				if(c==2) {hasil= a*b; }
				if(c==3) {hasil= a/b; }
				if(c==4) {hasil= a%b; }
			    textHasil.setText(String.valueOf(hasil));
			}catch (NumberFormatException ex) {
				pesanErorr("Angka 1 dan Angka 2 tidak valid");
			}
		}
		}
		});
		btnNewButton.setBounds(96, 156, 88, 22);
		contentPane.add(btnNewButton);

	}

}