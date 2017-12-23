import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        
    }
}
    
    class problem1{

        public static void main(String s[]) {
            for (int e=1; e<=10; e++) {
                System.out.println();
            
                for (int v=1; v<=e; v++) {
                    System.out.print(v);
                }
            }
            System.out.println();
        }
    
    }
    
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
    
    class problem3{
        
        public static void main(String[] args) {
            int e,v,a;
            for (e=1; e<=7; e++) {
                for (v=e; v < 7; v++) {
                    System.out.println(" ");
                }
                for (a=1; a< (e*2); a++) {
                    System.out.println("*");
                }
                System.out.println();
            }
            for (e=6; e>=1; e--) {
                for (v=7; v>=e; v--) {
                    System.out.println(" ");
                }
                for (a=1; a<(e*2); a++) {
                    System.out.println("*");
                }
                System.out.println("");
            }
        }
    }
    
    class problem4{
       
        public static void main(String[] args) {
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
                for (int j = 0; j < count1; j++) {
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
    
    class problem5{
        
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
            return longest_sequence_len;
        }
    }

    class problem6{
        
        static void unique_array(int [] my_array) {
            System.out.println("Original Array: ");
            for (int e = 0; e < my_array.length; e++) {
                System.out.println(my_array[e]+"\t");
            }
            int no_unique_elements = my_array.length;
            
            for (int e = 0; e < no_unique_elements; e++) {
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
        public static void main(String[] args) {
            unique_array(new int[] {20, 20, 30, 40, 50, 50, 50});
        }
    }

    class problem7{
        
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a Uppercase String: ");
            String userInputString = scanner.nextLine();
            
            System.out.println("Lowercase String:\n"+userInputString.toLowerCase());
        }
    }

    class problem8{
        
        public static void main(String[] args) {
            Scanner scanner = new  Scanner(System.in);
            System.out.println("Enter a String: ");
            String s = scanner.nextLine();
            
            char[] E;
            
            E = s.toCharArray();
            
            System.out.println("Charcter array of the string: ");
            for (int e = 0; e < E.length; e++)
                System.out.println("E[" + e +"] = " + E[e]);
                System.out.println( "\n" );
        }
    }

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
            
            if (is_Valid_Password(s)){
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

    class problem10{
        
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            int n = in.nextInt();
            printMatrix(n);
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