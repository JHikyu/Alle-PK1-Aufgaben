package VL01.Aufgabe_2;

import java.util.Calendar;

class Auto {
  // ? Variables
  private String hersteller;
  private int baujahr;

  // ? Constructors
  Auto(String hersteller, int baujahr) {
    this.hersteller = hersteller;
    this.baujahr = baujahr;
  }

  Auto(int baujahr) {
    this("", baujahr);
  }

  // ? Methods
  public int alter() {
    // ? Get current year
    int year = Calendar.getInstance().get(Calendar.YEAR);

    // ? Calculate age
    // * And return it
    return year - baujahr;
  }
}