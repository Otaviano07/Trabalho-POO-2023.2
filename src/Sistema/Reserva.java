package Sistema;

import java.util.Date;

public class Reserva {
    private static int idReserva = 0;
    private int matriculaSolicitante;
    private int matriculaAprovador;
    private String tipoReserva;
    private Date dataReserva;
    private Date dataFinal;
    private Date horaReserva;
    private Date horaFinal;
    private int duracao;
    private String statusReserva;
    private String finalidade;
    private String observacao;
    
    public Reserva() {
        this.matriculaSolicitante = 0;
        this.matriculaAprovador = 0;
        this.tipoReserva = null;
        this.dataReserva = null;
        this.dataFinal = null;
        this.horaReserva = null;
        this.horaFinal = null;
        this.duracao = 0;
        this.statusReserva = null;
        this.finalidade = null;
        this.observacao = null;
    }

    public Reserva(int matriculaSolicitante, int matriculaAprovador, String tipoReserva, Date dataReserva,
     Date dataFinal, Date horaReserva, Date horaFinal, int duracao, String statusReserva, String finalidade,
      String observacao) {             
        this.setMatriculaSolicitante(matriculaSolicitante);
        this.setMatriculaAprovador(matriculaAprovador);
        this.setTipoReserva(tipoReserva);
        this.setDataReserva(dataReserva);
        this.setDataFinal(dataFinal);
        this.setHoraReserva(horaReserva);
        this.setHoraFinal(horaFinal);
        this.setDuracao(duracao);
        this.setStatusReserva(statusReserva);
        this.setFinalidade(finalidade);
        this.setObservacao(observacao);

        this.idReserva = ++idReserva;
    }

    public static int getIdReserva() {
        return idReserva;
    }

    public static void setIdReserva(int idReserva) {
        Reserva.idReserva = idReserva;
    }

    public int getMatriculaSolicitante() {
        return matriculaSolicitante;
    }

    public void setMatriculaSolicitante(int matriculaSolicitante) {
        this.matriculaSolicitante = matriculaSolicitante;
    }

    public int getMatriculaAprovador() {
        return matriculaAprovador;
    }

    public void setMatriculaAprovador(int matriculaAprovador) {
        this.matriculaAprovador = matriculaAprovador;
    }

    public String getTipoReserva() {
        return tipoReserva;
    }

    public void setTipoReserva(String tipoReserva) {
        this.tipoReserva = tipoReserva;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Date getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(Date horaReserva) {
        this.horaReserva = horaReserva;
    }

    public Date getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Date horaFinal) {
        this.horaFinal = horaFinal;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getStatusReserva() {
        return statusReserva;
    }

    public void setStatusReserva(String statusReserva) {
        this.statusReserva = statusReserva;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) { // Correção aqui: de Sgtring para String
        this.observacao = observacao;
    }
    
}

