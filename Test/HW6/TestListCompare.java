package HW6;


import Main.hw6.ListCompare;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestListCompare {
    ListCompare listCompare;
    private final List<Integer> list1 = Arrays.asList(6, 9, 7, 18, 32);
    private final List<Integer> list2 = Arrays.asList(2, 5, 1, 7, 40);
    private final List<Integer> listNull = new ArrayList<>();

    @BeforeEach
    void testInit() {
        listCompare = new ListCompare();
    }

    @Test
    void averageValue() {
        assertEquals(listCompare.average(list1), 14.4);
        assertEquals(listCompare.average(list2), 11);
    }

    @Test
    void averageNull() {
        assertEquals(listCompare.average(listNull), 0.0);
    }

    @Test
    void compareAverageTwo() {
        assertEquals(listCompare.compareAverage(list1, list2), "First list has a higher average value");
    }

    @Test
    void compareAverageOne() {
        assertEquals(listCompare.compareAverage(list2, list1), "Second list has a higher average value");
    }

    @Test
    void compareEqual() {
        assertEquals(listCompare.compareAverage(list1, list1), "The average values are equal");
    }
}
