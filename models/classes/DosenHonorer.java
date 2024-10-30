package models.classes;

import java.sql.Date;
import java.util.ArrayList;

public class DosenHonorer extends Dosen{
    private double honorPerSKS;

    

    public DosenHonorer(String nama, String alamat, Date tTL, String telepon, String nIK, double gaji,
            String departemen, ArrayList<MatkulAjar> listMataKuliah, double honorPerSKS) {
        super(nama, alamat, tTL, telepon, nIK, gaji, departemen, listMataKuliah);
        this.honorPerSKS = honorPerSKS;
    }

    public double getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(double honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "honorPerSKS        : " + honorPerSKS + "\n";
    }
    
    
}
