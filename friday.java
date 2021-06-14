/*
ID: helloro1
LANG: JAVA
TASK: friday
*/
import java.io.*;
import java.util.*;
public class friday {
public static void main(String args[]) throws IOException {
	BufferedReader f = new BufferedReader(new FileReader("friday.in"));
	FileWriter out = new FileWriter("friday.out");
	int in = Integer.parseInt(f.readLine());
	int upper = 1899 + in;
	int months[] = {1,2,3,4,5,6,7,8,9,10,11,12};
	int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	int week[] = {0,0,0,0,0,0,0};
	int numdays = 0;
	int count = 0;
	for(int i = 1900; i <= upper; i++) {
	  for(int j = 0; j < 12; j++) {
			 numdays = days[j];
	    for(int k = 0; k < numdays; k++) {
	    	if(isLeapYear(i)) {
	    		if(j == 1) {
	    			numdays = 29;
	    		}
	    	}
	    	count++;
	    	if(k == 12) {
	    	if(count % 7 == 0) {
	    	  week[0]++;
	    	  //System.out.println("week[0]++ " + week[0] + " year is " + i + " month is " + j + " count is " + count);
	    	}
	    	if(count % 7 == 1) {
	    	  week[1]++;
	    	  //System.out.println("week[1]++ " + week[1] + " year is " + i + " month is " + j + " count is " + count);
	    	}
	    	if(count % 7 == 2) {
	    	   week[2]++;
	    	   //System.out.println("week[2]++ " + week[2] + " year is " + i + " month is " + j + " count is " + count);
	    	}
	    	if(count % 7 == 3) {
	    	   week[3]++;
	    	   //System.out.println("week[3]++ " + week[3] + " year is " + i + " month is " + j + " count is " + count);
	    	}
	    	if(count % 7 == 4) {
	           week[4]++;
	           //System.out.println("week[4]++ " + week[4] + " year is " + i + " month is " + j + " count is " + count);
			}
	    	if(count % 7 == 5) {
	    	   week[5]++;
	    	   //System.out.println("week[5]++ " + week[5] + " year is " + i + " month is " + j + " count is " + count);
	    	}
	    	if(count % 7 == 6) {
	    	   week[6]++;
	    	   //System.out.println("week[6]++ " + week[6] + " year is " + i + " month is " + j + " count is " + count);
	    	}
	    	
	    	}	
	    }
	  }	
	}
	out.write(week[6] + " " + week[0] + " " + week[1] + " " + week[2] + " " + week[3] + " " + week[4] + " " + week[5] + "\n");
	f.close();
	out.close();
}
public static boolean isLeapYear(int year) {
  if((year % 4) == 0 && (year % 100 != 0)) {
	  return true;
  }
  if((year % 4) == 0 && (year % 100 == 0)) {
	  if(year % 400 == 0) {
		  return true;
	  }else {
		  return false;
	  }
  }
return false;
}
}
