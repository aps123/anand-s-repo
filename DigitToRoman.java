# anand-s-repo

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DigitToRoman {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
                System.out.print("Enter your Digit::");
                int digit=sc.nextInt();
		String s=converter(digit);
		System.out.println("Digit in Roman number::"+ s);
		System.out.print("Do you want continue or Not"+ "("+"Y/N"+")::");
		String s1=sc.next();
		while(true) {
		switch(s1) {
		case "y" :{
			System.out.print("Enter your Digit::");
	         digit=sc.nextInt();
			 s=converter(digit);
			System.out.println("Digit in Roman number::"+ s);
			System.out.print("Do you want continue or Not"+ "("+"y/n"+")::");
		    s1=sc.next();
			break;
		}
		case"n":
			System.exit(0);
		}
		}
	}
	
	public static String  converter(int digit)
	{
		Map<String,Integer> hm =new LinkedHashMap<>();
		hm.put("M", 1000);
		hm.put("CM",900);
		hm.put("D", 500);
		hm.put("CD",400);
	        hm.put("C", 100);
	        hm.put("XC", 90);
		hm.put("L", 50);
		hm.put("XL", 40);
		hm.put("X", 10);
		hm.put("IX", 9);
		hm.put("V", 5);
		hm.put("IV", 4);
		hm.put("I", 1);
		final StringBuilder sb=new StringBuilder();
		@SuppressWarnings("rawtypes")
		Set s=hm.entrySet();
		@SuppressWarnings("rawtypes")
		Iterator itr=s.iterator();
		 while(itr.hasNext()) {
			  @SuppressWarnings("unchecked")
			  Map.Entry<String, Integer> m=(Entry<String, Integer>) itr.next();
		          int qou=digit/m.getValue();
		          for(int i=0; i< qou;i++) { 
		              sb.append(m.getKey());
		      }
		         digit=digit%m.getValue();	
		}
		return  sb.toString();
	}
}
