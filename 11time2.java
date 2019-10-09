import java.sql.*; 

class Time2 { 
	public static void main(String args[]) 
	{ 

		// time in milliseconds 
		long milli = 123456789999l; 

		// create a object 
		java.sql.Time time = new java.sql.Time(milli); 

		// display the time 
		System.out.println("Time = " + time.toString()); 

		// ----- setTime() ----- 

		// set another time 
		// using setTime() method 
		long milSec = 455415454l; 
		time.setTime(milSec); 

		// ----- toString() ----- 

		// display the time 
		// using toString() method 
		System.out.println("New Time = " + time.toString()); 

		// ----- valueOf() ----- 

		// using valueOf() method 
		System.out.println("Value of 00:05:29 = "
						+ Time.valueOf("00:05:29")); 
	} 
} 