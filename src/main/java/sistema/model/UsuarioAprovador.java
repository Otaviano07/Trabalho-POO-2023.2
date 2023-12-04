package main.java.sistema.model;

import java.time.LocalDate;

public class UsuarioAprovador extends Usuario {
    private boolean vice;

    public UsuarioAprovador(){
        super();
        this.vice = false;
    }

    public UsuarioAprovador(String nomeCompleto, LocalDate dataNascimento, String cpf, String telefone, String email, String senha, boolean vice) {
        super(nomeCompleto, dataNascimento, cpf, telefone, email, senha);
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
