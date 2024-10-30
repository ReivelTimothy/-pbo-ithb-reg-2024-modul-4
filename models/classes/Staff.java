package models.classes;
import java.sql.Date;

public class Staff extends User {
    final private String nIK;

    public Staff(String nama, String alamat, Date tTL, String telepon, String nIK) {
        super(nama, alamat, tTL, telepon);
        this.nIK = nIK;
    }

    public String getNIK() {
        return nIK;
    }


    @Override
    public String toString() {
        return super.toString() + "\n" ;
    }


}
