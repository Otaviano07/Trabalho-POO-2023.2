package sistema;

public class Controller {
    private View view;

    public Controller() {
        this.view = new View();
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
