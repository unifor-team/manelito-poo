import java.io.File;
import java.io.FileWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

import base.Pessoa;
import base.Veiculo;
import entities.Motorista;
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

        Long veiculosAzuis = veiculos
            .stream()
            .filter(veiculo -> veiculo.getCor().equals("azul"))
            .count();
        
        OptionalDouble mediaSalarioOptional = pessoas
            .stream()
            .filter(pessoa -> pessoa instanceof Motorista)
            .mapToDouble(pessoa -> ((Motorista) pessoa).getSalario())
            .average();

        Double mediaSalarioMotorista = mediaSalarioOptional.orElse(0.0);
        
        vehicleWriteFile.write("Veículos azuis: " + veiculosAzuis);
        personWriteFile.write("Média salarial dos motoristas: " + mediaSalarioMotorista);

        vehicleWriteFile.close();
        personWriteFile.close();
        
        vehicleScanner.close();
        personScanner.close();
    }
}
