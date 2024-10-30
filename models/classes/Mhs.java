package models.classes;

import java.sql.Date;

abstract public class Mhs extends User{
    private final String nim; 
    private String jurusan;

    public Mhs(String nama, String alamat, Date tTL, String telepon, String nim, String jurusan) {
        super(nama, alamat, tTL, telepon);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

 

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "nim                 : " + nim + "\n" +
                "jurusan             : " + jurusan + "\n";
    }
}

    



