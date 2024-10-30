package models.classes;

import java.sql.Date;
import java.util.ArrayList;

public class MhsSarjana extends Mhs {

    private ArrayList<MatkulAmbil> mataKuliah = new ArrayList<>();

    public MhsSarjana(String nama, String alamat, Date tTL, String telepon, String nim, String jurusan,
            ArrayList<MatkulAmbil> mataKuliah) {
        super(nama, alamat, tTL, telepon, nim, jurusan);
        this.mataKuliah = mataKuliah;
    }

    public ArrayList<MatkulAmbil> getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(ArrayList<MatkulAmbil> mataKuliah) {
        this.mataKuliah = mataKuliah;
    }


    @Override
    public String toString() {
        return super.toString() + "\n" +
                "list mataKuliah          : \n" + mataKuliah.toString() + "\n";
    }


}
