package USACOWebsite;


import java.util.*;
import java.io.*;
/*
ID: helloro1
PROB: gift1
LANG: JAVA
*/
  class gift {
  public static void main(String[] args) throws IOException {
	Scanner scan = new Scanner(new File("gift1.in"));
	FileWriter out = new FileWriter("gift1.out");
    int num = Integer.parseInt(scan.nextLine());
    int whiler = 0;
    String arr[] = new String[num];
    int arrvals[] = new int[num];
    for(int i = 0; i < num; i++) {
    	arr[i] = scan.nextLine();
    }
    while(whiler == 0) {
    	String person = scan.nextLine();
    	String s = scan.nextLine();
    	int amount = Integer.parseInt(s.substring(0,s.indexOf(" ")));
    	int rvcnum = Integer.parseInt(s.substring(s.indexOf(" ")+1, s.length()));
    	if(rvcnum == 0) {
    		for(int m = 0; m < arr.length;m++) {
    		  System.out.println((arr[m] +  " " + arrvals[m]));
    		  out.write(arr[m] +  " " + arrvals[m] + "\n");
    		
    		}
    		break;
    	}
    	for(int i = 0; i < rvcnum;i++) {
    		String rcsvr = scan.nextLine();
    		for(int j = 0; j < arr.length; j++) {
    			if(arr[j].equals(person)) {
    			System.out.println("arrvals[j] - amount/rvcnum + (amount%rvcnum)/rvcnum; is " + (arrvals[j] - amount/rvcnum + (amount%rvcnum)/rvcnum));
    				arrvals[j] = arrvals[j] - amount/rvcnum + (amount%rvcnum)/rvcnum;
    			}
    			if(arr[j].equals(rcsvr)) {
    				arrvals[j] = arrvals[j] + amount/rvcnum;
    			}
    		}
    	}
    }
	out.close();
  }

}

