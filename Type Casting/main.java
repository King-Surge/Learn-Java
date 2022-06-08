
public class Main {
  public static void main(String[] args) {
    
    // Narrowing Casting
    double surge = 9.78;
    int map = (int) surge; // Manual casting: double to int

    System.out.println(surge);   // Outputs 9.78
    System.out.println(map);      // Outputs 9
    
    // Widening Casting
    int surging = 9;
    double surger = surging; // Automatic casting: int to double

    System.out.println(surging);      // Outputs 9
    System.out.println(surger);   // Outputs 9.0
  }
}
