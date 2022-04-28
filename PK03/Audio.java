package PK03;

class Audio extends Medium {
  private String interpret;
  private int dauer;

  Audio(String titel, int jahr, String interpret, int dauer) {
    super(titel, jahr);
    this.interpret = interpret;
    this.dauer = dauer;
  }

  public String getInterpret() {
    return interpret;
  }

  public void setInterpret(String interpret) {
    this.interpret = interpret;
  }

  public int getDauer() {
    return dauer;
  }

  public void setDauer(int dauer) {
    this.dauer = dauer;
  }

  @Override
  public void druckeDaten() {
    System.out.printf("ID = %d \"%s\" von %s aus %d Spieldauer: %d sek.", this.getId(), this.getTitel(),
        this.getInterpret(), this.getJahr(), this.getDauer());
  }

  @Override
  public boolean equals(Object audio) {
    Audio a = (Audio) audio;

    if (audio == null) {
      return false;
    }

    return this.getTitel() == a.getTitel() &&
        this.getJahr() == a.getJahr() &&
        this.getInterpret() == a.getInterpret() &&
        this.getDauer() == a.getDauer();
  }

  @Override
  public int hashCode() {
    int sum = 0;
    sum += this.getTitel().hashCode();
    sum += this.getJahr();
    sum += this.getInterpret().hashCode();
    sum += this.getDauer();
    return sum;
  }
}
