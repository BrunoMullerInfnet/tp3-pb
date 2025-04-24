package model;

public class Bicicleta {
    public int id;
    public String modelo;
    public String cor;
    public String status;

    public Bicicleta(int id, String modelo, String cor, String status) {
        this.id = id;
        this.modelo = modelo;
        this.cor = cor;
        this.status = status;
    }

    public void registrarUso() {
        this.status = "Em uso";
    }

    public void finalizarUso() {
        this.status = "Disponível";
    }

    @Override
    public String toString() {
        return id + "," + modelo + "," + cor + "," + status;
    }

    public static Bicicleta fromCSV(String linha) {
        String[] partes = linha.split(",");
        return new Bicicleta(Integer.parseInt(partes[0]), partes[1], partes[2], partes[3]);
    }
}