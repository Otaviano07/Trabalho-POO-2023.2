package main.java.sistema.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.time.LocalDate;
import java.time.LocalTime;

import main.java.sistema.model.Reserva;

public class ControllerReserva {
    private ArrayList<Reserva> reservas;

    public ControllerReserva() {
        this.reservas = new ArrayList<>();
    }

    public void adicionarReserva(int idUsuarioSolicitante, String tipo, LocalDate dataReserva,
                                 LocalDate dataFinal, LocalTime horaReserva, LocalTime horaFinal, int duracao, String finalidade,
                                 String observacao) {
        Reserva reserva = new Reserva(idUsuarioSolicitante, tipo, dataReserva, dataFinal, horaReserva, horaFinal, duracao, finalidade, observacao);
        reservas.add(reserva);
    }

    public void removerReserva(int idReserva) {
        Iterator<Reserva> iterator = reservas.iterator();
        while (iterator.hasNext()) {
            Reserva reserva = iterator.next();
            if (reserva.getIdReserva() == idReserva) {
                iterator.remove();
            }
        }
    }

    public boolean solicitarEdicaoReserva(int idReserva) {
        for (Reserva reserva : reservas) {
            if (reserva.getIdReserva() == idReserva) {
                return true;
            }
        }
        return false;
    }

    public void editarReserva(int idReserva, String tipo, LocalDate dataReserva,
                              LocalDate dataFinal, LocalTime horaReserva, LocalTime horaFinal, int duracao, String finalidade,
                              String observacao) {
        for (Reserva reserva : reservas) {
            if (reserva.getIdReserva() == idReserva) {
                reserva.setTipo(tipo);
                reserva.setDataReserva(dataReserva);
                reserva.setDataFinal(dataFinal);
                reserva.setHoraReserva(horaReserva);
                reserva.setHoraFinal(horaFinal);
                reserva.setDuracao(duracao);
                reserva.setFinalidade(finalidade);
                reserva.setObservacao(observacao);
                break;
            }
        }
    }


    public ArrayList<Reserva> listarReservas() {
        return reservas;
    }

    public Reserva buscarReserva(int idReserva) {
        for (Reserva reserva : reservas) {
            if (reserva.getIdReserva() == idReserva) {
                return reserva;
            }
        }
        return null;
    }
}