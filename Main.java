//----------------------------------------------------------------------------------------------------------------------
//EKLENİCEK KÜTÜPHANELER
import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//----------------------------------------------------------------------------------------------------------------------
//NESNE OLUŞTURMAMIZ İÇİN GEREKEN CLASS`LAR
class GenelUyeler{
    public  String isim  ;
    public  String soyisim ;
    public  String mailadresi ;
}
class ElitUyeler extends GenelUyeler{
//----------------------------------------------------------------------------------------------------------------------
}


public class Main {
    public static void main(String[] args) throws IOException {
//----------------------------------------------------------------------------------------------------------------------
// GENEL VE ELİT ÜYELERİN KULLANICI BİLGİLERİ (CLASSLARDAN TÜRETİLEN)
        GenelUyeler geneluye1 = new GenelUyeler();
        geneluye1.isim = "Ayse";
        geneluye1.soyisim = "Ak";
        geneluye1.mailadresi = "ayse@email.com";

        ElitUyeler elituye1 = new ElitUyeler();
        elituye1.isim = "Serpil";
        elituye1.soyisim = "Ustebay";
        elituye1.mailadresi = "serpil@deneme.edu.tr";

        ElitUyeler elituye2 = new ElitUyeler();
        elituye2.isim = "Eda";
        elituye2.soyisim = "Gok";
        elituye2.mailadresi = "eda@email.com";

        ElitUyeler elituye3 = new ElitUyeler();
        elituye3.isim = "Ali";
        elituye3.soyisim = "Gokten";
        elituye3.mailadresi = "ali@email.com";
//----------------------------------------------------------------------------------------------------------------------
//GENEL ÜYELER DOSYAMIZI OLUŞTURUYORUZ
        File dosya = new File("src/GenelÜyeler.txt");
        if (!dosya.exists()) {
            dosya.createNewFile();
        }
//----------------------------------------------------------------------------------------------------------------------
//GENEL ÜYELER DOSYAMIZA KULLANICI BİLGİLERİNİ EKLİYORUZ  (HALİHAZIRDA 1 KULLANICI)
        FileWriter dosyayazma = new FileWriter(dosya,false);
        BufferedWriter Gdosyayazma = new BufferedWriter(dosyayazma);
        Gdosyayazma.write("                                GENEL ÜYELER\n");
        Gdosyayazma.write( geneluye1.isim + "\t" + geneluye1.soyisim + "\t" +geneluye1.mailadresi +"\n");
        Gdosyayazma.close();
//----------------------------------------------------------------------------------------------------------------------
//ELİT ÜYELER DOSYAMIZI   OLUŞTURUYORUZ
        File dosya2 = new File("src/ElitÜyeler.txt");
        if (!dosya2.exists()) {
            dosya2.createNewFile();
        }
//----------------------------------------------------------------------------------------------------------------------
//ELİT ÜYELER DOSYAMIZA KULLANICI BİLGİLERİNİ EKLİYORUZ  (HALİHAZIRDA 3 KULLANICI)
        FileWriter dosyayazma2 = new FileWriter(dosya2,false);
        BufferedWriter Edosyayazma = new BufferedWriter(dosyayazma2);
        Edosyayazma.write("                                 ELİT ÜYELER\n");
        Edosyayazma.write(elituye1.isim + "\t" + elituye1.soyisim + "\t" +elituye1.mailadresi+"\n");
        Edosyayazma.write(elituye2.isim + "\t" + elituye2.soyisim + "\t" +elituye2.mailadresi+"\n");
        Edosyayazma.write(elituye3.isim + "\t" + elituye3.soyisim + "\t" +elituye3.mailadresi+"\n");
        Edosyayazma.close();
//----------------------------------------------------------------------------------------------------------------------
//KULLANICIDAN VERİ İSTEYEREK SWİTCH-CASE YAPIMIZI OLUŞTURUYORUZ

        System.out.println("Elit Üyelere yeni bir kişi eklemek için 1`e ");
        System.out.println("Genel Üyelere yeni bir kişi eklemek icin 2`ye ");
//mail atma programını ne kadar denesemde yapamadım        System.out.println("Mail atmak için 3`e tıklayınız");

        Scanner verial =new Scanner(System.in);
        int menuislem = verial.nextInt();
        switch (menuislem){
//----------------------------------------------------------------------------------------------------------------------
//KULLANICI 1 İ SEÇTİĞİNDE ELİT ÜYELER DOSYAMIZA YENİ BİR KULLANICI EKLİYORUZ
            case 1:
                dosyayazma2 = new FileWriter(dosya2, true);
                Edosyayazma = new BufferedWriter(dosyayazma2);
                ElitUyeler elituye4 = new ElitUyeler();

                System.out.println("Lütfen yeni kulanıcının ismini giriniz");
                elituye4.isim = verial.next();
                System.out.println("Lütfen yeni kulanıcının soyismini giriniz");
                elituye4.soyisim = verial.next();
                System.out.println("lütfen yeni kullanıcının mail adresini giriniz");
                elituye4.mailadresi = verial.next();

                Edosyayazma.write(elituye4.isim + "\t" + elituye4.soyisim + "\t" +elituye4.mailadresi+"\n");
                Edosyayazma.close();

                System.out.println("Elit Üyelere yeni kullanıcı eklendi.");
                break;
//----------------------------------------------------------------------------------------------------------------------
            //KULLANICI 2 Yİ SEÇTİĞİNDE GENEL ÜYELER DOSYAMIZA YENİ BİR KULLANICI EKLİYORUZ
            case 2:
                dosyayazma = new FileWriter(dosya , true);
                Gdosyayazma = new BufferedWriter(dosyayazma);
                GenelUyeler geneluye2 = new GenelUyeler();

                System.out.println("Lütfen yeni kulanıcının ismini giriniz");
                geneluye2.isim =verial.next();
                System.out.println("Lütfen yeni kulanıcının soyismini giriniz");
                geneluye2.soyisim =verial.next();
                System.out.println("lütfen yeni kullanıcının mail adresini giriniz");
                geneluye2.mailadresi =verial.next();

                Gdosyayazma.write(geneluye2.isim + "\t" + geneluye2.soyisim + "\t" +geneluye2.mailadresi+"\n");
                Gdosyayazma.close();
                System.out.println("Genel Üyelere yeni kullanıcı eklendi.");
                break;
//----------------------------------------------------------------------------------------------------------------------
//mail atma progmanı ne kadar denesemse yapamadım
// kendi pc imde en az 5 farklı mail atma kodu oluştursamda (mail.jar vb.)eklememe rağmen program çalışmadığından (hata almadım)
//mail atma kısmını yapamadım  (internettten hazır kodlardada denedim).
// bu sebeptende classlarım çok basit kaldı
            /*           case 3:
             *
             *                break;
             */

            default:
                System.out.println("Yanlış işlem seçtiniz");
                break;

        }
    }
}