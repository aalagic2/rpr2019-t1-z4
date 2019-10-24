package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl ("Keks", 900, "21"));
        boolean nadjeno=false;
        Artikl [] artikli=korpa.getArtikli();
        for (int i=0; i<artikli.length; i++) {
            if (artikli[i] != null)
            {
                if (artikli[i].getKod().equals("21"))
                {
                    nadjeno=true;
                    break;
                }
            }
        }
        assertTrue(nadjeno);
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl ("Keks", 900, "21"));
        korpa.izbaciArtiklSaKodom("21");
        boolean izbaceno=true;
        Artikl [] artikli=korpa.getArtikli();
        for (int i=0; i<artikli.length; i++) {
            if (artikli[i] != null)
            {
                if (artikli[i].getKod().equals("21"))
                {
                    izbaceno=false;
                    break;
                }
            }
        }
        assertTrue(izbaceno);
    }
}