import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoDaNasa implements ExtratorDeConteudo{

	public List<Conteudo> extraiConteudos (String json) {
		
				// Extrair só os dados que interessam (titulo, poster, classificação)
				JsonParser parser = new JsonParser();
				List<Map<String, String>> listaDeAtriutos = parser.parse(json);
				
				List<Conteudo> conteudos = new ArrayList<>();
				
				//Popular a lista de conteudos
				for (Map<String, String> atributos : listaDeAtriutos) {
					
					String titulo = atributos.get("title");
					String urlImage = atributos.get("url");
					
					conteudos.add(new Conteudo(titulo, urlImage));
				}
				return conteudos;
	}
}
