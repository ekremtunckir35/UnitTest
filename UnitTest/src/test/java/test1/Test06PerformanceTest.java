package test1;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Test06PerformanceTest {

       @Test
     void testPerformanceSum(){
           assertTimeout(Duration.ofMillis(1),()->{
             long sum=0;
               for (long i = 0; i < 1000000; i++) {
                   sum+=i;
               }

           });
       }
    //2. parametrede verilen kod 1. parametrede verilen sürede gerceklesirse
    // test passed olur degilse failed olur, buna performans testi denir
    //bu testin amacı verilen sürede verilen işlemin gerceklesip gerceklesmedigini kontrol etmektir

}
