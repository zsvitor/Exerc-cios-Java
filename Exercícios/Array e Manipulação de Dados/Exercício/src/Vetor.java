public class Vetor {

	private Produto[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new Produto[capacidade];
		this.tamanho = 0;
	}
	
	public void adiciona(Produto elemento) throws Exception {
		aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}
		
		s.append("]");
		return s.toString();
	}
	
	public Object busca(int posicao) throws Exception {
		if(posicao >= 0 && posicao < tamanho) {
			return elementos[posicao];
		}
		else {
			throw new Exception("Posição Inválida");
		}
	}
	
	public int busca(Produto elemento) {
		for(int i = 0; i < tamanho; i++) {
			if(this.elementos[i].comparar(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean adicionaInicio(int posicao, Produto elemento) throws Exception {
		if(posicao >= 0 && posicao < tamanho) {
			for(int i = this.tamanho - 1; i >= posicao; i--) {
				this.elementos[i + 1] = this.elementos[i];
			}
			this.elementos[posicao] = elemento;
			this.tamanho++;
		}
		else {
			throw new Exception("Posição Inválida");
		}
		return true;
	}
	
	public void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			Produto[] elementosNovos = new Produto[this.elementos.length * 2];
			for(int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public void remove(int posicao) throws Exception {
		if(posicao >= 0 && posicao < tamanho) {
			for(int i = posicao; i < this.tamanho - 1; i++) {
					this.elementos[i] = this.elementos[i + 1];
			}
			this.tamanho--;
		}
		else {
			throw new Exception("Posição Inválida");
		}
	}
	
}