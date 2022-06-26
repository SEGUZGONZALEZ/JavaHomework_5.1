package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SqrServiceTest {

    @ParameterizedTest
    @CsvSource({
            "200,300,3",
            "100,200,5",
            "10,300,8",
            "1,99,0",
            "1000,3000,23"
    })

    public void sqrRootSeekerBetweenRange(int underRange, int upperRange, int expected) {
        SqrService service = new SqrService();

              int actual = service.calculate(underRange, upperRange);

              Assertions.assertEquals(expected, actual);

    }
}
