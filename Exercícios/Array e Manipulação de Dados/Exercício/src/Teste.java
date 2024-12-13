import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);	
		Produto p = new Produto() {};
		Vetor estoque = new Vetor(5);	
		int op;
		
		do {
			
			p.menu();
			op = ler.nextInt();
			
			if(op < 0 || op > 7) {
				System.err.println("\nOpção Inválida!");
				continue;
			}
			if(op == 1) {
				ler.nextLine();
				System.out.printf("\nMarca: ");
				String marca = ler.nextLine();
				System.out.printf("Modelo: ");
				String modelo = ler.nextLine();
				System.out.printf("Valor: ");
				double valor = ler.nextDouble();
				Produto produto = new Produto(marca, modelo, valor);
				try {
					estoque.adiciona(produto);
					System.out.println("Produto Adicionado com Sucesso!");
				} catch (Exception e){
					System.err.println("Erro: " + e.getMessage());
				}
			}
			else if(op == 2) {
				System.out.printf("\nInforme a Posição: ");
				int posicao = ler.nextInt();
				try {
					estoque.remove(posicao);
					System.out.println("Produto Removido com Sucesso!");
				} catch(Exception e) {
					System.err.println("Erro: " + e.getMessage());
				}
			}
			else if(op == 3) {
				System.out.println("\nEstoque: " + estoque);
			}
			else if(op == 4) {
				System.out.println("\nTamanho do Estoque: " + estoque.tamanho() + " produto(s)");
			}
			else if(op == 5) {
				System.out.printf("\nInforme a Posição: ");
				int posicao = ler.nextInt();
				ler.nextLine();
				System.out.printf("Marca: ");
				String marca = ler.nextLine();
				System.out.printf("Modelo: ");
				String modelo = ler.nextLine();
				System.out.printf("Valor: ");
				double valor = ler.nextDouble();
				Produto produto = new Produto(marca, modelo, valor);
				try {
					estoque.adicionaInicio(posicao, produto);
					System.out.println("Produto Adicionado com Sucesso!");
				} catch (Exception e){
					System.err.println("Erro: " + e.getMessage());
				}
			}
			else if(op == 6) {
				System.out.printf("\nInforme a Posição: ");
				int posicao = ler.nextInt();
				try {
					Produto prod = (Produto) estoque.busca(posicao);
					System.out.println("Produto na Posição " + posicao + ": " + prod);
				} catch(Exception e) {
					System.err.println("Erro: " + e.getMessage());
				}
			}
			else if(op == 7) {
				ler.nextLine();		
				System.out.printf("\nMarca: ");
				String marca = ler.nextLine();
				System.out.printf("Modelo: ");
				String modelo = ler.nextLine();
				System.out.printf("Valor: ");
				double valor = ler.nextDouble();
				Produto produto = new Produto(marca, modelo, valor);
				int posicao = estoque.busca(produto);
				if(posicao >= 0) {
					System.out.println	("Produto encontrado na Posição: " + posicao);
				}
				else {
					System.err.println("Produto Não Encontrado.");
				}
			}
			else if(op == 0) {
				System.err.println("\nPrograma Finalizado!");
			}
			
		}while(op != 0);
	}
	
}