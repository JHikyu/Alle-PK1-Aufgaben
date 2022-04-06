package VL01.Aufgabe_5;

public class Vorstand extends Manager {
  // ? Variablen
  private double abfindung;

  // ? Konstruktor
  Vorstand(String name, double monatsgehalt, double bonus, double abfindung) {
    // ? Gib name und monatsgehalt an den Konstruktor der Superklasse Angestellter
    super(name, monatsgehalt, bonus);

    // ? Setze unsere Variablen
    this.abfindung = abfindung;
  }

  // ? Methoden
  public void setAbfindung(double abfindung) {
    this.abfindung = abfindung;
  }

  public double getAbfindung() {
    return abfindung;
  }
}
