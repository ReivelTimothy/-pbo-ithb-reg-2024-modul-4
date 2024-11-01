package models.classes;

import java.sql.Date;
import java.util.ArrayList;

public class MhsMagister extends MhsSarjana {
    private String judulPeneletianTesis;


    public MhsMagister(String nama, String alamat, Date tTL, String telepon, String nim, String jurusan, ArrayList<MatkulAmbil> mataKuliah, String judulPeneletianTesis) {
        super(nama, alamat, tTL, telepon, nim, jurusan, mataKuliah);
        this.judulPeneletianTesis = judulPeneletianTesis;
    }

    public String getJudulPeneletianTesis() {
        return judulPeneletianTesis;
    }

    public void setJudulPeneletianTesis(String judulPeneletianTesis) {
        this.judulPeneletianTesis = judulPeneletianTesis;
    }

    @Override
    public String toString() {
        return "judulPenelitianTesis       : " + judulPeneletianTesis + "\n" +
                super.toString();
    }


}
