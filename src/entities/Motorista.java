package entities;

import base.Pessoa;

public class Motorista extends Pessoa {
  private String cnh;

  public Motorista(
    String nome,
    String cpf,
    String telefone,
    String email,
    String cnh) {
      super(nome, cpf, telefone, email);
      this.cnh = cnh;
  }

  public String getCnh() {
    return cnh;
  }

  public void setCnh(String cnh) {
    this.cnh = cnh;
  }
}
