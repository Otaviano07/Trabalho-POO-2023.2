package sistema;

import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("==== Sistema de Reservas ====");
        System.out.println("1. Gerenciar Espaços");
        System.out.println("2. Gerenciar Equipamentos");
        System.out.println("3. Gerenciar Reservas");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");

        return scanner.nextInt();
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    // Métodos para interação com o usuário, se necessário
}

