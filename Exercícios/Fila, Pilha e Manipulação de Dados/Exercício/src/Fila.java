public class Fila<T> {
	
	private T[] elementos;
	private int tamanho;
	
	public Fila() {
		this(10);
	}
	
	public Fila(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public void enfileira(T elemento) {
		this.aumentaCapacidade();
		this.elementos[this.tamanho] = elemento;
		this.tamanho++;
	}
	
	public T desenfileira() {
		if(this.estaVazia()) {
			return null;
		}
		T elementoRemover = this.elementos[0];
		for(int i = 0; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
		return elementoRemover;
	}
	
	public void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] novaFila = (T[]) new Object[this.elementos.length * 2];
			for(int i = 0; i < this.tamanho; i++) {
				novaFila[i] = this.elementos[i];
			}
			this.elementos = novaFila;
		}
	}
	
	public T espiar() {
		if(this.estaVazia()) {
			return null;
		}
		return this.elementos[0];
	}
	
	public boolean estaVazia() {
		return this.tamanho == 0;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		for(int i = 0; i < this.tamanho; i++) {
			s.append(this.elementos[i]); 
			if(i < this.tamanho - 1) {
				s.append(", ");
			}
		}
		return s.toString();
	}
	
}