package model;

public class UsoBicicleta {
    public int id;
    public int bicicletaId;
    public String horarioInicio;
    public String horarioFim;

    public UsoBicicleta(int id, int bicicletaId, String horarioInicio, String horarioFim) {
        this.id = id;
        this.bicicletaId = bicicletaId;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
    }

    public String duracaoUso() {
        return horarioInicio + " até " + horarioFim;
    }

    @Override
    public String toString() {
        return id + "," + bicicletaId + "," + horarioInicio + "," + horarioFim;
    }

    public static UsoBicicleta fromCSV(String linha) {
        String[] partes = linha.split(",");
        return new UsoBicicleta(Integer.parseInt(partes[0]), Integer.parseInt(partes[1]), partes[2], partes[3]);
    }
}