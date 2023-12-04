package main.java.sistema.model;
import java.util.ArrayList;
import java.time.LocalDate;
import main.java.sistema.model.Professor;

public class Administrador {
    private static int idSecretaria = 0;
    private ArrayList<Professor> professores;
    private ArrayList<Coordenador> coordenadores;
    private ArrayList<Diretor> diretores;
    private ArrayList<Reserva> reservas;
    private ArrayList<Espaco> espacos;
    private ArrayList<Equipamento> equipamentos;

    public Administrador() {
        this.professores = new ArrayList<>();
        this.coordenadores = new ArrayList<>();
        this.diretores = new ArrayList<>();
        this.reservas = new ArrayList<>();
        this.espacos = new ArrayList<>();
        this.equipamentos = new ArrayList<>();
    }

    public Administrador(ArrayList<Professor> professores, ArrayList<Coordenador> coordenadores, ArrayList<Diretor> diretores, ArrayList<Reserva> reservas, ArrayList<Espaco> espacos, ArrayList<Equipamento> equipamentos) {
        Administrador.idSecretaria = idSecretaria++;
        this.setProfessores(professores);
        this.setCoordenadores(coordenadores);
        this.setDiretores(diretores);
        this.setReservas(reservas);
        this.setEspacos(espacos);
        this.setEquipamentos(equipamentos);
    }

    public static int getIdSecretaria() {
        return idSecretaria;
    }

    public static void setIdSecretaria(int idSecretaria) {
        if (idSecretaria > 0) {
            Administrador.idSecretaria = idSecretaria;
        }
    }

    public ArrayList<Professor> getProfessores() {
        return this.professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        if (professores != null) {
            this.professores = professores;
        }
    }

    public ArrayList<Coordenador> getCoordenadores() {
        return coordenadores;
    }

    public void setCoordenadores(ArrayList<Coordenador> coordenadores) {
        if (coordenadores != null) {
            this.coordenadores = coordenadores;
        }
    }

    public ArrayList<Diretor> getDiretores() {
        return diretores;
    }

    public void setDiretores(ArrayList<Diretor> diretores) {
        if (diretores != null) {
            this.diretores = diretores;
        }
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        if (reservas != null) {
            this.reservas = reservas;
        }
    }

    public ArrayList<Espaco> getEspacos() {
        return espacos;
    }

    public void setEspacos(ArrayList<Espaco> espacos) {
        if (espacos != null) {
            this.espacos = espacos;
        }
    }

    public ArrayList<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(ArrayList<Equipamento> equipamentos) {
        if (equipamentos != null) {
            this.equipamentos = equipamentos;
        }
    }

    public Professor adicionarProfessor(String nomeCompleto, LocalDate dataNascimento, String cpf,
                                        String telefone, String email, String formacao,
                                        String senha) {

        Professor novoProfessor = new Professor();

        novoProfessor.setNomeCompleto(nomeCompleto);
        novoProfessor.setDataNascimento(dataNascimento);
        novoProfessor.setCpf(cpf);
        novoProfessor.setTelefone(telefone);
        novoProfessor.setEmail(email);
        novoProfessor.setFormacao(formacao);
        novoProfessor.setSenha(senha);

        return novoProfessor;
    }




}
