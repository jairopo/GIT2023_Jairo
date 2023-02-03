
public class Vehiculo {

  private String marca;
  private String modelo;
  private String matricula;
  
  public Vehiculo(String marca, String modelo, String matricula) {
    this.marca = marca;
    this.modelo = modelo;
    this.matricula = matricula;
  }
  
  public void mostrarMarca() {
    System.out.println(marca);
  }
  
  public void mostrarModelo() {
    System.out.println(modelo);
  }
}
