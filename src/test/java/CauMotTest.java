import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CauMotTest {
    @Test
    void MangRong() {
        int[] arr = {};
        assertEquals(0, CauMot.sumArray(arr), "Tổng của mảng rỗng phải là 0");
    }

    @Test
    void TongMangla5() {
        int[] arr = {5};
        assertEquals(5, CauMot.sumArray(arr), "Tổng của mảng {5} phải là 5");
    }

    @Test
    void TongMangla15() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(15, CauMot.sumArray(arr), "Tổng của mảng {1,2,3,4,5} phải là 15");
    }

    @Test
    void TongManglaAm15() {
        int[] arr = {-1, -2, -3, -4, -5};
        assertEquals(-15, CauMot.sumArray(arr), "Tổng của mảng {-1,-2,-3,-4,-5} phải là -15");
    }

    @Test
    void testMixedNumbers() {
        int[] arr = {-10, 5, -3, 8, 0};
        assertEquals(0, CauMot.sumArray(arr), "Tổng của mảng {-10,5,-3,8,0} phải là 0");
    }

    @Test
    void testArrayWithZero() {
        int[] arr = {0, 0, 0, 0};
        assertEquals(0, CauMot.sumArray(arr), "Tổng của mảng {0,0,0,0} phải là 0");
    }

    @Test
    void testBoundaryValues() {
        int[] arr = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        assertEquals(-1, CauMot.sumArray(arr), "Tổng của {MAX_VALUE, MIN_VALUE} phải là -1");
    }
}