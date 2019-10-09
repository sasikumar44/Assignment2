import java.sql.*;
class Time3 {

	public static void main(String args[]){ 
		String time1 = "01:03:23";
		String time2 = "02:32:00";
		long difference;
		Time t1 = Time.valueOf(time1);
		Time t2 = Time.valueOf(time2);
		if(t2.getTime() >= t1.getTime()){
			difference = t2.getTime() - t1.getTime() -19800000;
		}
		else{
			difference = t1.getTime() - t2.getTime() -19800000;
		}
		
		java.sql.Time time = new java.sql.Time(difference); 
		System.out.println(time);
	} 
	
} 