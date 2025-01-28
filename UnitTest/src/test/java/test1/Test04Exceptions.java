package test1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test04Exceptions {

    @Test
    void testLengthForNullValue() {
        String str = "Hello world!";

        //str.length()--->12

        String str2= null;
        //str2.length()--->NullPointerException
        assertThrows(NullPointerException.class, () -> {
            str2.length();
        });

    }
    @Test
    void testDivideForArithmeticException() {
        //10/0--->ArithmeticException
        int sayi1 =999;
        int sayi2 = 0;
        assertThrows(ArithmeticException.class, () -> {
            System.out.println(sayi1/sayi2);
        });

    }
}