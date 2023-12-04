package main.java.sistema.model;
import java.time.LocalDate;

public class ItemReservavel {
    private static int id = 0;
    private String descricao;
    private int quantidade;
    private boolean status;
    private LocalDate dataReserva;
    private String observacoes;

    public ItemReservavel() {
        this.descricao = null;
        this.quantidade = 0;
        this.status = true;
        this.dataReserva = null;
        this.observacoes = null;
    }

    public ItemReservavel(String descricao, int quantidade, boolean status, LocalDate dataReserva, String observacoes) {
        ItemReservavel.id = id++;
        this.setDescricao(descricao);
        this.setQuantidade(quantidade);
        this.setStatus(status);
        this.setDataReserva(dataReserva);
        this.setObservacoes(observacoes);
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        if(id > 0){
            ItemReservavel.id = id;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao != null){
            this.descricao = descricao;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade > 0){
            this.quantidade = quantidade;
        }
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        if (dataReserva != null) {
            this.dataReserva = dataReserva;
        }
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        if(observacoes != null){
            this.observacoes = observacoes;
        }
    }


    public void adicionar() {

    }

    public void remover() {

    }

    public void alterar() {

    }

    public void atualizarStatus() {

    }

    public void verificarDisponibilidade() {

    }

    @Override
    public String toString() {
        return "ItemReservavel{" + "descricao=" + descricao + ", quantidade=" + quantidade + ", status=" + status + ", dataReserva=" + dataReserva + ", observacoes=" + observacoes + '}';
    }
}
