package main.java.sistema.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Equipamento extends ItemReservavel {
    private String fabricante;
    private String modelo;
    private boolean manutencao;

    public Equipamento() {
        super();
        this.fabricante = null;
        this.modelo = null;
        this.manutencao = false;
    }

    public Equipamento(String descricao, int quantidade, boolean status, LocalDate dataDisponivel, String observacoes, String fabricante, String modelo, boolean manutencao) {
        super(descricao, quantidade, status, dataDisponivel, observacoes);
        this.setFabricante(fabricante);
        this.setModelo(modelo);
        this.setManutencao(manutencao);
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        if (fabricante != null) {
            this.fabricante = fabricante;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null) {
            this.modelo = modelo;
        }
    }

    public boolean isManutencao() {
        return manutencao;
    }

    public void setManutencao(boolean manutencao) {
        this.manutencao = manutencao;
    }

    public void realizarManutencao() {
        this.manutencao = true;
    }

    public void finalizarManutencao() {
        this.manutencao = false;
    }


    @Override
    public String toString() {
        return "Equipamento{" + super.toString() + ", marca=" + ", fabricante="
                + fabricante + ", modelo=" + modelo + ", manutencao=" + manutencao
                + ", dataCompra=" + '}';
    }
}