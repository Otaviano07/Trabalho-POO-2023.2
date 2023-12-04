package main.java.sistema;

import java.time.LocalDate;
import main.java.sistema.controller.ControllerUsuario;
import main.java.sistema.controller.ControllerPrincipal;
import main.java.sistema.controller.ControllerAdministrador;
import main.java.sistema.view.ViewPrincipal;
import main.java.sistema.view.ViewUsuario;
import main.java.sistema.model.Administrador;

public class Main {

    public static void main(String[] args) {

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
        ViewUsuario viewUsuario = new ViewUsuario(controllerUsuario);
        ControllerAdministrador controllerAdministrador = new ControllerAdministrador(administrador);
        ControllerPrincipal controllerPrincipal = new ControllerPrincipal(viewUsuario);
        controllerPrincipal.setViewPrincipal(new ViewPrincipal(controllerPrincipal));
        controllerPrincipal.iniciarPrograma();
    }
}
