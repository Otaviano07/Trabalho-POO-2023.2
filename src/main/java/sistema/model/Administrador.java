package main.java.sistema.model;

public class Administrador extends Usuario {
    private static int id = 0;
    private boolean vice;

    public Administrador(){
        this.vice = false;
    }

    public Administrador(boolean vice) {
        Administrador.id = id++;
        this.setVice(vice);
    }

    public static int getId() {
        return id;
    }

    public static void setIdDiretor(int id) {
        if (id > 0) {
            Administrador.id = id;
        }
    }

    public boolean isVice() {
        return vice;
    }

    public void setVice(boolean vice) {
        this.vice = vice;
    }

    public void aprovarReserva() {
        /*Esse método será utilizado para aprovar reserva solicitada pelo professor ou outro usuario*/
    }

    public void rejeitarReserva() {
        /*Esse método será utilizado para rejetirar solicitação de reserva de usuario*/
    }
}
