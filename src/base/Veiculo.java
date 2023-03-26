package base;

import interfaces.Veiculos;

public abstract class Veiculo implements Veiculos {
  private String modelo;
  private String marca;
  private Integer ano;
  private String cor;
  private String placa;
  private Boolean ligado = false;

  public Veiculo(
      String modelo,
      String marca,
      Integer ano,
      String cor,
      String placa) {
    this.modelo = modelo;
    this.marca = marca;
    this.ano = ano;
    this.cor = cor;
    this.placa = placa;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public void ligar() {
    if (!ligado)
      this.ligado = true;
  }

  public void desligar() {
    if (ligado)
      this.ligado = false;
  }

  public String toString() {
    return String.format(
        "Veiculo: %s %s %s %s %s",
        getModelo(),
        getMarca(),
        getAno(),
        getCor(),
        getPlaca());
  }
}
