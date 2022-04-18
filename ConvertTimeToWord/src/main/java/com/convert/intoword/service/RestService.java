package com.convert.intoword.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class RestService {
	
	public String convertTimeToWord() {
	    Scanner in = new Scanner(System.in); 
	    Date d = new Date();
	    SimpleDateFormat SDF = new SimpleDateFormat ("HH:mm");
	    System.out.println("Enter the time");
	    String sTime = SDF.format(d).toString();
	    System.out.println("sTime "+sTime);
	    String sHours = sTime.substring(0,2);
	    System.out.println("sHours "+sTime.substring(0,2));
	    String sMinutes = sTime.substring(3);
	    System.out.println("sMinutes "+sTime.substring(3));
	    try{ int hours = Integer.parseInt(sHours);
	      int minutes = Integer.parseInt(sMinutes);
	      return getTimeName(hours, minutes);
	    }

	      catch( NumberFormatException e){
	        System.out.println("invalid input");//affiche une erreur ici
	        return "invalid input";
	      }
		  }
    public static String getTimeName(int hours, int minutes){
	      String time_name = ""; 
    
	    	    int i= hours/10;
	    	    int j=hours%10;
	    	   int k= minutes/10;
	    	   int h=minutes%10;
	    	   if(hours<20 && minutes>=20 && minutes<60) {
	    	  String mint []={"Zero", "One", "Two", "Three", "Four", "Five", "Six","Seven", "Eight", "Nine","Ten",
	    	          "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"
	   }; 
	    	  String hour[]= {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninty"};
	    	  time_name="It's"+" "+mint[hours]+" "+hour[k]+" "+mint[h];
	      }
	    	   else   if(hours>20 && hours<=24 && minutes<=20 ) {
	    		   String mint []={"", "One", "Two", "Three", "Four", "Five", "Six","Seven", "Eight", "Nine","Ten",
	 	    	          "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"
	 	   }; 
	 	    	  String hour[]= {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninty"};
	 	    	  time_name="It's"+" "+hour[i]+mint[j]+" "+mint[minutes];
	    	   }
	      
	      else 
	        time_name = "invalid time format";

	      return time_name;

	}
}
