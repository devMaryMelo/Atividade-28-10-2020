public class Violao
{
    private String marca;
    private String modelo;

    public Violao(String marca, String modelo)
    {
        this.marca = marca;
        this.modelo = modelo;
    }


    public void setMarca(String nomeMarca)
    {
        this.marca = nomeMarca;
    }

    public String getMarca()
    {
        return this.marca;
    }
 
    public void setModelo(String nomeModelo)
    {
        this.modelo = nomeModelo;
    }

    public String  getModelo()
    {
        return this.modelo;
    }

    public void status()
    {
        System.out.println("-----------------");
        System.out.println("Violao");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("-----------------");
    }

}
