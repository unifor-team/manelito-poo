package entities;

import base.Veiculo;

public class Moto extends Veiculo {
  private Boolean inclinar = false;
  private Double graus = 0.0;

  public Moto(
      String modelo,
      String marca,
      Integer ano,
      String cor,
      String placa) {
    super(modelo, marca, ano, cor, placa);
  }

  public void inclinar(double graus) {
    this.inclinar = true;
  }

  public Boolean getInclinar() {
    return inclinar;
  }

  public void setInclinar(Boolean inclinar) {
    this.inclinar = inclinar;
  }

  public Double getGraus() {
    return graus;
  }

  public void setGraus(Double graus) {
    this.graus = graus;
  }
}
