package base;

import interfaces.Pessoas;

public abstract class Pessoa implements Pessoas {
  private String nome;
  private String cpf;
  private String telefone;
  private String email;

  public Pessoa(
      String nome,
      String cpf,
      String telefone,
      String email) {
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    this.email = email;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String toString() {
    return String.format(
        "Pessoa: %s %s %s %s",
        getNome(),
        getCpf(),
        getTelefone(),
        getEmail());
  }
}
