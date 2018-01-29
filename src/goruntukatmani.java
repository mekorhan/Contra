import java.awt.image.BufferedImage;

/**
 * Created by Enes on 28.11.2015.
 */
public class goruntukatmani {

    private BufferedImage goruntu;



    public goruntukatmani(BufferedImage katman){
        this.goruntu =katman;
    }

    public BufferedImage crop(int x,int y,int width,int height ){//goruntumuzun belli bir kýsmýný almak için kullanýlan metod


        return goruntu.getSubimage(x,y,width,height);
    }
}
