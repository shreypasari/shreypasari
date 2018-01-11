package test;


import java.util.*;
import java.util.stream.Collectors;

public class StreamTest {
	private static final String[] tensNames = {
		    "",
		    " ten",
		    " twenty",
		    " thirty",
		    " forty",
		    " fifty",
		    " sixty",
		    " seventy",
		    " eighty",
		    " ninety"
		  };

		  private static final String[] numNames = {
		    "",
		    " one",
		    " two",
		    " three",
		    " four",
		    " five",
		    " six",
		    " seven",
		    " eight",
		    " nine",
		    " ten",
		    " eleven",
		    " twelve",
		    " thirteen",
		    " fourteen",
		    " fifteen",
		    " sixteen",
		    " seventeen",
		    " eighteen",
		    " nineteen"
		  };

		  //private EnglishNumberToWords() {}

		  private static String convertDigitToWord(int number) {
		    String soFar;

		    if (number % 100 < 20){
		      soFar = numNames[number % 100];
		      number /= 100;
		    }
		    else {
		      soFar = numNames[number % 10];
		      number /= 10;

		      soFar = tensNames[number % 10] + soFar;
		      number /= 10;
		    }
		    if (number == 0) return soFar;
		    return numNames[number] + " hundred" + soFar;
		  }

	
	
	
	public static void main(String[] args) {
	    System.out.print(">");
	    Scanner userInput = new Scanner(System.in);
	    //int inputValue = userInput.nextInt();
	    ArrayList<Integer> a1 = new ArrayList<Integer>();
	    while (userInput.hasNextInt()) {
	        //System.out.println("you just wrote: " + userInput.nextInt());
	        a1.add(userInput.nextInt());
	    }
	    userInput.close();
	    System.out.println(a1);
	    List<Integer> fivem =a1.stream().filter(x->x%5==0).collect(Collectors.toList());
	    	 
	    	    System.out.println(fivem);
	    	    
	    	    for(int i=0;i<fivem.size();i++)
	    	    {
	    	    	 System.out.println(convertDigitToWord(fivem.get(i)));
	    	    }
	    	   
	    	    
	    	    
	}
}

