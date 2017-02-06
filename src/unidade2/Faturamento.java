package unidade2;

import javax.swing.JOptionPane;

public class Faturamento {

	public static void main(String[] args) {
		double vendas_janeiro;// = 15_000;
		double vendas_fevereiro;// = 23_000;
		double vendas_marco;// = 17_000;
		
		vendas_janeiro = Double.parseDouble(JOptionPane.showInputDialog("Favor informar as vendas de janeiro"));
		vendas_fevereiro = Double.parseDouble(JOptionPane.showInputDialog("Favor informar as vendas de fevereiro"));
		vendas_marco = Double.parseDouble(JOptionPane.showInputDialog("Favor informar as vendas de março"));
		
		double faturamento_trimestral = vendas_fevereiro + vendas_janeiro + vendas_marco;
		
		JOptionPane.showMessageDialog(null, "Resultado do Faturamento Trimestral:" + faturamento_trimestral);
	}

}
