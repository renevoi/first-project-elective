import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class MainClass{
    public static void main(String[] args) {
        
    }
}
// these are the classes that need to be instantiated in order to use in main() method
class Problem1{ //value of x increments
    
    public static void main(String[] args) {
        for (int x=1; x<=10; x++) {
            System.out.println();
            
            for (int y=1; y<=x; y++) {
                System.out.println(y);
            }
        }
        System.out.println();
            
    } 
}

class Problem2{                      //value of binary 1 and 0 increment
    public static void main(String[] args) {
        int x, y;
        int count =1;
        for (x=1; x<=6; x++) {
            for (y=1; y<=x; y++) {
                System.out.format("%d", count++ %2);
                if (y==x && x!=6)
                    System.out.println("");
            }
            if (x%2 == 0)
                count =1;
            else
                count = 0;
        }
    }
}

class Problem3{       //nested loop of * up to 7 and nested loop of * in decrrement from 7 to value of x
    public static void main(String[] args) {
        int x,y,z;
        for (x=1; x<=7; x++) {
            for (y=x; y<7; y++) {
                System.out.print(" ");
            }
            for (z=1; z<(x*2); z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (x=6; x>=1; x--) {
            for (y=7; y>x; y--) {
                System.out.print(" ");
            }
            for (z=1; z<(x*2); z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Problem4{                 //nested loop of letter A to F
    public static void main(String[] args) {         // letter increment from A to A-F
        int n=7;                                  //letter decrement from A-F to A
        int count = 1;
        int count2 = 1;
        char c = 'A';
        
        for (int i =1; i< (n*2); i++) {
            for (int spc = n - count2; spc > 0; spc--) {
                System.out.print(" ");
            }
            if (i<n) {
                count2++;
            }
            else {
                count2--;
            }
            for (int j=0; j<count; j++) {
                System.out.print(c);
                if (j<count/2) {
                    c++;
                } 
                else {
                    c--;
                }
            }
            if (i<n) {
                count = count +2;
            }
            else {
                count = count - 2;
            }
        }
    }
}

class Problem5 {                                 //from original array display
    public static void main(String[] args) {         //display new length fo the array
        int nums[] = {49, 1, 3, 200, 2, 4, 70, 5};
        System.out.println("Original array length: " +nums.length);
        System.out.print("Array elements are");
        for (int i = 0; i<nums.length; i++) {
            System.out.print(nums[i] +" ");
        }
        System.out.println("\nThe new length of the array is: " +longest_sequence(nums));
        
    }
    public static int longest_sequence(int[] nums) {
        final HashSet<Integer> h_set = new HashSet<Integer>();
        for (int i : nums) h_set.add(i);
        
        int longest_sequence_len = 0;
        for (int i : nums) {
            int length = 1;
            for (int j =1-1; h_set.contains(j); --j) {
                h_set.remove(j);
                ++length;
            }
            for (int j =1+1; h_set.contains(j); ++j) {
                h_set.remove(j);
                ++length;
            
        }
            longest_sequence_len = Math.max(longest_sequence_len, length);
    }
        return longest_sequence_len;
}
}
    
    

class Problem6 {                       //when there si duplicate element of an array,
    static void unique_array(int[] my_array) {         //it removesit and display the new
        System.out.println("Original Array: ");        //length of the array
        for (int i=0; i <my_array.length; i++) {
            System.out.print(my_array[i]+"\t");
        }
        int no_unique_elements = my_array.length;
        for (int i= 0; i<no_unique_elements; i++) {
            for (int j = i+1; j<no_unique_elements; j++) {
                if (my_array[i] == my_array[j]) {
                    my_array[j] = my_array[no_unique_elements-1];
                    
                    no_unique_elements--;
                    j--;
                }
            }
        }
        int[] array1  = Arrays.copyOf(my_array, no_unique_elements);
        System.out.println();
        System.out.println("Array with unique values: ");
        for (int i =0; i<array1.length;i++) {
            System.out.print(array1[i]+"\t");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        unique_array(new int[] {20,20,30,40,50,50,50});
    }   
}






class Problem7 {                   //converts Uppercase String into lowercase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Uppercase String: ");
        String userInputString = scanner.nextLine();
        
        System.out.println("Lowercase String:\n"+userInputString.toLowerCase());
    }
}
    
class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a String: ");
        String s = scanner.nextLine();
        
        char[] A;
        
        A = s.toCharArray();
        System.out.println("Character array of the String: ");
        for (int i =0; i<A.length; i++) 
            System.out.println("A[" +i+ "] = "+A[i]);
            System.out.println("\n");
        }
}

class Problem9 {    //checks if password is valid, contaning atleast 10 characters,
    public static final int PASSWORD_LENGTH = 10;         //letters and digit, and
    public static void main(String[] args) {           //atleast two digits
        Scanner input = new Scanner(System.in);
        System.out.print(
        "Password rules:\n" +
        "1. A Password must have at least ten characters.\n" +
        "2. A Password consists of only letters and digits.\n" +
        "3. A Password must contain at least two digits.\n" +
        "Input a password (You are aggreing to the above Terms and Conditions.)");
        String s = input.nextLine();
        if (is_Valid_Password(s)) {
            System.out.println("Password is valid: " +s);
        }
        else {
            System.out.println("Not a valis password! " +s);
        }
    }
    public static boolean is_Valid_Password(String password) {
        if (password.length() <PASSWORD_LENGTH) return false;
        int charCount = 0;
        int numCount = 0;
        for (int i= 0; i<password.length(); i++) {
            char ch = password.charAt(i);
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
        return (ch>= '0' && ch <= '9');
    } 
}

class Problem10 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int n) {
        for (int i= 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                System.out.print((int)(Math.random() *2)+"");
            }
            System.out.println();
        }
    }
}

class Problem11 {
    public static void main(String[] args) {
        for (int i =2; i<100; i++) {
            if (is_Prime(i) && is_Prime(i+2)) {
                System.out.printf("(%d, %d)\n", i, i +2);
            }
        }
    }
    public static boolean is_Prime(long n) {
        if (n<2) return false;
        for (int i=2; i<=n/2; i++) {
            if (n%i==0) return false;
        }
        return true;
    }
}