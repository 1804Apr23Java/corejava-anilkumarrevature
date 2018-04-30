package com.revature.eval.java.core;

import java.time.temporal.Temporal;
import java.util.List;
import java.util.Map;

public class EvaluationService {

	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	public static String reverse(String string) {
		char[] reversed = new char[string.length()];
		for (int i = reversed.length - 1, j=0; i >= 0; i--, j++) {
			reversed[j] = string.charAt(i);
		}
		return new String(reversed);
	}
	
	
	public static void main(String[] args) {
		System.out.println(reverse("ToBeOrNotToBe"));  
		

	}

}

	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
public static String acronym(String phrase) {
	
    StringBuilder acronyms = new StringBuilder();	
    
    String[] WordsArray = phrase.split(" ");
    
    for(String word : WordsArray) {
        acronyms.append( word.substring(0, 1) );
    }
return acronyms.toString();
}

public static void main(String[] args) {

System.out.println("The acronym of the three words are: " + acronym("This is Tom Danion"));

}

}

	/**
	 * 3. Determine if a triangle is equilateral, isosceles, or scalene. An
	 * equilateral triangle has all three sides the same length. An isosceles
	 * triangle has at least two sides the same length. (It is sometimes specified
	 * as having exactly two sides the same length, but for the purposes of this
	 * exercise we'll say at least two.) A scalene triangle has all sides of
	 * different lengths.
	 *
	 */
private double sideOne;
private double sideTwo;
private double sideThree;

public Triangle() {
	super();
}

public Triangle(double sideOne, double sideTwo, double sideThree) {
	this();
	this.sideOne = sideOne;
	this.sideTwo = sideTwo;
	this.sideThree = sideThree;
}

public double getSideOne() {
	return sideOne;
}

public void setSideOne(double sideOne) {
	this.sideOne = sideOne;
}

public double getSideTwo() {
	return sideTwo;
}

public void setSideTwo(double sideTwo) {
	this.sideTwo = sideTwo;
}

public double getSideThree() {
	return sideThree;
}

public void setSideThree(double sideThree) {
	this.sideThree = sideThree;
}

public boolean isEquilateral() {
	
	if (sideOne == sideTwo && sideTwo == sideThree) {
		return true;
	}
	else	
	
	return false;
}

public boolean isIsosceles() {
	
	if ((sideOne == sideTwo) & (sideTwo != sideThree) || (sideTwo == sideThree) & (sideThree!= sideOne)) {
		return true;
	}
	else
	return false;
}


public boolean isScalene() {
	
	if (sideOne != sideTwo && sideTwo != sideThree) {
		return true;
	}
	else
	return false;
}



public static void main(String[] args) {
Scanner sc = new Scanner(System.in);  

Triangle t = new Triangle();

System.out.println("Please enter the first side of a triangle");
double side1 = sc.nextDouble();
t.setSideOne(side1);

System.out.println("Please enter the second side of a triangle");
double side2 = sc.nextDouble();
t.setSideTwo(side2);

System.out.println("Please enter the third side of a triangle");
double side3 = sc.nextDouble();
t.setSideThree(side3);

if(t.isEquilateral()== true) {
	System.out.println("It is a equilateral triangle");
}

if(t.isIsosceles()== true) {
		System.out.println("It is a isoscelese triangle");
	}

if(t.isScalene()== true) {
			System.out.println("It is a scalene triangle");
	
	
	
}

}

}

	/**
	 * 4. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
public int getScrabbleScore(String string) {
	  
	
    int scrambleScore = 0;
    string = string.toUpperCase();
    for (int i = 0; i < string.length(); i++){
        char letter = string.charAt(i);
        switch (letter) {
            case 'A':
            case 'E':
            case 'I':
            case 'L':
            case 'N':
            case 'O':
            case 'R':
            case 'S':
            case 'T':
            case 'U': 
            	scrambleScore +=1; break;
            case 'D':
            case 'G':
            	scrambleScore+=2; break;
            case 'B':
            case 'C':
            case 'M':
            case 'P':
            	scrambleScore +=3; break;
            case 'F':
            case 'H':
            case 'V':
            case 'W':
            case 'Y':
            	scrambleScore +=4; break;
            case 'K':
            	scrambleScore +=5; break;
            case 'J':
            case 'X':
            	scrambleScore +=8; break;
            case 'Q':
            case 'Z':
            	scrambleScore +=10; break;
            default: break;
        }
    }
    return scrambleScore;
}





public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
ScrabbleScore s = new ScrabbleScore();
System.out.println("Please enter the word to find the score");
String word = sc.nextLine();
System.out.println("The score for the word "+ word + " is: " +s.getScrabbleScore(word));

}

}
	/**
	 * 5. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
public String cleanPhoneNumber(String string) {
	
	String newNumber = string.replaceAll("[^0-9]",""); 
	
	return newNumber;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	CleanPhoneNumber s = new CleanPhoneNumber();
	System.out.println("Please enter the phone number");
	String phoneNumber = sc.nextLine();
	System.out.println("The score for the word "+ phoneNumber + " is: " +s.cleanPhoneNumber(phoneNumber));

}

}

	/**
	 * 6. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
public Map<String, String> wordCount(String string) {
	Map<String, String> map = new HashMap <String, String> ();
	 
    if (string != null) {
        String[] separatedWords = string.split(" ");
        for (String str: separatedWords) {
            if (map.containsKey(str)) {
                int count = Integer.parseInt(map.get(str));
                map.put(str, String.valueOf(count + 1));
            } else {
                map.put(str, "1");
            }
        }
    }

    System.out.println("Count :- " + map);
    return map;	
	
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	WordCount s = new WordCount();
	System.out.println("Please enter the pharase to count the word");
	String word = sc.nextLine();
	System.out.println("The score for the word "+ word + " is: " +s.wordCount(word));

}

}

	/**
	 * 7. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> {
		private List<T> sortedList;

		public int indexOf(T t) {
			// TODO Write an implementation for this method declaration
			return 0;
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

	}

	/**
	 * 8. Implement a program that translates from English to Pig Latin.
	 * 
	 * Pig Latin is a made-up children's language that's intended to be confusing.
	 * It obeys a few simple rules (below), but when it's spoken quickly it's really
	 * difficult for non-children (and non-native speakers) to understand.
	 * 
	 * Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
	 * the word. Rule 2: If a word begins with a consonant sound, move it to the end
	 * of the word, and then add an "ay" sound to the end of the word. There are a
	 * few more rules for edge cases, and there are regional variants too.
	 * 
	 * See http://en.wikipedia.org/wiki/Pig_latin for more details.
	 * 
	 * @param string
	 * @return
	 */
Scanner sc = new Scanner(System.in);
	
	public String toPigLatin(String string) {
		if (string == null) return null;
	    String[] arr = string.toLowerCase().split(" ");
	    String pigLatin = "";
	    int i = 0;
	    while (i < arr.length) {
	        pigLatin = "bcdfghjklmnpqrstvwxz".contains("" + arr[i].charAt(0))
	                ? String.valueOf(pigLatin) + arr[i].substring(1, arr[i].length()) + arr[i].charAt(0) + "ay"
	                : String.valueOf(pigLatin) + arr[i] + "yay";
	        if (i != arr.length - 1)
	            pigLatin= String.valueOf(pigLatin) + " ";
	        ++i;
	    }
	    return pigLatin;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EnglishtoPigLatin s = new EnglishtoPigLatin();
		System.out.println("Please enter a word to be converted to Pig Latin");
		String word = sc.nextLine();
		System.out.println("The Pig Latin for the word "+ word + " is: " +s.toPigLatin(word));

	}

}


	/**
	 * 9. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
public boolean isArmstrongNumber(int input) {
	int tempVal,noOfDigits = 0,sumOfNumber = 0, remainder;
	int power = 1;
	
	tempVal = input;
	 
      // Count number of digits
 
      while (tempVal != 0) {
        
		noOfDigits++;
		
         tempVal = tempVal/10;
      }
 
      tempVal = input;
 
      while (tempVal != 0) {
         remainder = tempVal%10;
         
         for (int i = 1; i <= noOfDigits; i++) { 
	         power = power*remainder;
         }
         
         sumOfNumber = sumOfNumber + power;
         tempVal = tempVal/10;
      }
 
      if (input == sumOfNumber) {
         //System.out.println(n + " is an Armstrong number.");
    	  return true;
      }
      else
         //System.out.println(n + " isn't an Armstrong number.");         

	return false;
}


public static void main(String[] args) {
	
	 Scanner in = new Scanner(System.in);
	 ArmstrongNumber an = new ArmstrongNumber();
      System.out.println("Input a number to check if it is an Armstrong number");      
      int num = in.nextInt();
      
      
      if(an.isArmstrongNumber(num)== true) {
    	  System.out.println(num + " is an Armstrong number.");
      } else {
    	  System.out.println(num + " isn't an Armstrong number.");
      }
      
      
      
}

}


	/**
	 * 10. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
public  static List<Long> calculatePrimeFactorsOf(long l) {
	
	
	
	
    List<Long> factors = new ArrayList<Long>();
    
    for (Long i = (long) 2; i <= l; i++) {
        while (l % i == 0) {
            factors.add(i);
            l /= i;
        }
    }
    
    
    if (l > 0) {
    return factors;
    } else {
    	return null;
    }
	
	
}
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 calculatePrimeFactorsOf an = new calculatePrimeFactorsOf();
      System.out.println("Enter Number to calculate the prime factor");      
      Long num = (long) in.nextInt();
      //an.calculatePrimeFactorsOf(num);
      try {
      System.out.println("Primefactors of:" + num);
      for (Long integer : calculatePrimeFactorsOf(num)) {
            System.out.println(integer);  
}
      } catch(NullPointerException n) {
    	  System.out.println("There is no prime factors");
      }

}
}


	/**
	 * 11. Create an implementation of the rotational cipher, also sometimes called
	 * the Caesar cipher.
	 * 
	 * The Caesar cipher is a simple shift cipher that relies on transposing all the
	 * letters in the alphabet using an integer key between 0 and 26. Using a key of
	 * 0 or 26 will always yield the same output due to modular arithmetic. The
	 * letter is shifted for as many values as the value of the key.
	 * 
	 * The general notation for rotational ciphers is ROT + <key>. The most commonly
	 * used rotational cipher is ROT13.
	 * 
	 * A ROT13 on the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: nopqrstuvwxyzabcdefghijklm It is
	 * stronger than the Atbash cipher because it has 27 possible keys, and 25
	 * usable keys.
	 * 
	 * Ciphertext is written out in the same formatting as the input including
	 * spaces and punctuation.
	 * 
	 * Examples: ROT5 omg gives trl ROT0 c gives c ROT26 Cool gives Cool ROT13 The
	 * quick brown fox jumps over the lazy dog. gives Gur dhvpx oebja sbk whzcf bire
	 * gur ynml qbt. ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. gives The
	 * quick brown fox jumps over the lazy dog.
	 */
private String alphabet = "abcdefghijklmnopqrstuvwxyz";
private int key;

public RotationalCipher(int key) {
	super();
	this.key = key;
}

public String rotate(String string) {
	
	if(string != "") {
	 string = string.toLowerCase();
	    String cipherText = "";
	    for (int i = 0; i < string.length(); i++)
	    {
	        char replaceVal = string.charAt(i);
	        int charPosition = alphabet.indexOf(replaceVal);        
	        if(charPosition != -1) {
	            int keyVal = (key + charPosition) % 26;
	            replaceVal = alphabet.charAt(keyVal);
	        }

	        cipherText += replaceVal;
	    }
	    return cipherText;
	}
		else {
	return null;
}
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int value = 0;
	System.out.println("Enter key value for Encryption: ");
	value = sc.nextInt();
	
	RotationalCipher r = new RotationalCipher(value); 
    System.out.println("Enter the String for Encryption: ");       
    String message = sc.next();
    System.out.println(r.rotate(message));
    
    if(r.rotate(message)== "null") {
    	System.out.println("There is nothing to encrypt");
    }
        
}

}

	/**
	 * 12. Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 * 
	 * @param i
	 * @return
	 */
public int calculateNthPrime(int i) {
	 int num, count, j;
	    num=1;
	    count=0;
	 
	    while (count < i){
	      num=num+1;
	      for (j = 2; j <= num; j++){
	        if (num % j == 0) {
	          break;
	        }
	      }
	      if ( j == num){
	        count = count+1;
	      }
	    }
	   
	    return num;
	    
	    // System.out.println("Value of nth prime: " + num);
	  
	//return 0;
}



public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	 
   System.out.print("Enter n to compute the nth prime number: ");

   int nth = sc.nextInt();
   
   calculateNthPrime cnp = new calculateNthPrime();
   
   System.out.println("The nth prime number is: " +cnp.calculateNthPrime(nth));
}

}


	/**
	 * 13 & 14. Create an implementation of the atbash cipher, an ancient encryption
	 * system created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
import java.util.Scanner;

public class AtbashCipher {
	
	
	/**
	 * Question 13
	 * 
	 * @param string
	 * @return
	 */
	
	  private static final String PLAIN = "abcdefghijklmnopqrstuvwxyz";
	  private static final String CIPHER = "zyxwvutsrqponmlkjihgfedcba";
	
	public static String encode(String string) {
		
		if(string != null) {
		string = string.toLowerCase();
	        String cyphered = "";
	         
	        for (char c : string.toCharArray()) {
	            int idx = PLAIN.indexOf(c);
	            cyphered += CIPHER.toCharArray()[idx];
	        }
	         
	        return cyphered;
		} else {
		return null;
		}
	}

	/**
	 * Question 14
	 * 
	 * @param string
	 * @return
	 */
	public static String decode(String string) {
		string = string.toLowerCase();
        String cyphered = "";
         
        for (char c : string.toCharArray()) {
            int idx = PLAIN.indexOf(c);
            cyphered += CIPHER.toCharArray()[idx];
        }
         
        return cyphered;
		//return null;
	}
	public static void main(String[] args) {
		AtbashCipher ac = new AtbashCipher();
	
		Scanner sc = new Scanner(System.in);
		String value = "";
		System.out.println("Enter string value for Encryption: ");
		value = sc.next();
        
		System.out.println("The encoded string is: "+ ac.encode(value));
		
		System.out.println("The decoded string is: "+ ac.decode(ac.encode(value)));
	}

}

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidIsbn {
	/**
	 * 15. The ISBN-10 verification process is used to validate book identification
	 * numbers. These normally contain dashes and look like: 3-598-21508-8
	 * 
	 * ISBN The ISBN-10 format is 9 digits (0 to 9) plus one check character (either
	 * a digit or an X only). In the case the check character is an X, this
	 * represents the value '10'. These may be communicated with or without hyphens,
	 * and can be checked for their validity by the following formula:
	 * 
	 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
	 * * 2 + x10 * 1) mod 11 == 0 If the result is 0, then it is a valid ISBN-10,
	 * otherwise it is invalid.
	 * 
	 * Example Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula,
	 * and get:
	 * 
	 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 *
	 * 1) mod 11 == 0 Since the result is 0, this proves that our ISBN is valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isValidIsbn(String string) {
		String regex = "^(?:ISBN(?:-10)?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$)[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$";
		Pattern pattern = Pattern.compile(regex);
		
		
		    Matcher matcher = pattern.matcher(string);
		    boolean x = matcher.matches();
		
		return x;
		//return false;
	}

	public static void main(String[] args) {
		ValidIsbn vi = new ValidIsbn();
		Scanner sc = new Scanner(System.in);
		String value = "";
		System.out.println("Enter the ISBN: ");
		value = sc.next();
        
		
        if(vi.isValidIsbn(value)== true) {
        	System.out.println("The ISBN "+ value + " is valid");
        }else {
        	System.out.println("The ISBN "+ value + " is not valid");
        }
	} 

}


	/**
	 * 16. Determine if a sentence is a pangram. A pangram (Greek: Ï€Î±Î½ Î³Ï�Î¬Î¼Î¼Î±, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isPangram(String string) {
		
		boolean[] mark = new boolean[26];
		 
	       
	        int index = 0;
	 
	        
	        for (int i = 0; i < string.length(); i++)
	        {
	           
	            if ('A' <= string.charAt(i) && 
	                    string.charAt(i) <= 'Z')
	                         
	                index = string.charAt(i) - 'A';
	 
	                
	            else if('a' <= string.charAt(i) && 
	                        string.charAt(i) <= 'z')
	                             
	                index = string.charAt(i) - 'a';
	 
	            
	            mark[index] = true;
	        }
	 
	        
	        for (int i = 0; i <= 25; i++)
	            if (mark[i] == false) 
	                return (false);
	            
	       
	        return (true);
	     }
	
	
	
		
	
	public static void main(String[] args) {
		 String phrase;
		Scanner sc = new Scanner(System.in);
		
		Pangram p = new Pangram();
		
		System.out.println("Enter the Pangram phrase: ");
		phrase = sc.next();
		if (p.isPangram(phrase) == true)
	            System.out.print(phrase + " is a pangram.");
	        else
	            System.out.print(phrase+ " is not a pangram.");

	}

}


	/**
	 * 17. Calculate the moment when someone has lived for 10^9 seconds.
	 * 
	 * A gigasecond is 109 (1,000,000,000) seconds.
	 * 
	 * @param given
	 * @return
	 */
	public Temporal getGigasecondDate(Temporal given) {
		// TODO Write an implementation for this method declaration
		return null;
	}

	/**
	 * 18. Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 * 
	 * @param i
	 * @param set
	 * @return
	 */
	public int getSumOfMultiples(int i, int[] set) {
		// TODO Write an implementation for this method declaration
		return 0;
	}

	/**
	 * 19. Given a number determine whether or not it is valid per the Luhn formula.
	 * 
	 * The Luhn algorithm is a simple checksum formula used to validate a variety of
	 * identification numbers, such as credit card numbers and Canadian Social
	 * Insurance Numbers.
	 * 
	 * The task is to check if a given string is valid.
	 * 
	 * Validating a Number Strings of length 1 or less are not valid. Spaces are
	 * allowed in the input, but they should be stripped before checking. All other
	 * non-digit characters are disallowed.
	 * 
	 * Example 1: valid credit card number 1 4539 1488 0343 6467 The first step of
	 * the Luhn algorithm is to double every second digit, starting from the right.
	 * We will be doubling
	 * 
	 * 4_3_ 1_8_ 0_4_ 6_6_ If doubling the number results in a number greater than 9
	 * then subtract 9 from the product. The results of our doubling:
	 * 
	 * 8569 2478 0383 3437 Then sum all of the digits:
	 * 
	 * 8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80 If the sum is evenly divisible by 10,
	 * then the number is valid. This number is valid!
	 * 
	 * Example 2: invalid credit card number 1 8273 1232 7352 0569 Double the second
	 * digits, starting from the right
	 * 
	 * 7253 2262 5312 0539 Sum the digits
	 * 
	 * 7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57 57 is not evenly divisible by 10, so
	 * this number is not valid.
	 * 
	 * @param string
	 * @return
	 */
public boolean isLuhnValid(String string) {
		
		int[] ints = new int[string.length()];
		for (int i = 0; i < string.length(); i++) {
			ints[i] = Integer.parseInt(string.substring(i, i + 1));
		}
		for (int i = ints.length - 2; i >= 0; i = i - 2) {
			int j = ints[i];
			j = j * 2;
			if (j > 9) {
				j = j % 10 + 1;
			}
			ints[i] = j;
		}
		int sum = 0;
		for (int i = 0; i < ints.length; i++) {
			sum += ints[i];
		}
		if (sum % 10 == 0) {
			return true;
		} else {
			return false;
		}
	}

		
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String numphrase;
		
		LuhnFormula lf = new LuhnFormula();
		System.out.println("Enter the Pangram phrase: ");
		numphrase = sc.next();
		if (lf.isLuhnValid(numphrase) == true) {
	            System.out.print(numphrase + " is a valid for Luhn Formula.");
		}
	        else {
	            System.out.print(numphrase+ " is not valid for Luhn Formula.");
	        }

	}

}


	/**
	 * 20. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
public int solveWordProblem(String string) {
	Scanner sc = new Scanner(string);
	String operator;
	int firstValue, secondValue;
    // get the next number from the scanner
    firstValue = Integer.parseInt(sc.findInLine("[0-9]"));

    // get everything which follows and is not a number (might contain white spaces)
    operator = sc.findInLine("[^0-9]*").trim();
    
     secondValue = Integer.parseInt(sc.findInLine("[0-9]"));
    
    switch (operator){
        case "plus":
            return firstValue + secondValue;
        case "minus":
            return firstValue - secondValue;
        case "divided by":
            return firstValue / secondValue;
        case "multiplied by":
            return firstValue * secondValue;
	default:
            throw new RuntimeException("unknown operator: "+ operator);
            
    }
	
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
	
	String mathPhrase;
	
	MathWordProblems mwp = new MathWordProblems();
	System.out.println("Enter the math word phrase: ");
	mathPhrase = sc.next();
	System.out.println("The solution for the two values in the phrase is: "+(Integer) mwp.solveWordProblem(mathPhrase));

}

}
