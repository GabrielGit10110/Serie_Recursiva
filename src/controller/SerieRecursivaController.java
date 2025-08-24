package controller;

public class SerieRecursivaController {

	public static double recursiveSeries(int position) {

		if (position < 1) {
			return 0;
		}

		if (position < 0) {
			System.out.println("Valor Inválido");
			return 0;
		} else {
			return 1/(double)position + recursiveSeries(position - 1);
		}

	}
}
