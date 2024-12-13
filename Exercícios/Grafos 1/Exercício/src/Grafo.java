import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Grafo<T> {

	private ArrayList<Vertice<T>> vertices;
	private ArrayList<Aresta<T>> arestas;

	public Grafo() {
		this.vertices = new ArrayList<>();
		this.arestas = new ArrayList<>();
	}

	// Método para Adicionar um Vértice
	public void adicionarVertice(T dado) {
		Vertice<T> novoVertice = new Vertice<>(dado);
		vertices.add(novoVertice);
	}

	// Método para Adicionar uma Aresta com Peso entre dois Vértices
	public void adicionarAresta(Double peso, T dadoInicio, T dadoFim) {
		Vertice<T> inicio = getVertice(dadoInicio);
		Vertice<T> fim = getVertice(dadoFim);

		if (inicio != null && fim != null) {
			Aresta<T> aresta = new Aresta<>(peso, inicio, fim);
			inicio.adicionarArestaSaida(aresta);
			fim.adicionarArestaEntrada(aresta);
			arestas.add(aresta);
		}
	}

	// Método para Obter um Vértice pelo Dado
	public Vertice<T> getVertice(T dado) {
		for (Vertice<T> vertice : vertices) {
			if (vertice.getDado().equals(dado)) {
				return vertice;
			}
		}
		return null;
	}

	// Método para Buscar o Menor Caminho (Algoritmo de Dijkstra)
	public void menorCaminhoDijkstra(T inicio, T fim) {
		Vertice<T> verticeInicio = getVertice(inicio);
		Vertice<T> verticeFim = getVertice(fim);

		if (verticeInicio == null || verticeFim == null) {
			System.err.println("\nVértice de Início ou Fim não encontrado.");
			System.out.println("[" + inicio + " - " + fim + "]\n");
			return;
		}

		Map<Vertice<T>, Double> distancias = new HashMap<>();
		Map<Vertice<T>, Vertice<T>> antecessores = new HashMap<>();

		for (Vertice<T> v : vertices) {
			distancias.put(v, Double.MAX_VALUE);
		}
		distancias.put(verticeInicio, 0.0);

		PriorityQueue<Vertice<T>> fila = new PriorityQueue<>((a, b) -> distancias.get(a).compareTo(distancias.get(b)));
		fila.add(verticeInicio);

		while (!fila.isEmpty()) {
			Vertice<T> atual = fila.poll();
			if (atual.equals(verticeFim)) {
				break;
			}
			for (Aresta<T> aresta : atual.getArestasSaida()) {
				Vertice<T> adjacente = aresta.getFim();
				double novaDistancia = distancias.get(atual) + aresta.getPeso();
				if (novaDistancia < distancias.get(adjacente)) {
					distancias.put(adjacente, novaDistancia);
					antecessores.put(adjacente, atual);
					fila.add(adjacente);
				}
			}
		}

		if (distancias.get(verticeFim) == Double.MAX_VALUE) {
			System.err.println("\nNão existe caminho entre " + inicio + " e " + fim + "\n");
		} else {
			System.out.println("=====================================================================");
			System.out.println("MENOR CAMINHO [Estação " + inicio + " -> Estação " + fim + "]:\n");
			Vertice<T> passo = verticeFim;
			StringBuilder caminho = new StringBuilder();
			String verde = "\u001B[32m";
			String reset = "\u001B[0m";
			while (passo != null) {
				caminho.insert(0, verde + "-> " + reset + passo.getDado() + "\n");
				passo = antecessores.get(passo);
			}
			System.out.println(caminho);
			System.out.println("DISTÂNCIA TOTAL: " + distancias.get(verticeFim) + " minutos.");
			System.out.println("=====================================================================");
		}
	}
}