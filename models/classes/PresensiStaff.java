package models.classes;

import java.sql.Date;

import models.enumeration.StatusKehadiran;

public class PresensiStaff extends Presensi {

    private int jam;

    public PresensiStaff(Date tanggal, StatusKehadiran status, int jam) {
        super(tanggal, status);
        this.jam = jam;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "     - jam             : " + jam + "\n" ;
    }

}