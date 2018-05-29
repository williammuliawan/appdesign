import java.util.Scanner;

class Main {


  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);  // Reading from System.in
    System.out.println("Enter how much time you have in minutes: ");
    int totalTime = reader.nextInt(); // Scans the next token of the input as an int.
    while(totalTime>360){
    //once finished
    if(totalTime > 360 || totalTime <10){
      System.out.println("That is unreasonable. Please try again.");
      totalTime = reader.nextInt();
    }
    }
    System.out.println("You have " + totalTime + " minutes or " + totalTime/60 + " hour(s) and " + totalTime%60 + " minutes");
    reader.close();
    
  }
}
