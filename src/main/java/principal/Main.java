/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author Wanderson
 */
public class Main {

    public static void main(String[] args) {
        Double n1, n2, soma;
        int op;
        boolean sair = false;
      
        do {
            if (!sair) {

                n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero 1"));
                n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero 2"));
                op = Integer.parseInt(JOptionPane.showInputDialog("1-Somar\n2-Subtrair\n3-Multiplicação\n4-Divisão"));
                switch (op) {
                    case 1 -> JOptionPane.showMessageDialog(null, "Soma = " + (soma = n1 + n2));
                    case 2 -> JOptionPane.showMessageDialog(null, "Subtração = " + (soma = n1 - n2));
                    case 3 -> JOptionPane.showMessageDialog(null, "Multiplicação = " + (soma = n1 * n2));
                    case 4 -> JOptionPane.showMessageDialog(null, "Divisão = " + (soma = n1 / n2));
                        default -> {
                    }
                }
                op = Integer.parseInt(JOptionPane.showInputDialog("1-Realizar outro cálculo\n2-Encerrar o programa."));
                if (op == 1) {
                    sair = false;
                } else {
                    sair = true;
                }
            }
        } while (true);
    }
}
