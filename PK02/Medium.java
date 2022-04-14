package PK02;

import java.time.LocalDate;

// ? Abstrakte klassen koennen nicht instanziiert werden
abstract class Medium {
  private static int idCounter = 0;
  private final int id;
  private String titel;
  private int jahr;

  Medium(String titel, int jahr) {
    this.titel = titel;
    this.jahr = jahr;

    this.id = idCounter++;
  }

  public int getId() {
    return id;
  }

  public String getTitel() {
    return titel;
  }

  public void setTitel(String titel) {
    this.titel = titel;
  }

  public int getJahr() {
    return jahr;
  }

  public void setJahr(int jahr) {
    this.jahr = jahr;
  }

  public int alter() {
    int currentYear = LocalDate.now().getYear();
    return currentYear - this.jahr;
  }

  public abstract void druckeDaten();

  public boolean equals(Object medium) {
    Medium m = (Medium) medium;

    if (medium == null) {
      return false;
    }

    return this.getTitel() == m.getTitel() &&
        this.getJahr() == m.getJahr();
  }

  public int hashCode() {
    int sum = 0;
    sum += this.getTitel().hashCode();
    sum += this.getJahr();
    return sum;
  }
}