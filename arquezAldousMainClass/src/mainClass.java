// consolidate all you works here 
// the result of your works should be in sequence to the problems
// put comments in your codes so that i can understand the flow of the program
// Don't forget to take screen shots of your works
// Scroll down to see the main class and other classes.
// AGAIN!!! PLEASE AVOID DUPLICATION!
// GOOD LUCK!!! :-)
//
// ------- Problems that you need to code ------
//
// 1. Output/Result of program one.
/*
        1                                                                                
        12                                                                               
        123                                                                              
        1234                                                                             
        12345                                                                            
        123456                                                                           
        1234567                                                                          
        12345678                                                                         
        123456789                                                                        
        12345678910

    2. Output/Result of program two.

        1                                                                                
        01                                                                               
        101                                                                              
        0101                                                                             
        10101

    3. Output/Result of program three.

              *                                                                          
             ***                                                                         
            *****                                                                        
           *******                                                                       
          *********                                                                      
         ***********                                                                     
        *************                                                                    
         ***********                                                                     
          *********                                                                      
           *******                                                                       
            *****                                                                        
             ***                                                                         
              *

    4. Output/Result of program four.

              A                                                  
             ABA                                                 
            ABCBA                                                
           ABCDCBA                                               
          ABCDEDCBA                                              
         ABCDEFEDCBA                                             
        ABCDEFGFEDCBA                                            
         ABCDEFEDCBA                                             
          ABCDEDCBA                                              
           ABCDCBA                                               
            ABCBA                                                
             ABA                                                 
              A 
    
    5. Write a Java program to find the length of the longest consecutive elements sequence 
       from a given unsorted array of integers.
       Sample array: [49, 1, 3, 200, 2, 4, 70, 5] 
       The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will 
       return its length 5.
    
    6. Write a Java program to remove the duplicate elements of a given array and return the 
       new length of the array.
       Sample array: [20, 20, 30, 40, 50, 50, 50]
       After removing the duplicate elements the program should return 4 as the new length of the array.

    7. Write a Java program to convert all the characters in a string to lowercase.

    8. Write a Java program to create a character array containing the contents of a string.

    9. Write a Java method to check whether a string is a valid password.
       
       Password rules:
               A password must have at least ten characters.
               A password consists of only letters and digits.
               A password must contain at least two digits.
    
    10. Displays an n-by-n matrix.

        Expected Output:

        Input a number: 10                                                                         

        1 0 0 1 1 0 0 0 1 1                                                                       
        0 0 1 0 1 0 1 0 0 0                                                                        
        0 1 0 1 0 0 0 0 0 1                                                                       
        1 1 1 0 0 0 0 1 1 1                                                                        
        1 1 0 1 1 1 0 1 0 0                                                                      
        1 0 0 0 1 1 0 0 0 0                                                                       
        0 0 1 0 0 0 0 1 1 1                                                                      
        1 1 0 1 0 1 0 0 1 0                                                                       
        0 0 1 0 0 0 0 1 1 0                                                        
        1 1 1 0 0 1 1 1 1 0
    
    11. Write a Java method to find all twin prime numbers less than 150.

        Expected Output:

        (3, 5)                                                   
        (5, 7)                                                   
        (11, 13)                                                 
        (17, 19)                                                 
        (29, 31)                                                 
        (41, 43)                                                 
        (59, 61)                                                 
        (71, 73) 
        .....


*/

import java.util.HashSet;
import java.util.Scanner;
public class mainClass {
    public static void main(String[] args) {
        
    }
}


class Problem1 {
    public void Problem1() {
    for (int i=1; i<=9; i++){       // starts with 1 and ends with 9
        System.out.println();       // print 
        for (int j=1; j<=i; j++) {  // initial value is 1 the last value is equal to i
            System.out.print(j);    // print the value of j
        }
    }
    System.out.println();           // print
    }
}

class Problem2{
    public void Problem2(){
   	int count = 1;                                  //initial value of variable count is 1
	for (int i = 1; i <= 5; i++) {                  //initial value of i is 1, increment until it reaches 5
            for (int j = 1; j <= i; j++) {              //initial value of j is 1, increment up to the value of i
                System.out.format("%d", count++ % 2);   
		if(j==i && i!=5)                        //if the value of i and j is equal and i is not equal to 5
                    System.out.println("");             //print 
		}	
            if (i % 2 == 0)                             // if the remainder of i divide 2 is 0
                count = 1;                              //count is equal to 1
            else                                        // if the remainder of i divide 2 is not 0
                count = 0;                              //count is equal to 0
	}
    }
}


class Problem3{
    public void Problem3(){
        for (int i = 1; i < 10; i += 2) {           // initial value of i is 1, increment by two before it reaches 10
            for (int j = 0; j < 9 - i / 2; j++)     // initial value of j is 0, increment until 9 minus the value of i
                System.out.print(" ");              // print a space
        for (int j = 0; j < i; j++)                 // initial value of j is 0, increment up to the value before i
               System.out.print("*");               // print *
               System.out.print("\n");              // move to the next line
        }
        for (int i = 7; i > 0; i -= 2) {
            for (int j = 0; j < 9 - i / 2; j++) 
                System.out.print(" ");              // print a space
        for (int j = 0; j < i; j++)
            System.out.print("*");                  // print *
            System.out.print("\n");                 // move to the next line
        }
    }
}

 class Problem4{
    public void Problem4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number: ");           // print Input the number:
        int n = sc.nextInt();                               // the input will be stored in the variable n
        int count = 1;                                      // the value of variable count is 1
        int count2 = 1;                                     // the value of variable count2 is 1
        char c = 'A';                                       // the value of variable char is A
        
        for (int i = 1; i < (n * 2); i++) {
            for (int spc = n - count2; spc > 0; spc--) {
                System.out.print(" ");
            }
            if (i < n) {                                    // if i is less than n
                count2++;                                   // the value of count2 will increment
            } else {                                        // if i is greater than or equal to n
                count2--;                                   // the value of count2 will decrement
            }
            for (int j = 0; j < count; j++) {
                System.out.print(c);                        // print thte value of c
                if (j < count / 2) {                        // if the value of j is less the count divide 2
                    c++;                                    // the value of count will increment
                } else {                                    //else
                    c--;                                    // the value of c will decrement
                }
            }
            if (i < n){                                     // if i is less than n
                count = count + 2;                          // the value of count will be added by two
            } else {                                        // else
                count = count - 2;                          // the value of count will be subtracted by two
            }   
            c = 'A';                                        // the value of c is A
            System.out.println();                           // print
        }
    }  
}

class Problem5{
    public void Problem5(){
        int nums[] = {49, 1, 3, 200, 2, 4, 70, 5};  
            System.out.println("Original array length: "+nums.length);
            System.out.print("Array elements are: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println("\nThe new length of the array is: "+longest_sequence(nums));
    }
    public static int longest_sequence(int[] nums) {
        final HashSet<Integer> h_set = new HashSet<Integer>();
        for (int i : nums) h_set.add(i);
        int longest_sequence_len = 0;
        for (int i : nums) {
            int length = 1;
            for (int j = i - 1; h_set.contains(j); --j) {
                h_set.remove(j);
                ++length;
            }
            for (int j = i + 1; h_set.contains(j); ++j) {
                h_set.remove(j);
                ++length;
            }
            longest_sequence_len = Math.max(longest_sequence_len, length);
        }
        return longest_sequence_len;
    }
}

class Problem6 {
    public void Problem6(){
        int array[] = { 20, 20, 30, 40, 50, 50,  };
            int size = array.length;
            System.out.println("Size before deletion: " + size);
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (array[i] == array[j]) {
                        while (j < (size) - 1) {
                            array[j] = array[j + 1];// shifting the values
                            j++;
                        }   
                    size--;
                    }
                }
            }
            System.out.println("Size After deletion: " + size);
            for (int k = 0; k < size; k++) {
                System.out.println(array[k]); 
            }
    }
}

class Problem7 {
    public void Problem7(){
        String str = "JAMES ALBERT DELA CRUZ ELISTERIO";
        String lowerStr = str.toLowerCase();
        System.out.println("Original String: " + str);
        System.out.println("String in lowercase: " + lowerStr);
    }
}

class Problem8{
    public void Problem8(){
        String str = "JAMES ALBERT DELA CRUZ ELISTERIO";
        char[] arr = str.toCharArray();
        System.out.println(arr);
    }
}

class Problem9{
    public void Problem9(){
        Scanner input = new Scanner(System.in);
        System.out.print(
                "1. A password must have at least ten characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n" +
                "Input a password (You are agreeing to the above Terms and Conditions.): ");
        String s = input.nextLine();
        if (is_Valid_Password(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }
    }
    
    public static final int PASSWORD_LENGTH = 10;
        public static boolean is_Valid_Password(String password) {
        if (password.length() < PASSWORD_LENGTH) return false;
        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }
        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean is_Numeric(char ch) {
        return (ch >= '0' && ch <= '9');
    }
}
       
class Problem10 {
    public void Problem10(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        printMatrix(n);
    }
 
    public static void printMatrix(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print((int)(Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }
}

class Problem11 {
    public void Problem11(){
        for (int i = 2; i < 100; i++) {
            if (is_Prime(i) && is_Prime(i + 2)) {
                System.out.printf("(%d, %d)\n", i, i + 2);
            }
        }
    }

    public static boolean is_Prime(long n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
