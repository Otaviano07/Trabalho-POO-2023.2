package main.java.sistema.model;

import java.time.LocalDate;

public class Espaco extends ItemReservavel {
    private static int idEspaco = 0;
    private boolean reforma;
    private LocalDate horarioDisponivel;

    public Espaco() {
        super();
        Espaco.idEspaco = idEspaco++;
        this.setReforma(false);
        this.setHorarioDisponivel(null);
    }

    public Espaco(String descricaoEspaco, int capacidade, boolean statusEspaco, boolean reforma, LocalDate dataReservaEspaco, LocalDate horarioDisponivel, String observacoes) {
        super(descricaoEspaco, capacidade, statusEspaco, dataReservaEspaco, observacoes);
        Espaco.idEspaco = idEspaco++;
        this.setReforma(reforma);
        this.setHorarioDisponivel(horarioDisponivel);
    }

    public boolean isReforma() {
        return reforma;
    }

    public void setReforma(boolean reforma) {
        this.reforma = reforma;
    }


    public LocalDate getHorarioDisponivel() {
        return horarioDisponivel;
    }

    public void setHorarioDisponivel(LocalDate horarioDisponivel) {
        if (horarioDisponivel != null) {
            this.horarioDisponivel = horarioDisponivel;
        }
    }


    public void realizarReforma() {
        /* Método para realizar alguma reforma no espaço, atualizando o atributo reforma para true ou false */
    }

    @Override
    public String toString() {
        return "Espaco{" + super.toString() + "reforma=" + reforma + ", horarioDisponivel=" + horarioDisponivel + '}';
    }
}

