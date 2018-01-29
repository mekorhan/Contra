import java.awt.*;

/**
 * Created by Enes on 27.11.2015.
 */
public class menuAlani extends State {

    public menuAlani(Oyun oyun){
        super (oyun);

    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {

        g.drawImage(ResimYukleyici.resimyukle("textures/Selman.jpg"),0,0,null);


    }
}
