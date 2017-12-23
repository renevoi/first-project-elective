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
public class MainClass{

    public static void main(String[] args) {
        
}
    }


// these are the classes that need to be instantiated in order to use in main() method
class Problem1{
    private int numberOfRow;             //I used private variable
    public int getNumberOfRow() {       //and used getters and setters
        return numberOfRow;
    }
    public void setNumberOfRow(int numberOfRow) {
        this.numberOfRow = numberOfRow;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows");
        Problem1 p1 = new Problem1();
        p1.setNumberOfRow(in.nextInt());

int i,j;
   System.out.print("Input number of rows : \n");         //The program will ask the users of how many rows
   for(i=1;i<=p1.getNumberOfRow();i++)
   {
	for(j=1;j<=i;j++)
	  System.out.print(j);

    System.out.println("");
    }
    }
}



class Problem2{                             //problem 2 is increment value of binary 1 and 0
    private int numberOfRow;             //I used private variable
    public int getNumberOfRow() {       //and used getters and setters
        return numberOfRow;
    }
    public void setNumberOfRow(int numberOfRow) {
        this.numberOfRow = numberOfRow;
    }
    public static void main(String s[])  {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows");
        Problem2 p2 = new Problem2();
        p2.setNumberOfRow(in.nextInt());
	int x, y;                                 
   	int count = 1;     
        System.out.print("Input number of rows : \n");         //The program will ask the users of how many rows
	for (x = 1; x <= p2.getNumberOfRow(); x++) {                
            for (y = 1; y <= x; y++) {
                System.out.format("%d", count++ % 2);
		if(y==x && x!=6)
                System.out.println("");
            }		
            if (x % 2 == 0)
            count = 1;
            else
            count = 0;
	}
    }
}




class Problem3{             //Nested loop of * 1 to 7 and nested loop of * in decrement from 7 to 1
    //to print a diamond shape using asterisk(*)
    public static void main(String[] args)  {
        int x, y, z;                            
        for(x=1;x<=7;x++){                      //for loop increment
            for(y=x;y<7;y++) {
                System.out.print(" ");
            }
            for(z=1;z<(x*2);z++) {
                System.out.print("*");
            }
            System.out.println();
        }                       
        for(x=6;x>=1;x--) {                     //for loop decrement
            for(y=7;y>x;y--) {
                System.out.print(" ");
            }
            for(z=1;z<(x*2);z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




class Problem4 {    //Nested loop  of letter 1 to 7 and nested loop of letter in decrement from 7 to 1 with increment and decrement A to F
   public static void main(String args[]) {     //almost the same of problem3 but instead of * letters A to F will increment
        int n = 7;                                          
        int count = 1;                                      
        int count2 = 1;                                     
        char c = 'A';                                       
       for (int i = 1; i < (n * 2); i++) {                 
            for (int spc = n - count2; spc > 0; spc--) {    
                System.out.print(" ");
            }
            if (i < n) {
                count2++;
            } 
            else {
                count2--;
            }
            for (int j = 0; j < count; j++) {       //nested for loop
                System.out.print(c);                        
                if (j < count / 2) {
                    c++;
                } else {
                    c--;
                }
            }
            if (i < n) {
                count = count + 2;
            } 
            else {
                count = count - 2;
            }
            c = 'A';

            System.out.println();
        }
    }
    
}
class Problem5 {                        //problem 5 finding the length of the longest consecutive elements sequence 
      // from a given unsorted array of integers.
    
    public static void main(String[] args) {
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
        return longest_sequence_len;                    //the program will return the value of 'longest_sequence_len'
    }
}




class Problem6 {                //original array display
                                //Array with unique value
    static void unique_array(int[] my_array) {
        System.out.println("Original Array : ");                        
        for (int i = 0; i < my_array.length; i++) {
            System.out.print(my_array[i]+"\t");
        }
        int no_unique_elements = my_array.length;
        for (int i = 0; i < no_unique_elements; i++){               //nested for loop
            for (int j = i+1; j < no_unique_elements; j++) {        
                if(my_array[i] == my_array[j]) {
                    my_array[j] = my_array[no_unique_elements-1];
                    no_unique_elements--;
                    j--;
                }
            }
        } 
        int[] array1 = Arrays.copyOf(my_array, no_unique_elements);
        System.out.println();
        System.out.println("Array with unique values : ");                 
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args)                              //main method of Problem6
    {        
        unique_array(new int[] {20, 20, 30, 40, 50, 50, 50});             
    }    
}




class Problem7 {       //problem 7, program to convert all the characters in a string to lowercase.
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Uppercase String: ");              //the system will ask a Uppercase string from a user
        String userInputString = scanner.nextLine();
        System.out.println("Lowercase String:\n"+userInputString.toLowerCase());       //then the system will convert the string from uppercase to lowercase
    }
}




class Problem8 {     //promblem 8, Java program creating a character array containing the contents of a string.
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");     //the system will ask the user to enter a string
   	String s = scanner.nextLine();
    
   	char[] A;     
   	A = s.toCharArray();
    
   	System.out.println("Character array of the string: ");  //then the system will print the result of Character array of the string
   	for ( int i = 0; i < A.length; i++ )
   	System.out.println( "A[" + i + "] = " + A[i] );                  
   	System.out.println( "\n" );
    
    }
}




class Problem9 {                        //the output is password rules
    public static final int PASSWORD_LENGTH = 10;                      
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(                                               
                "Password rules:\n" +
                "1. A password must have at least ten characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n" +
                "Input a password (You are agreeing to the above Terms and Conditions.): ");
        String s = input.nextLine();

        if (is_Valid_Password(s)) {     //the condition will check if the user's input matched the code
            System.out.println("Password is valid: " + s);          
        } else {
            System.out.println("Not a valid password: " + s);
        }

    }
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




class Problem10 {          //problem 10, Displays an n-by-n matrix.
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");                   
        int n = in.nextInt();                           //the system will ask the user to enter a number
        printMatrix(n);                                 //using the printMatrix method, the user's input will generate
    }
 public static void printMatrix(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print((int)(Math.random() * 2) + "");
            }
            System.out.println();
        }
    }
}




class Problem11 {           // problem, 11 ,Java program to find all twin prime numbers less than 150.
    public static void main(String[] args) {
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

























