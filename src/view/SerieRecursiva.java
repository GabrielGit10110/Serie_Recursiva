package view;

import controller.*;
import javax.swing.JOptionPane;

public class SerieRecursiva {
	public static void main(String[] args) {
		int position = Integer.parseInt(JOptionPane.showInputDialog(
			null, "Digite o termo da série a ser buscado: "));

		double sum = SerieRecursivaController.recursiveSeries(position);

		JOptionPane.showMessageDialog(null, sum);
	}
}
