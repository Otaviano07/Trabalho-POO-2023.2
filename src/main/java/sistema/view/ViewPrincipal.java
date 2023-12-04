package main.java.sistema.view;

import main.java.sistema.controller.ControllerPrincipal;

import java.util.Scanner;

public class ViewPrincipal {

    private ControllerPrincipal controllerPrincipal;
    private ViewAdministrador viewAdministrador;

    public ViewPrincipal(ControllerPrincipal controllerPrincipal, ViewAdministrador viewAdministrador) {
        this.controllerPrincipal = controllerPrincipal;
        this.viewAdministrador = viewAdministrador;
    }

    public void exibirMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("----- Menu Principal -----");
            System.out.println("[1] Fazer Login");
            System.out.println("[0] Sair do Programa");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Por favor, insira um número válido.");
                scanner.nextLine();
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    controllerPrincipal.realizarLogin();
                    break;
                case 0:
                    System.out.println("Saindo do Programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }
}
