package entities;

import base.Pessoa;

public class Passageiro extends Pessoa {
  public Passageiro(
    String nome,
    String cpf,
    String telefone,
    String email) {
      super(nome, cpf, telefone, email);
  }
}
