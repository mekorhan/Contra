
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Enes on 26.11.2015.
 */
public class ResimYukleyici {//resim yukleme sýnýfý

    public static BufferedImage resimyukle(String path){  // resim yukleme olayý


        try {
            return ImageIO.read(ResimYukleyici.class.getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        return null;

    }
}
