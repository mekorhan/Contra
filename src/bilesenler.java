import java.awt.image.BufferedImage;

/**
 * Created by Enes on 28.11.2015.
 */
public class bilesenler {//m�zikler ve benzeri i�ler s�n�f�

    private static final int width=32,height=32;// burda en ve boyun final de�erlerini giriyoruz

    public static BufferedImage oyuncu,tas,ot,agac,toprak;//ekrana bas�labilir her an �al��maya uygun nesneler

    public static void init(){//

        goruntukatmani goruntu = new goruntukatmani(ResimYukleyici.resimyukle("textures/test1.png"));//goruntu al�nacak

        oyuncu=goruntu.crop(0,0,32,32);//her bir nesneye k�rp�lan goruntu de�erleri aktar�l�yor
        tas=goruntu.crop(0,32,32,32);
        ot=goruntu.crop(64,0,32,32);
        toprak=goruntu.crop(32,0,32,32);
        agac=goruntu.crop(96,0,32,32);


    }
}
