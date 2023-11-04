import java.util.*;
public class TestMorses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TextorNumbersToMorseCode morse = new TextorNumbersToMorseCode(); //creating and instantiating objects
		TextorNumbersToBinary bin = new TextorNumbersToBinary();
		
		Scanner in = new Scanner(System.in);
		String input;
		
		System.out.println("Enter alphanumeric text or word "); //Enter word or number
		input = in.next();
		
			
		try 
		{
		 if(!(input.equals("")))
		 {
		  morse.setInput(input);
				
		  morse.morseCode(morse.getInput()); // convert entered text or number to Morse Code
		  bin.toBinayTextorNum(morse.getInput()); // convert input to binary
				
		  System.out.println(morse.toString() +" \n"+ bin.toString()); //output result
		 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(in != null)
			{
				in.close();
			}
		}
		
		
	}

}
