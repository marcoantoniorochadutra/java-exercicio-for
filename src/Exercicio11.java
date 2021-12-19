package Q2;

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {

		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas são?"));

		String r = "Listagem de nomes e idades. \n\n";
					
		for (int i = 1; i<= quantidade; i ++) {
			String nome = JOptionPane.showInputDialog("Nome");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));			

			

				r = r + nome + " Tem " +  idade + " Anos" + "\n";
		
		
	


		}
		JOptionPane.showMessageDialog(null, r);


	}

	
}