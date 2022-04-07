package PK01;

class Bild extends Medium {
  private String ort;

  Bild(String titel, int jahr, String ort) {
    super(titel, jahr);
    this.ort = ort;
  }

  public String getOrt() {
    return ort;
  }

  public void setOrt(String ort) {
    this.ort = ort;
  }

  @Override
  public void druckeDaten() {
    System.out.printf("ID = %d \"%s\" aufgenommen im Jahr %d in %s", this.getId(), this.getTitel(), this.getJahr(),
        this.getOrt());
  }

  @Override
  public boolean equals(Object bild) {
    Bild b = (Bild) bild;

    if (bild == null) {
      return false;
    }

    return this.getTitel() == b.getTitel() &&
        this.getJahr() == b.getJahr() &&
        this.getOrt() == b.getOrt();
  }

  @Override
  public int hashCode() {
    int sum = 0;
    sum += this.getTitel().hashCode();
    sum += this.getJahr();
    sum += this.getOrt().hashCode();
    return sum;
  }
}
