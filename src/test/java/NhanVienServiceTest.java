import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
        public class NhanVienServiceTest {
            private NhanVienService service;
            private NhanVien nv;

            @BeforeEach
            void BanDau() {
                service = new NhanVienService();
                nv = new NhanVien("NV01", "Nguyen Van A", 25, 5000.0f, 2, "IT");
            }

            @Test
            void SuaHopLe() {
                service.suaNhanVien(nv, "NV", "Le", 30, 623.0f, 5, "Abc");
                assertEquals("NV", nv.getMaNV());
                assertEquals("Le", nv.getTen());
                assertEquals(30, nv.getTuoi());
                assertEquals(623.0f, nv.getLuong());
                assertEquals(5, nv.getSoNamLamViec());
                assertEquals("Abc", nv.getPhongBan());
            }

            @Test
            void TuoiToiThieu() {
                service.suaNhanVien(nv, "NV", "Tran", 18, 40.0f, 1, "abc");
                assertEquals(18, nv.getTuoi());
            }

            @Test
            void TuoiToiDa() {
                service.suaNhanVien(nv, "NV", "Tran", 65, 40.0f, 40, "Marketing");
                assertEquals(65, nv.getTuoi());
            }

            @Test
            void LuongAm() {
                service.suaNhanVien(nv, "NV", "Tran", 28, -50.0f, 3, "ABC");
                assertTrue(nv.getLuong() < 0);
            }

            @Test
            void TenRong() {
                service.suaNhanVien(nv, "NV", "", 35, 8000.0f, 10, "abc");
                assertEquals("", nv.getTen());
            }@Test
            void MaRong() {
                service.suaNhanVien(nv, "", "Tran", 35, 8000.0f, 10, "abc");
                assertEquals("", nv.getMaNV());
            }
            @Test
            void PhongBanRong() {
                service.suaNhanVien(nv, "abc", "Tran", 22, 8000.0f, 10, "");
                assertEquals("", nv.getPhongBan());
            }

        }



//            git add .
//        git commit -m "update new code"
//        git push -u origin master