package models.classes;

import java.sql.Date;
import java.util.Arrays;

public class MhsDoktor extends Mhs {
    private double[] nilai = new double[3];
    private String judulPenelitian;


    public MhsDoktor(String nama, String alamat, Date tTL, String telepon, String nim, String jurusan, double[] nilai, String judulPenelitian) {
        super(nama, alamat, tTL, telepon, nim, jurusan);
        this.nilai = nilai;
        this.judulPenelitian = judulPenelitian;
    }

    public double[] getNilai() {
        return nilai;
    }

    public void setNilai(double[] nilai) {
        this.nilai = nilai;
    }

    public String getJudulPenelitian() {
        return judulPenelitian;
    }

    public void setJudulPenelitian(String judulPenelitian) {
        this.judulPenelitian = judulPenelitian;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "nilai                : " + Arrays.toString(nilai) + "\n" +
                "judulPenelitian      : " + judulPenelitian + "\n" +
                "getJudulPenelitian() : " + getJudulPenelitian() + "\n" +
                "getNilai()           : " + Arrays.toString(getNilai());
    }

}
