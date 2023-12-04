package main.java.sistema;

import java.time.LocalDate;
import java.util.Scanner;  // Adicione esta importação
import main.java.sistema.controller.ControllerUsuario;
import main.java.sistema.controller.ControllerPrincipal;
import main.java.sistema.controller.ControllerAdministrador;
import main.java.sistema.view.ViewPrincipal;
import main.java.sistema.view.ViewUsuario;
import main.java.sistema.view.ViewAdministrador;  // Adicione esta importação
import main.java.sistema.model.Administrador;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Adicione esta linha para criar o Scanner

        Administrador administrador = new Administrador(
                "Fernando Douglas Nascimento",
                LocalDate.of(1997, 9, 16),
                "068.033.243-03",
                "(88 98876 2694)",
                "douglasnascimento@gmail.com",
                "minhasenha",
                "Secretário"
        );

        Administrador.adicionarUsuario(administrador);

        ControllerUsuario controllerUsuario = new ControllerUsuario();
        ViewUsuario viewUsuario = new ViewUsuario(controllerUsuario, administrador);
        ControllerAdministrador controllerAdministrador = new ControllerAdministrador(administrador);
        ControllerPrincipal controllerPrincipal = new ControllerPrincipal(viewUsuario);

        // Alteração nesta linha para criar a instância do ViewAdministrador
        ViewAdministrador viewAdministrador = new ViewAdministrador(controllerAdministrador, scanner);

        // Restante do código...
        controllerPrincipal.setViewPrincipal(new ViewPrincipal(controllerPrincipal, viewAdministrador));  // Alteração nesta linha

        controllerPrincipal.iniciarPrograma();
    }
}