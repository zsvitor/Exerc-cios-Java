import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Grafo {

	private Map<String, List<Aresta>> listaAdjacencia;

	public Grafo() {
		listaAdjacencia = new HashMap<>();
	}

	// Método para adicionar uma aresta entre dois vértices
	public void adicionarAresta(String origem, String destino, int peso) {
		if (!listaAdjacencia.containsKey(origem)) {
			listaAdjacencia.put(origem, new ArrayList<>());
		}
		if (!listaAdjacencia.containsKey(destino)) {
			listaAdjacencia.put(destino, new ArrayList<>());
		}
		listaAdjacencia.get(origem).add(new Aresta(destino, peso));
		listaAdjacencia.get(destino).add(new Aresta(origem, peso));
	}

	// Método para remover a aresta entre dois vértices
	private void removerAresta(String origem, String destino) {
		listaAdjacencia.get(origem).removeIf(aresta -> aresta.destino.equals(destino));
		listaAdjacencia.get(destino).removeIf(aresta -> aresta.destino.equals(origem));
	}

	// Método para obter o peso da aresta entre dois vértices
	private int obterPeso(String origem, String destino) {
		for (Aresta aresta : listaAdjacencia.get(origem)) {
			if (aresta.destino.equals(destino)) {
				return aresta.peso;
			}
		}
		return Integer.MAX_VALUE;
	}

	// Método para calcular a distância total de um caminho
	public int calcularDistancia(List<String> caminho) {
		int distanciaTotal = 0;
		for (int i = 0; i < caminho.size() - 1; i++) {
			String atual = caminho.get(i);
			String proximo = caminho.get(i + 1);
			for (Aresta aresta : listaAdjacencia.get(atual)) {
				if (aresta.destino.equals(proximo)) {
					distanciaTotal += aresta.peso;
					break;
				}
			}
		}
		return distanciaTotal;
	}

	// Método para encontrar o caminho mínimo (Algoritmo de Dijkstra)
	public List<String> caminhoMinimo(String partida, String chegada) {
		Map<String, Integer> distancias = new HashMap<>();
		Map<String, String> anteriores = new HashMap<>();
		PriorityQueue<Aresta> fila = new PriorityQueue<>(Comparator.comparingInt(a -> a.peso));
		for (String vertice : listaAdjacencia.keySet()) {
			distancias.put(vertice, Integer.MAX_VALUE);
		}
		distancias.put(partida, 0);
		fila.add(new Aresta(partida, 0));
		while (!fila.isEmpty()) {
			Aresta aresta = fila.poll();
			String verticeAtual = aresta.destino;
			for (Aresta vizinho : listaAdjacencia.get(verticeAtual)) {
				int novaDistancia = distancias.get(verticeAtual) + vizinho.peso;
				if (novaDistancia < distancias.get(vizinho.destino)) {
					distancias.put(vizinho.destino, novaDistancia);
					anteriores.put(vizinho.destino, verticeAtual);
					fila.add(new Aresta(vizinho.destino, novaDistancia));
				}
			}
		}
		List<String> caminho = new ArrayList<>();
		for (String vertice = chegada; vertice != null; vertice = anteriores.get(vertice)) {
			caminho.add(vertice);
		}
		Collections.reverse(caminho);
		return caminho;
	}

	// Método para encontrar um caminho alternativo (exclui a primeira aresta de um caminho dado)
	public List<String> caminhoAlternativo(String partida, String chegada, List<String> primeiroCaminho) {
		List<String> caminhoAlternativo = new ArrayList<>();
		if (primeiroCaminho.size() > 1) {
			String origem = primeiroCaminho.get(0);
			String destino = primeiroCaminho.get(1);
			removerAresta(origem, destino);
			caminhoAlternativo = caminhoMinimo(partida, chegada);
			adicionarAresta(origem, destino, obterPeso(origem, destino));
		}
		return caminhoAlternativo;
	}
}
