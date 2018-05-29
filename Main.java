import java.util.Scanner;
import java.util.Timer;

class Main {


  public static void main(String[] args) {
    Timer timer = new Timer();
    Scanner reader = new Scanner(System.in);  // Reading from System.in
    System.out.println("Enter how much time you have in minutes: ");
    int totalTime = reader.nextInt(); // Scans the next token of the input as an int.
    while(totalTime>360 || totalTime<10){
    //once finished
    if(totalTime > 360 || totalTime<10){
      System.out.println("That is unreasonable. Please try again.");
      totalTime = reader.nextInt();
    }
    }
    System.out.println("You have " + totalTime + " minutes or " + totalTime/60 + " hour(s) and " + totalTime%60 + " minutes");
    reader.close();
   /* long startTime = System.currentTimeMillis();
    totalTime = totalTime*60;
    while(startTime/1000<=totalTime){
      totalTime-=startTime/1000;
      System.out.println(totalTime/60 + " minutes");
    }*/
    //Test timer, not functional

    /*timer.scheduleAtFixedRate(new TimerTask() {
    @Override
    public void run() {
      System.out.println(totalTime);
    }
  }, 1000, 1000);*/
//other timer not working in repl.it

    //TimeUnit.SECONDS.Sleep(1);
    //Drifts after a while; not reliable
    


  }



}
