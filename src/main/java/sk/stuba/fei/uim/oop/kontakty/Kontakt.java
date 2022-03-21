package sk.stuba.fei.uim.oop.kontakty;

public class Kontakt {
    private String meno;
    private String priezvisko;

    private Kontakt[] znami;

    public Kontakt(String meno, String priezvisko) {
        this.meno = meno;
        this.priezvisko = priezvisko;
    }

    public Kontakt(String celeMeno) {
       var casti = celeMeno.split(" ");
        this.priezvisko = casti[1];
        this.meno = casti[0];
    }

    public void pridajZnamych(Kontakt[] kontakty) {
        this.znami = kontakty;
    }

    public void vypisZnamych() {
        for(int i = 0; i < this.znami.length; i++) {
            System.out.println(this.znami[i].meno + " " + this.znami[i].priezvisko);
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return this.meno + " " + this.priezvisko;
    }

    public String getMeno() {
        return meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }
}
