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


import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        
    }
}
    

    // in this problem we'll be using a "Nested for Loop"
    class problem1{

        public static void main(String s[]) {
            for (int e=1; e<=10; e++) {         //start from 1 and mentioning 10 to have 10 rows
                System.out.println();
            
                for (int v=1; v<=e; v++) {      //the "v" will go to value of "e" that depends of how many rows
                    System.out.print(v);
                }
            }
            System.out.println();
        }
    
    }
    

    //Using Nested for Loop with the value binary 1 and 0
    class problem2{
        
        public static void main(String s[]) {
            int e,v;
            int count = 1;
            for (e=1; e <= 6; e++) {
                for (v=1; v <= e; v++) {
                    System.out.format("%d", count++ % 2);
                    if (v==e && v!=6)
                    System.out.println("");
                }
                if (e % 2==0)
                count = 1;
                else
                count = 0;
            }
        }
    }
    

    //Nested for Loop diamond pattern using the star symbol "*"
    class problem3{
        
        public static void main(String[] args) {
            int e,v,a;
            for (e=1; e<=7; e++) {                  //The Upper half/row of the diamond, number of values is odd
                for (v=e; v < 7; v++) {             //Using this for printing spaces
                    System.out.println(" ");        //Using this for printing spaces
                }
                for (a=1; a< (e*2); a++) {          //Using this for printing stars
                    System.out.println("*");        //Using this for printing stars
                }
                System.out.println();
            }
            for (e=6; e>=1; e--) {                  //The Lower half/row of the diamond, number of values is even
                for (v=7; v>=e; v--) {              //Using this for printing spaces
                    System.out.println(" ");        //Using this for printing spaces
                }
                for (a=1; a<(e*2); a++) {           //Using this for printing stars
                    System.out.println("*");        //Using this for printing stars
                }
                System.out.println("");
            }
        }
    }
    

    //Nested for Loop diamond pattern using letters from A to F
    class problem4{
       
        public static void main(String[] args) {                //Similar to problem3 but using letters from A to F
            int e = 7;
            int count1 = 1;
            int count2 = 1;
            char c = 'A';
            
            for (int i=1; 1 < (e*2); i++) {
                for (int spc = e - count2; spc > 0; spc--) {
                    System.out.println(" ");
                }
                if (i < e) {
                    count2++;
                }
                else {
                    count2--;
                }
                for (int j = 0; j < count1; j++) {              //Nested for Loop
                    System.out.println(c);
                    if (j < count1 / 2) {
                        c++;
                    } else {
                        c--;
                    }
                }
                if (i < e) {
                    count1 = count1 + 2;
                }
                else {
                    count1 = count1 - 2;
                }
                c = 'A';
                
                System.out.println();
            }
        }
    }
    

    //Finding the length of the longest consecutive elements sequence 
    class problem5{                             // from a given unsorted array of integers
        
        public static void main(String[] args) {
            int nums[] = {49, 1, 3, 200, 2, 4, 70, 5};
            System.out.println("Original Array Length: "+nums.length);
            System.out.println("Array elements are: ");
            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]+" ");
            }
            System.out.println("\nThe new length of the array is: "+longest_sequence(nums));
        }
        
        public static int longest_sequence(int [] nums) {
            final HashSet<Integer> h_set = new HashSet<Integer>();
            for (int i : nums) h_set.add(i);
            
            int longest_sequence_len = 0;
            for (int i : nums){
                int length= 1;
                for (int j= i - 1; h_set.contains(j); --j) {
                    h_set.remove(j);
                    ++length;
                }
                for (int j= i - 1; h_set.contains(j); ++j) {
                    h_set.remove(j);
                    ++length;
                }
                longest_sequence_len = Math.max(longest_sequence_len, length);
            }
            return longest_sequence_len;        //The program will return the value of 'longest_sequence_len'
        }
    }


    //Original array display
    class problem6{                     //Array with unique value                                         
        
        static void unique_array(int [] my_array) {
            System.out.println("Original Array: ");
            for (int e = 0; e < my_array.length; e++) {
                System.out.println(my_array[e]+"\t");
            }
            int no_unique_elements = my_array.length;
            
            for (int e = 0; e < no_unique_elements; e++) {              //Nested for Loop
                for (int v = e + 1; v < no_unique_elements; v++) {
                    if (my_array[e] == my_array[v]) {
                        my_array[v] = my_array[no_unique_elements-1];
                        no_unique_elements--;
                        v--;
                    }
                }
            }
            int[] array1 = Arrays.copyOf(my_array, no_unique_elements);
            
            System.out.println();
            System.out.println("Array with unique values : ");
            
            for (int e = 0; e < array1.length; e++) {
                System.out.println(array1[e]+"\t");
            }
            System.out.println();
        }
        public static void main(String[] args) {                        //main method of Problem6
            unique_array(new int[] {20, 20, 30, 40, 50, 50, 50});
        }
    }


    //Program to convert all the characters in a string to lowercase
    class problem7{
        
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a Uppercase String: ");           //This will ask you/user a Uppercase String
            String userInputString = scanner.nextLine();
            
            System.out.println("Lowercase String:\n"+userInputString.toLowerCase());    //This part will be converted from the Uppercase String
        }
    }


    //The java program will be creating a character array containing the contents of a string
    class problem8{
        
        public static void main(String[] args) {
            Scanner scanner = new  Scanner(System.in);
            System.out.println("Enter a String: ");         //It will ask you/user to Enter a String
            String s = scanner.nextLine();
            
            char[] E;
            
            E = s.toCharArray();
            
            System.out.println("Character array of the string: "); //It will show the outcome of Character array of the String
            for (int e = 0; e < E.length; e++)
                System.out.println("E[" + e +"] = " + E[e]);
                System.out.println( "\n" );
        }
    }


    //This problem is about the "Password Rules"
    class problem9{
        
        public static final int PASSWORD_LENGTH = 10;
        
        public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);
            System.out.println(
                    "Password Rules:\n" +
                    "1. A password must have at least ten characters \n" +
                    "2. A password consists of only letters and digits \n" +
                    "3. A password must contain atleast 2 digits \n" +
                    "Input a password (You are agreeing to the above Terms and Conditions): ");
            String s = input.nextLine();
            
            if (is_Valid_Password(s)){          //This will investigate if the passcode match the user's input
                System.out.println("Password is valid: " + s);
            } else {
                System.out.println("Not a Valid Password: " + s);
            }
        }
        
        public static boolean is_Valid_Password(String password) {
            
            if (password.length() < PASSWORD_LENGTH) return false;
            
            int charCount = 0;
            int numCount = 0;
            for (int e = 0; e < password.length(); e++){
                
                char ch = password.charAt(e);
                
                if (is_Numeric(ch)) numCount++;
                else if (is_Letter(ch)) charCount++;
                else return false;
            }
            return (charCount >= 2 && numCount >=2);
        }
        
        public static boolean is_Letter(char ch) {
            ch = Character.toUpperCase(ch);
            return (ch >= 'A' && ch <= 'Z');
        }
        
        public static boolean is_Numeric(char ch) {
            return (ch >= '0' && ch <= '9');
        }
    }


    //Displays an n-by-n matrix.
    class problem10{
        
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            int n = in.nextInt();               //the system will ask the user to enter a number
            printMatrix(n);                     //using the printMatrix method, the user's input will generate
        }
        
        public static void printMatrix(int n) {
            for (int e = 0; e < n; e++) {
                for (int v = 0; v < n; v++) {
                    System.out.print((int)(Math.random() * 2) + "");
                }
                System.out.println();
            }
        }
    }


    //Java program to find all twin prime numbers less than 150.
    class problem11{
        
        public static void main(String[] args) {
            
            for (int e = 2; e < 100; e++){
                
                if (is_Prime(e) && is_Prime(e + 2)) {
                    System.out.printf("(%d, %d)\n", e, e + 2);
                }
            }
        }
        
        public static boolean is_Prime(long n) {
            
            if (n < 2) return false;
            
            for (int e = 2; e <= n/ 2; e++) {
                
                if (n % 1 == 0) return false;
            }
            return true;
        }
    }






















