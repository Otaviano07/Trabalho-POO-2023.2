package sistema;

public class Secretaria {
    private static int idSecretaria = 0;
    private Professor[] professores;
    private Coordenador[] coordenadores;
    private Diretor[] diretores;
    private Reserva[] reservas;
    private Espaco[] espacos;
    private Equipamento[] equipamentos;

    public Secretaria() {
        this.professores = null;
        this.coordenadores = null;
        this.diretores = null;
        this.reservas = null;
        this.equipamentos = null;
    }

    public Secretaria(Professor[] professores, Coordenador[] coordenadores, Diretor[] diretores, Reserva[] reservas, Espaco[] espacos, Equipamento[] equipamentos) {
        Secretaria.idSecretaria = idSecretaria++;
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
            Secretaria.idSecretaria = idSecretaria;
        }
    }

    public Professor[] getProfessores() {
        return this.professores;
    }

    public void setProfessores(Professor[] professores) {
        if(professores != null) {
            this.professores = professores;
        }
    }

    public Coordenador[] getCoordenadores() {
        return coordenadores;
    }

    public void setCoordenadores(Coordenador[] coordenadores) {
        if(coordenadores != null) {
            this.coordenadores = coordenadores;
        }
    }

    public Diretor[] getDiretores() {
        return diretores;
    }

    public void setDiretores(Diretor[] diretores) {
        if(diretores != null) {
            this.diretores = diretores;
        }
    }

    public Reserva[] getReservas() {
        return reservas;
    }

    public void setReservas(Reserva[] reservas) {
        if(reservas != null) {
            this.reservas = reservas;
        }
    }

    public Espaco[] getEspacos() {
        return espacos;
    }

    public void setEspacos(Espaco[] espacos) {
        if(espacos != null) {
            this.espacos = espacos;
        }
    }

    public Equipamento[] getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(Equipamento[] equipamentos) {
        if(equipamentos != null) {
            this.equipamentos = equipamentos;
        }
    }
}
