package test1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test02BeforeEachAfterEach {

         /*
    @BeforeEach
    Test senaryoları başlamadan önce ortak kaynakların
    (örneğin, veritabanı bağlantıları, nesne oluşturma)
    ayarlanması veya başlangıç değerlerinin belirlenmesi

    @AfterEach
    Test sonrasında kaynakların serbest bırakılması
    (örneğin, dosya kapatma, veritabanı bağlantısını sonlandırma)
    veya geçici verilerin temizlenmesi

     gibi işler yapılır.
     */

    //bu classta String in upperCase ve contains metodlarını test edelim
    String str;

    @BeforeEach
    void createStringObject(){
        str="merhaba";
        System.out.println("before each çalıştı.");
    }

    @AfterEach
    void setNullStringObject(){
        str=null;
        System.out.println("After each çalıştı.");
    }

    //upperCase metodunu test edelim
    @Test
    void testUpperCase(){
        String act=str.toUpperCase();
        String exp="MERHABA";

        assertEquals(exp,act);
        System.out.println("testUpperCase çalıştı.");
    }

    //contains metodunu test edelim
    @Test
    void testContains(){
        boolean act=str.contains("z");
        boolean actual=str.contains("m");
        boolean exp=false;

        assertEquals(exp,act);
        //veya
        assertFalse(act);
        assertTrue(actual);
        System.out.println("testContains çalıştı.");

    }


}