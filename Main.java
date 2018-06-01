import java.util.Scanner;
import java.util.Timer;

class Main {
  public static void main(String[] args) {
    int angle = 360;
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
    int userTime = totalTime;
    System.out.println("You have " + totalTime + " minutes or " + totalTime/60 + " hour(s) and " + totalTime%60 + " minute(s)");
    System.out.println("How many tasks do you have?");
    int taskNum = reader.nextInt();
    while(taskNum < 1){
    if(taskNum < 1){
      System.out.println("You can't have zero tasks.");
      taskNum = reader.nextInt();
    }
    }
    int less = totalTime/10;
    int least = taskNum - less;
    int more = totalTime/60;
    int most = more+1;
    while((userTime/taskNum)>60 || (userTime/taskNum)<10){
    if((totalTime/taskNum)>60 || (userTime/taskNum)<10){
      if((userTime/taskNum)<10){
        less = totalTime/10;
        System.out.println("Please try again with at most " + least + " tasks");
        taskNum = reader.nextInt();
      }
      else if(totalTime/taskNum>60){
     System.out.println("Please try again with at least " + most + " tasks");    
     taskNum = reader.nextInt();
      }    
      }
    }
    System.out.println("You have " + taskNum + " tasks");
    //tasks
  int task1=0;
  int task2=0;
  int task3=0;
  int task4=0;
  int task5=0;
  int task6=0;
  int task7=0;
  int task8=0;
  int task9=0;
  int task10=0;
  int task11=0;
  int task12=0;
  int task13=0;
  int task14=0;
  int task15=0;
  int task16=0;
  int task17=0;
  int task18=0;
  int task19=0;
  int task20=0;
  int task21=0;
  int task22=0;
  int task23=0;
  int task24=0;
  int task25=0;
  int task26=0;
  int task27=0;
  int task28=0;
  int task29=0;
  int task30=0;
  int task31=0;
  int task32=0;
  int task33=0;
  int task34=0;
  int task35=0;
  int task36=0;

  String name1;
  String name2;
  String name3;
  String name4;
  String name5;
  String name6;
  String name7;
  String name8;
  String name9;
  String name10;
  String name11;
  String name12;
  String name13;
  String name14;
  String name15;
  String name16;
  String name17;
  String name18;
  String name19;
  String name20;
  String name21;
  String name22;
  String name23;
  String name24;
  String name25;
  String name26;
  String name27;
  String name28;
  String name29;
  String name30;
  String name31;
  String name32;
  String name33;
  String name34;
  String name35;
  String name36;


//start length + name

  if(taskNum == 36){

    System.out.println("How long, in minutes, is the first task?");
    task1 = reader.nextInt();
    while(totalTime-task1<=0 || task1 < 5){
    if(totalTime-task1<=0){
      System.out.println("please add less time.");
      task1 = reader.nextInt();
    }
    if(task1 < 5){
      System.out.println("Please add more time");
      task1 = reader.nextInt();
    }
    }
    totalTime -= task1;
    System.out.println("What do you need to do?");
    name1 = reader.nextLine();
    while(name1.equals(null)){
      if(name1.equals(null)){
      name1 = reader.nextLine();
    }
    }
    System.out.println("You need to do "+name1+" for " + task1 + " minutes");
    System.out.println("How long, in minutes, is the second task?");
    task2 = reader.nextInt();
    while(totalTime-task2<=0 || task2<5){
      if(totalTime-task2<=0){
        System.out.println("Please add less time");
        task2 = reader.nextInt();
      }
      if(task2<5){
        System.out.println("Please add more time");
        task2 = reader.nextInt();
      }
    }
    totalTime -= task2;
    System.out.println("What do you need to do?");
    name2 = reader.nextLine();
  }
  

    reader.close();
    totalTime = totalTime*60;
    
    timer.scheduleAtFixedRate(new TimerTask() {
    @Override
    public void run() {
      angle -= taskNum/(totalTime/60);
      System.out.println(totalTime/60 + " minutes" + totalTime%60 + " seconds");
      fillArc(20,20,200,200,0,angle)
      if(totalTime<=0){
        Timertask.shutdown();
      }
    }
  }, 1000, 1000);
//timer not working in repl.it, try later in other platform

     /* long startTime = System.currentTimeMillis();
    totalTime = totalTime*60;
    while(startTime/1000<=totalTime){
      totalTime-=startTime/1000;
      System.out.println(totalTime/60 + " minutes");
    }*/
    //Test timer, not functional
    //TimeUnit.SECONDS.Sleep(1);
    //Drifts after a while; not reliable
    


  }



}
