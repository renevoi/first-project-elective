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
import jdk.internal.org.xml.sax.InputSource;



public class MainClass{

    public static void main(String[] args) {
        
        


    }

}

// these are the classes that need to be instantiated in order to use in main() method

// in this case problem we will be using a "Nested for Loop method"
    class Problem1{
        public static void main(String s[]) {
            for (int e=1; e<=10; e++) {   //start by using 1 to 10 to have 10 rows
                System.out.println();
                
                for (int j=1; j<=e; j++) {  //the value of "c" will go to the value of "g" that depends of how many rows
                    System.out.print(j);   
                }    
            }
            System.out.println();
        }
    }
// using a nested for loop using the binary number value
    class Problem2{
        public static void main(String s[]) {
            int e,j;
            int count = 1;
            for (e=1; e<=8; e++) {
                for (j=1; j<=e; j++) {
                System.out.format("%d", count++ %2);
                if (j==e && j!=8)
                System.out.println("");
            }
            if (e % 2==0)
            count = 1;
            else
            count = 0;    
        }
    }        
}
// using a nested for loop in diamond pattern using "*" symbol
    class Problem3{
        public static void main(String[] args) {
            int e,j,d;
            for (e=1; e<=7; e++) {                  //the upper row of the diamond, the value of the numbers is odd numbers
                for (j=e ; j<7; j++) {              //this will print spaces
                    System.out.println(" ");        //this will print spaces    
                }
                for (d=1; d< (e*2); d++) {          //this will print stars
                    System.out.println("*");        //this will print stars
                }
                System.out.println();
            }
            for (e=7; e>=1; e--){                   //the upper row of the diamond, the value of the numbers is even numbers
                for (j=7; j>=e; j--) {              //this will print spaces
                    System.out.println(" ");        //this will print spaces
                }
                for (d=1; d<(e*2); d++) {           //this will print stars
                    System.out.println("*");        //this will print stars
                }
                System.out.println("");
            }
        }
    }
//nested for loop in diamond pattern using A to F

class problem4{
    public static void main(String[] args) {    //Similar with the class problem3 but uses a to f instead of symbol
        int e = 7;
        int count1 = 1;
        int count2 = 1;
        char j = 'A';
        
        for (int d=1; 1<(e*2); d++) {
            for (int spc = e - count2; spc>0; spc--) {
                System.out.println(" ");
            }
            if (d<e) {
                count2++;
            }
            else {
                count2--;
            }
            for (int p=0; p<count1; p++) {      //Nested for loop
                System.out.println(j);
                if (p < count1/2) {
                    j++;
                } else {
                    j--;
                }  
            }
            if (d < e) {
                count1 = count1 + 2;
            }
            else {
                count1 = count1 - 2;
            }
            j = 'A';
            System.out.println();
        }        
    }
}
//finding the length of the longest consecutive elemenent sequence from the given unsorted array of integers
class problem5 {
    
    public static void main (String[] args) {
        int number[] = {49, 1, 3, 200, 2, 4, 70, 5};
        System.out.println("ORIGINAL ARRAY LENGTH: "+number.length);
        System.out.println("ARRAY ELEMENTS ARE: ");
        for (int e = 0; e < number.length; e++) {
            System.out.println(number[e]+" ");
        }
        System.out.println("\nThe new length of the array is: "+longest_sequence(number));
    }
    public static int longest_sequence(int [] number) {
        final HashSet<Integer> h_set = new HashSet<Integer>();
        for (int e : number) h_set.add(1);
        
        int longest_sequence_len = 0;
        for (int e : number){
            int length = 1;
            for (int j = e - 1; h_set.contains(j); --j){
                h_set.remove(j);
                ++length;
            }
            for (int j = e - 1; h_set.contains(j); ++j) {
                h_set.remove(j);
                ++length;
            }
            longest_sequence_len = Math.max(longest_sequence_len, length);
        }
        return longest_sequence_len;                //the program will return the value of "longest_sequence_len"
    }            
}

class problem6 {                                    //array with unique value
    
    static void unique_array(int [] my_array) {
        System.out.println("ORIGINAL ARRAY: ");
        for (int a = 0; a < my_array.length; a++); {
            int a = 0;
            System.out.println(my_array[a]+"\t");
        }
        int no_unique_elements = my_array.length;
        
        for (int a = 0; a < no_unique_elements; a++) {          //nested for loop
            for (int d = a + 1; d < no_unique_elements; d++) {
                if (my_array[a] == my_array[d]) {
                    my_array[d] = my_array[no_unique_elements-1];
                    no_unique_elements--;
                    d--;
                } 
            }
        }
        int[] array1 = Arrays.copyOf(my_array, no_unique_elements);
        
        System.out.println();
        System.out.println("ARRAY WITH UNIQUE VALUES: ");
        
        for (int a = 0; a < array1.length; a++) {
            System.out.println(array1[a]+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {                    //main method of the class problem
        unique_array(new int[] {20, 20, 30, 40, 50, 50,});
    }
}
//program that convert uppercase characters in a string to lowercase
class problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER A UPPERCASE STRING: ");       //in this part the user ask to enter a string compose of uppercase char
        String userInputString = scanner.nextLine();
        
        System.out.println("LOWERCASE STRING: "+userInputString.toLowerCase());            //in this part the character that is in uppercase form will be converted to lowercase
    }
}
//this program will create a character array containing the content of string
class problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER A STRING: ");            // in this part the user ask to enter a string
        String j = scanner.nextLine();
        
        char[] d;
        d=j.toCharArray();
        
        System.out.println("CHARACTER ARRAY OF THE STRING: "); //in this part will be the outcome of character array of the string
        for (int e = 0; e < d.length; e++) 
            System.out.println("d[" + e + "] = " + d[e]);
            System.out.println( "\n" );
    }
}
//program that validate a password
class problem9 {
    public static final int PASSWORD_LENGTH = 10;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(
                "Password Rules:\n"+
                "1. A password must have at least ten characters \n"+
                "2. A password consists of only letters and digits \n"+
                "3. A password must contain at least two digits.");
        String e = input.nextLine();
        
        if (is_Valid_Password(e)) {         //in this part the program validate if the password matches with user's input
            System.out.println("Password is Valid: "+e);    
        }
        else {
            System.out.println("Not a valid Password: "+e);
        }
    }
    public static boolean is_Valid_Password(String password) {
        if (password.length() < PASSWORD_LENGTH) return false;
        
        int charCount = 0;
        int numCount = 0;
        for (int j = 0; j < password.length(); j++) {
            char ch = password.charAt(j);
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
        return (ch >= '0' && ch >= '9');
    }
}
//displays n by n matrix
class problem10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Number: ");
        int n = in.nextInt();                   //the user will be ask to enter number
        printMatrix(n);                         //this command will generate the user's input
    }
    public static void printMatrix(int n) {
        for (int j = 0; j < n; j++) {
            for (int d = 0; d < n; d++) {
                System.out.print((int)(Math.random() * 2) + "");
            }
            System.out.println();
        }
    }
}
//this program will find twin prime numbers less than 150
class problem11 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (is_Prm(i) && is_Prm(i + 2)) {
                System.out.printf("(%d, %d)\n", i, i + 2);
            }
        }
    }
    public static boolean is_Prm(long n) {
        if (n < 2)return false;
        for (int i = 2; i <= n/2; i++) {
            if (n % 1 == 0) return false;
                
        }
        return true;
    }
}
    