package PK04;

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
        "\n\n1. Audio aufnehmen\n2. Bild aufnehmen\n3. Zeige alle Medien\n4. Zeige neues Medium\n5. Berechne durchschnittliches Erscheinungsjahr\n6. Beenden\n");

    // * Eingabe der Auswahl
    int choice = -1;
    do {
      try {
        choice = getInput(0);
      } catch (Exception e) {
        System.out.println("Fehlerhafte Eingabe");
      }
    } while (choice < 1 || choice > 6);

    String titel, interpret, ort;
    int jahr, dauer;
    switch (choice) {
      case 6:
        System.exit(0);
        break;
      case 5:
        System.out.printf("Durchschnitts Erscheinungsjahr: %.2f",
            m.berechneErscheinungsjahr());
        getInput();
        break;
      case 4:
        m.sucheNeuesMedium().druckeDaten();
        getInput();
        break;
      case 3:
        m.zeigeMedien();
        getInput();
        break;
      case 2:
        try {
          titel = getOptionPane("", "Titel:");
        } catch (Exception e) {
          System.out.println(e);
          break;
        }
        try {
          jahr = getOptionPane(0, "Jahr:");
        } catch (Exception e) {
          System.out.println(e);
          break;
        }
        try {
          ort = getOptionPane("", "Ort:");
        } catch (Exception e) {
          System.out.println(e);
          break;
        }

        Bild b = new Bild(titel, jahr, ort);
        m.aufnehmen(b);
        break;
      case 1:
        try {
          titel = getOptionPane("", "Titel:");
        } catch (Exception e) {
          System.out.println(e);
          break;
        }
        try {
          jahr = getOptionPane(0, "Jahr:");
        } catch (Exception e) {
          System.out.println(e);
          break;
        }
        try {
          interpret = getOptionPane("", "Interpret:");
        } catch (Exception e) {
          System.out.println(e);
          break;
        }
        try {
          dauer = getOptionPane(0, "Dauer:");
        } catch (Exception e) {
          System.out.println(e);
          break;
        }

        Audio a = new Audio(titel, jahr, interpret, dauer);
        m.aufnehmen(a);
        break;
      default:
        break;
    }
    main();
  }

  private static void getInput() {
    Scanner sc = new Scanner(System.in);
    String in = sc.nextLine();
  }

  private static int getInput(int type) throws Exception {
    System.out.print(" > ");

    Scanner sc = new Scanner(System.in);
    int in = sc.nextInt();
    return in;
  }

  private static String getInput(String type) throws Exception {
    System.out.print(" > ");

    Scanner sc = new Scanner(System.in);
    String in = sc.nextLine();
    return in;
  }

  private static int getOptionPane(int type, String title) throws Exception {
    String res = JOptionPane.showInputDialog(null, title);

    if (res == null) {
      throw new Exception("Abgebrochen");
    }

    return Integer.parseInt(res);
  }

  private static String getOptionPane(String type, String title) throws Exception {
    String res = JOptionPane.showInputDialog(null, title);

    if (res == null) {
      throw new Exception("Abgebrochen");
    }

    return res;
  }

}
