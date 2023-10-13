package sistema;

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

    public void compartilharReserva() {
        /*Esse método será utilizado para compatilhar reserva para outro professor, 
        caso mesmo depois de tido a aprovação do coordenado/diretor poderá compatilhar a reserva*/
    }

    public void aceitarReserva() {
        /*Esse método será utilizado para aceitar reserva compatilhada por outro professor*/
    }

}