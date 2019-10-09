import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
class myDate { 
    private Scanner sc = new Scanner(System.in); 
    Date date ;
    Date today = new Date(); // today  
    int totalTime =  8 * 60; 
    int usedTime = 0;
    Task[] dayTask = new Task[10];
    int count = 0;

    Calendar myCalendar = Calendar.getInstance(); //create Instance of Calender class 
    
    myDate(String date){
        
        String[] da = date.split("/");
        int year = Integer.parseInt(da[0]);
        int month = Integer.parseInt(da[1])-1;
        int day = Integer.parseInt(da[2]);
        myCalendar.set(year,month,day);  // 0 is for january
        this.date = myCalendar.getTime(); // get date 


        if(calDays(this.date,this.today)){
            addTask();           
        } 
        else System.out.println("You can Only add tasks on today Date");
    }
    void addTask(){
        while(true){
            System.out.print("are you going to add task ?  y : ");
            String c = sc.next();
            if(!c.equals("y")) break;
            System.out.println("Enter your task: ");
            System.out.println("Name : "); String name = sc.next();
            System.out.println("Time in munits : "); int time = sc.nextInt();
            int newTime = usedTime + time;
            if(newTime <= totalTime){
                Task t = new Task(time, name);
                dayTask[count] = t;
                usedTime += time;
                count++;
            }
            else {
                System.out.println("you have Only "+(this.totalTime - this.usedTime)+ " munits more in this Day");
                System.out.println();
            }
        }
        sc.close();
    }

    void printTask(){
        System.out.println();
        System.out.println("Date "+ dateFormat(this.date) + "\t Time Used "+ this.usedTime );
        System.out.println("Name"+ "\t\t"+ "Time");
        for (int i = 0; i < count; i++) {
            Task ta = dayTask[i];
            System.out.println(ta.getName()+ "\t\t"+ ta.getTime());
        }
    }
            
    // will return true when date today
    boolean calDays(Date one, Date two) {  
        long dif = (one.getTime()-two.getTime())/86400000;  // 
        if(dif == 0) return true;
        else return false; // - to +
    }    

    String dateFormat(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, YY");
        return sdf.format(date);
    } 
}
class Task{
    private int time;
    private String name ="";
    Task(int time,String name){
        this.name = name;
        this.time = time;
    }
    //String time1 = "01:03:23";
    int getTime(){
        return this.time;
    }
    String getName(){
        return this.name;
    }
}

class myMain{
    private static Scanner sc2 = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Please Today Date (yyyy/mm/dd) : ");        
        myDate md = new myDate(sc2.next());
        md.printTask();
    }
}