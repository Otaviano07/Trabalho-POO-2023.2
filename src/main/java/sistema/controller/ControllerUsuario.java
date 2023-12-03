package main.java.sistema.controller;

import main.java.sistema.view.ViewPrincipal;

public class ControllerUsuario {
    private ViewPrincipal view;

    public ControllerUsuario() {
        this.view = new ViewPrincipal();
    }

    public void iniciarSistema() {
        int opcao;
        do {
            opcao = view.mostrarMenu();

            switch (opcao) {
                case 1:
                    // Lógica para gerenciar espaços
                    break;
                case 2:
                    // Lógica para gerenciar equipamentos
                    break;
                case 3:
                    // Lógica para gerenciar reservas
                    break;
                case 4:
                    view.mostrarMensagem("Sistema encerrado.");
                    break;
                default:
                    view.mostrarMensagem("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);
    }

}
