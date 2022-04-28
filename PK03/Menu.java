package PK03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu {
  static Medienverwaltung m;

  public static void main(String[] args) {
    m = new Medienverwaltung();

    main();
  }

  private static void main() {
    System.out.printf(
        "\n\n1. Audio aufnehmen\n2. Bild aufnehmen\n3. Zeige alle Medien\n4. Zeige neues Medium\n5. Berechne durchschnittliches Erscheinungsjahr\n6. Beenden");

    int choice = getInput(0);

    switch (choice) {
      case 6:
        System.exit(0);
        break;
      case 5:
        System.out.printf("Durchschnitts Erscheinungsjahr: %.2f",
            m.berechneErscheinungsjahr());
        getInput("");
        break;
      case 4:
        m.sucheNeuesMedium().druckeDaten();
        getInput("");
        break;
      case 3:
        m.zeigeMedien();

        getInput("");
        break;
      case 2:
        String titel = JOptionPane.showInputDialog(null, "Titel:");
        String jahr = JOptionPane.showInputDialog(null, "Jahr:");
        String ort = JOptionPane.showInputDialog(null, "Ort:");
        Bild b = new Bild(titel, Integer.parseInt(jahr), ort);
        m.aufnehmen(b);
        break;
      case 1:
        // * String titel, int jahr, String interpret, int dauer
        titel = JOptionPane.showInputDialog(null, "Titel:");
        jahr = JOptionPane.showInputDialog(null, "Jahr:");
        String interpret = JOptionPane.showInputDialog(null, "Interpret:");
        String dauer = JOptionPane.showInputDialog(null, "Dauer:");
        Audio a = new Audio(titel, Integer.parseInt(jahr), interpret,
            Integer.parseInt(dauer));
        m.aufnehmen(a);
        break;
      default:
        break;
    }
    main();

  }

  private static int getInput(int type) {
    System.out.print("\n > ");

    Scanner sc = new Scanner(System.in);
    int in = sc.nextInt();
    return in;
  }

  private static String getInput(String type) {
    System.out.print("\n > ");

    Scanner sc = new Scanner(System.in);
    String in = sc.nextLine();
    return in;
  }
}
