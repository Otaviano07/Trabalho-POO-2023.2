package sistema;

import java.util.Date;

public class Espaco {
    private static int idEspaco = 0;
    private String descricaoEspaco;
    private int capacidade;
    private boolean statusEspaco;
    private String recursosDisponiveis;
    private Date dataReservaEspaco;
    private Date horarioDisponivel;
    private String observacoes;

    public Espaco() {
        this.descricaoEspaco = null;
        this.capacidade = 0;
        this.statusEspaco = true;
        this.recursosDisponiveis = null;
        this.dataReservaEspaco = null;
        this.horarioDisponivel = null;
        this.observacoes = null;
    }
    

    public Espaco(String descricaoEspaco, int capacidade, boolean statusEspaco, String recursosDisponiveis,
            Date dataReservaEspaco, Date horarioDisponivel, String observacoes) {
        Espaco.idEspaco = idEspaco++;
        this.descricaoEspaco = descricaoEspaco;
        this.capacidade = capacidade;
        this.statusEspaco = statusEspaco;
        this.recursosDisponiveis = recursosDisponiveis;
        this.dataReservaEspaco = dataReservaEspaco;
        this.horarioDisponivel = horarioDisponivel;
        this.observacoes = observacoes;
    }

    public static int getIdEspaco() {
        return idEspaco;
    }


    public static void setIdEspaco(int idEspaco) {
        if(idEspaco > 0){
            Espaco.idEspaco = idEspaco;
        }
    }


    public String getDescricaoEspaco() {
        return descricaoEspaco;
    }


    public void setDescricaoEspaco(String descricaoEspaco) {
        if(descricaoEspaco != null){
            this.descricaoEspaco = descricaoEspaco;
        }  
    }


    public int getCapacidade() {
        return capacidade;
    }


    public void setCapacidade(int capacidade) {
        if(capacidade > 0){
            this.capacidade = capacidade;
        }
    }


    public boolean isStatusEspaco() {
        return statusEspaco;
    }


    public void setStatusEspaco(boolean statusEspaco) {
        this.statusEspaco = statusEspaco;
    }


    public String getRecursosDisponiveis() {
        return recursosDisponiveis;
    }


    public void setRecursosDisponiveis(String recursosDisponiveis) {
        if(recursosDisponiveis != null){
            this.recursosDisponiveis = recursosDisponiveis;
        }        
    }


    public Date getDataReservaEspaco() {
        return dataReservaEspaco;
    }


    public void setDataReservaEspaco(Date dataReservaEspaco) {
        if(dataReservaEspaco != null){
            this.dataReservaEspaco = dataReservaEspaco;
        }
    }


    public Date getHorarioDisponivel() {
        return horarioDisponivel;
    }


    public void setHorarioDisponivel(Date horarioDisponivel) {
        if(horarioDisponivel != null){
            this.horarioDisponivel = horarioDisponivel;
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


    public void adicionarEspaco(){

    }public void alterarEspaco(){
        
    }public void removerEspaco(){
        
    }public void realizarReforma(){
        
    }public void finalizarReforma(){
        
    }public void atualizarLocalizacao(){
        
    }public void verificarDisponibilidade(){
        
    }public void obterInformacoes(){
        
    }
}
