package main.java.sistema;

import main.java.sistema.controller.ControllerUsuario;

public class Main {
    public static void main(String[] args) {
        ControllerUsuario controller = new ControllerUsuario();
        controller.iniciarSistema();
    }
}