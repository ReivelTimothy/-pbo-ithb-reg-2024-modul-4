package models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import models.classes.*;
import models.enumeration.StatusKehadiran;

public class DataDummy {

    public List<User> Generate() {
        // Data dummy untuk kelas MataKuliah
        MataKuliah matkul1 = new MataKuliah("MK001", 3, "Pemrograman");
        MataKuliah matkul2 = new MataKuliah("MK002", 2, "Matematika");

        // Data dummy untuk kelas mataKulPilihan
        MataKuliah matkulPil1 = new MatkulPilihan("MP001", 2, "Agikultural", 0);
        MataKuliah matkutPil2 = new MatkulPilihan("MP002", 2, "Game Des", 2);

        // Data dummy untuk kelas Presensi
        Presensi presensi1 = new Presensi(new java.sql.Date(System.currentTimeMillis()), StatusKehadiran.HADIR);
        Presensi presensi2 = new Presensi(new java.sql.Date(0), StatusKehadiran.ALPHA);
        System.out.println(presensi1.getTanggal());
        ArrayList<Presensi> listPresensi = new ArrayList<>();
        listPresensi.add(presensi1);
        listPresensi.add(presensi2);

        // Data dummy untuk kelas PresensiStaff
        PresensiStaff presensiStaff1 = new PresensiStaff(new java.sql.Date(System.currentTimeMillis()),
                StatusKehadiran.ALPHA, 2);
        PresensiStaff presensiStaff2 = new PresensiStaff(new java.sql.Date(System.currentTimeMillis()),
                StatusKehadiran.HADIR, 2);
        List<PresensiStaff> listPresensiStaff = new ArrayList<>();
        listPresensiStaff.add(presensiStaff1);
        listPresensiStaff.add(presensiStaff2);

        // Data dummy untuk kelas MatkulAmbil
        MatkulAmbil matkulAmbil1 = new MatkulAmbil(matkul1, listPresensi, new int[]{85, 90, 88});
        MatkulAmbil matkulAmbil2 = new MatkulAmbil(matkul2, listPresensi, new int[]{70, 75, 80});
        ArrayList<MatkulAmbil> listMataKuliahAmbil = new ArrayList<>();
        listMataKuliahAmbil.add(matkulAmbil1);
        listMataKuliahAmbil.add(matkulAmbil2);

        // Data dummy untuk kelas matkul ajar
        MatkulAjar matkulAjar1 = new MatkulAjar(matkulPil1, listPresensiStaff);
        MatkulAjar matkulAjar2 = new MatkulAjar(matkutPil2, listPresensiStaff);
        ArrayList<MatkulAjar> listMatkulAjar = new ArrayList<>();
        listMatkulAjar.add(matkulAjar2);
        listMatkulAjar.add(matkulAjar1);

        // Data dummy Mahasiswa ----
        // Data dummy untuk kelas MhsSarjana
        Mhs mahsSarjana1 = new MhsSarjana("Reivel", null, null, null, "1123010", null, listMataKuliahAmbil);

        // Data dummy untuk kelas MhsMagister
        Mhs mhsMagister1 = new MhsMagister(null, null, null, null, "1123010", null, listMataKuliahAmbil, null);

        // Data dummy untuk kelas MhsDoktor
        Mhs mhsDoktor1 = new MhsDoktor(null, null, null, null, null, "1123010", null, null);


        // Data dummy staff ----
        // Data dummy untuk kelas Dosen
        Staff dosentetap1 = new DosenTetap("rafael", "taman rahayu 3", new Date(System.currentTimeMillis()), "082310419", "019238421", 10000, "informatika", listMatkulAjar, 0);
        Staff dosenHonorer1 = new DosenHonorer(null, null, null, null, null, 0, null, listMatkulAjar, 0);

        // Data dummyKaryawan
        Staff karyawan1 = new Karyawan("ruben", null, null, null, null, 0, listPresensiStaff);
        Staff karyawan2 = new Karyawan(null, null, null, null, null, 0, listPresensiStaff);

        // taru di satu list datanya 
        List<User> listUsers = new ArrayList<>();
        listUsers.add(dosenHonorer1);
        listUsers.add(dosentetap1);
        listUsers.add(karyawan1);
        listUsers.add(karyawan2);
        listUsers.add(mahsSarjana1);
        listUsers.add(mhsMagister1);
        listUsers.add(mhsDoktor1);

        return listUsers;
    }
}