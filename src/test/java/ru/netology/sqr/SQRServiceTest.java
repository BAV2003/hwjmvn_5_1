package ru.netology.sqr;
//import ru.netology.sqr.SQRService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/sqr.csv")
    public void testValue(int lowerBound, int upperBound, int expected) {
        SQRService service = new SQRService();
        int actual = service.sqrCalcQuantity(lowerBound, upperBound);
        assertEquals(expected, actual);
    }
}
