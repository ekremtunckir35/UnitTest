package test1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Test01Assertions {


    @Test//bu bir test metodudur ve tek başına çalıştırılabilir.
    public void test(){
        //A metodu için bir test metodu
    }


    //JDK da hazır olan metodları test edelim

    //String in length metodunu test edelim

    @Test
    public void testLength(){

        String str="Hello world!";
        int gercekDeger=str.length();//12
        int beklenenDeger=12;

        assertEquals(beklenenDeger,gercekDeger,"Yanlış karakter sayısı!");
        // assertEquals(12,str.length());
        //beklenenDeger ile gercekDeger i karşılaştırır, eşit ise test geçer(passed)
        //aksi halde test başarısız olur(failed)

    }

    //Math addExact
    @Test
    public void testAddExact(){

        int actual=Math.addExact(9,6);
        int expected=15;
        int notExpected=25;

        assertEquals(expected,actual);
        assertNotEquals(notExpected,actual);

    }





}