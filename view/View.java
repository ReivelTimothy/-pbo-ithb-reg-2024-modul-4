package view;
import controller.Controller;
import javax.swing.*;

public class View {
    public void showMenu() {

        boolean running = true;
        Controller controller = new Controller();
        String menu = "1. Print UserData\n" +
                "2. Print Nilai Akhir Mahasiswa\n" +
                "3. Print Rata-Rata Nilai Akhir\n" +
                "4. Print Jumlah Mahasiswa Tidak Lulus\n" +
                "5. Print Mata Kuliah Ambil Mahasiswa\n" +
                "6. Print Total Jam Mengajar Dosen\n" +
                "7. Print Gaji Staff\n" +
                "0. Exit\n" +
                "Pilih menu:";

        while (running) {
            int input = Integer.parseInt(JOptionPane.showInputDialog(menu))
                    ;

            switch (input) {

                case 1:
                    String nama = getinput("masukan nama");

                    showMesaage(controller.printData(nama));
                    break;

                case 2:
                    String nim = getinput("masukan nim");
                    String kodeMk = getinput("masukan kode mk");
                    showMesaage(controller.printNa(kodeMk, nim));

                    break;

                case 3:
                    String kodeMk1 = getinput("masukan Mk");
                    showMesaage(controller.printNr(kodeMk1));
                    break;

                case 4:
                    String namaMk = getinput("masukan nama");
                    showMesaage(controller.printMhsTidakLulus(namaMk));

                    break;

                case 5:
                    String nimm = getinput("masukan nim");
                    showMesaage(controller.printMatkulMhs(nimm));
                    break;

                case 6:
                    String Nik =getinput("masukan nik");
                    showMesaage(controller.printLamaMengajar(Nik));
                    break;

                case 7:
                    String jabatan = getinput("masukan jabatan");
                    String Niik = getinput("masukan NIK");
                    showMesaage(controller.PrintGajiKaryawan(Niik, jabatan));
                    break;
                case 0:
                    running = false;
                    break;

            }

        }

    }

    public static void PrintMenu(){

        int input = Integer.parseInt(JOptionPane.showInputDialog("masukan input"));
    }
    public void showMesaage(String pesan){
        JOptionPane.showMessageDialog(null,pesan);
    }
    public String getinput(String pesan){
        return JOptionPane.showInputDialog(null,pesan);
    }

}
