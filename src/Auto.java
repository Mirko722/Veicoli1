
    public class Auto extends Veicolo {
        String tipo;

        public Auto(int nMatricola, String nProprietario, String t) {

            super(nMatricola, nProprietario);
            tipo = t;

        }
        public void assegnaTipo(String insTIPO)
        {
         tipo=insTIPO;
        }
        public String visualizzatipo()
        {
            return tipo;
        }
    }