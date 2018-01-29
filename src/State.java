import java.awt.*;

/**
 * Created by Enes on 27.11.2015.
 */
public abstract class State {//her statein tick ve render metodu vardý //state pbinevi pencerelerdir mesela setting penceresi yada new game e basarak geçilen asýl oyun alaný

    private static State suankiAlan=null;//burda penceremizizin atanacaðý nesne static dikkat

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
