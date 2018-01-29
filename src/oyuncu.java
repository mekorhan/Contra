import java.awt.*;

/**
 * Created by Enes on 30.11.2015.
 */
public class oyuncu extends aletler {

    private Oyun oyun;

    public oyuncu(Oyun oyun, float x , float y) { /// oyuncu  textureleri

        super(x, y);
        this.oyun=oyun;
    }



    @Override
    public void tick() {
        if(oyun.getTusYonetici().yukari) //yapýlan iþ tusa basýldýgýnda kaç piksel kayacagý playerýmýzýn
        y-=10;
        if(oyun.getTusYonetici().assagi)
        y+=10;
        if(oyun.getTusYonetici().sol)
        x-=10;
        if(oyun.getTusYonetici().sag)
        x+=10;

    }

    @Override
    public void render(Graphics g) { //oyuncu texturu

        g.drawImage(bilesenler.oyuncu,(int)x,(int)y,null);
    }

}
