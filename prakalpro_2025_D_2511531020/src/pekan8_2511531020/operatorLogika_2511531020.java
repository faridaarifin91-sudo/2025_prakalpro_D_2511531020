package pekan8_2511531020;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;

public class operatorLogika_2511531020 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtA;
    private JTextField txtB;
    private JLabel lblHasil;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    operatorLogika_2511531020 frame = new operatorLogika_2511531020();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // ==============================
    // KONSTRUKTOR GUI (Sudah benar)
    // ==============================
    public operatorLogika_2511531020() {

        setTitle("Aplikasi Operator Logika");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);

        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        // ======== JUDUL BESAR =========
        JLabel lblJudul = new JLabel("OPERATOR LOGIKA");
        lblJudul.setBounds(80, 5, 250, 25);
        lblJudul.setHorizontalAlignment(SwingConstants.CENTER);
        lblJudul.setFont(lblJudul.getFont().deriveFont(16f));
        contentPane.add(lblJudul);

        // Label A
        JLabel lblA = new JLabel("Masukkan A:");
        lblA.setBounds(20, 40, 100, 25);
        contentPane.add(lblA);

        // TextField A
        txtA = new JTextField();
        txtA.setBounds(120, 40, 150, 25);
        contentPane.add(txtA);

        // Label B
        JLabel lblB = new JLabel("Masukkan B:");
        lblB.setBounds(20, 80, 100, 25);
        contentPane.add(lblB);

        // TextField B
        txtB = new JTextField();
        txtB.setBounds(120, 80, 150, 25);
        contentPane.add(txtB);

        // Tombol AND
        JButton btnAND = new JButton("AND");
        btnAND.setBounds(20, 130, 80, 30);
        contentPane.add(btnAND);

        // Tombol OR
        JButton btnOR = new JButton("OR");
        btnOR.setBounds(120, 130, 80, 30);
        contentPane.add(btnOR);

        // Tombol NOT
        JButton btnNOT = new JButton("NOT A");
        btnNOT.setBounds(220, 130, 100, 30);
        contentPane.add(btnNOT);

        // Label Hasil
        lblHasil = new JLabel("Hasil: -");
        lblHasil.setBounds(20, 190, 350, 30);
        lblHasil.setFont(lblHasil.getFont().deriveFont(14f));
        contentPane.add(lblHasil);

        // ==============================
        // EVENT BUTTON AND
        // ==============================
        btnAND.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean a = Boolean.parseBoolean(txtA.getText());
                boolean b = Boolean.parseBoolean(txtB.getText());
                lblHasil.setText("Hasil: " + (a && b));
            }
        });

        // ==============================
        // EVENT BUTTON OR
        // ==============================
        btnOR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean a = Boolean.parseBoolean(txtA.getText());
                boolean b = Boolean.parseBoolean(txtB.getText());
                lblHasil.setText("Hasil: " + (a || b));
            }
        });

        // ==============================
        // EVENT BUTTON NOT
        // ==============================
        btnNOT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean a = Boolean.parseBoolean(txtA.getText());
                lblHasil.setText("Hasil: " + (!a));
            }
        });
    }
}
