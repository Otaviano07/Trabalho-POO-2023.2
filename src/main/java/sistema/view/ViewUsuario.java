package main.java.sistema.view;

import main.java.sistema.controller.ControllerUsuario;
import main.java.sistema.model.Usuario;
import main.java.sistema.model.Administrador;
import main.java.sistema.model.Professor;
import main.java.sistema.model.Aluno;
import main.java.sistema.model.Diretor;
import main.java.sistema.model.Coordenador;
import main.java.sistema.controller.ControllerAdministrador;

import java.util.Scanner;

public class ViewUsuario {

    private ControllerUsuario controllerUsuario;
    private Administrador administrador;

    public ViewUsuario(ControllerUsuario controllerUsuario, Administrador administrador) {
        this.controllerUsuario = controllerUsuario;
        this.administrador = administrador;

    }

    public void fazerLogin() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o e-mail: ");
        String email = scanner.nextLine();

        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();

        Usuario usuarioLogado = controllerUsuario.fazerLogin(email, senha);

        if (usuarioLogado != null) {
            exibirMenu(usuarioLogado);
        } else {
            System.out.println("Login falhou. Verifique suas credenciais.");
        }
    }

    private void exibirMenu(Usuario usuario) {
        if (usuario instanceof Administrador) {
            abrirMenuAdministrador();
        } else if (usuario instanceof Professor) {
            abrirMenuProfessor();
        } else if (usuario instanceof Aluno) {
            abrirMenuAluno();
        } else if (usuario instanceof Diretor) {
            abrirMenuDiretor();
        } else if (usuario instanceof Coordenador) {
            abrirMenuCoordenador();
        }
    }

    private void abrirMenuAdministrador() {
        Scanner scanner = new Scanner(System.in);
        ControllerAdministrador controllerAdministrador = new ControllerAdministrador(administrador);

        ViewAdministrador viewAdministrador = new ViewAdministrador(controllerAdministrador, scanner);
        viewAdministrador.mostrarMenuAdministrador();
    }


    private void abrirMenuProfessor() {
        ViewProfessor viewProfessor = new ViewProfessor();
        viewProfessor.mostrarMenuProfessor();
    }

    private void abrirMenuAluno() {
        ViewAluno viewAluno = new ViewAluno();
        viewAluno.mostrarMenuAluno();
    }

    private void abrirMenuDiretor() {
        ViewDiretor viewDiretor = new ViewDiretor();
        viewDiretor.mostrarMenuDiretor();
    }

    private void abrirMenuCoordenador() {
        ViewCoordenador viewCoordenador = new ViewCoordenador();
        viewCoordenador.mostrarMenuCoordenador();
    }
}
