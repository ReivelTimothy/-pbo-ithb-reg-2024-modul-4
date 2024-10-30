package models.classes;
import java.sql.Date;

public class Staff extends User {
    final private String nIK;
    private double gaji;

    public Staff(String nama, String alamat, Date tTL, String telepon, String nIK, double gaji) {
        super(nama, alamat, tTL, telepon);
        this.nIK = nIK;
        this.gaji = gaji;
    }

    public String getNIK() {
        return nIK;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +  // Memanggil toString() dari kelas User
                "NIK             : " + nIK + "\n" +
                "gaji            : " + gaji + "\n" +
                "getNIK()        : " + getNIK() + "\n" +
                "getGaji()       : " + getGaji();
    }


}
