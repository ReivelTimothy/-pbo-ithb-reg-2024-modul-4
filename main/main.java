package main;

import java.util.ArrayList;
import java.util.List;

import models.classes.*;
import controller.Controller;
import view.View;
import javax.swing.*;

public class main {
    static Controller c = new Controller();

    public static void main(String[] args) {
        View view = new View();
        view.showMenu();

    }
}
