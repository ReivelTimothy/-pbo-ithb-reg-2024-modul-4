package controller;

import java.util.ArrayList;
import java.util.List;

import models.DataDummy;
import models.classes.*;
import models.enumeration.*;

public class Controller {
    static int a = 2;
    static DataDummy dataDummy = new DataDummy();
    static List<User> users = dataDummy.Generate();

    public String printData(String name) {
        for (User user : users) {
            if (name.equals(user.getNama())) {
                return user.toString();  // Mengembalikan string representasi dari pengguna
            }
        }
        return "name ini tidak ada";  // Mengembalikan pesan jika nama tidak ditemukan
    }

    public String printNa(String nim, String kodeMk) { // mencari nilai akhir
        double totalNilai = 0;
        String nama;
        for (User user : users) {
            if (user instanceof Mhs && ((Mhs) user).getNim() != null) { // cek sebelum melakukan casting dan jika nim yang ada sesuai
                Mhs mhs = (Mhs) user; // casting objek nya
                if (mhs instanceof MhsSarjana) { // cek sebelum casting MhsSarjana
                    nama = mhs.getNama(); // ambil nama buat hiasan di output
                    MhsSarjana mhsSarjana = (MhsSarjana) mhs; // casting lagi
                    for (MatkulAmbil matkulAmbil : mhsSarjana.getMataKuliah()) { // mencari semua matkul yang dimiliki seorang mhs
                        if (matkulAmbil.getMatkul().getKode().equals(kodeMk)) { // jika sudah ketemu berdasarkan kode Mk
                            for (int i = 0; i < matkulAmbil.getN().length; i++) { // menghitung avg nilai matkul
                                totalNilai += matkulAmbil.getN()[i];
                            }
                            return "NIM               : " + nim + "\n"
                                    + "nama            : " + nama
                                    + "\n" + "totalNilai      : " + Math.round(totalNilai / matkulAmbil.getN().length);
                        }
                    }
                } else if (mhs instanceof MhsMagister) {
                    nama = mhs.getNama();
                    for (MatkulAmbil matkulAmbil : ((MhsMagister) mhs).getMataKuliah()) {
                        if (matkulAmbil.getMatkul().getKode().equals(kodeMk)) {
                            for (int i = 0; i < matkulAmbil.getN().length; i++) {
                                totalNilai += matkulAmbil.getN()[i];
                            }
                            return "NIM               : " + nim + "\n"
                                    + "nama            : " + nama
                                    + "\n" + "totalNilai      : " + Math.round(totalNilai / matkulAmbil.getN().length);
                        }
                    }
                }
            }
        }
        return "tidak ada data dari mahasiswa dengan nim " + nim;
    }

    public String printNr(String kodeMk) { // mencari rata-rata nilai dari sebuah matkul
        double totalNilai = 0;
        int totalMahasiswa = 0;
        String namaMatkul = "";

        for (User user : users) {
            if (user instanceof Mhs) { // casting menjadi Mhs
                Mhs mhs = (Mhs) user;

                // Proses MhsSarjana
                if (mhs instanceof MhsSarjana) {
                    MhsSarjana mhsSarjana = (MhsSarjana) mhs;
                    for (MatkulAmbil matkulAmbil : mhsSarjana.getMataKuliah()) {
                        if (matkulAmbil.getMatkul().getKode().equals(kodeMk)) {
                            double temp = 0;
                            namaMatkul = matkulAmbil.getMatkul().getNama(); // simpan nama mata kuliah
                            for (double nilai : matkulAmbil.getN()) {
                                temp += nilai;
                            }
                            totalNilai += temp / matkulAmbil.getN().length;
                            totalMahasiswa++;
                        }
                    }
                }

                // Proses MhsMagister
                else if (mhs instanceof MhsMagister) {
                    MhsMagister mhsMagister = (MhsMagister) mhs;
                    for (MatkulAmbil matkulAmbil : mhsMagister.getMataKuliah()) {
                        if (matkulAmbil.getMatkul().getKode().equals(kodeMk)) {
                            namaMatkul = matkulAmbil.getMatkul().getNama();
                            double temp = 0;
                            for (double nilai : matkulAmbil.getN()) {
                                totalNilai += nilai;
                            }
                            totalNilai += temp / matkulAmbil.getN().length;
                            totalMahasiswa++;
                        }
                    }
                }
            }
        }

        // Jika tidak ada mahasiswa yang mengambil mata kuliah dengan kode tersebut
        if (totalMahasiswa == 0) {
            return "Tidak ada mahasiswa yang mengambil mata kuliah dengan kode " + kodeMk;
        }

        // Hitung rata-rata nilai
        System.out.println(totalMahasiswa);
        double rataRataNilai = totalNilai / totalMahasiswa;
        return String.format("Mata Kuliah        : %s%nRata-rata Nilai   : %.2f", namaMatkul, rataRataNilai);
    }

    public String printMhsTidakLulus(String kodeMk) {
        int counter = 0;
        int totalMahasiswa = 0;
        String namaMatkul = "";
        for (User user : users) {
            if (user instanceof Mhs) {
                Mhs mhs = (Mhs) user;

                if (mhs instanceof MhsSarjana) {
                    MhsSarjana mhsSarjana = (MhsSarjana) mhs;
                    for (MatkulAmbil matkulAmbil : mhsSarjana.getMataKuliah()) {
                        if (matkulAmbil.getMatkul().getKode().equals(kodeMk)) {
                            namaMatkul = matkulAmbil.getMatkul().getNama();
                            double temp = 0;
                            for (int i = 0; i < matkulAmbil.getN().length; i++) {
                                temp += matkulAmbil.getN()[i];
                            }
                            temp /= matkulAmbil.getN().length;
                            if (temp < 56) {
                                counter++;
                            }
                            totalMahasiswa++;
                        }
                    }
                } else if (mhs instanceof MhsMagister) {
                    MhsMagister mhsMagister = (MhsMagister) mhs;
                    for (MatkulAmbil matkulAmbil : mhsMagister.getMataKuliah()) {
                        if (matkulAmbil.getMatkul().getKode().equals(kodeMk)) {
                            double temp = 0;
                            for (int i = 0; i < matkulAmbil.getN().length; i++) {
                                temp += matkulAmbil.getN()[i];
                            }
                            temp /= matkulAmbil.getN().length;
                            if (temp < 56) {
                                counter++;
                            }
                            totalMahasiswa++;
                        }
                    }
                }
            }
        }

        return "yang tidak lulus " + counter + " dari " + totalMahasiswa + " mahasiswa " + "\nmata Kuliah : " + namaMatkul;
    }

    public String printMatkulMhs(String NIM) {

        for (User user : users) {
            if (user instanceof Mhs) {
                Mhs mhs = (Mhs) user;
                if (mhs.getNim().equals(NIM)) {
                    return mhs.toString();
                }
            }
        }
        return "tidak ada mahasiswa dengan nim " + NIM;
    }

    public String printLamaMengajar(String NIK) {
        int jam = 0;
        for (User user : users) {
            if (user instanceof Dosen) {
                Dosen dosen = (Dosen) user;

                if (dosen instanceof DosenTetap) {
                    DosenTetap dosenTetap = (DosenTetap) dosen;
                    if (dosenTetap.getNIK().equals(NIK)) {
                        for (MatkulAjar matkulAjar : dosenTetap.getListMataKuliah()) {
                            for (PresensiStaff presensiStaff : matkulAjar.getPresensiStaff()) {
                                if (presensiStaff.getStatus() == StatusKehadiran.HADIR ) {
                                    jam += matkulAjar.getMataKuliah().getSKS();
                                }
                            }
                        }
                    }
                }
            }
        }

        if (jam == 0) {
            return "tidak mengajar sama sekali";
        } else {
            return "lama mengajar: " + jam + " jam";
        }
    }
    public String PrintGajiKaryawan(String NIK, String jabatan){
        double gaji = 0;
        int counterStaff = 0;
        for (User user : users) {
            switch (jabatan.toLowerCase()) {
                case "karyawan" :
                    if (user instanceof Karyawan) {
                        Karyawan karyawan = (Karyawan) user;
                        for (PresensiStaff presensiStaff : karyawan.getListPresensiStaff()){
                            if (presensiStaff.getStatus() == StatusKehadiran.HADIR) {
                                counterStaff++;
                            }
                        }
                        gaji = (counterStaff / 22) / karyawan.getGaji();
                    }
                    break;
                case "DosenHonorer" :
                    if (user instanceof DosenHonorer){
                        DosenHonorer dosenHonorer = (DosenHonorer) user;
                        for(MatkulAjar matkulAjar : dosenHonorer.getListMataKuliah()){
                            for (PresensiStaff presensiStaff : matkulAjar.getPresensiStaff()){
                                if (presensiStaff.getStatus() == StatusKehadiran.HADIR) {
                                    counterStaff++;
                                }
                            }
                        }
                        gaji = dosenHonorer.getHonorPerSKS() * counterStaff;
                    }
                    break;
                case "DosenTetap" :
                    if (user instanceof DosenTetap){
                        DosenTetap dosenTetap = (DosenTetap) user;
                        for(MatkulAjar matkulAjar : dosenTetap.getListMataKuliah()){
                            for (PresensiStaff presensiStaff : matkulAjar.getPresensiStaff()){
                                if (presensiStaff.getStatus() == StatusKehadiran.HADIR) {
                                    counterStaff++;
                                }
                            }
                        }
                        gaji = dosenTetap.getGaji() + (dosenTetap.getGaji() * 25000);
                    }
                    break;
                default:
            }
        }
        return "input jabatan tidak valid";
    }

}
