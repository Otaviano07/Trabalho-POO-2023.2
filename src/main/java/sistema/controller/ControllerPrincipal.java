package main.java.sistema.controller;

import main.java.sistema.view.ViewUsuario;
import main.java.sistema.view.ViewPrincipal;

public class ControllerPrincipal {

    private ViewPrincipal viewPrincipal;
    private ViewUsuario viewUsuario;

    public ControllerPrincipal(ViewUsuario viewUsuario) {
        this.viewUsuario = viewUsuario;
    }

    public void setViewPrincipal(ViewPrincipal viewPrincipal) {
        this.viewPrincipal = viewPrincipal;
    }

    public void iniciarPrograma() {
        viewPrincipal.exibirMenuPrincipal();
    }

    public void realizarLogin() {
        viewUsuario.fazerLogin();
    }
}
