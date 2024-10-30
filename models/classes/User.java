package models.classes;

import java.sql.Date;

abstract public class User {
    private String nama;
    private String alamat;
    private Date TTL;
    private String telepon;

    public User(String nama, String alamat, Date tTL, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.TTL = tTL;
        this.telepon = telepon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Date getTTL() {
        return TTL;
    }

    public void setTTL(Date tTL) {
        TTL = tTL;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    @Override
    public String toString() {
        return  "Nama                : " + nama+ "\n" +
                "Alamat              : " + alamat + "\n" +
                "TTL                 : " + TTL + "\n" +
                "Telepon             : " + telepon;

    }

}
