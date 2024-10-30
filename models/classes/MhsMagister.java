package models.classes;

import java.sql.Date;
import java.util.ArrayList;

public class MhsMagister extends Mhs {
    private ArrayList<MatkulAmbil> listMataKuliah = new ArrayList<>();
    private String judulPeneletianTesis;

    

    public MhsMagister(String nama, String alamat, Date tTL, String telepon, String nim, String jurusan,
            ArrayList<MatkulAmbil> listMataKuliah, String judulPeneletianTesis) {
        super(nama, alamat, tTL, telepon, nim, jurusan);
        this.listMataKuliah = listMataKuliah;
        this.judulPeneletianTesis = judulPeneletianTesis;
    }

    public ArrayList<MatkulAmbil> getMataKuliah() {
        return listMataKuliah;
    }

    public void setMataKuliah(ArrayList<MatkulAmbil> listMataKuliah) {
        this.listMataKuliah = listMataKuliah;
    }

    public String getJudulPeneletianTesis() {
        return judulPeneletianTesis;
    }

    public void setJudulPeneletianTesis(String judulPeneletianTesis) {
        this.judulPeneletianTesis = judulPeneletianTesis;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "listMataKuliah             : " + listMataKuliah + "\n" +
                "judulPenelitianTesis       : " + judulPeneletianTesis + "\n" +
                "getJudulPeneletianTesis    : " + getJudulPeneletianTesis() + "\n" +
                "getMataKuliah              : " + getMataKuliah();
    }





}
