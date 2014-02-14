package Mundo;


public class Joya {

    private String nombre;

    private int costoBase;

    private String disenador;

    private int numeroDeOfertas;

    private int valorTotalOfertas;

  
  public Joya (String nombreN, int costoBaseN, String disenadorN) {

    }

 
  public int getCostoBase () {
        return costoBase;
    }

  
  public void setCostoBase (int val) {
        this.costoBase = val;
    }

  
  public String getDisenador () {
        return disenador;
    }

  
  public void setDisenador (String val) {
        this.disenador = val;
    }

  
  public String getNombre () {
        return nombre;
    }

 
  public void setNombre (String val) {
        this.nombre = val;
    }

  
  public int getNumeroDeOfertas () {
        return numeroDeOfertas;
    }

  public void setNumeroDeOfertas (int val) {
        this.numeroDeOfertas = val;
    }

 
  public int getValorTotalOfertas () {
        return valorTotalOfertas;
    }

 
  public void setValorTotalOfertas (int val) {
        this.valorTotalOfertas = val;
    }

}

