package VL03;

import java.util.ArrayList;
import java.util.Collections;

public class testing {

  public static void main(String[] args) {
    ArrayList<String> liste = new ArrayList<String>();
    liste.add("Just a string");
    liste.add("Another string");
    liste.add("Yet another string");
    liste.add("And yet another string");

    // ? Sortieren
    Collections.sort(liste);

    // ? Mit Iterator
    // Iterator<String> i = liste.iterator();
    // while (i.hasNext()) {
    // String s = i.next();

    // System.out.println(s);
    // }

    // ? Mit For Schleife
    for (String s : liste) {
      System.out.println(s);
    }

  }
}
