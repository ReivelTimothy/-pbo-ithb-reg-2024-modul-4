package models.classes;

import java.sql.Date;
import java.util.ArrayList;

public class Dosen extends Staff {
    private String departemen;
    private ArrayList<MatkulAjar> listMataKuliah = new ArrayList<>();
        
    public Dosen(String nama, String alamat, Date tTL, String telepon, String nIK, double gaji, String departemen,
            ArrayList<MatkulAjar> listMataKuliah) {
        super(nama, alamat, tTL, telepon, nIK, gaji);
        this.departemen = departemen;
        this.listMataKuliah = listMataKuliah;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MatkulAjar> getListMataKuliah() {
        return listMataKuliah;
    }

    public void setListMataKuliah(ArrayList<MatkulAjar> listMataKuliah) {
        this.listMataKuliah = listMataKuliah;
    }

    @Override
    public String toString() {
        return super.toString() +
                "departemen          : " + departemen + "\n" +
                "listMataKuliah      : " + listMataKuliah + "\n" +
                "NIK                 : " + getNIK() + "\n" +
                "Gaji                : " + getGaji() + "\n";
    }

    
}
