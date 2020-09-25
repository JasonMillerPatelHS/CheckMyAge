
public class Main  { // It does not let me change the file name to CheckMyAge
  public static void main(String[] args) {
  
    int myAge = 16;
    int myBirthday = 901; // input date as 901 or 1021 putting a 0 infront results in an error
    int todaysDate = 923;

    if (todaysDate == myBirthday) {
      myAge++; // adds 1
      System.out.println("I am " + myAge + " years old now.");
    } else {
      System.out.println("I am still " + myAge + " years old.");
    }
  }
}
