import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class App {

	public static void main(String[] args) throws Exception {
		
		// Fazer uma conex�o HTTP e buscar os top 250 filmes
		
		//String url = "https://imdb-api.com/en/API/Top250Movies/k_conbdb2v";
		//ExtratorDeConteudo extrator = new ExtratorDeConteudoDoIMDB();
		
		// String url = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2022-07-01&end_date=2022-07-20";
		// ExtratorDeConteudo extrator = new ExtratorDeConteudoDaNasa();
		
		String url = "http://localhost:8080/linguagens";
		ExtratorDeConteudo extrator = new ExtratorDeConteudoDoIMDB();
		
		var http = new ClienteHttp();
		String json = http.buscaDados(url);
		
		// Exibir e manipular os dados
		
		List<Conteudo> conteudos = extrator.extraiConteudos(json);
		
		GeradoraDeFigurinhas geradora = new GeradoraDeFigurinhas();
		
		for (int i = 0; i < 10; i++) {
			
			Conteudo conteudo = conteudos.get(i);
			
			InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();
			
			String nomeArquivo = "saida/" + conteudo.getTitulo() + ".png";
			
			geradora.cria(inputStream, nomeArquivo);
			
			System.out.println(conteudo.getTitulo());
			System.out.println();
		}
		
	}

}