package sistema;

import java.util.Date;

public class Reserva {
    private static int idReserva = 0;
    private int idUsuarioSolicitante;
    private int idUsuarioAprovador;
    private String tipo;
    private Date dataReserva;
    private Date dataFinal;
    private Date horaReserva;
    private Date horaFinal;
    private int duracao;
    private String statusReserva;
    private String finalidade;
    private String observacao;
    
    public Reserva() {
        this.idUsuarioSolicitante = 0;
        this.idUsuarioAprovador = 0;
        this.tipo = null;
        this.dataReserva = null;
        this.dataFinal = null;
        this.horaReserva = null;
        this.horaFinal = null;
        this.duracao = 0;
        this.statusReserva = null;
        this.finalidade = null;
        this.observacao = null;
    }

    public Reserva(int idUsuarioSolicitante, int idUsuarioAprovador, String tipo, Date dataReserva,
     Date dataFinal, Date horaReserva, Date horaFinal, int duracao, String statusReserva, String finalidade,
      String observacao) {  
        Reserva.idReserva = idReserva++;
        this.setIdUsuarioSolicitante(idUsuarioSolicitante);
        this.setIdUsuarioAprovador(idUsuarioAprovador);
        this.setTipo(tipo);
        this.setDataReserva(dataReserva);
        this.setDataFinal(dataFinal);
        this.setHoraReserva(horaReserva);
        this.setHoraFinal(horaFinal);
        this.setDuracao(duracao);
        this.setStatusReserva(statusReserva);
        this.setFinalidade(finalidade);
        this.setObservacao(observacao);
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        if(idReserva > 0){
            Reserva.idReserva = idReserva;
        }
    }

    public int getIdUsuarioSolicitante() {
        return idUsuarioSolicitante;
    }

    public void setIdUsuarioSolicitante(int idUsuarioSolicitante) {
        if(idUsuarioSolicitante > 0){
            this.idUsuarioSolicitante = idUsuarioSolicitante;
        }
    }

    public int getIdUsuarioAprovador() {
        return idUsuarioAprovador;
    }

    public void setIdUsuarioAprovador(int idUsuarioAprovador) {
        if(idUsuarioAprovador > 0){
            this.idUsuarioAprovador = idUsuarioAprovador;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(tipo != null){   
            this.tipo = tipo;
        }
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        if (dataReserva != null) {
            this.dataReserva = dataReserva;
        }
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        if (dataReserva != null) {
            this.dataFinal = dataFinal;
        }        
    }

    public Date getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(Date horaReserva) {
        if (dataReserva != null) {
            this.horaReserva = horaReserva;
        } 
    }

    public Date getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Date horaFinal) {
        if (dataReserva != null) {
            this.horaFinal = horaFinal;
        }         
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        if(duracao > 0){
            this.duracao = duracao;
        }
    }

    public String getStatusReserva() {
        return statusReserva;
    }

    public void setStatusReserva(String statusReserva) {
        if(statusReserva != null){
            this.statusReserva = statusReserva;
        }
        
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        if(finalidade != null){
            this.finalidade = finalidade;
        }
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) { 
        if(observacao != null){
            this.observacao = observacao;
        }
    }

    public void solicitarReserva() {

    }

    public void alterarReserva() {

    }

    public void rejeitarReserva() {

    }

    public void aprovarReserva() {

    }

    public void excluirRerserva() {

    }
    
}

