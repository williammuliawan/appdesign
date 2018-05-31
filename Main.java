import java.util.Scanner;
import java.util.Timer;

class Main {
public abstract void fillArc(int x,
           int y,
           int width,
           int height,
           int startAngle,
           int arcAngle);

  public static void main(String[] args) {
    Timer timer = new Timer();
    Scanner reader = new Scanner(System.in);  
    // Sees input 
    System.out.println("Enter how much time you have in minutes: ");
    int totalTime = reader.nextInt(); 
    //sets input to variable
    while(totalTime>360 || totalTime<10){
    //once finished, 
    if(totalTime > 360 || totalTime<10){
      
      if(totalTime>360){
        System.out.println("That is too much time. Try going under 360 minutes.");
      }
      else if(totalTime<10){
        System.out.println("That is not enough time. Try at least 10 minutes.");
      }
      System.out.println("Please try again.");
      totalTime = reader.nextInt();
    }
    }
    System.out.println("You have " + totalTime + " minutes or " + totalTime/60 + " hour(s) and " + totalTime%60 + " minute(s)");
    reader.close();
    totalTime = totalTime*60;
   /* long startTime = System.currentTimeMillis();
    totalTime = totalTime*60;
    while(startTime/1000<=totalTime){
      totalTime-=startTime/1000;
      System.out.println(totalTime/60 + " minutes");
    }*/
    //Test timer, not functional

    timer.scheduleAtFixedRate(new TimerTask() {
    @Override
    public void run() {
      System.out.println(totalTime/60 + " minutes" + totalTime + " seconds");
      drawArc(20,20,200,200,0,90)
      if(totalTime<=0){
        Timertask.shutdown();
      }
    }
  }, 1000, 1000);
//timer not working in repl.it, try later in other platform

    //TimeUnit.SECONDS.Sleep(1);
    //Drifts after a while; not reliable
    


  }



}
