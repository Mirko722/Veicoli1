
public class Veicolo {

      int numeroMatricola;
      String nomeProprietario;

    public Veicolo(int nomeM, String nomeP) {
        nomeProprietario = nomeP;
        numeroMatricola = nomeM;
    }

    public void assegnaProprietario(String nome)
    {
        nomeProprietario=nome;
    }
    public String dammiProprietario()
    {
        return nomeProprietario;
    }
    public void assegnaMatricola(int matricola)
    {
     numeroMatricola=matricola;
    }
    public int dammiMatricola()
    {
        return numeroMatricola;
    }
}