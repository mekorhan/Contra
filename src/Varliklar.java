import java.awt.*;

/**
 * Created by Enes on 30.11.2015.
 */
public abstract class Varliklar {

    protected float x,y;

    public Varliklar(float x,float y){

        this.y=y;
        this.x=x;

    }


    public abstract void tick();

    public abstract void render(Graphics g);
}
