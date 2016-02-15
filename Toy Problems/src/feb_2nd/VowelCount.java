package feb_2nd;

//PSEUDOCODE
//* Created one class with main method  (Main + VowelCount)
//* created a print messege for user 		(in Main)
//	-reads reply
//
//* Call vowel count using string as a parameter	(in Vowel count)
//* Make string in lower case
//* Loop through each character
//* Use condition to check if it is a  vowel
//* Count vowels
// 
//* Create object of HashMap
//* Added values to HashMap
//* Return Hashmap
//
//* Create a loop through all values and keys
//* Print them
//





import java.util.Scanner;
import java.util.HashMap;



public class VowelCount {

	public static void main(String[] args) {
		

	}

}




package vowelcount;
import java.util.HashMap;
/**
 *
 * @author kimaiga
 */
public class VowelCount {

    /**
     * @param args the command line arguments
     */
    //vowel count method goes here-I'll make it static
public static HashMap vowelcount (String str){
		
		//create hashmap object
                HashMap <Character, Integer> x = new HashMap <Character, Integer> (); 
		
              
		int a = 0; int e = 0; int ii = 0; int o = 0; int u = 0;
		
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch == 'a'){
            	a= a+1;
            } 
            
            if (ch == 'e'){
            	e= e+1;
            }
            
            if (ch == 'u'){
            	u= u+1;
            } 
            
            if (ch == 'i'){
            	ii= ii+1;
            } 
            
            if (ch == 'o'){
            	o=o+1;
           } 
            
            x.put('a', a);
            x.put('e', e);
            x.put('u', ii);
            x.put('i', o);
            x.put('o', u);
            
            
        }
        
      //returning hashmap object 
        return x;
		
	}
    
    public static void main(String[] args) {
        // TODO code application logic here
        //print output here
        System.out.println(VowelCount.vowelcount("Moringa School"));	
	System.out.println(VowelCount.vowelcount("Code School"));
    }
    
}
