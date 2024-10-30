package models.classes;

import java.sql.Date;

import models.enumeration.StatusKehadiran;

public class Presensi {
    private Date tanggal;
    private StatusKehadiran status;

    public Presensi(Date date, StatusKehadiran status) {
        this.tanggal = date;
        this.status = status;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public StatusKehadiran getStatus() {
        return status;
    }

    public void setStatus(StatusKehadiran status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "\n     - tanggal         : " + tanggal + "\n" +
                "     - status          : " + status ;

    }

}
