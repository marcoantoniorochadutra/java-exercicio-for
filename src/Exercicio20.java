package Q2;

import javax.swing.JOptionPane;

public class Exercicio20 {
	public static void main(String[] args) {	

	
				
		int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos?"));
		String result = "";
		
		for(int i=0; i<n; i++) {
			
			String nome = JOptionPane.showInputDialog("Nome:");
			int x = Integer.parseInt(JOptionPane.showInputDialog("Qtade de provas de "+nome));
			double soma = 0;
			for(int j = 0; j<x; j++) {
				
				soma = soma + Double.parseDouble(JOptionPane.showInputDialog("Nota da "+(j+1)+"º prova"));
			}
			
			double media = soma / x;
			result = result + nome +" - Média: "+media+"\n";
		}
		JOptionPane.showMessageDialog(null, result);
	}
}