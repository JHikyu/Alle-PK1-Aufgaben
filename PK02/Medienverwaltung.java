package PK02;

import java.util.LinkedList;
import java.util.List;

public class Medienverwaltung {
  private List<Medium> mediumListe = new LinkedList<Medium>();

  public void aufnehmen(Medium m) {
    mediumListe.add(m);
  }

  public void zeigeMedien() {
    for (Medium m : mediumListe) {
      m.druckeDaten();
      System.out.println();
    }
  }

  public Medium sucheNeuesMedium() {
    Medium neustesMedium = null;
    for (Medium m : mediumListe) {
      if (neustesMedium == null) {
        neustesMedium = m;
      } else if (m.getJahr() > neustesMedium.getJahr()) {
        neustesMedium = m;
      }
    }

    return neustesMedium;
  }

  public double berechneErscheinungsjahr() {
    if (mediumListe.size() == 0) {
      return 0.0;
    }

    double summe = 0;
    for (Medium m : mediumListe) {
      summe += m.getJahr();
    }

    return summe / mediumListe.size();
  }

}
