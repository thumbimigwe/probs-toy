package feb_12th;
import java.util.HashMap;

public class removeDuplicates {

	public static void main(String[] args) {
		String full = "thoshh";//sample string
	    String remove=" ";//string with no duplicates
	    HashMap <Integer,Character> charStore = new HashMap<Integer,Character>();//create a hashmap to store the char's
	    char [] charArray = full.toCharArray();
	    for (Character c : charArray)//for each char
	    	{
	            if (!charStore.containsValue(c))//if the char is not already in the hashmap
	                {
	                    remove=remove+c.toString();//add the char to the output string
	                    charStore.put(c.hashCode(),c);//and add the char to the hashmap
	                }
	        }

	        System.out.println(remove);//final string
	    }
		
	}