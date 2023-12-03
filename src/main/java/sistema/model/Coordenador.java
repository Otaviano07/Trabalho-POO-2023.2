package main.java.sistema.model;

public class Coordenador {
    private static int idCoordenador = 0;
    private boolean viceCoordenador;    

    public Coordenador(){
        this.viceCoordenador = false;
    }

    public Coordenador(boolean viceCoordenador) {
        Coordenador.idCoordenador = idCoordenador++;
        this.setViceCoordenador(viceCoordenador);
    }

    public static int getIdCoordenador() {
        return idCoordenador;
    }

    public static void setIdCoordenador(int idCoordenador) {
        if (idCoordenador > 0) {
            Coordenador.idCoordenador = idCoordenador;
        }
    }

    public boolean isViceCoordenador() {
        return viceCoordenador;
    }
    
    public void setViceCoordenador(boolean viceCoordenador) {
        this.viceCoordenador = viceCoordenador;
    }

    public void aprovarReserva() {
        /*Esse método será utilizado para aprovar reserva solicitada pelo professor ou outro usuario*/
    }

    public void rejeitarReserva() {
        /*Esse método será utilizado para rejetirar solicitação de reserva de usuario*/
    }
}
