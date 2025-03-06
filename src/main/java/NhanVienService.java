public class NhanVienService {
    public void suaNhanVien(NhanVien nv, String maNV, String ten, int tuoi, float luong, int soNamLamViec, String phongBan) {
        if (nv == null) return;
        nv.setMaNV(maNV);
        nv.setTen(ten);
        nv.setTuoi(tuoi);
        nv.setLuong(luong);
        nv.setSoNamLamViec(soNamLamViec);
        nv.setPhongBan(phongBan);
    }
}

