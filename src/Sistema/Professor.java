package Sistema;

public class Professor {
    private static int idProfessor = 0;

    public Professor() {
        Professor.idProfessor = idProfessor++;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        if (idProfessor > 0) {
            Professor.idProfessor = idProfessor;
        }
    }

    public boolean compartilharReserva() {
        return false;
    }

    public void aceitarReserva() {

    }

    public void alterarReserva() {

    }

    public void receberReserva() {

    }
}