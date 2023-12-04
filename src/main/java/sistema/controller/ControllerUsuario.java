package main.java.sistema.controller;

import main.java.sistema.model.Administrador;
import main.java.sistema.model.Usuario;

import java.util.ArrayList;

public class ControllerUsuario {
    private ArrayList<Usuario> usuarios = Administrador.getUsuarios();

    public Usuario fazerlogin(String email, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                return usuario;
            }
        }
        return null;
    }
}
