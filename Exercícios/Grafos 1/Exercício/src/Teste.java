import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {

		Grafo<String> grafo = new Grafo<>();

		// Linha Esmeralda
		// Estação
		grafo.adicionarVertice("Vila Natal");
		grafo.adicionarVertice("Grajaú");
		grafo.adicionarVertice("Primavera-Interlagos");
		grafo.adicionarVertice("Autodromo");
		grafo.adicionarVertice("Jurubatuba");
		grafo.adicionarVertice("Socorro");
		grafo.adicionarVertice("Santo Amaro");
		grafo.adicionarVertice("João Dias");
		grafo.adicionarVertice("Granja Julieta");
		grafo.adicionarVertice("Morumbi");
		grafo.adicionarVertice("Berrini");
		grafo.adicionarVertice("Vila Olímpia");
		grafo.adicionarVertice("Cidade Jardim");
		grafo.adicionarVertice("Hebraica-Rebouças");
		grafo.adicionarVertice("Pinheiros");
		grafo.adicionarVertice("Cidade Universitária");
		grafo.adicionarVertice("Villa Lobos-Jaguaré");
		grafo.adicionarVertice("Ceasa");
		grafo.adicionarVertice("Presidente Altino");
		grafo.adicionarVertice("Osasco");

		// Tempo gasto / Origem / Destino
		grafo.adicionarAresta(2.5, "Vila Natal", "Grajaú");
		grafo.adicionarAresta(2.5, "Grajaú", "Vila Natal");

		grafo.adicionarAresta(3.0, "Grajaú", "Primavera-Interlagos");
		grafo.adicionarAresta(3.0, "Primavera-Interlagos", "Grajaú");

		grafo.adicionarAresta(3.0, "Primavera-Interlagos", "Autodromo");
		grafo.adicionarAresta(3.0, "Autodromo", "Primavera-Interlagos");

		grafo.adicionarAresta(2.5, "Autodromo", "Jurubatuba");
		grafo.adicionarAresta(2.5, "Jurubatuba", "Autodromo");

		grafo.adicionarAresta(2.0, "Jurubatuba", "Socorro");
		grafo.adicionarAresta(2.0, "Socorro", "Jurubatuba");

		grafo.adicionarAresta(2.0, "Socorro", "Santo Amaro");
		grafo.adicionarAresta(2.0, "Santo Amaro", "Socorro");

		grafo.adicionarAresta(2.0, "Santo Amaro", "João Dias");
		grafo.adicionarAresta(2.0, "João Dias", "Santo Amaro");

		grafo.adicionarAresta(2.5, "João Dias", "Granja Julieta");
		grafo.adicionarAresta(2.5, "Granja Julieta", "João Dias");

		grafo.adicionarAresta(2.0, "Granja Julieta", "Morumbi");
		grafo.adicionarAresta(2.0, "Morumbi", "Granja Julieta");

		grafo.adicionarAresta(1.5, "Morumbi", "Berrini");
		grafo.adicionarAresta(1.5, "Berrini", "Morumbi");

		grafo.adicionarAresta(2.0, "Berrini", "Vila Olímpia");
		grafo.adicionarAresta(2.0, "Vila Olímpia", "Berrini");

		grafo.adicionarAresta(2.0, "Vila Olímpia", "Cidade Jardim");
		grafo.adicionarAresta(2.0, "Cidade Jardim", "Vila Olímpia");

		grafo.adicionarAresta(1.5, "Cidade Jardim", "Hebraica-Rebouças");
		grafo.adicionarAresta(1.5, "Hebraica-Rebouças", "Cidade Jardim");

		grafo.adicionarAresta(2.0, "Hebraica-Rebouças", "Pinheiros");
		grafo.adicionarAresta(2.0, "Pinheiros", "Hebraica-Rebouças");

		grafo.adicionarAresta(2.5, "Pinheiros", "Cidade Universitária");
		grafo.adicionarAresta(2.5, "Cidade Universitária", "Pinheiros");

		grafo.adicionarAresta(2.0, "Cidade Universitária", "Villa Lobos-Jaguaré");
		grafo.adicionarAresta(2.0, "Villa Lobos-Jaguaré", "Cidade Universitária");

		grafo.adicionarAresta(3.0, "Villa Lobos-Jaguaré", "Ceasa");
		grafo.adicionarAresta(3.0, "Ceasa", "Villa Lobos-Jaguaré");

		grafo.adicionarAresta(2.5, "Ceasa", "Presidente Altino");
		grafo.adicionarAresta(2.5, "Presidente Altino", "Ceasa");

		grafo.adicionarAresta(1.5, "Presidente Altino", "Osasco");
		grafo.adicionarAresta(1.5, "Osasco", "Presidente Altino");

		// Linha Diamante
		// Estação
		grafo.adicionarVertice("Júlio Prestes");
		grafo.adicionarVertice("Palmeiras-Barra Funda");
		grafo.adicionarVertice("Lapa");
		grafo.adicionarVertice("Domingos de Moraes");
		grafo.adicionarVertice("Imperatriz Leopoldina");
		grafo.adicionarVertice("Comandante Sampaio");
		grafo.adicionarVertice("Quitaúna");
		grafo.adicionarVertice("General Miguel Costa");
		grafo.adicionarVertice("Carapicuíba");
		grafo.adicionarVertice("Santa Terezinha");
		grafo.adicionarVertice("Antonio João");
		grafo.adicionarVertice("Barueri");
		grafo.adicionarVertice("Jardim Belval");
		grafo.adicionarVertice("Jardim Silveira");
		grafo.adicionarVertice("Jandira");
		grafo.adicionarVertice("Sagrado Coração");
		grafo.adicionarVertice("Engenheiro Cardoso");
		grafo.adicionarVertice("Itapevi");
		grafo.adicionarVertice("Santa Rita");
		grafo.adicionarVertice("Amador Bueno");

		// Tempo gasto / Origem / Destino
		grafo.adicionarAresta(4.0, "Júlio Prestes", "Palmeiras-Barra Funda");
		grafo.adicionarAresta(4.0, "Palmeiras-Barra Funda", "Júlio Prestes");

		grafo.adicionarAresta(3.0, "Palmeiras-Barra Funda", "Lapa");
		grafo.adicionarAresta(3.0, "Lapa", "Palmeiras-Barra Funda");

		grafo.adicionarAresta(2.5, "Lapa", "Domingos de Moraes");
		grafo.adicionarAresta(2.5, "Domingos de Moraes", "Lapa");

		grafo.adicionarAresta(2.0, "Domingos de Moraes", "Imperatriz Leopoldina");
		grafo.adicionarAresta(2.0, "Imperatriz Leopoldina", "Domingos de Moraes");

		grafo.adicionarAresta(2.0, "Imperatriz Leopoldina", "Presidente Altino");
		grafo.adicionarAresta(2.0, "Presidente Altino", "Imperatriz Leopoldina");

		grafo.adicionarAresta(1.0, "Presidente Altino", "Osasco");
		grafo.adicionarAresta(1.0, "Osasco", "Presidente Altino");

		grafo.adicionarAresta(3.5, "Osasco", "Comandante Sampaio");
		grafo.adicionarAresta(3.5, "Comandante Sampaio", "Osasco");

		grafo.adicionarAresta(3.0, "Comandante Sampaio", "Quitaúna");
		grafo.adicionarAresta(3.0, "Quitaúna", "Comandante Sampaio");

		grafo.adicionarAresta(3.0, "Quitaúna", "General Miguel Costa");
		grafo.adicionarAresta(3.0, "General Miguel Costa", "Quitaúna");

		grafo.adicionarAresta(2.5, "General Miguel Costa", "Carapicuíba");
		grafo.adicionarAresta(2.5, "Carapicuíba", "General Miguel Costa");

		grafo.adicionarAresta(2.5, "Carapicuíba", "Santa Terezinha");
		grafo.adicionarAresta(2.5, "Santa Terezinha", "Carapicuíba");

		grafo.adicionarAresta(3.5, "Santa Terezinha", "Antonio João");
		grafo.adicionarAresta(3.5, "Antonio João", "Santa Terezinha");

		grafo.adicionarAresta(2.0, "Antonio João", "Barueri");
		grafo.adicionarAresta(2.0, "Barueri", "Antonio João");

		grafo.adicionarAresta(3.0, "Barueri", "Jardim Belval");
		grafo.adicionarAresta(3.0, "Jardim Belval", "Barueri");

		grafo.adicionarAresta(2.5, "Jardim Belval", "Jardim Silveira");
		grafo.adicionarAresta(2.5, "Jardim Silveira", "Jardim Belval");

		grafo.adicionarAresta(3.0, "Jardim Silveira", "Jandira");
		grafo.adicionarAresta(3.0, "Jandira", "Jardim Silveira");

		grafo.adicionarAresta(2.0, "Jandira", "Sagrado Coração");
		grafo.adicionarAresta(2.0, "Sagrado Coração", "Jandira");

		grafo.adicionarAresta(3.0, "Sagrado Coração", "Engenheiro Cardoso");
		grafo.adicionarAresta(3.0, "Engenheiro Cardoso", "Sagrado Coração");

		grafo.adicionarAresta(3.5, "Engenheiro Cardoso", "Itapevi");
		grafo.adicionarAresta(3.5, "Itapevi", "Engenheiro Cardoso");

		grafo.adicionarAresta(4.0, "Itapevi", "Santa Rita");
		grafo.adicionarAresta(4.0, "Santa Rita", "Itapevi");

		grafo.adicionarAresta(3.5, "Santa Rita", "Amador Bueno");
		grafo.adicionarAresta(3.5, "Amador Bueno", "Santa Rita");

		// Linha Lilás
		// Estação
		grafo.adicionarVertice("Capão Redondo");
		grafo.adicionarVertice("Campo Limpo");
		grafo.adicionarVertice("Vila das Belezas");
		grafo.adicionarVertice("Giovanni Gronchi");
		grafo.adicionarVertice("Largo Treze");
		grafo.adicionarVertice("Adolfo Pinheiro");
		grafo.adicionarVertice("Alto da Boa Vista");
		grafo.adicionarVertice("Borba Gato");
		grafo.adicionarVertice("Brooklin");
		grafo.adicionarVertice("Campo Belo");
		grafo.adicionarVertice("Eucaliptos");
		grafo.adicionarVertice("Moema");
		grafo.adicionarVertice("AACD-Servidor");
		grafo.adicionarVertice("Hospital São Paulo");
		grafo.adicionarVertice("Santa Cruz");
		grafo.adicionarVertice("Chácara Klabin");

		// Tempo gasto / Origem / Destino
		grafo.adicionarAresta(3.0, "Capão Redondo", "Campo Limpo");
		grafo.adicionarAresta(3.0, "Campo Limpo", "Capão Redondo");

		grafo.adicionarAresta(2.5, "Campo Limpo", "Vila das Belezas");
		grafo.adicionarAresta(2.5, "Vila das Belezas", "Campo Limpo");

		grafo.adicionarAresta(3.0, "Vila das Belezas", "Giovanni Gronchi");
		grafo.adicionarAresta(3.0, "Giovanni Gronchi", "Vila das Belezas");

		grafo.adicionarAresta(3.0, "Giovanni Gronchi", "Santo Amaro");
		grafo.adicionarAresta(3.0, "Santo Amaro", "Giovanni Gronchi");

		grafo.adicionarAresta(2.5, "Santo Amaro", "Largo Treze");
		grafo.adicionarAresta(2.5, "Largo Treze", "Santo Amaro");

		grafo.adicionarAresta(3.0, "Largo Treze", "Adolfo Pinheiro");
		grafo.adicionarAresta(3.0, "Adolfo Pinheiro", "Largo Treze");

		grafo.adicionarAresta(2.5, "Adolfo Pinheiro", "Alto da Boa Vista");
		grafo.adicionarAresta(2.5, "Alto da Boa Vista", "Adolfo Pinheiro");

		grafo.adicionarAresta(2.5, "Alto da Boa Vista", "Borba Gato");
		grafo.adicionarAresta(2.5, "Borba Gato", "Alto da Boa Vista");

		grafo.adicionarAresta(2.5, "Borba Gato", "Brooklin");
		grafo.adicionarAresta(2.5, "Brooklin", "Borba Gato");

		grafo.adicionarAresta(2.0, "Brooklin", "Campo Belo");
		grafo.adicionarAresta(2.0, "Campo Belo", "Brooklin");

		grafo.adicionarAresta(2.0, "Campo Belo", "Eucaliptos");
		grafo.adicionarAresta(2.0, "Eucaliptos", "Campo Belo");

		grafo.adicionarAresta(2.0, "Eucaliptos", "Moema");
		grafo.adicionarAresta(2.0, "Moema", "Eucaliptos");

		grafo.adicionarAresta(2.0, "Moema", "AACD-Servidor");
		grafo.adicionarAresta(2.0, "AACD-Servidor", "Moema");

		grafo.adicionarAresta(2.0, "AACD-Servidor", "Hospital São Paulo");
		grafo.adicionarAresta(2.0, "Hospital São Paulo", "AACD-Servidor");

		grafo.adicionarAresta(2.5, "Hospital São Paulo", "Santa Cruz");
		grafo.adicionarAresta(2.5, "Santa Cruz", "Hospital São Paulo");

		grafo.adicionarAresta(2.0, "Santa Cruz", "Chácara Klabin");
		grafo.adicionarAresta(2.0, "Chácara Klabin", "Santa Cruz");

		// Linha Azul
		// Estação
		grafo.adicionarVertice("Jabaquara");
		grafo.adicionarVertice("Conceição");
		grafo.adicionarVertice("São Judas");
		grafo.adicionarVertice("Saúde");
		grafo.adicionarVertice("Praça da Árvore");
		grafo.adicionarVertice("Vila Mariana");
		grafo.adicionarVertice("Ana Rosa");
		grafo.adicionarVertice("Paraíso");
		grafo.adicionarVertice("Vergueiro");
		grafo.adicionarVertice("São Joaquim");
		grafo.adicionarVertice("Japão-Liberdade");
		grafo.adicionarVertice("Sé");
		grafo.adicionarVertice("São Bento");
		grafo.adicionarVertice("Luz");
		grafo.adicionarVertice("Tiradentes");
		grafo.adicionarVertice("Armênia");
		grafo.adicionarVertice("Portuguesa-Tietê");
		grafo.adicionarVertice("Carandiru");
		grafo.adicionarVertice("Santana");
		grafo.adicionarVertice("Jardim São Paulo-Ayrton Senna");
		grafo.adicionarVertice("Parada Inglesa");
		grafo.adicionarVertice("Tucuruvi");

		// Tempo gasto / Origem / Destino
		grafo.adicionarAresta(2.5, "Jabaquara", "Conceição");
		grafo.adicionarAresta(2.5, "Conceição", "Jabaquara");

		grafo.adicionarAresta(2.0, "Conceição", "São Judas");
		grafo.adicionarAresta(2.0, "São Judas", "Conceição");

		grafo.adicionarAresta(2.5, "São Judas", "Saúde");
		grafo.adicionarAresta(2.5, "Saúde", "São Judas");

		grafo.adicionarAresta(2.0, "Saúde", "Praça da Árvore");
		grafo.adicionarAresta(2.0, "Praça da Árvore", "Saúde");

		grafo.adicionarAresta(2.0, "Praça da Árvore", "Santa Cruz");
		grafo.adicionarAresta(2.0, "Santa Cruz", "Praça da Árvore");

		grafo.adicionarAresta(2.0, "Santa Cruz", "Vila Mariana");
		grafo.adicionarAresta(2.0, "Vila Mariana", "Santa Cruz");

		grafo.adicionarAresta(2.0, "Vila Mariana", "Ana Rosa");
		grafo.adicionarAresta(2.0, "Ana Rosa", "Vila Mariana");

		grafo.adicionarAresta(2.5, "Ana Rosa", "Paraíso");
		grafo.adicionarAresta(2.5, "Paraíso", "Ana Rosa");

		grafo.adicionarAresta(2.0, "Paraíso", "Vergueiro");
		grafo.adicionarAresta(2.0, "Vergueiro", "Paraíso");

		grafo.adicionarAresta(2.0, "Vergueiro", "São Joaquim");
		grafo.adicionarAresta(2.0, "São Joaquim", "Vergueiro");

		grafo.adicionarAresta(2.5, "São Joaquim", "Japão-Liberdade");
		grafo.adicionarAresta(2.5, "Japão-Liberdade", "São Joaquim");

		grafo.adicionarAresta(2.5, "Japão-Liberdade", "Sé");
		grafo.adicionarAresta(2.5, "Sé", "Japão-Liberdade");

		grafo.adicionarAresta(2.5, "Sé", "São Bento");
		grafo.adicionarAresta(2.5, "São Bento", "Sé");

		grafo.adicionarAresta(2.5, "São Bento", "Luz");
		grafo.adicionarAresta(2.5, "Luz", "São Bento");

		grafo.adicionarAresta(2.5, "Luz", "Tiradentes");
		grafo.adicionarAresta(2.5, "Tiradentes", "Luz");

		grafo.adicionarAresta(2.0, "Tiradentes", "Armênia");
		grafo.adicionarAresta(2.0, "Armênia", "Tiradentes");

		grafo.adicionarAresta(2.5, "Armênia", "Portuguesa-Tietê");
		grafo.adicionarAresta(2.5, "Portuguesa-Tietê", "Armênia");

		grafo.adicionarAresta(2.0, "Portuguesa-Tietê", "Carandiru");
		grafo.adicionarAresta(2.0, "Carandiru", "Portuguesa-Tietê");

		grafo.adicionarAresta(2.5, "Carandiru", "Santana");
		grafo.adicionarAresta(2.5, "Santana", "Carandiru");

		grafo.adicionarAresta(2.5, "Santana", "Jardim São Paulo-Ayrton Senna");
		grafo.adicionarAresta(2.5, "Jardim São Paulo-Ayrton Senna", "Santana");

		grafo.adicionarAresta(2.5, "Jardim São Paulo-Ayrton Senna", "Parada Inglesa");
		grafo.adicionarAresta(2.5, "Parada Inglesa", "Jardim São Paulo-Ayrton Senna");

		grafo.adicionarAresta(2.5, "Parada Inglesa", "Tucuruvi");
		grafo.adicionarAresta(2.5, "Tucuruvi", "Parada Inglesa");

		// Linha Amarela
		// Estação
		grafo.adicionarVertice("Vila Sônia");
		grafo.adicionarVertice("São Paulo-Morumbi");
		grafo.adicionarVertice("Butantã");
		grafo.adicionarVertice("Faria Lima");
		grafo.adicionarVertice("Fradique Coutinho");
		grafo.adicionarVertice("Oscar Freire");
		grafo.adicionarVertice("Paulista");
		grafo.adicionarVertice("Higienópolis-Mackenzie");
		grafo.adicionarVertice("República");
		grafo.adicionarVertice("Luz");

		// Tempo gasto / Origem / Destino
		grafo.adicionarAresta(1.5, "Luz", "República");
		grafo.adicionarAresta(1.5, "República", "Luz");

		grafo.adicionarAresta(1.0, "República", "Higienópolis-Mackenzie");
		grafo.adicionarAresta(1.0, "Higienópolis-Mackenzie", "República");

		grafo.adicionarAresta(1.0, "Higienópolis-Mackenzie", "Paulista");
		grafo.adicionarAresta(1.0, "Paulista", "Higienópolis-Mackenzie");

		grafo.adicionarAresta(2.0, "Oscar Freire", "Paulista");
		grafo.adicionarAresta(2.0, "Paulista", "Oscar Freire");

		grafo.adicionarAresta(2.5, "Oscar Freire", "Fradique Coutinho");
		grafo.adicionarAresta(2.5, "Fradique Coutinho", "Oscar Freire");

		grafo.adicionarAresta(1.0, "Fradique Coutinho", "Faria Lima");
		grafo.adicionarAresta(1.0, "Faria Lima", "Fradique Coutinho");

		grafo.adicionarAresta(1.0, "Faria Lima", "Pinheiros");
		grafo.adicionarAresta(1.0, "Pinheiros", "Faria Lima");

		grafo.adicionarAresta(2.0, "Pinheiros", "Butantã");
		grafo.adicionarAresta(2.0, "Butantã", "Pinheiros");

		grafo.adicionarAresta(1.5, "Butantã", "São Paulo-Morumbi");
		grafo.adicionarAresta(1.5, "Butantã", "São Paulo-Morumbi");

		grafo.adicionarAresta(2.0, "São Paulo-Morumbi", "Vila Sônia");
		grafo.adicionarAresta(2.0, "Vila Sônia", "São Paulo-Morumbi");

		// Linha Verde
		// Estação
		grafo.adicionarVertice("Vila Madalena");
		grafo.adicionarVertice("Sumaré");
		grafo.adicionarVertice("Clínicas");
		grafo.adicionarVertice("Consolação");
		grafo.adicionarVertice("Trianon-Masp");
		grafo.adicionarVertice("Brigadeiro");
		grafo.adicionarVertice("Santos-Imigrantes");
		grafo.adicionarVertice("Alto do Ipiranga");
		grafo.adicionarVertice("Sacomã");
		grafo.adicionarVertice("Tamanduateí");
		grafo.adicionarVertice("Vila Prudente");

		// Tempo gasto / Origem / Destino
		grafo.adicionarAresta(2.0, "Vila Madalena", "Sumaré");
		grafo.adicionarAresta(2.0, "Sumaré", "Vila Madalena");

		grafo.adicionarAresta(2.0, "Sumaré", "Clínicas");
		grafo.adicionarAresta(2.0, "Clínicas", "Sumaré");

		grafo.adicionarAresta(1.0, "Clínicas", "Paulista");
		grafo.adicionarAresta(1.0, "Paulista", "Clínicas");

		grafo.adicionarAresta(1.5, "Paulista", "Consolação");
		grafo.adicionarAresta(1.5, "Consolação", "Paulista");

		grafo.adicionarAresta(1.0, "Consolação", "Trianon-Masp");
		grafo.adicionarAresta(1.0, "Trianon-Masp", "Consolação");

		grafo.adicionarAresta(1.0, "Trianon-Masp", "Brigadeiro");
		grafo.adicionarAresta(1.0, "Brigadeiro", "Trianon-Masp");

		grafo.adicionarAresta(1.0, "Brigadeiro", "Paraíso");
		grafo.adicionarAresta(1.0, "Paraíso", "Brigadeiro");

		grafo.adicionarAresta(1.0, "Paraíso", "Ana Rosa");
		grafo.adicionarAresta(1.0, "Ana Rosa", "Paraíso");

		grafo.adicionarAresta(1.0, "Ana Rosa", "Chácara Klabin");
		grafo.adicionarAresta(1.0, "Chácara Klabin", "Ana Rosa");

		grafo.adicionarAresta(2.0, "Chácara Klabin", "Santos-Imigrantes");
		grafo.adicionarAresta(2.0, "Santos-Imigrantes", "Chácara Klabin");

		grafo.adicionarAresta(2.0, "Santos-Imigrantes", "Alto do Ipiranga");
		grafo.adicionarAresta(2.0, "Alto do Ipiranga", "Santos-Imigrantes");

		grafo.adicionarAresta(2.0, "Alto do Ipiranga", "Sacomã");
		grafo.adicionarAresta(2.0, "Sacomã", "Alto do Ipiranga");

		grafo.adicionarAresta(1.5, "Sacomã", "Tamanduateí");
		grafo.adicionarAresta(1.5, "Tamanduateí", "Sacomã");

		grafo.adicionarAresta(1.0, "Tamanduateí", "Vila Prudente");
		grafo.adicionarAresta(1.0, "Vila Prudente", "Tamanduateí");

		do {
			String partida = JOptionPane.showInputDialog("Informe a Estação de PARTIDA:");
			String destino = JOptionPane.showInputDialog("Informe a Estação de DESTINO:");
			grafo.menorCaminhoDijkstra(partida, destino);
		} while (JOptionPane.showConfirmDialog(null, "Deseja ver outro caminho?") == 0);

		JOptionPane.showMessageDialog(null, "Programa Finalizado.");
		System.exit(0);

	}
}