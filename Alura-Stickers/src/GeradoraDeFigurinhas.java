import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class GeradoraDeFigurinhas {

	public void cria(InputStream inputStream, String nomeArquivo) throws Exception {
		
		//leitura da imagem
		//InputStream inputStream = new FileInputStream(new File("entrada/filme.jpg"));
		//InputStream inputStream = new URL("https://capas-p.imagemfilmes.com.br/164777_000_p.jpg").openStream();
		BufferedImage imagemOriginal = ImageIO.read(inputStream);
		
		//criar nova imagem em mem�ria e com tamanho novo
		int largura = imagemOriginal.getWidth();
		int altura = imagemOriginal.getHeight();
		int novaAltura = altura + 200;
		
		BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);
		
		//copiar a imagem original para nova imagem(em mem�ria)
		Graphics2D graphics = (Graphics2D)novaImagem.getGraphics();
		graphics.drawImage(imagemOriginal, 0, 0, null);
		
		//Configurar a fonte
		var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 64);
		graphics.setColor(Color.YELLOW);
		graphics.setFont(fonte);
		
		//escrever uma frase na nova imagem
		graphics.drawString("TOPZERA", 100 , novaAltura - 100);
		
		
		//escrever a nova imagem no arquivo
		ImageIO.write(novaImagem, "png", new File(nomeArquivo));
		
	}
	
}