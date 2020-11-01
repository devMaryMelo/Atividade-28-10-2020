public class Violao
{
    private String Marca;
    private String Modelo;

    public Violao(String marc, String mod)
    {
        this.Marca = marc;
        this.Modelo = mod;
    }


    public void setMarca(String nomeMarca)
    {
        this.Marca = nomeMarca;
    }

    public String getMarca()
    {
        return this.Marca;
    }
 
    public void setModelo(String nomeModelo)
    {
        this.Modelo = nomeModelo;
    }

    public String  getModelo()
    {
        return this.Modelo;
    }

    public void status()
    {
        System.out.println("-----------------");
        System.out.println("Violao");
        System.out.println("Marca: " + this.Marca);
        System.out.println("Modelo: " + this.Modelo);
        System.out.println("-----------------");
    }

}
