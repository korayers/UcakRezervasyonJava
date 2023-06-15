/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

/**
 *
 * @author enese
 */
import Models.Rezervasyon;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DosyayaYazma {
    public void rezervasyonKaydet(Rezervasyon rezervasyon) throws IOException {
        String dosyaAdresi = "Rezervasyonlar.txt";

        try (PrintWriter dosya = new PrintWriter(new FileWriter(dosyaAdresi, true))) {
            dosya.println(rezervasyon.getMusteri().getAd() + "," +
                          rezervasyon.getMusteri().getSoyad() + "," +
                          rezervasyon.getUcus().getUcusNo() + "," +
                          rezervasyon.getUcus().getNereye() + "," +
                          rezervasyon.getUcus().getNereden() + "," +
                          rezervasyon.getUcus().getUcusTarihi() + ",," +
                          rezervasyon.getKoltukNo());

            System.out.println("Rezervasyon dosyaya yazıldı.");

        }
    }
}