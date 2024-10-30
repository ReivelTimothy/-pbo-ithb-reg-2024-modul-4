
package models.classes;

import java.util.List;

public class MatkulAjar {

    private List<PresensiStaff> presensiStaff;
    private MataKuliah mataKuliah;

    public MatkulAjar(MataKuliah mataKuliah, List<PresensiStaff> presensiStaff) {
        this.mataKuliah = mataKuliah;
        this.presensiStaff = presensiStaff;
    }

    public List<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }

    public void setPresensiStaff(List<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    @Override
    public String toString() {
        return "\npresensiStaff   : " + presensiStaff + "\n" +
                "mataKuliah      : \n" + mataKuliah.toString() + "\n" ;

    }


}