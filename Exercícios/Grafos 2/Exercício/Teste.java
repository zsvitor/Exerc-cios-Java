import java.util.List;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Grafo grafo = new Grafo();

		grafo.adicionarAresta("A", "B", 300);
		grafo.adicionarAresta("B", "A", 300);

		grafo.adicionarAresta("A", "X", 317);
		grafo.adicionarAresta("X", "A", 317);

		grafo.adicionarAresta("A", "V", 370);
		grafo.adicionarAresta("V", "A", 370);

		grafo.adicionarAresta("B", "C", 47);
		grafo.adicionarAresta("C", "B", 47);

		grafo.adicionarAresta("C", "D", 62);
		grafo.adicionarAresta("D", "C", 62);

		grafo.adicionarAresta("C", "H", 141);
		grafo.adicionarAresta("H", "C", 141);

		grafo.adicionarAresta("D", "E", 8);
		grafo.adicionarAresta("E", "D", 8);

		grafo.adicionarAresta("E", "F", 13);
		grafo.adicionarAresta("F", "E", 13);

		grafo.adicionarAresta("E", "G", 230);
		grafo.adicionarAresta("G", "E", 230);

		grafo.adicionarAresta("H", "I", 138);
		grafo.adicionarAresta("I", "H", 138);

		grafo.adicionarAresta("I", "J", 153);
		grafo.adicionarAresta("J", "I", 153);

		grafo.adicionarAresta("J", "K", 512);
		grafo.adicionarAresta("K", "J", 512);

		grafo.adicionarAresta("K", "L", 135);
		grafo.adicionarAresta("L", "K", 135);

		grafo.adicionarAresta("L", "M", 50);
		grafo.adicionarAresta("M", "L", 50);

		grafo.adicionarAresta("L", "N", 167);
		grafo.adicionarAresta("N", "L", 167);

		grafo.adicionarAresta("N", "O", 108);
		grafo.adicionarAresta("O", "N", 108);

		grafo.adicionarAresta("O", "P", 82);
		grafo.adicionarAresta("P", "O", 82);

		grafo.adicionarAresta("P", "Q", 215);
		grafo.adicionarAresta("Q", "P", 215);

		grafo.adicionarAresta("Q", "R", 97);
		grafo.adicionarAresta("R", "Q", 97);

		grafo.adicionarAresta("R", "T", 243);
		grafo.adicionarAresta("T", "R", 243);

		grafo.adicionarAresta("R", "S", 33);
		grafo.adicionarAresta("S", "R", 33);

		grafo.adicionarAresta("S", "T", 207);
		grafo.adicionarAresta("T", "S", 207);

		grafo.adicionarAresta("S", "V", 38);
		grafo.adicionarAresta("V", "S", 38);

		grafo.adicionarAresta("T", "U", 22);
		grafo.adicionarAresta("U", "T", 22);

		grafo.adicionarAresta("V", "U", 210);
		grafo.adicionarAresta("U", "V", 210);

		grafo.adicionarAresta("V", "A", 370);
		grafo.adicionarAresta("A", "V", 370);

		grafo.adicionarAresta("U", "X", 107);
		grafo.adicionarAresta("X", "U", 107);

		grafo.adicionarAresta("X", "A", 317);
		grafo.adicionarAresta("A", "X", 317);

		System.out.printf("Informe o ponto de partida: ");
		String partida = ler.nextLine().toUpperCase();

		System.out.printf("Informe o ponto de chegada: ");
		String chegada = ler.nextLine().toUpperCase();

		List<String> caminho1 = grafo.caminhoMinimo(partida, chegada);
		int distancia1 = grafo.calcularDistancia(caminho1);
		System.out.print("\nCaminho: ");
		for (int i = 0; i < caminho1.size(); i++) {
			System.out.print(caminho1.get(i));
			if (i < caminho1.size() - 1) {
				System.out.print(" - ");
			}
		}
		System.out.println("\nDistância total: " + distancia1 + " metros\n");

		List<String> caminho2 = grafo.caminhoAlternativo(partida, chegada, caminho1);
		int distancia2 = grafo.calcularDistancia(caminho2);
		if (!caminho2.isEmpty() && !caminho2.equals(caminho1) && distancia2 > 0) {
			System.out.print("Caminho Alternativo: ");
			for (int i = 0; i < caminho2.size(); i++) {
				System.out.print(caminho2.get(i));
				if (i < caminho2.size() - 1) {
					System.out.print(" - ");
				}
			}
			System.out.println("\nDistância total: " + distancia2 + " metros\n");
		} else {
			System.out.println("Nenhum caminho alternativo disponível.");
		}

	}
}
