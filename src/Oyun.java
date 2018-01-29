import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

/**
 * Created by Enes on 25.11.2015.
 */
public class Oyun implements Runnable { // taban kodlar burda

    private Ekran ekran;

    public int width,height;
    public String title;

    private boolean running=false;
    private Thread thread;

    private BufferStrategy bs; //???????????????
    private Graphics g; // bi nevi paintbrush grafik sýnýfana ait nesne

    //ALANLAR BUARAAYA

    private State oyunAlani;
    private State menuAlani;
    private State ayarlarAlani;

    //input
    private TusYonetici tusYonetici;


    //private BufferedImage testImage;//resmimizi yuklediðimiz field
    //private goruntukatmani goruntu; //bir field açýyoruz goruntu için


    public Oyun(String title,int width,int height){
        this.width=width;
        this.height=height;
        this.title=title;
        tusYonetici=new TusYonetici();///

    }

    private void init(){//!!!!!!????
        ekran=new Ekran(title,width,height);
        ekran.getEkran().addKeyListener(tusYonetici);////
        bilesenler.init();
        //testImage=ResimYukleyici.resimyukle("/textures/test1.png");  //resmi yukler
        //goruntu=new goruntukatmani(testImage);


        oyunAlani=new oyunAlani(this);
        menuAlani=new menuAlani(this);
        ayarlarAlani=new ayarlarAlani(this);

        State.setState(oyunAlani);

/** fpsin nedeni iþlemcinin saniyede yaptýgý tickleri 60kareye
 sabitlemek eðer bu sabitlemeyi yapmassak
 daha güçlü iþlemciler daha çok tick atacak bve goruntu daha zorlanacaktýr **/

    }


    private void tick(){    // bi nevi update update update

        tusYonetici.tick();

        if(State.getState()!=null)  //burda alanýn updateleri bi nevi
            State.getState().tick();

    }
    private void render(){//
        bs=ekran.getCanvas().getBufferStrategy();   //ekrana çizmek için bir yontem ????????
        if(bs==null){
            ekran.getCanvas().createBufferStrategy(3);  // çok önemli neden 3 ?
            return;
        }
        g=bs.getDrawGraphics();  //imagemizi ekrana yazdýracak metod !! kütüphane petodu

            //draw here




       /**g.drawImage(testImage,0,0,null);// resimi çizer
        //g.drawImage(goruntu.crop(0,0,32,32),0,0,null);//crop metoduyla kesilmiþ goruntu
        nesnesini ekrana yazzdýrýr
        goruntu.crop(x=düzlemdeki x,y=düzlemdeki,width resimdeki en ,resimdeki boy) */

       /**g.drawImage(bilesenler.oyuncu,0,0,null);
       // g.drawImage(bilesenler.toprak,32,0,null);
        //g.drawImage(bilesenler.agac,64,0,null);*/

        if(State.getState()!=null)
            State.getState().render(g);


        //end draw
        bs.show();//????
        g.dispose();//?????

    }


    public void run(){//

        init(); //grafiksel olaylar çaðýrýlýyor ve aþaðýda güncelleniyor

        int fps = 60; //frame per second
        double timerPerTick=1000000000/fps;
        double delta=0;
        long now;
        long lastTime=System.nanoTime();
        long timer=0;
        int ticks=0;

        while(running) { // genel olarak oyunun dondugu bolge LOOOOOPP *

            now = System.nanoTime();
            delta += (now - lastTime) / timerPerTick;
            timer +=now-lastTime;
            lastTime = now;


            if (delta>=1){
                tick();//ekran update olur her bir tick metodunda
            render();//ekran
                ticks++;
                delta--;

        }
            if(timer>=1000000000){
                System.out.println("Tick and Frames:"+ticks);
                ticks=0;
                timer=0;
            }
        }

        stop();
    }

    public TusYonetici getTusYonetici(){
        return tusYonetici;
    }
    public synchronized void start(){ // threadi baþlatýr "eþzamanlý"
        if (running)//çalýþma durumu kontrol edilir
            return;
        running=true;
        thread = new Thread(this); //thread oluþturuyoruz (this) bu klasý vurgular
        thread.start();//thread RUN edilir

    }
    public synchronized void stop(){ //threadi sonladýrýr

        if (!running)
            return;
        running=false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
