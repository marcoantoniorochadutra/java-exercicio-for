package Q2;

import javax.swing.JOptionPane;

public class Exercicio14 {	



	public static void main(String[] args) {
		

		int saldo = 10000;
        int soma = 0;
        int vl = 0;
        int saldo1 = 0;

        int qt = Integer.parseInt(JOptionPane.showInputDialog("Quantas transações serão feitas?"));
        JOptionPane.showMessageDialog(null, "Seu saldo é de " + saldo);

        for (int i = 1; i <= qt; i++) {
            char oper = JOptionPane.showInputDialog("Qual operação? (D/R)").toUpperCase().charAt(0);

            if (oper == 'D') {
                vl = Integer.parseInt(JOptionPane.showInputDialog("Quanto quer Depositar?"));

                soma = soma + vl;
            }

            if (oper == 'R') {
                vl = Integer.parseInt(JOptionPane.showInputDialog("Quanto quer Sacar?"));

                soma = soma - vl;
            }
            saldo1 = saldo + soma;
        }
        JOptionPane.showMessageDialog(null, "Seu saldo final é de " + saldo1);
    }
}
		
		
		
	



		
		
		
		



