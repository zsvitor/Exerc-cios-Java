public class Produto {

	private String marca;
	private String modelo;
	private double valor;
	
	public Produto() {}

	public Produto(String marca, String modelo, double valor) {
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getValor() {
		return valor;	
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return "[" + marca + ", " + modelo + ", R$ " + valor + "]";
	}
	
	public void menu() {
		System.out.println("\nMENU DE OPÇÕES");
		System.out.println("1 - Cadastrar Produto");
		System.out.println("2 - Remover Produto");
		System.out.println("3 - Exibir Estoque");
		System.out.println("4 - Exibir Tamanho do Estoque");
		System.out.println("5 - Adicionar Produto em uma Posição Específica");
		System.out.println("6 - Buscar Produto por Posição");
		System.out.println("7 - Buscar Produto por Objeto");
		System.out.println("0 - Finalizar");
		System.out.printf("Opção: ");
	}
	
	public boolean comparar(Produto outro) {
		return this.marca.equals(outro.getMarca()) && this.modelo.equals(outro.getModelo()) && this.valor == outro.getValor();	
	}
	
}