package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BonusBinarySearchTest {

    @Test
    public void arrayOneReturnsSix() {
        int[] arr = {10, 20, 30, 50, 60, 80, 110, 130, 140, 170};
        assertEquals(BonusBinarySearch.binarySearch(arr, 110), 6);
    }

    @Test
    public void arrayTwoReturnsThree() {
        int[] arr = { 2, 3, 4, 10, 40 };
        assertEquals(BonusBinarySearch.binarySearch(arr, 10), 3);
    }

    @Test
    public void arrayThreeReturnsNegativeOne() {
        int[] arr = {10, 20, 30, 40, 60, 110, 120, 130, 170};
        assertEquals(BonusBinarySearch.binarySearch(arr, 175), -1);
    }
}
