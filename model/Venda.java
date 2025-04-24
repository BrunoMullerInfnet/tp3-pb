package model;

public class Venda {
    public int id;
    public String data;
    public double valor;
    public int bicicletaId;
    public int clientId;

    public Venda(int id, String data, double valor, int bicicletaId, int clientId) {
        this.id = id;
        this.data = data;
        this.valor = valor;
        this.bicicletaId = bicicletaId;
        this.clientId = clientId;
    }

    public double calcularValor() {
        return valor;
    }

    @Override
    public String toString() {
        return id + "," + data + "," + valor + "," + bicicletaId + "," + clientId;
    }

    public static Venda fromCSV(String linha) {
        String[] partes = linha.split(",");
        return new Venda(Integer.parseInt(partes[0]), partes[1], Double.parseDouble(partes[2]),
                         Integer.parseInt(partes[3]), Integer.parseInt(partes[4]));
    }
}