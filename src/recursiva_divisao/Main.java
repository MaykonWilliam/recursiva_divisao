package recursiva_divisao;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String inputDividendo = JOptionPane.showInputDialog("Digite o dividendo:");
		String inputDivisor = JOptionPane.showInputDialog("Digite o divisor:");

		int dividendo = Integer.parseInt(inputDividendo);
		int divisor = Integer.parseInt(inputDivisor);

		int resto = DivisaoRecursiva.restoDivisao(dividendo, divisor);

		JOptionPane.showMessageDialog(null, "O resto da divisão é: " + resto);
	}

}
