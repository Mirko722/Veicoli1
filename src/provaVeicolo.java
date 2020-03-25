//main

public class provaVeicolo {
    public static void main(String[] arg) {


        Auto a = new Auto();
        a.assegnaProprietario("Luca");
        a.assegnaMatricola(1234);
        a.assegnaTipo("Sport");


        Camion c = new Camion();
        c.assegnaProprietario("Anna");
        c.assegnaMatricola(34231);
        c.assegnaASSI(3);


        Moto m = new Moto();
        m.assegnaProprietario("Valentino");
        m.assegnaMatricola(8765);
        m.assegnaPOSTI(2);

        System.out.println("Auto di: " + a.assegnaProprietario(); + "tipo dell'auto: " + a.visualizzatipo());

        System.out.println("Camion di: " + c.assegnaProprietario(); + "numero Matricola: " + c.dammiMatricola() + "numero assi: " + c.visualizzaASSI());

        System.out.println("Moto di: " + m.assegnaProprietario(); + "numero Matricola: " + m.dammiMatricola() + "numero Posti: " + m.dammiPOSTI());

        Veicolo v = new Veicolo();
        v = m;

        if (v instanceof Moto)
            System.out.println("il veicolo è una moto");

        Moto m2 = (Moto)v;
        System.out.println(m2.dammiPOSTI());
    }
}

