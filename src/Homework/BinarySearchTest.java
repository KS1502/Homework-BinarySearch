package Homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    private static BinarySearch binarySearch;

    @BeforeEach
    public void init() {
        binarySearch = new BinarySearch();
    }

    @Test
    public void testBinarySearch_one() {
        int[] actual = {-1};
        assertEquals(-1, binarySearch.binarySearch(6, actual));

    }

    @Test
    public void testBinarySearch() {
        int[] actual = {1, 3, 6, 8,};
        assertEquals(3, 3);
    }

    @Test
    public void testBinarySearch_1() {
        int[] actual = {9, 14, 28, 32};
        assertEquals(32, 32);

    }

    @Test
    public void testBinarySearch_FourtySeven() {
        int[] actual = {-1};
        assertEquals(-1, binarySearch.binarySearch(47, actual));

    }
}