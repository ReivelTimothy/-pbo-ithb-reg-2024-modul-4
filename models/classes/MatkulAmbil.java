package models.classes;

import java.util.Arrays;
import java.util.List;

public class MatkulAmbil {

    private MataKuliah matkul;
    private List<Presensi> listPresensi;
    private int[] nilai = new int[3];

    public MatkulAmbil(MataKuliah matkul, List<Presensi> listPresensi, int[] n) {
        this.matkul = matkul;
        this.listPresensi = listPresensi;
        this.nilai = n;
    }

    public MataKuliah getMatkul() {
        return matkul;
    }

    public void setMatkul(MataKuliah matkul) {
        this.matkul = matkul;
    }

    public List<Presensi> getListPresensi() {
        return listPresensi;
    }

    public void setPresensi(List<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }

    public void setListPresensi(List<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }

    public int[] getN() {
        return nilai;
    }

    public void setN(int[] n) {
        this.nilai = n;
    }

    @Override
    public String toString() {
        return "\n  " + matkul.toString() + "\n" +
                " - nilai               : " + Arrays.toString(nilai) +
                "\n - listPresensi        : " + listPresensi.toString();
    }


}