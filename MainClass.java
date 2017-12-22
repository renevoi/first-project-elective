
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

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


public class MainClass{

    public static void main(String[] args) {
        
        


    }

}

// these are the classes that need to be instantiated in order to use in main() method


class Problem1{   //increment value of x
    
    
    public static void main(String s[]) {
        for (int x = 1; x < 10; x++) {
            System.out.println();
            
            for (int y = 1; y < 10; y++) {
                System.out.println(y);
            }
        }
        System.out.println();
    }
    
}

class Problem2{  //increment value of binary 1 and 0

    
    public static void main(String s[]) {
        int x, y;
        int count = 1;
        for ( x = 1; x <= 6; x++) {
            for (y = 1; y < x; y++) {
                System.out.format("%d", count++ % 2);
                if (y==x && x!=6) {
                    System.out.println("");
                }
                if (x % 2 == 0) {
                    count = 1;
                } else {
                    count = 0;
                
                }
            }
        }
    
    }
}    

class Problem3{  //problem3 nested loop of * up to 7
                 // nested loop of * in decrement from 7 
    public static void main(String[] args) {
           int x, y, z;
        for(x=1;x<=7;x++){
            for (y = x; y < 7; y++) {
                System.out.println("");
                
            }
            for (z = 1;  z<(x*2); z++) {
                System.out.println("");
                
            }
            System.out.println("");
            
        }
        
        for(x=6; x>=1; x--){
            for(y=7; y>x; y--){
                System.out.println("");
            }
              for(z=1; z<(x*2); z++){
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
class Problem4{  //nested loop of letter from 1 to 7 (A-F)
                 // with increment and decrement  A to F
   public static void main(String[] args) {
        int n = 7;
        int count =1;
        int count2 =1;
        char c ='A';
        
        for (int i = 1; i < (n*2); i++) {
            for (int spc = n - count2; spc > 0; spc--) {
                System.out.println("");
                
            }
            if(i < n){
                count2++;
            }
            else {
                count2--;
            }
            for (int j = 0; j < count; j++) {
                System.out.println(c);
                if(j < count / 2){
                    c++;
                }else{
                    c--;
                }
            }
            
            if(i<n){
                count = count +2;
            }
            else{
                count = count - 2;
            }
            
        }
    }
}   
class Problem5{  //5 original array display 
                 // the new length of the array 
                 // in original  array get the longest sequence
    public static void main(String[] args) {
        int nums[] = {49,1,3,200,2,4,70,5};
        System.out.println("Original array length: "+nums.length);
        System.out.println("Array elements are: ");
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]+"");
        }
        System.out.println("\nThe new length of the array is: ");
    }

    public static int longest_sequence(int [] nums){
        final HashSet<Integer> h_set = new HashSet<Integer>();
        for(int i : nums)h_set.add(i);
        
        int longest_sequence_len = 0;
        for(int i : nums){
            int length = 1;
            for(int j = i -1; h_set.contains(j); --j){
                h_set.remove(j);
                ++length;
            }
            for(int j= i -1; h_set.contains(j);j++){
                h_set.remove(j);
                ++length;
            }
            longest_sequence_len = Math.max(longest_sequence_len, length);
            
        }
        return longest_sequence_len;
        
    }  
}        
class Problem6{   // m
    static void unique_array(int [] my_array){
        System.out.println("Original Array: ");
        for (int i = 0; i < my_array.length; i++) {
            System.out.println(my_array[i]+"\t");
        }
        int no_unique_elements = my_array.length;
        for (int i = 0; i < no_unique_elements; i++) {
            for (int j = i; j < no_unique_elements; j++) {
                if (my_array[i] == my_array[j]) {
                    my_array[j] = my_array[no_unique_elements-1];
                    
                    no_unique_elements--;
                    
                    j--;
                }
            }
        }
        
        int[] array1 = Arrays.copyOf(my_array, no_unique_elements);
        System.out.println();
        System.out.println("Array with unique values: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args){
        unique_array(new int[] {20,20,30,40,50,50});
    }
}
class Problem7{  //
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a uppercase string" );
        String userInputString = scanner.nextLine();
        
        System.out.println("Lowercase string:\n"+userInputString.toLowerCase());
    }
}
class Problem8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String" );
        String s = scanner.nextLine();
        
        char[] A;
        
        A=s.toCharArray();
        
        System.out.println("Character array of the string: ");
        for(int i =0; i<A.length;i++)
        System.out.println("A{" + i + "} = " + A[i]);
        System.out.println("\n");
    }
}
class Problem9{
    public static final int PASSWORD_LENGTH = 10;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(
                "Password rules:\n" +
                "1. A password must have at least ten characters.\n" +
                "2. A password consists of only letters and digits .\n" +
                "3. A password must contains at least two digits\n" +
                " Input a password (You are agreeing to the above terms and conditions.):");
             String s = input.nextLine();
             if (is_Valid_Password(s)) {
                  System.out.println("Password is valid"+s);
              
        }else{
                 System.out.println("Not a valid password: "+s);
    }
    }
    public static boolean is_Valid_Password(String password){
        if (password.length() < PASSWORD_LENGTH) return false;
        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if(is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }
          return (charCount >=2 && numCount >=2);
        }
    public static boolean is_Letter(char ch){
        ch = Character.toUpperCase(ch);
        return (ch >='A' && ch <='Z');
        
    }
    
    public static boolean is_Numeric(char ch){
        return (ch >='0' && ch <='9');
    }
}
class Problem10{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: " );
        int n = in.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println((int)(Math.random()*2)+"");
            }
            System.out.println();
        }
    }
}
class Problem11{
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if(is_Prime(i) && is_Prime(1+2)){
                System.out.printf("(%d, %d)\n",i,i + 2);
            }
        }
    }
    public static boolean is_Prime(long n){
        if (n<2) return false;
        for(int i=2; i<=n/2; i++){
            if(n%i == 0)return false;
        }
        return true;
    }
}




















