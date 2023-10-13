package Sistema;

public class Diretor {
    private static int idDiretor = 0;
    private boolean viceDiretor;    

    public Diretor(){
        this.viceDiretor = false;
    }

    public Diretor(boolean viceDiretor) {
        Diretor.idDiretor = idDiretor++;
        this.setViceDiretor(viceDiretor);
    }

    public static int getIdDiretor() {
        return idDiretor;
    }

    public static void setIdDiretor(int idDiretor) {
        if (idDiretor > 0) {
            Diretor.idDiretor = idDiretor;
        }
    }

    public boolean isViceDiretor() {
        return viceDiretor;
    }
    
    public void setViceDiretor(boolean viceDiretor) {
        this.viceDiretor = viceDiretor;
    }

    public void aprovarReserva() {

    }

    public void rejeitarReserva() {

    }
}
