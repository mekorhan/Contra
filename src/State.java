import java.awt.*;

/**
 * Created by Enes on 27.11.2015.
 */
public abstract class State {//her statein tick ve render metodu vard� //state pbinevi pencerelerdir mesela setting penceresi yada new game e basarak ge�ilen as�l oyun alan�

    private static State suankiAlan=null;//burda penceremizizin atanaca�� nesne static dikkat

    public static void setState(State state){//atama
        suankiAlan=state;
    }

    public static  State getState(){
        return suankiAlan;
    }

    //class

    protected Oyun oyun;

    public State(Oyun oyun){
        this.oyun = oyun;

    }
    public abstract void tick();//asbtract calsslar

    public abstract void render(Graphics g);


}
