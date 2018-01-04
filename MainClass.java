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
import java.util.Scanner;
import java.util.HashSet;


public class MainClass{

    public static void main(String[] args) {
        
        


    }

}

// these are the classes that need to be instantiated in order to use in main() method

// this problem use nested for loop
class Problem1{
    public static void main(String a[]) {
        for (int b = 1; b <=10; b++) {              // start from 1 to 10 to have 10 rows
            System.out.println();
            for (int c = 1; c <=b; c++) {           //the value of "c" will go to the value of "b" that depends of how many rows
                System.out.println(c);
            }
            
        }
        System.out.println();
    }
    
}

// this use nested for loop using binary
class Problem2{
    
    public static void main(String d[]) {
        int e,f;
        int count = 1;
        for ( e = 1; e < 6; e++) {
            for (f = 1; f <=10; f++) {
                System.out.format("%d", count ++ % 2);
                if (f==e && f!=6)
                    System.out.println("");             // this will display the output
                    
                
            }
            if (e % 2==0) 
            count = 1;
            else
            count = 0;
                
        }
        
    }

}

// nested for loop diamond pattern using the star symbol "*"
class Problem3{
    
    public static void main(String[] args) {
        int j,c,b;
        for ( j = 1; j <=7; j++) {              //the upper row of the diamond, the value of the numbers is odd numbers
            for (c = j; c <=7; c++) {           
                System.out.println(" ");        //this will display spaces 
            }
            for (b = 1; b < (j*2); b++) {    
                System.out.println("*");        //this will display stars
            }
            System.out.println();
        }
        for ( j = 6; j >=1; j--){               //the upper row of the diamond, the value of the numbers is even numbers
            for (c = 7; c >=j ; c--) {          
                System.out.println(" ");        //this will display spaces 
                
            }
            for (b = 1; b < (j*2); b++) {
                System.out.println("*");        //this will display stars
            }
            System.out.println("");
        }
    }
    
}

// nested for loop in diamond pattern using "A to F"
class Problem4{
        
    public static void main(String[] args) {                //Same as problem3 but this uses letters from "A to F"
        int e = 7;
        int count1 = 1;
        int count2 = 1;
        char c = 'A';
             
        for (int q = 1; 1 < (e*2); q++) {
            for (int spc = e - count2; spc > 0; spc--) {
                    System.out.println(" ");
            }
            if (q < e) {
                count2++;
            }
            else {
                count2--;
            }
            for (int f = 0; f < count1; f++) {              //Nested for Loop
                System.out.println(c);
                if (f < count1 / 2) {
                    c++;
                }
                else {
                    c--;
                }
            }
            if (c < e) {
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
// finding the length of the longest consecutive elemenent sequence
class problem5 {
     
    public static void main (String[] args) {
        int number[] = {49, 1, 3, 200, 2, 4, 70, 5};
        System.out.println("ORIGINAL ARRAY LENGTH: "+number.length);
        System.out.println("ARRAY ELEMENTS ARE: ");
        for (int o = 0; o < number.length; o++) {
            System.out.println(number[o]+" ");
        }
        System.out.println("\nThe new length of the array is: "+longest_sequence(number));
    }
    public static int longest_sequence(int [] number) {
        final HashSet<Integer> z_set = new HashSet<Integer>();
        for (int o : number) z_set.add(1);
        
        int longest_sequence_len = 0;
        for (int o : number){
            int length = 1;
            for (int j = o - 1; z_set.contains(j); --j){
                z_set.remove(j);
                ++length;
            }
            for (int x = o - 1; z_set.contains(x); ++x) {
                z_set.remove(x);
                ++length;
            }
            longest_sequence_len = Math.max(longest_sequence_len, length);
        }
        return longest_sequence_len;                //this will return the value of "longest_sequence_len"
    }            
}

class problem6 {                                    // array with unique value
    
    static void unique_array(int [] my_array) {
        System.out.println("ORIGINAL ARRAY: ");
        for (int j = 0; j < my_array.length; j++); {
            int p = 0;
            System.out.println(my_array[p]+"\t");
        }
        int no_unique_elements = my_array.length;
        
        for (int p = 0; p < no_unique_elements; p++) {          //  nested for loop
            for (int j = p + 1; j < no_unique_elements; j++) {
                if (my_array[p] == my_array[j]) {
                    my_array[j] = my_array[no_unique_elements-1];
                    no_unique_elements--;
                    j--;
                } 
            }
        }
        int[] array1 = Arrays.copyOf(my_array, no_unique_elements);
        
        System.out.println();
        System.out.println("ARRAY WITH UNIQUE VALUES: ");
        
        for (int l = 0; l < array1.length; l++) {
            System.out.println(array1[l]+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {                    // main method of the problem
        unique_array(new int[] {20, 20, 30, 40, 50, 50,});
    }
}

//converting uppercase characters in a string to lowercase
class problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER A UPPERCASE STRING: ");       // the user will be ask to enter a uppercase string
        String userInputStr = scanner.nextLine();
        
        System.out.println("lowercase string: "+userInputStr.toLowerCase());            //the uppercase string will be converted to lowercase string
    }
}

//this program will create a character array containing the contents of a string
class problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER A STRING: ");            //  the user will be ask to enter a string
        String k = scanner.nextLine();
        
        char[] d;
        d=k.toCharArray();
        
        System.out.println("CHARACTER ARRAY OF THE STRING: "); //in this part it will display the outcome of character array of the string
        for (int e = 0; e < d.length; e++) 
            System.out.println("d[" + e + "] = " + d[e]);
            System.out.println( "\n" );
    }
}

    //This scenario is all about the "Password Rules"
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
        String x = input.nextLine();
             
        if (is_ValidPass(x)){          // in this program, this will check and validate if the passcode match the user's input
            System.out.println("Password is valid: " + x);
        } else {
            System.out.println("Not a Valid Password: " + x);
        }
    }
         
    public static boolean is_ValidPass(String password) {
             
        if (password.length() < PASSWORD_LENGTH) return false;
             
        int charCnt = 0;
        int numCnt = 0;
        for (int d = 0; d < password.length(); d++){
                 
            char ch = password.charAt(d);
                 
            if (is_Numerical(ch)) numCnt++;
            else if (is_Letter(ch)) charCnt++;
            else return false;
        }
        return (charCnt >= 2 && numCnt >=2);
    }
         
    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
         
    public static boolean is_Numerical(char ch) {
        return (ch >= '0' && ch <= '9');
    }
}

//displays n by n mtrx
class problem10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Number: ");
        int n = in.nextInt();                   //in this command the user will be ask to input number
        printMtrx(n);                         //this method will generate the user's input
    }
    public static void printMtrx(int n) {
        for (int z = 0; z < n; z++) {
            for (int d = 0; d < n; d++) {
                System.out.print((int)(Math.random() * 2) + "");
            }
            System.out.println();
        }
    }
}

//this java program will find all the twin prime numbers that less than 150
class problem11 {
    public static void main(String[] args) {
        for (int m = 2; m < 100; m++) {
            if (is_Pr1me(m) && is_Pr1me(m + 2)) {
                System.out.printf("(%d, %d)\n", m, m + 2);
            }
        }
    }
    public static boolean is_Pr1me(long n) {
        if (n < 2)return false;
        for (int m = 2; m <= n/2; m++) {
            if (n % 1 == 0) return false;
                
        }
        return true;
    }
}















