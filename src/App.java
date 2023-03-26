import java.io.File;
import java.io.FileWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import base.Pessoa;
import base.Veiculo;
import main.LeituraPessoa;
import main.LeituraVeiculo;

public class App {
    public static void main(String[] args) throws Exception {
        File vehicleFile = new File("entrada1.txt");
        File personFile = new File("entrada2.txt");

        FileWriter vehicleWriteFile = new FileWriter("resultado1.txt");
        FileWriter personWriteFile = new FileWriter("resultado2.txt");

        Scanner vehicleScanner = new Scanner(vehicleFile);
        Scanner personScanner = new Scanner(personFile);

        List<Veiculo> veiculos = new ArrayList<>();
        List<Pessoa> pessoas = new ArrayList<>();

        new LeituraVeiculo(vehicleFile, vehicleScanner, veiculos);
        new LeituraPessoa(personFile, personScanner, pessoas);

        for (Veiculo a : veiculos) {
            vehicleWriteFile.write(a.toString());
        }

        for (Pessoa a : pessoas) {
            personWriteFile.write(a.toString());
        }

        vehicleWriteFile.close();
        personWriteFile.close();
        
        vehicleScanner.close();
        personScanner.close();
    }
}
