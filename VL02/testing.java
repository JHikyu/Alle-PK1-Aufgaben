package VL02;

import VL01.Aufgabe_5.Angestellter;
import VL01.Aufgabe_5.Manager;

public class testing {

  public static void main(String[] args) {
    // Object a = new Manager("Bill Gates", 100000.00, 50000.00);
    // System.out.println(((Manager) a).berechneJahresgehalt());

    Angestellter a = new Angestellter("Meier", 5000.00);
    Angestellter b = a;
    Angestellter c = new Angestellter("Meier", 5000.00);
    System.out.println("1. " + (a == b));
    System.out.println("2. " + (a == c));
    System.out.println("3. " + (a.equals(c)));
  }
}
