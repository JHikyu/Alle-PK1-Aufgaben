package VL01.Aufgabe_5;

public class Angestellter {
  // ? Variablen
  private String name;
  private double monatsgehalt;

  // ? Konstruktor
  public Angestellter(String name, double monatsgehalt) {
    this.name = name;
    this.monatsgehalt = monatsgehalt;
  }

  // ? Methoden
  public void setName(String name) {
    this.name = name;
  }

  public void setGehalt(double monatsgehalt) {
    this.monatsgehalt = monatsgehalt;
  }

  public String getName() {
    return name;
  }

  public double getGehalt() {
    return monatsgehalt;
  }

  public double berechneJahresgehalt() {
    return monatsgehalt * 12;
  }
}
