package Sistema;

public class Professor {
    private int idProfessor;
    private String[] disciplinas;

    public Professor() {
        this.idProfessor = 0;
        this.disciplinas = null;
    }

    public int getIdProfessor() {
        return this.idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public boolean compartilharReserva() {
        return true;
    }

    public void aceitarReserva() {

    }

    public void alterarReserva() {

    }

    public void receberReserva() {

    }
}
