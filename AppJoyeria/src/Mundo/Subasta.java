package Mundo;


public class Subasta {

    private int conteoAbiertaJoya1;
    private int conteoAbiertaJoya2;
    private int conteoAbiertaJoya3;
    private Joya joya2;
    private Joya joya1;
    private Joya joya3;


    public Subasta () {
        joya1=new Joya("Primero", 1000000, "Adarme");
        joya2=new Joya("Segundo", 5000000, "Pilar");
        joya3=new Joya("Tercero",10000000,"Boris");
    }


    public Joya getJoya1 () {
        return joya1;
    }


    public void setJoya1 (Joya val) {
        this.joya1 = val;
    }


    public Joya getJoya2 () {
        return joya2;
    }


    public void setJoya2 (Joya val) {
        this.joya2 = val;
    }


    public Joya getJoya3 () {
        return joya3;
    }


    public void setJoya3 (Joya val) {
        this.joya3 = val;
    }


    public int calcularNumeroTotalOfertas () {
        return 0;
    }


    public void calcularValorTotalRecaudos () {
    }


    public double calcularIncrementoPromedioCostoBase () {
        return 0.0;
    }


    public void reiniciarSubasta () {
        this.conteoAbiertaJoya1=0;
        this.conteoAbiertaJoya2=0;
        this.conteoAbiertaJoya3=0;
  }


    public String calcularMayorOfertaAbierta () {
        return null;
    }


    public void registrarOferta (int tipoOferta, int numeroJoya, int valorOferta) {
    }



}

