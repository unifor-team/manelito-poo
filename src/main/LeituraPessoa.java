package main;

import java.io.File;

import java.util.List;
import java.util.Scanner;

import base.Pessoa;
import entities.Motorista;
import entities.Passageiro;

public class LeituraPessoa {
  private final String PATTERN = "\\s*\"\\s*";
  private Pessoa pessoa;
  
  public LeituraPessoa(File file, Scanner scanner, List<Pessoa> pessoas) {
    while (scanner.hasNextLine()) {
      scanner.useDelimiter(PATTERN);

      String fullName = scanner.next();
      String restOfLine = scanner.next();

      Scanner restOfLineScanner = new Scanner(restOfLine);

      String cpf = restOfLineScanner.next();
      String phone = restOfLineScanner.next();
      String email = restOfLineScanner.next();
      String cnh = restOfLineScanner.next();
      Double salario = restOfLineScanner.nextDouble();

      if (cnh.equals("null")) {
        cnh = null;
      }

      if (cnh != null) {
        pessoa = new Motorista(fullName, cpf, phone, email, cnh, salario);
      } else {
        pessoa = new Passageiro(fullName, cpf, phone, email);
      }
      
      pessoas.add(pessoa);
      restOfLineScanner.close();
    }
  }
}
