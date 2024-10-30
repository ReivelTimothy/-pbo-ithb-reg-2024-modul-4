package controller;
import java.util.ArrayList;
import java.util.List;

import models.DataDummy;
import models.classes.*;
import models.enumeration.*;
public class Controller {
    static  int a = 2;
    static  DataDummy dataDummy = new DataDummy();
    static  List<User> users = dataDummy.Generate();

    public String printData(String name) {
        for (User user : users) {
            if (name.equals(user.getNama())) {
                return user.toString();  // Mengembalikan string representasi dari pengguna
            }
        }
        return "name ini tidak ada";  // Mengembalikan pesan jika nama tidak ditemukan
    }

}
