/*
 Course: IST 311
 Instructor: Phil O'Connell (pxo4)
 Student: Your Name
 Email: Your PSU email
*/

public abstract class Animal {
  private String name = "";

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract String speak();

  IFlyable flight = new CannotFly();
  public void setFlight(IFlyable flight) {
    this.flight = flight;
  }

  public String fly() {
    return this.flight.fly();
  }
}
