package Models;

public class Vacancy {

  private String position;
  private int offeringSalary;

  public Vacancy(String position, int offeringSalary) {
    this.position = position;
    this.offeringSalary = offeringSalary;
  }

  public String getPosition() {
    return position;
  }

  public int getOfferingSalary() {
    return offeringSalary;
  }
}
