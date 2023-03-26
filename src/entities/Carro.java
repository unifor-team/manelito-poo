package entities;

import base.Veiculo;

public class Carro extends Veiculo {
  private Integer portas;
  private Boolean portasAbertas = false;

  public Carro(
      String modelo,
      String marca,
      Integer ano,
      String cor,
      String placa,
      Integer portas) {
    super(modelo, marca, ano, cor, placa);

    this.portas = portas;
  }

  public Integer getPortas() {
    return portas;
  }

  public void setPortas(Integer portas) {
    this.portas = portas;
  }

  public void abrirPortas() {
    if (!portasAbertas) this.portasAbertas = true;
  }

  public void fecharPortas() {
    if (portasAbertas) this.portasAbertas = false;
  }
}