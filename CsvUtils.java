import java.io.*;
import java.util.*;
import java.util.function.Function;

public class CsvUtils {
    public static <T> void salvarCSV(List<T> lista, String caminho) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminho))) {
            for (T obj : lista) {
                writer.write(obj.toString());
                writer.newLine();
            }
        }
    }

    public static <T> List<T> lerCSV(String caminho, Function<String, T> converter) throws IOException {
        List<T> lista = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                lista.add(converter.apply(linha));
            }
        }
        return lista;
    }
}