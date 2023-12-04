package main.java.sistema.view;

import main.java.sistema.controller.ControllerUsuario;
import main.java.sistema.model.Usuario;
import main.java.sistema.model.Administrador;
import main.java.sistema.model.Professor;
import main.java.sistema.model.Aluno;
import main.java.sistema.model.Diretor;
import main.java.sistema.model.Coordenador;

import java.util.Scanner;

public class ViewUsuario {

    private ControllerUsuario controllerUsuario;

    public ViewUsuario(ControllerUsuario controllerUsuario) {
        this.controllerUsuario = controllerUsuario;
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
        ViewAdministrador viewAdministrador = new ViewAdministrador();
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
