import javax.swing.*;
import java.awt.*;

/**
 * Created by Enes on 25.11.2015.
 */
public class Ekran {

    private int width,height;
    private String title;
    private Canvas canvas; // tuval yani üstüne resim çizilen yer örnek olarraka ressamlarýn üstüne çizdiklei þey aslýnda bir canvas onu ayakta tutan tahtalarýda ekranan ornek verilebilir
    private JFrame ekran;

    public Ekran(String title , int width,int height){ //ekran consturactor gonderilen degerlere dikkat

        this.title=title;
        this.width=width;
        this.height=height;

        frameolustur();

    }



    public void frameolustur(){ //ekrana conturacturdan girilen deðerlerle birlikte pencere oluþturma

        ekran = new JFrame(title);
        ekran.setSize(width,height);
        ekran.setResizable(false);
        ekran.setVisible(true);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ekran.setLocationRelativeTo(null);
        ekran.setResizable(true);

        canvas = new Canvas();// yeni t1uval oluþtur

        canvas.setPreferredSize(new Dimension(width,height));
        canvas.setMaximumSize (new Dimension(width,height));
        canvas.setMinimumSize(new Dimension(width,height));
        canvas.setFocusable(false);//ekraný deðiþtirme

        ekran.add(canvas);// ekran üzerine tuval ekleniyor
        ekran.pack(); //!!!!!!!!!!!!!!!!!!!1 öðren

    }
    public Canvas getCanvas() { // tuvalimizin kullanýlabilmesi için gereken get metodu
        return canvas;
    }

    public JFrame getEkran(){
        return ekran;

    }

}
