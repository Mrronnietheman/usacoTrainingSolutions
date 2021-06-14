/*
ID: helloro1
LANG: JAVA
TASK: ride
*/
import java.io.FileWriter;
import java.io.*;
import java.util.*;
public class ride{

	public static void main(String[] args) throws IOException {
		int mult = 1;
		int mult2 = 1;
		String arr[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		BufferedReader f = new BufferedReader(new FileReader("ride.in"));
		FileWriter out = new FileWriter("ride.out");
		String line = "";
		int count = 0;
		while((line = f.readLine()) != null) {
			count++;
			if(count == 1) {
			for(int i = 0; i < line.length();i++) {
				  for(int j = 0; j < arr.length;j++) {
					if(line.charAt(i) == arr[j].charAt(0)) {
						mult = mult * (j+1);
				    }
				  }
			}
			}
			    else{
					for(int i = 0; i < line.length();i++) {
						  for(int j = 0; j < arr.length;j++) {
							if(line.charAt(i) == arr[j].charAt(0)) {
								mult2 = mult2 * (j+1);
						    }
						  }
					}
					}
		}
		if(mult%47 == mult2%47) {
			out.write("GO\n");
			
			
		}else {
			out.write("STAY\n");
		}
	  out.close();
	}
}

