package com.mycompany.codificadoperro;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Codificadoperro extends JFrame implements ActionListener {

    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JButton b1;

    public static void main(String[] args) {
        Codificadoperro perro = new Codificadoperro();
    }

    public Codificadoperro() {
        setBounds(100, 100, 400, 500);
        setLayout(new GridLayout(5,2,20,3));
        l1 = new JLabel("Numero de Horas de Paseo");
        t1 = new JTextField("0");
        l2 = new JLabel("Perros Grandes");
        t2 = new JTextField("0");
        l3 = new JLabel("Perros Medianos");
        t3 = new JTextField("0");
        l4 = new JLabel("Perros Pequeños");
        t4 = new JTextField("0");

        b1 = new JButton("aceptar");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b1);
        b1.addActionListener(this);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(350,300);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accion = e.getActionCommand();
        if (accion.equals("aceptar")) {
            
            int numPerros = Integer.parseInt(t2.getText())+Integer.parseInt(t3.getText())+ Integer.parseInt(t4.getText());
        int grandes = Integer.parseInt(t2.getText());
        int medianos = Integer.parseInt(t3.getText());
        int pequeños = Integer.parseInt(t4.getText());
        int numHoras = Integer.parseInt(t1.getText());
        grandes = grandes * 10000;
        medianos = medianos * 5000;
        pequeños = pequeños * 3000;
        double totalPaseo = (grandes + medianos + pequeños)*numHoras;
        if (numPerros>1) {
            totalPaseo = totalPaseo - totalPaseo * 0.1;
            JOptionPane.showMessageDialog(this, "Valor total de las horas"+totalPaseo);
        } else {
            JOptionPane.showMessageDialog(this, "Valor total de las horas"+totalPaseo);
        }
        }
    }
}
