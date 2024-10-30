package models.classes;

import java.sql.Date;
import java.util.List;

public class Karyawan extends Staff {
    private double gaji;
    private List<PresensiStaff> listPresensiStaff;

    public Karyawan(String nama, String alamat, Date tTL, String telepon, String nIK, double gaji,
            List<PresensiStaff> listPresensiStaff) {
        super(nama, alamat, tTL, telepon, nIK, gaji);
        this.gaji = gaji;
        this.listPresensiStaff = listPresensiStaff;
    }

    public List<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(List<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }
    
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Gaji        : " + gaji + "\n";
    }
}