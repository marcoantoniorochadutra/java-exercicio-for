package Q2;

import javax.swing.JOptionPane;

public class Exercicio15 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Verificação do status de alunos.");

		int qt = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos são?"));

		for (int i2 = 0; i2 < qt; i2++) {
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
	

			double soma = 0;
			double media = 0;
			

			for (int i = 0; i < 3; i++) { 
	
				int nr = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + " º nota: "));
				soma = soma + nr;
				media = soma / 3;
			}

				if (media >= 7.0) {
					JOptionPane.showMessageDialog(null, "O aluno " + nome +  " foi aprovado");

				} else {

					if (media >= 2.0 && media < 7) {
						JOptionPane.showMessageDialog(null, "O aluno " + nome +  " ficou em recuperação");

					} else {
						if (media < 2.0) {
							JOptionPane.showMessageDialog(null, "O aluno " + nome + " foi reprovado");
							
						}

					}

				}
				
			}

		

		}

	}

