package Q2;

import javax.swing.JOptionPane;

public class Exercicio17 {

	public static void main(String[] args) {

		int nr = 0;
		int inr = 0;
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos números são?"));

		for (int i = 0; i < quantidade; i++) {
			nr = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "º Número: "));
			
		}
		if (nr < nr) {		
			inr = nr;
	
		} else if (nr > nr) {
			inr = nr;
		}


		JOptionPane.showMessageDialog(null, inr);

	}

}
