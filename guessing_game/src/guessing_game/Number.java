package guessing_game;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Number {

	public static void main(String[] args) throws Exception {
	     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	     Random  random =  new Random();
	     int val=random.nextInt(100);
	     System.out.println("Random number is "+val);
	     int count = 0;
	     for(int i=0;i<10;i++) {
	    	 String choice = "yes";
	    	 while(choice.equals("yes")) {
	    		 System.out.println("the range for guessing the number is between (0 to 100)");
	    		 int num=Integer.parseInt(reader.readLine());
	    		 count++;
	    		 if(num>=101){
	    			 System.out.println("wrong Input");
	    			 break;
	    		 }
	    		 else if(val>num) {
	    			 System.out.println("Guess little higher");
	    			 break;
	    		 }
	    		 else if(val<num) {
	    			 System.out.println("Guess little lower");
	    			 break;
	    		 }
	    		 if(val==num) {
	    			 System.out.println("congratulations you guessed the correct number");
	    			 System.out.println("you guessed in " + count + " tries");
	    			 System.out.println("do you want to play again(Yes/No)");
	    			 choice=reader.readLine().toLowerCase();
	    			 if(choice.equals("no")) {
	    				 i=10;
	    				 break;
	    			 }
	    	   while(!choice.equals("yes")) {
	    		   System.out.println("Enter the correct input(yes/no)");
	    		   choice=reader.readLine().toLowerCase();
	    	   }
	    	   val=random.nextInt(101);
	    	   System.out.println(val);
	    		 }
	    	 }
	    	 
	     }
	    		 

	}

}
