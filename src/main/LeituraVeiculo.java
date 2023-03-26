package main;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import base.Veiculo;

import entities.Carro;
import entities.Moto;

public class LeituraVeiculo {
  private Veiculo veiculo;

  public LeituraVeiculo(File file, Scanner scanner, List<Veiculo> veiculos) {
    while (scanner.hasNextLine()) {
      String modelo = scanner.next();
      String marca = scanner.next();
      Integer ano = scanner.nextInt();
      String cor = scanner.next();
      String placa = scanner.next();
      Integer portas = scanner.nextInt();

      if (portas > 0) {
        veiculo = new Carro(modelo, marca, ano, cor, placa, portas);
      } else {
        veiculo = new Moto(modelo, marca, ano, cor, placa);
      }

      veiculos.add(veiculo);
    }
  }
}
