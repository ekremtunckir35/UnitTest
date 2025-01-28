package test2;

import mockito1.PaymentManager;
import mockito1.PaymentService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

// A methodu B'ye bagli olsun
// A methodunu Test ederken B'yi dogru gibi Kabul edip A'yi test ederiz
// A'da Hata Yoksa B'yi ayri bir sekilde test ederek hatayi bulma yoluna gideriz.
//B metodunun beklenen işlevi doğru olarak yaptığını kabul
//etmek için mock(sahte, vekil vs) obje kullanılır.
public class TestPaymentService {

    //PaymentManager için ayrı bir test classı oluşturulur
    //ve metodları için unit testler yazılır.
    //checkPaymentStatus metodunu test edelim.
    //1-verilen id(100) göre STATUS : SUCCESS döndürür
    //2-getPaymentStatus metodunu çağırır
    @Test
    void testCheckPaymentStatus(){

        //PaymentService PaymentManager objesine bağımlı
        //1-PaymentManager objesine ihtiyaç var:pm yerine sahte obje(mock) kullanalım
        PaymentManager pm=mock(PaymentManager.class);//vekil
        //vekil'e gerçek objenin nasıl davranması gerektiğini gösterelim
        when(pm.getPaymentStatus(100)).thenReturn("SUCCESS");
        //getPaymentStatus beklenen işlevi yerine getirdiğini kabul etmiş olduk


        //2-PaymentService objesini oluşturalım
        PaymentService paymentService=new PaymentService(pm);

        String actual=paymentService.checkPaymentStatus(100);
        String expected="STATUS : SUCCESS";

        assertEquals(expected,actual);

        //getPaymentStatus tam olarak 1 kez 100 idsi ile çağrılıyor mu?
        verify(pm,times(1)).getPaymentStatus(100);

    }




}