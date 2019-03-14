
import java.awt.HeadlessException;
import javax.swing.JFrame;



public class AnaEkran extends JFrame{
    
    public static void main(String[] args) {
        
        GrafikKullanimi grafik = new GrafikKullanimi();
        
        AnaEkran ekran = new AnaEkran("Grafik Kullanımı");
        
        ekran.setVisible(true);
        ekran.setResizable(true); // ekran yanlardan tutulunca boyutlarıyla oynanabilsin
        ekran.setSize(800,600); // en 800 boy 600
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// çarpı işaretine basınca kapansın.
        ekran.add(grafik);
        
        
        
        
    }

    public AnaEkran(String title) throws HeadlessException {
        super(title);
    }

}
