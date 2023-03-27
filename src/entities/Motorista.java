package entities;

import base.Pessoa;

public class Motorista extends Pessoa {
  private String cnh;
  private Double salario;

  public Motorista(
    String nome,
    String cpf,
    String telefone,
    String email,
    String cnh,
    Double salario) {
      super(nome, cpf, telefone, email);
      this.cnh = cnh;
      this.salario = salario;
  }

  public String getCnh() {
    return cnh;
  }

  public void setCnh(String cnh) {
    this.cnh = cnh;
  }
  
  public Double getSalario() {
    return salario;
  }

  public void setSalario(Double salario) {
    this.salario = salario;
  }
}
