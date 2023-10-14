package Sistema;

import java.util.Date;

public class Espaco {
    private static int idEspaco = 0;
    private String descricaoEspaco;
    private int capacidade;
    private boolean statusEspaco;
    private boolean reforma;
    private String recursosDisponiveis;
    private Date dataReservaEspaco;
    private Date horarioDisponivel;
    private String observacoes;

    public Espaco() {
        this.descricaoEspaco = null;
        this.capacidade = 0;
        this.statusEspaco = true;
        this.reforma = false;
        this.recursosDisponiveis = null;
        this.dataReservaEspaco = null;
        this.horarioDisponivel = null;
        this.observacoes = null;
    }
    

    public Espaco(String descricaoEspaco, int capacidade, boolean statusEspaco, boolean reforma, String recursosDisponiveis,
            Date dataReservaEspaco, Date horarioDisponivel, String observacoes) {
        Espaco.idEspaco = idEspaco++;
        this.setDescricaoEspaco(descricaoEspaco);
        this.setCapacidade(capacidade);
        this.setStatusEspaco(statusEspaco);
        this.setReforma(reforma);
        this.setRecursosDisponiveis(recursosDisponiveis);
        this.setDataReservaEspaco(dataReservaEspaco);
        this.setHorarioDisponivel(horarioDisponivel);
        this.setObservacoes(observacoes);
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
        /*Esse método será utilizado para adicionar um espaço novo */
    }
    
    public void alterarEspaco(){
        /*Esse método será utilizado para alterar alguma informação do 
        espaço cadastrado */
    }
    
    public void removerEspaco(){
        /*Esse método será utilizado para remover um espaço cadastrado */
    }
    
    public void realizarReforma(){
        /*Esse método será utilizado para realizar alguma reformar no espaço, 
        atualizando o atributo reforma para true ou false*/
    }

    public void atualizarStatus(){
        /*Esse método será utilizado para atualizar o status do espaco
         pelo atributo statusEspaco*/
   }
    
    public void obterInformacoes(){
            /*Esse método será utilizado para obter as informações do espaço, 
            como descricaoEspaco, capacidade, statusEspaco, recursosDisponiveis 
            e observações como exemplo */
    }
}
