import java.awt.*;

/**
 * Created by Enes on 27.11.2015.
 */
public class oyunAlani extends State {//oyunumuzun alaný pencereesi

    private oyuncu oyuncu;

    public oyunAlani(Oyun oyun){
       super (oyun);
        oyuncu=new oyuncu(oyun,100,100);



    }
    @Override
    public void tick() {
        oyuncu.tick();//oyuncu updateleri

    }

    @Override
    public void render(Graphics g) {
       oyuncu.render(g);//oyuncu texturelerý


    }
}
