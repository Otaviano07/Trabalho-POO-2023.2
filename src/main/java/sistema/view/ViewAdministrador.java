package main.java.sistema.view;

import main.java.sistema.controller.ControllerAdministrador;

import java.time.LocalDate;
import java.util.Scanner;

public class ViewAdministrador {
    private final ControllerAdministrador controller;
    private final Scanner scanner;

    public ViewAdministrador(ControllerAdministrador controller, Scanner scanner) {
        this.controller = controller;
        this.scanner = scanner;
    }

    public void mostrarMenuAdministrador() {
        boolean continuarExecucao = true;

        while (continuarExecucao) {
            System.out.println("Menu Administrador:");
            System.out.println("1 - Gerenciar espaços");
            System.out.println("2 - Gerenciar equipamentos");
            System.out.println("3 - Gerenciar reservas");
            System.out.println("4 - Gerenciar usuários");
            System.out.println("5 - Sair");

            int escolhaMenuPrincipal = scanner.nextInt();
            scanner.nextLine();

            switch (escolhaMenuPrincipal) {
                case 1:
                    mostrarMenuEspacos();
                    break;
                case 2:
                    mostrarMenuEquipamentos();
                    break;
                case 3:
                    mostrarMenuReservas();
                    break;
                case 4:
                    mostrarMenuUsuarios();
                    break;
                case 5:
                    continuarExecucao = false;
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
                    break;
            }
        }
    }

    private void mostrarMenuEspacos() {
        boolean voltar = false;

        while (!voltar) {
            System.out.println("Opções para Gerenciar Espaços:");
            System.out.println("1 - Adicionar espaço");
            System.out.println("2 - Remover espaço");
            System.out.println("3 - Editar espaço");
            System.out.println("4 - Voltar");

            int escolhaEspacos = scanner.nextInt();
            scanner.nextLine();

            switch (escolhaEspacos) {
                case 1:
                    System.out.print("Digite a descrição do espaço: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Digite a quantidade disponível: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Digite alguma observação sobre o espaço: ");
                    String observacoes = scanner.nextLine();
                    System.out.print("Digite a capacidade do espaço: ");
                    int capacidade = scanner.nextInt();

                    controller.adicionarEspaco(descricao, quantidade, false, LocalDate.of(2024, 9, 16) , observacoes, capacidade, false);
                    break;
                case 2:
                    System.out.print("Digite o ID do : ");

                    controller.removerEspaco();
                    break;
                case 3:
                    controller.editarEspaco();
                    break;
                case 4:
                    voltar = true;
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
                    break;
            }
        }
    }
    public void mostrarMenuEquipamentos() {
        System.out.println("Opções para Gerenciar Equipamentos:");
        System.out.println("1 - Adicionar equipamento");
        System.out.println("2 - Remover equipamento");
        System.out.println("3 - Editar equipamento");
        System.out.println("4 - Voltar");
    }

    public void mostrarMenuReservas() {
        System.out.println("Opções para Gerenciar Reservas:");
        System.out.println("1 - Adicionar reserva");
        System.out.println("2 - Remover reserva");
        System.out.println("3 - Editar reserva");
        System.out.println("4 - Voltar");    }

    public void mostrarMenuUsuarios() {
        System.out.println("Opções para Gerenciar Usuários:");
        System.out.println("1 - Administradores");
        System.out.println("2 - Alunos");
        System.out.println("3 - Professores");
        System.out.println("4 - Coordenadores");
        System.out.println("5 - Diretores");
        System.out.println("6 - Voltar");}

    public void mostrarMenuProfessores() {
        System.out.println("Opções para Gerenciar Professores:");
        System.out.println("1 - Adicionar professor");
        System.out.println("2 - Remover professor");
        System.out.println("3 - Editar professor");
        System.out.println("4 - Voltar");    }

    public void mostrarMenuAdministradores() {
        System.out.println("Opções para Gerenciar Administradores:");
        System.out.println("1 - Adicionar administrador");
        System.out.println("2 - Remover administrador");
        System.out.println("3 - Editar administrador");
        System.out.println("4 - Voltar");    }

    public void mostrarMenuAlunos() {
        System.out.println("Opções para Gerenciar Alunos:");
        System.out.println("1 - Adicionar aluno");
        System.out.println("2 - Remover aluno");
        System.out.println("3 - Editar aluno");
        System.out.println("4 - Voltar");    }

    public void mostrarMenuCoordenadores() {
        System.out.println("Opções para Gerenciar Coordenadores:");
        System.out.println("1 - Adicionar coordenador");
        System.out.println("2 - Remover coordenador");
        System.out.println("3 - Editar coordenador");
        System.out.println("4 - Voltar");    }

    public void mostrarMenuDiretores() {
        System.out.println("Opções para Gerenciar Diretores:");
        System.out.println("1 - Adicionar diretor");
        System.out.println("2 - Remover diretor");
        System.out.println("3 - Editar diretor");
        System.out.println("4 - Voltar");    }

}
