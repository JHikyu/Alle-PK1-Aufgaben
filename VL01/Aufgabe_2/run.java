package VL01.Aufgabe_2;

class run {
  public static void main(String[] args) {

    Auto meinAuto;
    meinAuto = new Auto("Audi", 2015);
    Auto lieblingsAuto = meinAuto;
    Auto mariasAuto = new Auto("BMW", 2017);
    Auto franksAuto = new Auto("Audi", 2015);

    // Auto auto = new Auto("BMW", 2020);
    System.out.println(meinAuto == franksAuto);

  }
}
