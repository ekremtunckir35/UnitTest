package test2;

import mockito1.PaymentManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPaymentManager {

    public PaymentManager paymentManager;

    @BeforeEach
    void createObject(){
        paymentManager=new PaymentManager();
    }

    @AfterEach
    void setNullToObject(){
        paymentManager=null;
    }

    //getPaymentStatus metodunu test edelim
    @Test
    void testGetPaymentStatus(){
        String actual= paymentManager.getPaymentStatus(100);
        String expected="SUCCESS";
        assertEquals(expected,actual);
    }


}