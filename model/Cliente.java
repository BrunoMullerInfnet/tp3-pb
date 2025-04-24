package model;

public class Cliente {
    public int id;
    public String cpf;
    public String nome;

    public Cliente(int id, String cpf, String nome) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return id + "," + cpf + "," + nome;
    }

    public static Cliente fromCSV(String linha) {
        String[] partes = linha.split(",");
        return new Cliente(Integer.parseInt(partes[0]), partes[1], partes[2]);
    }
}