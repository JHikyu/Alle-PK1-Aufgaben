package VL01.Aufgabe_5;

public class Manager extends Angestellter {
  // ? Variablen
  private int MONATE_IN_JAHR = 12;
  private double bonus;

  // ? Konstruktor
  public Manager(String name, double monatsgehalt, double bonus) {
    // ? Gib name und monatsgehalt an den Konstruktor der Superklasse Angestellter
    super(name, monatsgehalt);

    // ? Setze unsere Variablen
    this.bonus = bonus;
  }

  // ? Methoden
  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  public double getBonus() {
    return bonus;
  }

  public double berechneJahresgehalt() {
    return (this.getGehalt() * MONATE_IN_JAHR) + this.getBonus();
  }
}
