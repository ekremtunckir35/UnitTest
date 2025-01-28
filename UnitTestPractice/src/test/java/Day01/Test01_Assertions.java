package Day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01_Assertions {
    @Test
    public void test(){ //min methodu olmadan nasil calisti
                        //Junit icinde gomulu gelken main methodu kullaniliyor.
        //JUnit 5 ile beraber methodlar public ile belirtlilmesi zorunlulugu ortadan kalkti.



    }

    @Test
    public void testLength(){//String clasindan gelen length() test edecegiz

        String str ="Merhaba Dunya";//13 karakter oldugunu test edecegiz
        //burada  iki degisken olusturacagiz  biri beklenen digeri gercek sonuc
        int anlikDeger = str.length();
        int beklenenDeger = 13;

        assertEquals(beklenenDeger,anlikDeger);


    }

    @Test
    public void testUpperCase(){
        String  str ="Merhaba".toUpperCase();//MERHABA
        String beklenenDeger = "MERHABA";
        //assertEquals(beklenenDeger,str);\
        //Hata aninda kullaniciya msj gondermek istiyorsak
        assertEquals(beklenenDeger,str,"UpperCase()methodu duzgun calismadi");//mesaj yazilabilir

    }
    @Test
    void testToplama(){//Math classindan gelen toplama methodunu test edecegiz
        int Sayi1 =10;
        int sayi2 =5;
        int anlikDeger =Math.addExact(Sayi1,sayi2);
        int beklenenDeger = 15;
        assertEquals(beklenenDeger,anlikDeger);

    }
    @Test
    void testContains(){
        assertEquals(false,"Ekrem".contains("t"));

    }

}



/*
1-oncelikle bir method olusturuyoruz.
2-Bu methodun bir test methodu oldugunu belirtmek icin @Test annotation'ini kullaniyoruz.
3-Method'un adi test ile baslamali.Method'un icine test islemlerimizi yaziyoruz.

 */