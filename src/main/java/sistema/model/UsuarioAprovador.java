package main.java.sistema.model;

public class UsuarioAprovador extends Usuario {
    private boolean vice;

    public UsuarioAprovador(){
        this.vice = false;
    }

    public UsuarioAprovador(boolean vice) {
        this.setVice(vice);
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
