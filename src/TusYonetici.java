import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Enes on 30.11.2015.
 */
public class TusYonetici implements KeyListener {


    private boolean[] tuslar;
    public boolean yukari,assagi,sol,sag;

    public TusYonetici(){
        tuslar=new boolean[256];

    }

    public void tick(){
        yukari=tuslar[KeyEvent.VK_W];
        assagi=tuslar[KeyEvent.VK_S];
        sol=tuslar[KeyEvent.VK_A];
        sag=tuslar[KeyEvent.VK_D];
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {//basýlan yuþlar

        tuslar[e.getKeyCode()]=true;
        System.out.println("Tusa basýldý..");

    }

    @Override
    public void keyReleased(KeyEvent e) {

        tuslar[e.getKeyCode()]=false;
    }
}
