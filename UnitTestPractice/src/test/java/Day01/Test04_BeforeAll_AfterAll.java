package Day01;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test04_BeforeAll_AfterAll {


    @BeforeAll
    static void beforeAll(TestInfo info) {
        System.out.println("beforeAll calisti");
    }

    @AfterAll
    static void afterAll() {
        System.out.println(" afterAll calisti");

    }

    @Test
    void testArrays(TestInfo info) {
        String str = "Unit Test with JUnit";
        String[] anlikDizi = str.split(" ");
        String[] beklenenDizi = {"Unit", "Test", "with", "JUnit"};
        System.out.println(info.getDisplayName() + " calisti");
        assertArrayEquals(beklenenDizi, anlikDizi);

    }

    @Test
    void testArrays2(TestInfo info) {
        String str = "Spring Boot ile Backend yazmak everestin tepesine cikmak gibi ";
        int anlikDeger = str.split(" ").length;
        int beklenenDeger = 9;
        System.out.println(info.getDisplayName() + " calisti");
        assertEquals(beklenenDeger, anlikDeger,"uzunkular birbirine esit degil");
    }
}