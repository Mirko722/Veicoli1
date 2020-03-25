public class Moto extends Veicolo{
    int posti;
    public Moto(int nMatricola, String nProprietario, int nPosti){

        super(nMatricola, nProprietario);
        posti=nPosti;

    }

    public void assegnaPOSTI(int i)
    {
        posti=i;
    }

    public int dammiPOSTI()
    {
        return posti;
    }
}
