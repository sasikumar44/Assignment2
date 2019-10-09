import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

class date2 {    
    public static long calDays(Date one, Date two) {
        long dif = (one.getTime()-two.getTime())/86400000;  // 24*60*60*1000 milliSecound in a day
        return Math.abs(dif); // - to +

    }    
    public static String dateFormat(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, YY");
        return sdf.format(date);
    } 
    public static void main(String[] args){
        Date today = new Date(); // today

        Calendar myCalendar = Calendar.getInstance(); //create Instance of Calender class
        myCalendar.set(2014,0,12);  // 0 is for january
        Date date = myCalendar.getTime(); // get date 

        long days = calDays(date,today);
        System.out.println(days + " days form today date: "+ dateFormat(today)+" to the date: "+dateFormat(date) );

    }

}