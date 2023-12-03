package main.java.sistema.model;

public class ItemReservavel {
private static int idItemReservavel = 0;
    private String descricaoItem;
    private boolean statusItem;
    private boolean reforma;
    private String recursosDisponiveis;
    private String observacoes;

    public ItemReservavel() {
        this.descricaoItem = null;
        this.statusItem = true;
        this.reforma = false;
        this.recursosDisponiveis = null;
        this.observacoes = null;
    }

    public ItemReservavel(String descricaoItem, boolean statusItem, boolean reforma, String recursosDisponiveis,
            String observacoes) {
        ItemReservavel.idItemReservavel = idItemReservavel++;
        this.setDescricaoItem(descricaoItem);
        this.setStatusItem(statusItem);
        this.setReforma(reforma);
        this.setRecursosDisponiveis(recursosDisponiveis);
        this.setObservacoes(observacoes);
    }

    public static int getIdItemReservavel() {
        return idItemReservavel;
    }

    public static void setIdItemReservavel(int idItemReservavel) {
        if(idItemReservavel > 0){
            ItemReservavel.idItemReservavel = idItemReservavel;
        }
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        if(descricaoItem != null){
            this.descricaoItem = descricaoItem;
        }
    }

    public boolean isStatusItem() {
        return statusItem;
    }

    public void setStatusItem(boolean statusItem) {
        this.statusItem = statusItem;
    }

    public boolean isReforma() {
        return reforma;
    }

    public void setReforma(boolean reforma) {
        this.reforma = reforma;
    }

    public String getRecursosDisponiveis() {
        return recursosDisponiveis;
    }

    public void setRecursosDisponiveis(String recursosDisponiveis) {
        if(recursosDisponiveis != null){
            this.recursosDisponiveis = recursosDisponiveis;
        }
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        if(observacoes != null){
            this.observacoes = observacoes;
}}}
