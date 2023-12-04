package main.java.sistema.controller;

import main.java.sistema.model.Administrador;
import main.java.sistema.model.Usuario;

import java.util.ArrayList;

public class ControllerUsuario {
    private ArrayList<Usuario> usuarios = Administrador.getUsuarios();

    public Usuario fazerLogin(String email, String senha) {
        System.out.println("Tentando fazer login com email: " + email + " e senha: " + senha);

        for (Usuario usuario : usuarios) {
            System.out.println("Comparando com usuário: " + usuario.getEmail() + " e senha: " + usuario.getSenha());

            if (usuario.getEmail().trim().equals(email.trim()) && usuario.getSenha().equals(senha)) {
                System.out.println("Login bem-sucedido para o usuário: " + usuario.getNomeCompleto());
                return usuario;
            }
        }

        System.out.println("Login falhou para email: " + email);
        return null;
    }

/*
    public Usuario fazerLogin(String email, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                return usuario;
            }
        }
        return null;
    }

    */
}
