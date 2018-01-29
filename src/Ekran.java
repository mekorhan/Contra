import javax.swing.*;
import java.awt.*;

/**
 * Created by Enes on 25.11.2015.
 */
public class Ekran {

    private int width,height;
    private String title;
    private Canvas canvas; // tuval yani �st�ne resim �izilen yer �rnek olarraka ressamlar�n �st�ne �izdiklei �ey asl�nda bir canvas onu ayakta tutan tahtalar�da ekranan ornek verilebilir
    private JFrame ekran;

    public Ekran(String title , int width,int height){ //ekran consturactor gonderilen degerlere dikkat

        this.title=title;
        this.width=width;
        this.height=height;

        frameolustur();

    }



    public void frameolustur(){ //ekrana conturacturdan girilen de�erlerle birlikte pencere olu�turma

        ekran = new JFrame(title);
        ekran.setSize(width,height);
        ekran.setResizable(false);
        ekran.setVisible(true);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ekran.setLocationRelativeTo(null);
        ekran.setResizable(true);

        canvas = new Canvas();// yeni t1uval olu�tur

        canvas.setPreferredSize(new Dimension(width,height));
        canvas.setMaximumSize (new Dimension(width,height));
        canvas.setMinimumSize(new Dimension(width,height));
        canvas.setFocusable(false);//ekran� de�i�tirme

        ekran.add(canvas);// ekran �zerine tuval ekleniyor
        ekran.pack(); //!!!!!!!!!!!!!!!!!!!1 ��ren

    }
    public Canvas getCanvas() { // tuvalimizin kullan�labilmesi i�in gereken get metodu
        return canvas;
    }

    public JFrame getEkran(){
        return ekran;

    }

}
