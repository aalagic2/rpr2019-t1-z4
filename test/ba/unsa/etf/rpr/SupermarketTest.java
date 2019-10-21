package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

@Test
 void izbaciArtiklSaKodom () {
    Supermarket supermarket = new Supermarket();
    supermarket.dodajArtikl(new Artikl ("aaaa", 900, "21"));
    supermarket.izbaciArtiklSaKodom("21");
    boolean izbaceno=true;
    Artikl [] artikli=supermarket.getArtikli();
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