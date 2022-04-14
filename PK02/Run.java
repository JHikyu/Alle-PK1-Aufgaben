package PK02;

class Run {
  public static void main(String args[]) {
    Medienverwaltung m = new Medienverwaltung();

    Audio a1 = new Audio("Test", 1999, "Interpret", 120);
    Audio a2 = new Audio("Test", 2001, "Interpret", 120);

    m.aufnehmen(a1);
    m.aufnehmen(a2);

    System.out.println(m.sucheNeuesMedium().getJahr());
  }
}
