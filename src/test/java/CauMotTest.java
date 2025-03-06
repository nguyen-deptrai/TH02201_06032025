import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CauMotTest {
 @Test
     void SoMC() {
         List<Integer> filteredList = CauMot.Tam();
         assertEquals(19, filteredList.size(), "Danh sách phải có 19 số chẵn không chia hết cho 8.");
     }

     @Test
     void SoNhoNhat() {
         List<Integer> filteredList = CauMot.Tam();
         assertTrue(filteredList.contains(2), "Danh sách phải chứa số 2.");

     }
     @Test
     void SoLonNhat() {
         List<Integer> filteredList = CauMot.Tam();
         assertTrue(filteredList.contains(50), "Danh sách phải chứa số 50.");
     }
     @Test
     void SoTam() {
         List<Integer> filteredList = CauMot.Tam();
         assertFalse(filteredList.contains(8), "Số 8 phải bị loại.");
     }
    @Test
    void SoMS() {
        List<Integer> filteredList = CauMot.Tam();
        assertFalse(filteredList.contains(16), "Số 16 phải bị loại.");
    }
    @Test
    void SoHT() {
        List<Integer> filteredList = CauMot.Tam();
        assertFalse(filteredList.contains(24), "Số 24 phải bị loại.");
    }
    @Test
    void SoBH() {
        List<Integer> filteredList = CauMot.Tam();
        assertFalse(filteredList.contains(32), "Số 32 phải bị loại.");
    }
    @Test
    void SoBM() {
        List<Integer> filteredList = CauMot.Tam();
        assertFalse(filteredList.contains(40), "Số 40 phải bị loại.");
    }
    @Test
    void SoBT() {
        List<Integer> filteredList = CauMot.Tam();
        assertFalse(filteredList.contains(48), "Số 48 phải bị loại.");
    }
}