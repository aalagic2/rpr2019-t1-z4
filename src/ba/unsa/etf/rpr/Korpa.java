package ba.unsa.etf.rpr;

public class Korpa {
    int brojArtikala;
    private Artikl [] artikli=new Artikl[50];

    public boolean dodajArtikl (Artikl a) {
        if (brojArtikala>=50) return false;
        artikli[brojArtikala]=new Artikl (a.getNaziv(), a.getCijena(), a.getKod());   //moze li artikli[brojArtikala-1]=a
        brojArtikala++;
        return true;
    }
    public Artikl izbaciArtiklSaKodom (String k) {
        for (int i=0; i<brojArtikala; i++) {
            if (k.equals(artikli[i].getKod())) {
                Artikl a=artikli[i];
                for (int j=i; j<brojArtikala-1; j++) {
                    artikli[j]=artikli[j+1];
                }
                artikli[brojArtikala-1]=null;
                brojArtikala--;
                return a;
            }
        }
        return null; //ako nema tog koda
    }
    public Artikl [] getArtikli () {
        return artikli;
    }
    public int dajUkupnuCijenuArtikala() {
        int suma=0;
        for (int i=0; i<brojArtikala; i++)
            suma+=artikli[i].getCijena();
        return suma;
    }

}
