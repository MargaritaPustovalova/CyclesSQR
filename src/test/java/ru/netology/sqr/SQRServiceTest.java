package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    @Test
    void shouldSqrCount() {
        SQRService service = new SQRService();
        int min = 200;
        int max = 300;
        int expected = 3;

        int actual = service.sqrCount(min, max);

        assertEquals(expected, actual);

    }

    @Test
    void shouldSqrCountWideRange() {
        SQRService service = new SQRService();
        int min = 10;
        int max = 3500_00;
        int expected = 90;

        int actual = service.sqrCount(min, max);

        assertEquals(expected, actual);

    }
}
