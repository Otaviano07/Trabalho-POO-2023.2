package main.java.sistema.model;

import java.time.LocalDate;

public class Equipamento extends ItemReservavel {
    private static int idEquipamento;
    private String marca;
    private String fabricante;
    private String modelo;
    private boolean manutencao;
    private LocalDate dataCompra;


    public Equipamento() {
        super();
        this.setMarca(null);
        this.setFabricante(null);
        this.setModelo(null);
        this.setManutencao(false);
        this.setDataCompra(null);

    }

    public Equipamento(String descricaoEquipamento, int quantidade, boolean statusEquipamento,
                       String marca, String fabricante, String modelo, boolean manutencao,
                       LocalDate dataCompra, LocalDate dataReservaEquipamento, String observacao) {
        super(descricaoEquipamento, quantidade, statusEquipamento, dataReservaEquipamento, observacao);
        Equipamento.idEquipamento = idEquipamento++;
        this.setMarca(marca);
        this.setFabricante(fabricante);
        this.setModelo(modelo);
        this.setManutencao(manutencao);
        this.setDataCompra(dataCompra);

    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null) {
            this.marca = marca;
        }
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

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public void realizarManutencao() {
        /* Método para realizar alguma manutenção no equipamento, atualizando o atributo manutenção para true ou false */
    }

    public void finalizarManutencao() {
        /* Método para finalizar alguma manutenção no equipamento, atualizando o atributo manutenção para true ou false */
    }


    @Override
    public String toString() {
        return "Equipamento{" + super.toString() + ", marca=" + marca + ", fabricante="
                + fabricante + ", modelo=" + modelo + ", manutencao=" + manutencao
                + ", dataCompra=" + dataCompra + '}';
    }
}