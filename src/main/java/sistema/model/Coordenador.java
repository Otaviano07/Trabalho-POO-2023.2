package main.java.sistema.model;

import java.time.LocalDate;

public class Coordenador extends UsuarioAprovador {

    public Coordenador(String nomeCompleto, LocalDate dataNascimento, String cpf, String telefone, String email, String senha, boolean vice) {
        super(nomeCompleto, dataNascimento, cpf, telefone, email, senha, vice);
    }
}
