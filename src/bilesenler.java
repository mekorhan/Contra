import java.awt.image.BufferedImage;

/**
 * Created by Enes on 28.11.2015.
 */
public class bilesenler {//müzikler ve benzeri iþler sýnýfý

    private static final int width=32,height=32;// burda en ve boyun final deðerlerini giriyoruz

    public static BufferedImage oyuncu,tas,ot,agac,toprak;//ekrana basýlabilir her an çalýþmaya uygun nesneler

    public static void init(){//

        goruntukatmani goruntu = new goruntukatmani(ResimYukleyici.resimyukle("textures/test1.png"));//goruntu alýnacak

        oyuncu=goruntu.crop(0,0,32,32);//her bir nesneye kýrpýlan goruntu deðerleri aktarýlýyor
        tas=goruntu.crop(0,32,32,32);
        ot=goruntu.crop(64,0,32,32);
        toprak=goruntu.crop(32,0,32,32);
        agac=goruntu.crop(96,0,32,32);


    }
}
