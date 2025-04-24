import model.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            List<Bicicleta> bicicletas = CsvUtils.lerCSV("bicicletas.csv", Bicicleta::fromCSV);
            bicicletas.add(new Bicicleta(3, "Mountain", "Preta", "Disponível"));
            CsvUtils.salvarCSV(bicicletas, "bicicletas.csv");

            List<Cliente> clientes = CsvUtils.lerCSV("clientes.csv", Cliente::fromCSV);
            clientes.forEach(cliente -> System.out.println(cliente.nome));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}