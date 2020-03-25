
public class Camion extends Veicolo {
    int assi;

    public Camion(int nMatricola, String nProprietario, int a) {
        super(nMatricola, nProprietario);
        assi = a;

    }
        public void assegnaASSI (int insASSI)
        {
            assi=insASSI;
        }
        public int visualizzaASSI()
        {
           return assi;
        }
    }
